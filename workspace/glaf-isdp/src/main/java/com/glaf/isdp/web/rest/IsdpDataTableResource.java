package com.glaf.isdp.web.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.query.TablePageQuery;
import com.glaf.core.service.ITablePageService;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.isdp.domain.CellDataTable;
 
import com.glaf.isdp.domain.FieldInterface;
import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.base.modules.sys.service.ICellTreedotPerService;
import com.glaf.base.modules.sys.service.ICellTreedotService;
import com.glaf.isdp.domain.TreeTableModel;
import com.glaf.isdp.domain.Treewbs;
import com.glaf.base.helper.JacksonTreeHelper;
import com.glaf.isdp.service.ICellDataFieldService;
import com.glaf.isdp.service.ICellDataTableService;
import com.glaf.isdp.service.ICellMenuService;
 
import com.glaf.isdp.service.IFieldInterfaceService;
import com.glaf.isdp.service.IMyCellBusiessService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IsdpTreepInfoService;
import com.glaf.isdp.service.ITreewbsService;
import com.glaf.isdp.service.ITreewbsTabService;
import com.glaf.isdp.service.IUserInfoService;
import com.glaf.isdp.util.EncodeUtils;

@Controller
@Path("/rs/isdp/datatable")
public class IsdpDataTableResource {
	protected final static Log logger = LogFactory
			.getLog(IsdpDataTableResource.class);

	protected ITablePageService tablePageService;

	protected ICellDataFieldService cellDataFieldService;

	protected ICellDataTableService cellDataTableService;

	protected IUserInfoService userInfoService;

	protected INetRoleService netRoleService;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected IFieldInterfaceService fieldInterfaceService;

	protected INetRoleUseService netRoleUseService;

	protected ICellTreedotPerService cellTreedotPerService;

	protected IMyCellBusiessService myCellBusiessService;

	protected IsdpTreepInfoService isdpTreepInfoService;

	protected ITreewbsTabService treewbsTabService;

	protected ITreewbsService treewbsService;

	public IsdpDataTableResource() {

	}

	@javax.annotation.Resource
	public void setCellDataFieldService(
			ICellDataFieldService cellDataFieldService) {
		this.cellDataFieldService = cellDataFieldService;
	}

	@javax.annotation.Resource
	public void setCellDataTableService(
			ICellDataTableService cellDataTableService) {
		this.cellDataTableService = cellDataTableService;
	}

	@javax.annotation.Resource
	public void setCellMenuService(ICellMenuService cellMenuService) {
		this.cellMenuService = cellMenuService;
	}

	@javax.annotation.Resource
	public void setCellTreedotPerService(
			ICellTreedotPerService cellTreedotPerService) {
		this.cellTreedotPerService = cellTreedotPerService;
	}

	@javax.annotation.Resource
	public void setCellTreedotService(ICellTreedotService cellTreedotService) {
		this.cellTreedotService = cellTreedotService;
	}

	@javax.annotation.Resource
	public void setFieldInterfaceService(
			IFieldInterfaceService fieldInterfaceService) {
		this.fieldInterfaceService = fieldInterfaceService;
	}

	@javax.annotation.Resource
	public void setMyCellBusiessService(
			IMyCellBusiessService myCellBusiessService) {
		this.myCellBusiessService = myCellBusiessService;
	}

	@javax.annotation.Resource
	public void setNetRoleService(INetRoleService netRoleService) {
		this.netRoleService = netRoleService;
	}

	@javax.annotation.Resource
	public void setNetRoleUseService(INetRoleUseService netRoleUseService) {
		this.netRoleUseService = netRoleUseService;
	}

	@javax.annotation.Resource
	public void setTablePageService(ITablePageService tablePageService) {
		this.tablePageService = tablePageService;
	}

	@javax.annotation.Resource
	public void setIsdpTreepInfoService(IsdpTreepInfoService isdpTreepInfoService) {
		this.isdpTreepInfoService = isdpTreepInfoService;
	}

	@javax.annotation.Resource
	public void setTreewbsService(ITreewbsService treewbsService) {
		this.treewbsService = treewbsService;
	}

	@javax.annotation.Resource
	public void setTreewbsTabService(ITreewbsTabService treewbsTabService) {
		this.treewbsTabService = treewbsTabService;
	}

	@javax.annotation.Resource
	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	@GET
	@POST
	@Path("/table")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] table(@Context HttpServletRequest request) {
		int indexId = RequestUtils.getInt(request, "indexId");
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		Treewbs treewbs = treewbsService.getTreewbsByPrimaryKey(indexId);
		if (treewbs != null && treewbs.getTypeTablename() != null) {
			String typeTablename = treewbs.getTypeTablename();
			CellDataTable dataTable = cellDataTableService
					.getCellDataTableByTablename(typeTablename);
			if (dataTable != null) {
				responseJSON = dataTable.toObjectNode();
				List<FieldInterface> fields = fieldInterfaceService
						.getFieldsByFrmType(dataTable.getId());
				if (fields != null && !fields.isEmpty()) {
					ArrayNode array = new ObjectMapper().createArrayNode();
					for (FieldInterface f : fields) {
						array.add(f.toObjectNode());
					}
					responseJSON.set("fields", array);
				}
			}
		}

		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/treeJson")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] treeJson(@Context HttpServletRequest request) {
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		String moduleId = request.getParameter("moduleId");
		if (StringUtils.isNotEmpty(moduleId)) {
			logger.debug("->moduleId:" + moduleId);
			moduleId = EncodeUtils.decode(moduleId);
			logger.debug("moduleId:" + moduleId);
			CellTreedot cellTreedot = cellTreedotService
					.getCellTreedotById(moduleId);
			if (cellTreedot != null) {
				if (cellTreedot.getModetableId() != null) {
					CellDataTable dataTable = cellDataTableService
							.getCellDataTable(cellTreedot.getModetableId());
					if (dataTable != null && dataTable.getTablename() != null) {
						TablePageQuery query = new TablePageQuery();
						query.setFirstResult(0);
						query.setMaxResults(5000);
						query.tableName(dataTable.getTablename());
						query.orderAsc("parent_id").orderAsc("listno");
						List<Map<String, Object>> rows = tablePageService
								.getTableData(query);
						if (rows != null && !rows.isEmpty()) {
							List<ITree> treeModels = new ArrayList<ITree>();
							for (Map<String, Object> dataMap : rows) {
								TreeTableModel tree = new TreeTableModel();
								tree.setDataMap(dataMap);
								tree.setId(ParamUtils.getString(dataMap, "id"));
								tree.setIndexId(ParamUtils.getInt(dataMap,
										"index_id"));
								tree.setParentId(ParamUtils.getInt(dataMap,
										"parent_id"));
								tree.setIndexName(ParamUtils.getString(dataMap,
										"name"));
								tree.setLevel(ParamUtils.getInt(dataMap,
										"nlevel"));
								tree.setListno(ParamUtils.getInt(dataMap,
										"listno"));
								tree.setTreeId(ParamUtils.getString(dataMap,
										"treeid"));
								treeModels.add(tree);
							}
							logger.debug("treeModels size:" + treeModels.size());
							JacksonTreeHelper treeHelper = new JacksonTreeHelper();
							responseJSON = treeHelper
									.getTreeArrayNode(treeModels);
						}
					}
				}
			}
		}

		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

}
