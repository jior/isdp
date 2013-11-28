package com.glaf.isdp.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.domain.ColumnDefinition;
import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.service.ITableDefinitionService;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.ParamUtils;
import com.glaf.isdp.domain.CellDataField;
import com.glaf.isdp.domain.CellDataTable;
import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.mapper.CellDataTableMapper;
import com.glaf.isdp.query.CellDataTableQuery;
import com.glaf.isdp.service.ICellDataFieldService;
import com.glaf.isdp.service.ICellDataTableService;
import com.glaf.isdp.service.IFieldInterfaceService;

@Service("cellDataTableService")
@Transactional(readOnly = true)
public class MxCellDataTableServiceImpl implements ICellDataTableService {
	protected static final Log logger = LogFactory
			.getLog(MxCellDataTableServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellDataTableMapper cellDataTableMapper;

	protected ICellDataFieldService cellDataFieldService;

	protected IFieldInterfaceService fieldInterfaceService;

	protected ITableDefinitionService tableDefinitionService;

	public MxCellDataTableServiceImpl() {

	}

	public int count(CellDataTableQuery query) {
		query.ensureInitialized();
		return cellDataTableMapper
				.getCellDataTableCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellDataTableMapper.deleteCellDataTableById(id);
	}

	public CellDataTable getCellDataTable(String id) {
		CellDataTable cellDataTable = cellDataTableMapper
				.getCellDataTableById(id);
		if (cellDataTable != null) {
			List<FieldInterface> fields = fieldInterfaceService
					.getFieldsByFrmType(cellDataTable.getId());
			cellDataTable.setFields(fields);

			List<CellDataField> cellDataFields = cellDataFieldService
					.getCellDataFieldsByTableId(cellDataTable.getId());
			cellDataTable.setCellDataFields(cellDataFields);
		}
		return cellDataTable;
	}

	/**
	 * 根据表名获取表定义信息
	 * 
	 * @param tablename
	 * @return
	 */
	public CellDataTable getCellDataTableByTablename(String tablename) {
		CellDataTable cellDataTable = cellDataTableMapper
				.getCellDataTableByTablename(tablename);
		if (cellDataTable != null) {
			List<FieldInterface> fields = fieldInterfaceService
					.getFieldsByFrmType(cellDataTable.getId());
			cellDataTable.setFields(fields);

			List<CellDataField> cellDataFields = cellDataFieldService
					.getCellDataFieldsByTableId(cellDataTable.getId());
			cellDataTable.setCellDataFields(cellDataFields);
		}
		return cellDataTable;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellDataTableCount(Map<String, Object> parameter) {
		return cellDataTableMapper.getCellDataTableCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellDataTableCountByQueryCriteria(CellDataTableQuery query) {
		return cellDataTableMapper
				.getCellDataTableCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellDataTable> getCellDataTables(Map<String, Object> parameter) {
		return cellDataTableMapper.getCellDataTables(parameter);
	}

	/**
	 * 根据文件编号获取表格定义信息（一个Cell文件定义分解到多个CellDataTable）
	 * 
	 * @param filedotFileId
	 * @return
	 */
	public List<CellDataTable> getCellDataTablesByFiledotId(String filedotFileId) {
		return cellDataTableMapper
				.getCellDataTablesByFiledotId(filedotFileId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<CellDataTable> getCellDataTablesByQueryCriteria(int start,
			int pageSize, CellDataTableQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellDataTable> rows = sqlSession.selectList(
				"getCellDataTablesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public int getTableRecordCount(String tablename, String actorId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		String date = DateUtils.getDateTime(DateUtils.YEAR_MONTH_DAY_FORMAT,
				new java.util.Date());
		String idLike = date + "/" + actorId + "-%";
		parameter.put("tablename", tablename);
		parameter.put("idLike", idLike);
		CellDataTableQuery query = new CellDataTableQuery();
		query.tablename(tablename);
		query.setIdLike(idLike);
		int count = cellDataTableMapper.getTableRecordCount(query);
		return count;
	}

	public String getNextId(String tablename, String actorId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		String date = DateUtils.getDateTime(DateUtils.YEAR_MONTH_DAY_FORMAT,
				new java.util.Date());
		String idLike = date + "/" + actorId + "-%";
		parameter.put("tablename", tablename);
		parameter.put("idLike", idLike);
		CellDataTableQuery query = new CellDataTableQuery();
		query.tablename(tablename);
		query.setIdLike(idLike);
		int count = cellDataTableMapper.getTableRecordCount(query);
		count = count + 1;
		StringBuffer sb = new StringBuffer();
		sb.append(date).append("/").append(actorId).append("-");
		if (count < 10) {
			sb.append("000000").append(count);
		} else if (count < 100) {
			sb.append("00000").append(count);
		} else if (count < 1000) {
			sb.append("0000").append(count);
		} else if (count < 10000) {
			sb.append("000").append(count);
		} else if (count < 100000) {
			sb.append("00").append(count);
		} else if (count < 1000000) {
			sb.append("0").append(count);
		}
		return sb.toString();
	}

	@Transactional
	public void insertCellUserData(CellDataTable model,
			Map<String, Object> dataMap) {
		String tablename = model.getTablename();
		if (!StringUtils.startsWith(tablename, "cell_useradd")) {
			return;
		}

		Map<String, Object> tmpMap = new HashMap<String, Object>();
		Set<Entry<String, Object>> entrySet = dataMap.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String name = entry.getKey();
			Object value = entry.getValue();
			tmpMap.put(name, value);
			tmpMap.put(name.toLowerCase(), value);
		}

		String actorId = MapUtils.getString(tmpMap, "actorId");
		if (actorId == null) {
			actorId = "system";
		}

		if (!tmpMap.containsKey("id")) {
			String nextId = this.getNextId(tablename, actorId);
			tmpMap.put("id", nextId);
		}

		int count = this.getTableRecordCount(tablename, actorId);
		count = count + 1;
		tmpMap.put("index_id", count);
		tmpMap.put("listno", count);

		String parentId = MapUtils.getString(tmpMap, "parentId");
		if (parentId == null) {
			parentId = MapUtils.getString(tmpMap, "parent_id");
		}

		if (StringUtils.isEmpty(parentId)) {
			tmpMap.put("parent_id", -1);
			tmpMap.put("treeid", tmpMap.get("index_id") + "|");
		} else {
			Map<String, Object> parameter = new HashMap<String, Object>();
			parameter.put("tablename", tablename);
			parameter.put("id", tmpMap.get("id"));
			CellDataTableQuery query = new CellDataTableQuery();
			query.tablename(tablename);
			query.setId(MapUtils.getString(tmpMap, "id"));
			Map<String, Object> map = cellDataTableMapper
					.getTableRecord(query);
			if (map != null && map.get("treeid") != null) {
				tmpMap.put("treeid", MapUtils.getString(tmpMap, "treeid")
						+ MapUtils.getString(tmpMap, "index_id") + "|");
			}
		}

		List<ColumnDefinition> columns = tableDefinitionService
				.getColumnDefinitionsByTableName(tablename);
		if (columns != null && !columns.isEmpty()) {
			List<ColumnDefinition> list = new ArrayList<ColumnDefinition>();
			for (ColumnDefinition column : columns) {
				String columnName = column.getColumnName();
				columnName = columnName.toLowerCase();
				String javaType = column.getJavaType();
				if (StringUtils.equals(javaType, "Boolean")) {
					boolean booleanValue = MapUtils.getBooleanValue(tmpMap,
							columnName);
					column.setValue(booleanValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Integer")) {
					int intValue = MapUtils.getIntValue(tmpMap, columnName);
					column.setIntValue(intValue);
					column.setValue(intValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Long")) {
					long longValue = MapUtils.getLongValue(tmpMap, columnName);
					column.setLongValue(longValue);
					column.setValue(longValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Float")) {
					double doubleValue = MapUtils.getFloatValue(tmpMap,
							columnName);
					column.setDoubleValue(doubleValue);
					column.setValue(doubleValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Double")) {
					double doubleValue = MapUtils.getDoubleValue(tmpMap,
							columnName);
					column.setDoubleValue(doubleValue);
					column.setValue(doubleValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Date")) {
					Timestamp t = ParamUtils.getTimestamp(tmpMap, columnName);
					column.setDateValue(t);
					column.setValue(t);
					list.add(column);
				} else if (StringUtils.equals(javaType, "String")) {
					String stringValue = MapUtils.getString(tmpMap, columnName);
					column.setStringValue(stringValue);
					column.setValue(stringValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Clob")) {
					String stringValue = MapUtils.getString(tmpMap, columnName);
					column.setStringValue(stringValue);
					column.setValue(stringValue);
					list.add(column);
				} else {
					Object value = MapUtils.getObject(tmpMap, columnName);
					column.setValue(value);
					list.add(column);
				}
			}
			model.setColumns(list);
			cellDataTableMapper.insertCellUserData(model);
		}
	}

	public List<CellDataTable> list(CellDataTableQuery query) {
		query.ensureInitialized();
		List<CellDataTable> list = cellDataTableMapper
				.getCellDataTablesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellDataTable cellDataTable) {
		if (StringUtils.isEmpty(cellDataTable.getId())) {
			cellDataTable.setId(idGenerator.getNextId());
			// cellDataTable.setId(idGenerator.getNextId());
			// cellDataTable.setCreateDate(new Date());
			cellDataTableMapper.insertCellDataTable(cellDataTable);
		} else {
			CellDataTable model = this.getCellDataTable(cellDataTable.getId());
			if (model != null) {
				if (cellDataTable.getTablename() != null) {
					model.setTablename(cellDataTable.getTablename());
				}
				if (cellDataTable.getName() != null) {
					model.setName(cellDataTable.getName());
				}
				model.setAddtype(cellDataTable.getAddtype());
				model.setMaxuser(cellDataTable.getMaxuser());
				model.setMaxsys(cellDataTable.getMaxsys());
				if (cellDataTable.getUserid() != null) {
					model.setUserid(cellDataTable.getUserid());
				}
				if (cellDataTable.getCtime() != null) {
					model.setCtime(cellDataTable.getCtime());
				}
				if (cellDataTable.getContent() != null) {
					model.setContent(cellDataTable.getContent());
				}
				if (cellDataTable.getSysnum() != null) {
					model.setSysnum(cellDataTable.getSysnum());
				}
				if (cellDataTable.getIssubtable() != null) {
					model.setIssubtable(cellDataTable.getIssubtable());
				}
				if (cellDataTable.getTopid() != null) {
					model.setTopid(cellDataTable.getTopid());
				}
				if (cellDataTable.getFiledotFileid() != null) {
					model.setFiledotFileid(cellDataTable.getFiledotFileid());
				}
				model.setIndexId(cellDataTable.getIndexId());
				model.setWinWidth(cellDataTable.getWinWidth());
				model.setWinHeight(cellDataTable.getWinHeight());
				model.setIntQuote(cellDataTable.getIntQuote());
				model.setIntLineEdit(cellDataTable.getIntLineEdit());
				if (cellDataTable.getPrintfileid() != null) {
					model.setPrintfileid(cellDataTable.getPrintfileid());
				}
				cellDataTableMapper.updateCellDataTable(model);
			}
		}
	}

	/**
	 * 保存数据
	 * 
	 * @param tablename
	 * @param dataMap
	 */
	@Transactional
	public void saveCellUserData(String tablename, Map<String, Object> dataMap) {
		boolean exist = false;
		String id = MapUtils.getString(dataMap, "id");
		if (StringUtils.isNotEmpty(id)) {
			Map<String, Object> parameter = new HashMap<String, Object>();
			parameter.put("tablename", tablename);
			parameter.put("id", id);
			CellDataTableQuery query = new CellDataTableQuery();
			query.tablename(tablename);
			query.setId(id);
			int count = cellDataTableMapper.getCellUserDataCount(query);
			if (count > 0) {
				exist = true;
			}
		}

		CellDataTable model = new CellDataTable();
		model.setTablename(tablename);
		if (exist) {
			this.updateCellUserData(id, model, dataMap);
		} else {
			this.insertCellUserData(model, dataMap);
		}
	}

	@javax.annotation.Resource
	public void setCellDataFieldService(
			ICellDataFieldService cellDataFieldService) {
		this.cellDataFieldService = cellDataFieldService;
	}

	@javax.annotation.Resource
	public void setCellDataTableMapper(
			CellDataTableMapper cellDataTableMapper) {
		this.cellDataTableMapper = cellDataTableMapper;
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFieldInterfaceService(
			IFieldInterfaceService fieldInterfaceService) {
		this.fieldInterfaceService = fieldInterfaceService;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setTableDefinitionService(
			ITableDefinitionService tableDefinitionService) {
		this.tableDefinitionService = tableDefinitionService;
	}

	@Transactional
	public void updateCellUserData(String id, CellDataTable model,
			Map<String, Object> dataMap) {
		String tablename = model.getTablename();
		if (!StringUtils.startsWith(tablename, "cell_useradd")) {
			return;
		}

		Map<String, Object> tmpMap = new HashMap<String, Object>();
		Set<Entry<String, Object>> entrySet = dataMap.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String name = entry.getKey();
			Object value = entry.getValue();
			tmpMap.put(name, value);
			tmpMap.put(name.toLowerCase(), value);
		}

		List<ColumnDefinition> columns = tableDefinitionService
				.getColumnDefinitionsByTableName(tablename);
		if (columns != null && !columns.isEmpty()) {
			List<ColumnDefinition> list = new ArrayList<ColumnDefinition>();
			for (ColumnDefinition column : columns) {
				String columnName = column.getColumnName();
				if ("id".equals(columnName)) {
					column.setStringValue(id);
					column.setValue(id);
					model.setIdColumn(column);
					continue;
				}
				columnName = columnName.toLowerCase();
				String javaType = column.getJavaType();
				if (StringUtils.equals(javaType, "Boolean")) {
					boolean booleanValue = MapUtils.getBooleanValue(tmpMap,
							columnName);
					column.setValue(booleanValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Integer")) {
					int intValue = MapUtils.getIntValue(tmpMap, columnName);
					column.setIntValue(intValue);
					column.setValue(intValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Long")) {
					long longValue = MapUtils.getLongValue(tmpMap, columnName);
					column.setLongValue(longValue);
					column.setValue(longValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Float")) {
					double doubleValue = MapUtils.getFloatValue(tmpMap,
							columnName);
					column.setDoubleValue(doubleValue);
					column.setValue(doubleValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Double")) {
					double doubleValue = MapUtils.getDoubleValue(tmpMap,
							columnName);
					column.setDoubleValue(doubleValue);
					column.setValue(doubleValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Date")) {
					Timestamp t = ParamUtils.getTimestamp(tmpMap, columnName);
					column.setDateValue(t);
					column.setValue(t);
					list.add(column);
				} else if (StringUtils.equals(javaType, "String")) {
					String stringValue = MapUtils.getString(tmpMap, columnName);
					column.setStringValue(stringValue);
					column.setValue(stringValue);
					list.add(column);
				} else if (StringUtils.equals(javaType, "Clob")) {
					String stringValue = MapUtils.getString(tmpMap, columnName);
					column.setStringValue(stringValue);
					column.setValue(stringValue);
					list.add(column);
				} else {
					Object value = MapUtils.getObject(tmpMap, columnName);
					column.setValue(value);
					list.add(column);
				}

			}
			model.setColumns(list);
			cellDataTableMapper.updateCellUserData(model);
		}
	}

}
