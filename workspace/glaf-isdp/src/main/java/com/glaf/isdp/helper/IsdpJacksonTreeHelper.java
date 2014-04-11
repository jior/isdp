package com.glaf.isdp.helper;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import com.glaf.core.tree.component.TreeComponent;
import com.glaf.core.tree.component.TreeRepository;

import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.ITree;

public class IsdpJacksonTreeHelper {
	protected static final Log logger = LogFactory
			.getLog(IsdpJacksonTreeHelper.class);

	protected void addDataMap(TreeComponent component, ObjectNode row) {
		if (component.getTreeModel() != null
				&& component.getTreeModel().getDataMap() != null) {
			Map<String, Object> dataMap = component.getTreeModel().getDataMap();
			Set<Entry<String, Object>> entrySet = dataMap.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				String name = entry.getKey();
				Object value = entry.getValue();
				if (value != null) {
					if (value instanceof Date) {
						Date d = (Date) value;
						row.put(name, DateUtils.getDate(d));
					} else if (value instanceof Boolean) {
						row.put(name, (Boolean) value);
					} else if (value instanceof Integer) {
						row.put(name, (Integer) value);
					} else if (value instanceof Long) {
						row.put(name, (Long) value);
					} else if (value instanceof Double) {
						row.put(name, (Double) value);
					} else if (value instanceof Float) {
						row.put(name, (Float) value);
					} else {
						row.put(name, value.toString());
					}
				}
			}
		}

		if (component.getTreeObject() != null) {
			if (component.getTreeObject() instanceof ITree) {
				ITree tree = (ITree) component.getTreeObject();
				ObjectNode objectNode = tree.toObjectNode();
				if (objectNode != null && !objectNode.isNull()) {
					Iterator<String> iterator = objectNode.fieldNames();
					while (iterator.hasNext()) {
						String nodeName = iterator.next();
						row.put(nodeName, objectNode.get(nodeName));
					}
				}

				row.put("id", tree.getIndexId());
				row.put("_id_", tree.getId());
				row.put("_oid_", tree.getId());
				row.put("indexId", tree.getIndexId());
				row.put("parentId", tree.getParentId());
				row.put("_parentId", tree.getParentId());
				row.put("indexName", tree.getIndexName());
				row.put("text", tree.getIndexName());
				row.put("checked", tree.isChecked());
				row.put("level", tree.getLevel());
				row.put("listno", tree.getListno());
			}
		}
	}

	public TreeRepository build(List<ITree> treeModels) {
		Map<Integer, ITree> treeModelMap = new HashMap<Integer, ITree>();

		for (int i = 0; i < treeModels.size(); i++) {
			ITree treeModel = (ITree) treeModels.get(i);
			if (treeModel.getIndexId() == treeModel.getParentId()) {
				treeModel.setParentId(-1);
			}
			treeModelMap.put(treeModel.getIndexId(), treeModel);
		}

		TreeRepository repository = new TreeRepository();
		for (int i = 0; i < treeModels.size(); i++) {
			ITree treeModel = treeModels.get(i);
			TreeComponent component = new TreeComponent();
			component.setId(String.valueOf(treeModel.getIndexId()));
			component.setCode(String.valueOf(treeModel.getIndexId()));
			component.setTitle(treeModel.getIndexName());
			component.setChecked(treeModel.isChecked());
			component.setTreeObject(treeModel);
			repository.addTree(component);

			int parentId = treeModel.getParentId();
			if (treeModelMap.get(parentId) != null) {
				TreeComponent parentTree = repository.getTree(String
						.valueOf(parentId));
				if (parentTree == null) {
					ITree parent = treeModelMap.get(parentId);
					parentTree = new TreeComponent();
					parentTree.setId(String.valueOf(parent.getIndexId()));
					parentTree.setCode(String.valueOf(parent.getIndexId()));
					parentTree.setTitle(parent.getIndexName());
					parentTree.setChecked(parent.isChecked());
					parentTree.setTreeObject(parent);
					repository.addTree(parentTree);
				}
				component.setParent(parentTree);
			}

		}
		return repository;
	}

	public void buildTree(ObjectNode row, TreeComponent treeComponent,
			Collection<String> checkedNodes, Map<String, ITree> nodeMap) {
		if (treeComponent.getComponents() != null
				&& treeComponent.getComponents().size() > 0) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			Iterator<?> iterator = treeComponent.getComponents().iterator();
			while (iterator.hasNext()) {
				TreeComponent component = (TreeComponent) iterator.next();
				ITree node = nodeMap.get(treeComponent.getId());
				ObjectNode child = new ObjectMapper().createObjectNode();
				this.addDataMap(component, child);
				child.put("id", component.getId());
				child.put("code", component.getCode());
				child.put("text", component.getTitle());
				child.put("checked", component.isChecked());
				if (node != null) {

				}
				if (checkedNodes.contains(component.getId())) {
					child.put("checked", Boolean.valueOf(true));
				} else {
					child.put("checked", Boolean.valueOf(false));
				}
				if (component.getComponents() != null
						&& component.getComponents().size() > 0) {
					child.put("leaf", Boolean.valueOf(false));
				} else {
					child.put("leaf", Boolean.valueOf(true));
				}
				array.add(child);
				this.buildTree(child, component, checkedNodes, nodeMap);
			}
			row.put("children", array);
		}

	}

	public void buildTreeModel(ObjectNode row, TreeComponent treeComponent) {
		if (treeComponent.getComponents() != null
				&& treeComponent.getComponents().size() > 0) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			Iterator<?> iterator = treeComponent.getComponents().iterator();
			while (iterator.hasNext()) {
				TreeComponent component = (TreeComponent) iterator.next();
				ObjectNode child = new ObjectMapper().createObjectNode();
				this.addDataMap(component, child);
				child.put("id", component.getId());
				child.put("code", component.getCode());
				child.put("text", component.getTitle());
				child.put("name", component.getTitle());
				child.put("checked", component.isChecked());

				if (component.getComponents() != null
						&& component.getComponents().size() > 0) {
					child.put("leaf", Boolean.valueOf(false));
					array.add(child);
					this.buildTreeModel(child, component);
				} else {
					child.put("leaf", Boolean.valueOf(true));
					array.add(child);
				}
			}
			row.put("children", array);
		}
	}

	public ObjectNode getJsonCheckboxNode(ITree root, List<ITree> trees,
			List<ITree> selectedNodes) {
		Collection<String> checkedNodes = new HashSet<String>();
		if (selectedNodes != null && selectedNodes.size() > 0) {
			for (int i = 0; i < selectedNodes.size(); i++) {
				ITree treeNode = (ITree) selectedNodes.get(i);
				checkedNodes.add(String.valueOf(treeNode.getIndexId()));
			}
		}

		Map<String, ITree> nodeMap = new HashMap<String, ITree>();
		if (trees != null && trees.size() > 0) {
			for (int i = 0; i < trees.size(); i++) {
				ITree treeNode = (ITree) trees.get(i);
				nodeMap.put(String.valueOf(treeNode.getIndexId()), treeNode);
			}
		}

		ObjectNode object = new ObjectMapper().createObjectNode();

		if (root != null) {
			object.put("id", String.valueOf(root.getIndexId()));
			object.put("code", String.valueOf(root.getIndexId()));
			object.put("text", root.getIndexName());
			object.put("leaf", Boolean.valueOf(false));
			object.put("checked", root.isChecked());
			if (checkedNodes.contains(String.valueOf(root.getIndexId()))) {
				object.put("checked", Boolean.valueOf(true));
			} else {
				object.put("checked", Boolean.valueOf(false));
			}
		}

		ArrayNode array = new ObjectMapper().createArrayNode();
		if (trees != null && trees.size() > 0) {
			TreeRepository repository = this.build(trees);
			if (repository != null) {
				List<?> topTrees = repository.getTopTrees();
				if (topTrees != null && topTrees.size() > 0) {
					if (topTrees.size() == 1) {
						TreeComponent menu = (TreeComponent) topTrees.get(0);
						if (StringUtils.equals(menu.getId(),
								String.valueOf(root.getIndexId()))) {
							this.buildTree(object, menu, checkedNodes, nodeMap);
						} else {
							ObjectNode row = new ObjectMapper()
									.createObjectNode();
							this.addDataMap(menu, row);
							row.put("id", menu.getId());
							row.put("code", menu.getCode());
							row.put("text", menu.getTitle());
							row.put("leaf", Boolean.valueOf(false));
							row.put("checked", menu.isChecked());
							if (checkedNodes.contains(menu.getId())) {
								row.put("checked", Boolean.valueOf(true));
							} else {
								row.put("checked", Boolean.valueOf(false));
							}
							array.add(row);
							object.put("children", array);
							this.buildTree(row, menu, checkedNodes, nodeMap);
						}
					} else {
						for (int i = 0; i < topTrees.size(); i++) {
							TreeComponent menu = (TreeComponent) topTrees
									.get(i);
							ITree node = (ITree) nodeMap.get(menu.getId());
							ObjectNode row = new ObjectMapper()
									.createObjectNode();
							this.addDataMap(menu, row);
							row.put("id", menu.getId());
							row.put("code", menu.getCode());
							row.put("text", menu.getTitle());
							row.put("checked", menu.isChecked());
							if (node != null) {

							}
							if (checkedNodes.contains(menu.getId())) {
								row.put("checked", Boolean.valueOf(true));
							} else {
								row.put("checked", Boolean.valueOf(false));
							}
							if (menu.getComponents() != null
									&& menu.getComponents().size() > 0) {
								row.put("leaf", Boolean.valueOf(false));
							} else {
								row.put("leaf", Boolean.valueOf(true));
							}
							array.add(row);
							this.buildTree(row, menu, checkedNodes, nodeMap);
						}
						object.put("children", array);
					}
				}
			}
		}

		return object;
	}

	public ArrayNode getTreeArrayNode(List<ITree> treeModels) {
		return this.getTreeArrayNode(treeModels, true);
	}

	public ArrayNode getTreeArrayNode(List<ITree> treeModels,
			boolean showParentIfNotChildren) {
		ArrayNode result = new ObjectMapper().createArrayNode();
		if (treeModels != null && treeModels.size() > 0) {
			TreeRepository repository = this.build(treeModels);
			List<?> topTrees = repository.getTopTrees();
			logger.debug("topTrees:" + (topTrees != null ? topTrees.size() : 0));
			if (topTrees != null && topTrees.size() > 0) {
				for (int i = 0; i < topTrees.size(); i++) {
					TreeComponent component = (TreeComponent) topTrees.get(i);
					ObjectNode row = new ObjectMapper().createObjectNode();
					this.addDataMap(component, row);

					row.put("id", component.getId());
					row.put("code", component.getCode());
					row.put("text", component.getTitle());
					row.put("name", component.getTitle());
					row.put("checked", component.isChecked());

					if (component.getComponents() != null
							&& component.getComponents().size() > 0) {
						row.put("leaf", Boolean.valueOf(false));
						row.put("cls", "folder");
						row.put("classes", "folder");
						result.add(row);
						this.buildTreeModel(row, component);
					} else {
						row.put("leaf", Boolean.valueOf(true));
						if (showParentIfNotChildren) {
							result.add(row);
						}
					}
				}
			}
		}

		return result;
	}

	public ObjectNode getTreeJson(ITree root, List<ITree> treeModels) {
		return this.getTreeJson(root, treeModels, true);
	}

	public ObjectNode getTreeJson(ITree root, List<ITree> treeModels,
			boolean showParentIfNotChildren) {
		ObjectNode object = new ObjectMapper().createObjectNode();
		if (root != null) {
			object = root.toObjectNode();
			object.put("id", String.valueOf(root.getIndexId()));
			object.put("code", String.valueOf(root.getIndexId()));
			object.put("text", root.getIndexName());
			object.put("leaf", Boolean.valueOf(false));
			object.put("cls", "folder");
			object.put("checked", root.isChecked());
		}

		if (treeModels != null && treeModels.size() > 0) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			TreeRepository repository = this.build(treeModels);
			if (repository != null) {
				List<?> topTrees = repository.getTopTrees();
				if (topTrees != null && topTrees.size() > 0) {
					if (topTrees.size() == 1) {
						TreeComponent component = (TreeComponent) topTrees
								.get(0);
						if (root != null) {
							if (StringUtils.equals(component.getId(),
									String.valueOf(root.getIndexId()))) {
								this.buildTreeModel(object, component);
							}
						} else {
							this.addDataMap(component, object);
							object.put("id", component.getId());
							object.put("code", component.getCode());
							object.put("text", component.getTitle());
							object.put("leaf", Boolean.valueOf(false));
							object.put("cls", "folder");
							object.put("checked", component.isChecked());
							this.buildTreeModel(object, component);
						}
					} else {
						for (int i = 0; i < topTrees.size(); i++) {
							TreeComponent component = (TreeComponent) topTrees
									.get(i);
							ObjectNode row = new ObjectMapper()
									.createObjectNode();
							this.addDataMap(component, row);
							row.put("id", component.getId());
							row.put("code", component.getCode());
							row.put("text", component.getTitle());
							row.put("checked", component.isChecked());
							if (component.getComponents() != null
									&& component.getComponents().size() > 0) {
								row.put("leaf", Boolean.valueOf(false));
								row.put("cls", "folder");
								array.add(row);
								this.buildTreeModel(row, component);
							} else {
								if (showParentIfNotChildren) {
									row.put("leaf", Boolean.valueOf(true));
									array.add(row);
								}
							}
						}
						object.put("children", array);
					}
				}
			}
		}

		return object;
	}

	public ObjectNode getTreeJson(List<ITree> treeModels) {
		return this.getTreeJson(null, treeModels);
	}

	public ObjectNode getTreeJson(List<ITree> treeModels,
			boolean showParentIfNotChildren) {
		return this.getTreeJson(null, treeModels, showParentIfNotChildren);
	}

}
