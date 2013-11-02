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
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.glaf.core.tree.component.TreeComponent;
import com.glaf.core.tree.component.TreeRepository;

import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.ITree;

public class IsdpTreeHelper {
	protected static final Log logger = LogFactory.getLog(IsdpTreeHelper.class);

	protected void addDataMap(TreeComponent component, JSONObject row) {
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
					} else {
						row.put(name, value);
					}
				}
			}
		}

		if (component.getTreeObject() != null) {
			if (component.getTreeObject() instanceof ITree) {
				ITree tree = (ITree) component.getTreeObject();

				JSONObject json = tree.toJsonObject();
				if (json != null && !json.isEmpty()) {
					Iterator<Entry<String, Object>> iterator = json.entrySet()
							.iterator();
					while (iterator.hasNext()) {
						Entry<String, Object> entry = iterator.next();
						String key = (String) entry.getKey();
						Object value = entry.getValue();
						if (value != null) {
							if (value instanceof Date) {
								Date d = (Date) value;
								row.put(key, DateUtils.getDate(d));
							} else {
								row.put(key, value);
							}
						}
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

	public void buildTree(JSONObject row, TreeComponent treeComponent,
			Collection<String> checkedNodes, Map<String, ITree> nodeMap) {
		if (treeComponent.getComponents() != null
				&& treeComponent.getComponents().size() > 0) {
			JSONArray array = new JSONArray();
			Iterator<?> iterator = treeComponent.getComponents().iterator();
			while (iterator.hasNext()) {
				TreeComponent component = (TreeComponent) iterator.next();
				ITree node = nodeMap.get(treeComponent.getId());
				JSONObject child = new JSONObject();
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

	public void buildTreeModel(JSONObject row, TreeComponent treeComponent) {
		if (treeComponent.getComponents() != null
				&& treeComponent.getComponents().size() > 0) {
			JSONArray array = new JSONArray();
			Iterator<?> iterator = treeComponent.getComponents().iterator();
			while (iterator.hasNext()) {
				TreeComponent component = (TreeComponent) iterator.next();
				JSONObject child = new JSONObject();
				this.addDataMap(component, child);
				child.put("id", component.getId());
				child.put("code", component.getCode());
				child.put("text", component.getTitle());
				child.put("name", component.getTitle());
				child.put("checked", component.isChecked());

				if (component.getComponents() != null
						&& component.getComponents().size() > 0) {
					child.put("leaf", Boolean.valueOf(false));
					this.buildTreeModel(child, component);
				} else {
					child.put("leaf", Boolean.valueOf(true));
				}
				array.add(child);
			}
			row.put("children", array);
		}
	}

	public JSONObject getJsonCheckboxNode(ITree root, List<ITree> trees,
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

		JSONObject object = new JSONObject();

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

		JSONArray array = new JSONArray();
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
							JSONObject row = new JSONObject();
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
							JSONObject row = new JSONObject();
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

	public JSONObject getTreeJson(ITree root, List<ITree> treeModels,
			boolean showParentIfNotChildren) {
		JSONObject object = new JSONObject();
		if (root != null) {
			object = root.toJsonObject();
			object.put("id", String.valueOf(root.getIndexId()));
			object.put("code", String.valueOf(root.getIndexId()));
			object.put("text", root.getIndexName());
			object.put("leaf", Boolean.valueOf(false));
			object.put("cls", "folder");
			object.put("checked", root.isChecked());
		}

		if (treeModels != null && treeModels.size() > 0) {
			JSONArray array = new JSONArray();
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
							JSONObject row = new JSONObject();
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

	public JSONObject getTreeJson(List<ITree> treeModels) {
		return this.getTreeJson(null, treeModels, true);
	}

	public JSONObject getTreeJson(List<ITree> treeModels,
			boolean showParentIfNotChildren) {
		return this.getTreeJson(null, treeModels, showParentIfNotChildren);
	}

	public JSONArray getTreeJSONArray(List<ITree> treeModels) {
		return this.getTreeJSONArray(treeModels, true);
	}

	public JSONArray getTreeJSONArray(List<ITree> treeModels,
			boolean showParentIfNotChildren) {
		JSONArray result = new JSONArray();
		if (treeModels != null && treeModels.size() > 0) {
			TreeRepository repository = this.build(treeModels);
			List<?> topTrees = repository.getTopTrees();
			logger.debug("topTrees:" + (topTrees != null ? topTrees.size() : 0));
			if (topTrees != null && topTrees.size() > 0) {
				for (int i = 0; i < topTrees.size(); i++) {
					TreeComponent component = (TreeComponent) topTrees.get(i);
					JSONObject row = new JSONObject();
					this.addDataMap(component, row);

					if (component.getId() != null) {
						row.put("id", component.getId());
					}
					if (component.getCode() != null) {
						row.put("code", component.getCode());
					}
					if (component.getTitle() != null) {
						row.put("text", component.getTitle());
						row.put("name", component.getTitle());
					}
					row.put("checked", component.isChecked());

					if (component.getComponents() != null
							&& component.getComponents().size() > 0) {
						row.put("leaf", Boolean.valueOf(false));
						row.put("cls", "folder");
						row.put("classes", "folder");
						this.buildTreeModel(row, component);
					} else {
						if (showParentIfNotChildren) {
							row.put("leaf", Boolean.valueOf(true));
						}
					}
					result.add(row);
				}
			}
		}

		return result;
	}

}
