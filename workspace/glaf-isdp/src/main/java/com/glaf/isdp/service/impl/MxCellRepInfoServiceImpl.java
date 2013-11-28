package com.glaf.isdp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.CellRepInfo;
import com.glaf.isdp.mapper.CellRepInfoMapper;
import com.glaf.isdp.query.CellRepInfoQuery;
import com.glaf.isdp.service.ICellRepInfoService;

@Service("cellRepInfoService")
@Transactional(readOnly = true)
public class MxCellRepInfoServiceImpl implements ICellRepInfoService {
	protected static final Log logger = LogFactory
			.getLog(MxCellRepInfoServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellRepInfoMapper cellRepInfoMapper;

	public MxCellRepInfoServiceImpl() {

	}

	public int count(CellRepInfoQuery query) {
		query.ensureInitialized();
		return cellRepInfoMapper.getCellRepInfoCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellRepInfoMapper.deleteCellRepInfoById(id);
	}

	public CellRepInfo getCellRepInfo(String id) {
		CellRepInfo cellRepInfo = cellRepInfoMapper.getCellRepInfoById(id);
		return cellRepInfo;
	}

	/**
	 * 根据主键返回该对象及各个关联信息
	 * 
	 * @param id
	 * @return
	 */
	public CellRepInfo getCellRepInfoWithAll(String id) {
		CellRepInfo cellRepInfo = cellRepInfoMapper.getCellRepInfoById(id);
		if (cellRepInfo != null) {

		}
		return cellRepInfo;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellRepInfoCount(Map<String, Object> parameter) {
		return cellRepInfoMapper.getCellRepInfoCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellRepInfoCountByQueryCriteria(CellRepInfoQuery query) {
		return cellRepInfoMapper.getCellRepInfoCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellRepInfo> getCellRepInfos(Map<String, Object> parameter) {
		return cellRepInfoMapper.getCellRepInfos(parameter);
	}

	/**
	 * 获取某个角色某个表格的单元格信息
	 * 
	 * @param filedot_fileid
	 * @param roleid
	 * @param celltreedot_index
	 * @return
	 */
	public List<CellRepInfo> getRoleUseExistsCellRepInfos(
			String filedot_fileid, int roleid, int celltreedot_index) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("filedotId", filedot_fileid);
		parameter.put("roleid", roleid);
		parameter.put("celltreedot_index", celltreedot_index);
		return cellRepInfoMapper.getRoleUseExistsCellRepInfos(parameter);
	}

	/**
	 * 获取某个角色某个表格的单元格信息
	 * 
	 * @param filedot_fileid
	 * @param roleid
	 * @param celltreedot_index
	 * @return
	 */
	public List<CellRepInfo> getRoleUseNotExistsCellRepInfos(
			String filedot_fileid, int roleid, int celltreedot_index) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("filedotId", filedot_fileid);
		parameter.put("roleid", roleid);
		parameter.put("celltreedot_index", celltreedot_index);
		return cellRepInfoMapper
				.getRoleUseNotExistsCellRepInfos(parameter);
	}

	/**
	 * 根据文件编号获取表格定义信息
	 * 
	 * @param filedotId
	 * @return
	 */
	public List<CellRepInfo> getCellRepInfosByFiledotId(String filedotId) {
		return cellRepInfoMapper.getCellRepInfosByFiledotId(filedotId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellRepInfo> getCellRepInfosByQueryCriteria(int start,
			int pageSize, CellRepInfoQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellRepInfo> rows = sqlSession.selectList(
				"getCellRepInfosByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellRepInfo> list(CellRepInfoQuery query) {
		query.ensureInitialized();
		List<CellRepInfo> list = cellRepInfoMapper
				.getCellRepInfosByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellRepInfo cellRepInfo) {
		if (StringUtils.isEmpty(cellRepInfo.getListId())) {
			cellRepInfo.setListId(idGenerator.getNextId());
			// cellRepInfo.setListId(idGenerator.getNextId());
			// cellRepInfo.setCreateDate(new Date());
			cellRepInfoMapper.insertCellRepInfo(cellRepInfo);
		} else {
			CellRepInfo model = this.getCellRepInfo(cellRepInfo.getListId());
			if (model != null) {
				if (cellRepInfo.getIndexId() != null) {
					model.setIndexId(cellRepInfo.getIndexId());
				}
				if (cellRepInfo.getFrmtype() != null) {
					model.setFrmtype(cellRepInfo.getFrmtype());
				}
				if (cellRepInfo.getIssystem() != null) {
					model.setIssystem(cellRepInfo.getIssystem());
				}
				if (cellRepInfo.getFname() != null) {
					model.setFname(cellRepInfo.getFname());
				}
				if (cellRepInfo.getDname() != null) {
					model.setDname(cellRepInfo.getDname());
				}
				if (cellRepInfo.getDtype() != null) {
					model.setDtype(cellRepInfo.getDtype());
				}
				if (cellRepInfo.getShowtype() != null) {
					model.setShowtype(cellRepInfo.getShowtype());
				}
				model.setStrlen(cellRepInfo.getStrlen());
				if (cellRepInfo.getForm() != null) {
					model.setForm(cellRepInfo.getForm());
				}
				if (cellRepInfo.getIntype() != null) {
					model.setIntype(cellRepInfo.getIntype());
				}
				if (cellRepInfo.getHintID() != null) {
					model.setHintID(cellRepInfo.getHintID());
				}
				model.setListno(cellRepInfo.getListno());
				if (cellRepInfo.getZtype() != null) {
					model.setZtype(cellRepInfo.getZtype());
				}
				if (cellRepInfo.getIsmustfill() != null) {
					model.setIsmustfill(cellRepInfo.getIsmustfill());
				}
				if (cellRepInfo.getIsListShow() != null) {
					model.setIsListShow(cellRepInfo.getIsListShow());
				}
				model.setListweigth(cellRepInfo.getListweigth());
				if (cellRepInfo.getPanid() != null) {
					model.setPanid(cellRepInfo.getPanid());
				}
				if (cellRepInfo.getIsallwidth() != null) {
					model.setIsallwidth(cellRepInfo.getIsallwidth());
				}
				if (cellRepInfo.getIstname() != null) {
					model.setIstname(cellRepInfo.getIstname());
				}
				if (cellRepInfo.getFiledotFileid() != null) {
					model.setFiledotFileid(cellRepInfo.getFiledotFileid());
				}
				model.setDatapoint(cellRepInfo.getDatapoint());
				if (cellRepInfo.getDefaultvalue() != null) {
					model.setDefaultvalue(cellRepInfo.getDefaultvalue());
				}
				if (cellRepInfo.getIssubtable() != null) {
					model.setIssubtable(cellRepInfo.getIssubtable());
				}
				if (cellRepInfo.getIsdataonly() != null) {
					model.setIsdataonly(cellRepInfo.getIsdataonly());
				}
				model.setChecktype(cellRepInfo.getChecktype());
				if (cellRepInfo.getOrderid() != null) {
					model.setOrderid(cellRepInfo.getOrderid());
				}
				model.setCelltype(cellRepInfo.getCelltype());
				if (cellRepInfo.getOstTablename() != null) {
					model.setOstTablename(cellRepInfo.getOstTablename());
				}
				model.setOstRow(cellRepInfo.getOstRow());
				model.setOstCol(cellRepInfo.getOstCol());
				if (cellRepInfo.getHintlist() != null) {
					model.setHintlist(cellRepInfo.getHintlist());
				}
				if (cellRepInfo.getOstCellid() != null) {
					model.setOstCellid(cellRepInfo.getOstCellid());
				}
				if (cellRepInfo.getOlddname() != null) {
					model.setOlddname(cellRepInfo.getOlddname());
				}
				if (cellRepInfo.getOstCellname() != null) {
					model.setOstCellname(cellRepInfo.getOstCellname());
				}
				if (cellRepInfo.getOstFormula() != null) {
					model.setOstFormula(cellRepInfo.getOstFormula());
				}
				model.setOstColor(cellRepInfo.getOstColor());
				model.setOstSumtype(cellRepInfo.getOstSumtype());
				if (cellRepInfo.getDataTablename() != null) {
					model.setDataTablename(cellRepInfo.getDataTablename());
				}
				if (cellRepInfo.getDataFieldname() != null) {
					model.setDataFieldname(cellRepInfo.getDataFieldname());
				}
				model.setOrderCon(cellRepInfo.getOrderCon());
				model.setConnum(cellRepInfo.getConnum());
				model.setNodeIndex(cellRepInfo.getNodeIndex());
				if (cellRepInfo.getTypeId() != null) {
					model.setTypeId(cellRepInfo.getTypeId());
				}
				if (cellRepInfo.getUserindex() != null) {
					model.setUserindex(cellRepInfo.getUserindex());
				}
				model.setOrderIndex(cellRepInfo.getOrderIndex());
				if (cellRepInfo.getParentDname() != null) {
					model.setParentDname(cellRepInfo.getParentDname());
				}
				model.setSysauto(cellRepInfo.getSysauto());
				model.setOrderIndexF(cellRepInfo.getOrderIndexF());
				if (cellRepInfo.getOrderidF() != null) {
					model.setOrderidF(cellRepInfo.getOrderidF());
				}
				model.setOrderConF(cellRepInfo.getOrderConF());
				model.setIsprintvalue(cellRepInfo.getIsprintvalue());
				cellRepInfoMapper.updateCellRepInfo(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellRepInfoMapper(
			CellRepInfoMapper cellRepInfoMapper) {
		this.cellRepInfoMapper = cellRepInfoMapper;
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
