package com.glaf.isdp.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.ObjectEntity;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.isdp.mapper.IsdpTreepInfoMapper;
import com.glaf.isdp.query.TreepInfoQuery;
import com.glaf.isdp.service.IsdpTreepInfoService;

@Service("isdpTreepInfoService")
@Transactional(readOnly = true)
public class MxTreepInfoServiceImpl implements IsdpTreepInfoService {
	protected static final Log logger = LogFactory
			.getLog(MxTreepInfoServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpTreepInfoMapper isdpTreepInfoMapper;

	public MxTreepInfoServiceImpl() {

	}

	public int count(TreepInfoQuery query) {
		query.ensureInitialized();
		return isdpTreepInfoMapper.getTreepInfoCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpTreepInfoMapper.deleteTreepInfoById(id);
	}

	public void deleteByPrimaryKey(int indexId) {
		isdpTreepInfoMapper.deleteTreepInfoByIndexId(indexId);
	}

	protected List<IsdpTreepInfo> getInnerTreepInfos(List<String> rowIds) {
		return this.getTreepInfoList(rowIds, 1, "0");
	}

	public IsdpTreepInfo getTreepInfoById(String id) {
		IsdpTreepInfo treepInfo = isdpTreepInfoMapper.getTreepInfoById(id);
		return treepInfo;
	}

	public IsdpTreepInfo getTreepInfoByPrimaryKey(int indexId) {
		return isdpTreepInfoMapper.getTreepInfoByIndexId(indexId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreepInfoCount(Map<String, Object> parameter) {
		return isdpTreepInfoMapper.getTreepInfoCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreepInfoCountByQueryCriteria(TreepInfoQuery query) {
		return isdpTreepInfoMapper.getTreepInfoCountByQueryCriteria(query);
	}

	public List<String> getTreepInfoIds(String strfuntion) {
		List<ObjectEntity> rows = isdpTreepInfoMapper
				.getTreepInfoIds(strfuntion);
		List<String> rowIds = new ArrayList<String>();
		if (rows != null && !rows.isEmpty()) {
			for (ObjectEntity o : rows) {
				rowIds.add(o.getStringValue());
			}
		}
		return rowIds;
	}

	public List<IsdpTreepInfo> getTreepInfoList(List<String> rowIds, int topId,
			String nodetype) {
		StringBuffer sb = new StringBuffer();
		sb.append(" select * from treepinfo where top_id=").append(topId)
				.append(" and nodetype='").append(nodetype).append("' and ( ");
		Iterator<String> iter = rowIds.iterator();
		while (iter.hasNext()) {
			String id = iter.next();
			sb.append(" '").append(id).append("' like id+'%' ");
			if (iter.hasNext()) {
				sb.append(" or ");
			}
		}
		sb.append(") order by parent_id, listno ");
		logger.debug("querySql:" + sb.toString());
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("querySql", sb.toString());
		return isdpTreepInfoMapper.getTreepInfosFromSql(parameter);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpTreepInfo> getTreepInfos(Map<String, Object> parameter) {
		return isdpTreepInfoMapper.getTreepInfos(parameter);
	}

	public List<IsdpTreepInfo> getTreepInfos(String strfuntion) {
		List<String> rowIds = this.getTreepInfoIds(strfuntion);
		List<IsdpTreepInfo> rows = new ArrayList<IsdpTreepInfo>();
		List<String> tempIds = new ArrayList<String>();
		for (String rowId : rowIds) {
			tempIds.add(rowId);
			if (tempIds.size() % 100 == 0) {
				List<IsdpTreepInfo> list = this.getInnerTreepInfos(tempIds);
				if (list != null && !list.isEmpty()) {
					rows.addAll(list);
				}
				tempIds.clear();
			}
		}

		if (tempIds.size() > 0) {
			List<IsdpTreepInfo> list = this.getInnerTreepInfos(tempIds);
			if (list != null && !list.isEmpty()) {
				rows.addAll(list);
			}
		}

		tempIds.clear();

		return rows;
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IsdpTreepInfo> getTreepInfosByQueryCriteria(int start,
			int pageSize, TreepInfoQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpTreepInfo> rows = sqlSession.selectList(
				"getTreepInfosByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<IsdpTreepInfo> getTreepInfosByTopId(String nodeType, int topId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("nodeType", nodeType);
		parameter.put("topId", topId);
		return isdpTreepInfoMapper.getTreepInfosByTopId(parameter);
	}

	public List<IsdpTreepInfo> getTreepInfosByTreedotIndexId(int indexId) {
		return isdpTreepInfoMapper.getTreepInfosByTreedotIndexId(indexId);
	}

	/**
	 * 获取WBS工程信息
	 * 
	 * @param indexId
	 * @return
	 */
	public List<IsdpTreepInfo> getWbsTreepInfosByIndexId(int indexId) {
		return isdpTreepInfoMapper.getWbsTreepInfosByIndexId(indexId);
	}

	public List<IsdpTreepInfo> getWfTreepInfos(int indexId, String strfuntion) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("indexId", indexId);
		parameter.put("strfuntion", strfuntion);
		return isdpTreepInfoMapper.getWfTreepInfos(parameter);
	}

	public List<IsdpTreepInfo> list(TreepInfoQuery query) {
		query.ensureInitialized();
		List<IsdpTreepInfo> list = isdpTreepInfoMapper
				.getTreepInfosByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpTreepInfo treepInfo) {
		if (treepInfo.getIndexId() == 0) {
			treepInfo.setIndexId(idGenerator.nextId().intValue());
			// treepInfo.setIndexId(idGenerator.getNextId());
			// treepInfo.setCreateDate(new Date());
			isdpTreepInfoMapper.insertTreepInfo(treepInfo);
		} else {
			IsdpTreepInfo model = this.getTreepInfoByPrimaryKey(treepInfo
					.getIndexId());
			if (model != null) {
				if (treepInfo.getId() != null) {
					model.setId(treepInfo.getId());
				}
				if (treepInfo.getNum() != null) {
					model.setNum(treepInfo.getNum());
				}
				model.setTopId(treepInfo.getTopId());
				if (treepInfo.getIndexName() != null) {
					model.setIndexName(treepInfo.getIndexName());
				}
				model.setNlevel(treepInfo.getNlevel());
				if (treepInfo.getNodetype() != null) {
					model.setNodetype(treepInfo.getNodetype());
				}
				model.setFromid(treepInfo.getFromid());
				model.setPartId(treepInfo.getPartId());
				model.setShowid(treepInfo.getShowid());
				if (treepInfo.getSindexName() != null) {
					model.setSindexName(treepInfo.getSindexName());
				}
				model.setFilenum(treepInfo.getFilenum());
				model.setFilenum0(treepInfo.getFilenum0());
				model.setFilenum1(treepInfo.getFilenum1());
				model.setFilenum2(treepInfo.getFilenum2());
				if (treepInfo.getProjtype() != null) {
					model.setProjtype(treepInfo.getProjtype());
				}
				if (treepInfo.getCid() != null) {
					model.setCid(treepInfo.getCid());
				}
				model.setDwid(treepInfo.getDwid());
				model.setFbid(treepInfo.getFbid());
				model.setFxid(treepInfo.getFxid());
				if (treepInfo.getJid() != null) {
					model.setJid(treepInfo.getJid());
				}
				if (treepInfo.getFlid() != null) {
					model.setFlid(treepInfo.getFlid());
				}
				if (treepInfo.getTopnode() != null) {
					model.setTopnode(treepInfo.getTopnode());
				}
				model.setNodeico(treepInfo.getNodeico());
				if (treepInfo.getOutflag() != null) {
					model.setOutflag(treepInfo.getOutflag());
				}
				if (treepInfo.getInflag() != null) {
					model.setInflag(treepInfo.getInflag());
				}
				if (treepInfo.getPassword() != null) {
					model.setPassword(treepInfo.getPassword());
				}
				if (treepInfo.getListnum() != null) {
					model.setListnum(treepInfo.getListnum());
				}
				if (treepInfo.getWcompany() != null) {
					model.setWcompany(treepInfo.getWcompany());
				}
				model.setListno(treepInfo.getListno());
				model.setPlevel(treepInfo.getPlevel());
				if (treepInfo.getUsernmu() != null) {
					model.setUsernmu(treepInfo.getUsernmu());
				}
				model.setIndexIdOld(treepInfo.getIndexIdOld());
				model.setPindexId(treepInfo.getPindexId());
				model.setFinishint(treepInfo.getFinishint());
				if (treepInfo.getTypeTablename() != null) {
					model.setTypeTablename(treepInfo.getTypeTablename());
				}
				if (treepInfo.getTreeDliststr() != null) {
					model.setTreeDliststr(treepInfo.getTreeDliststr());
				}
				model.setPfilesIndex(treepInfo.getPfilesIndex());
				if (treepInfo.getBdate() != null) {
					model.setBdate(treepInfo.getBdate());
				}
				if (treepInfo.getEdate() != null) {
					model.setEdate(treepInfo.getEdate());
				}
				model.setWbsindex(treepInfo.getWbsindex());
				if (treepInfo.getBdateS() != null) {
					model.setBdateS(treepInfo.getBdateS());
				}
				if (treepInfo.getEdateS() != null) {
					model.setEdateS(treepInfo.getEdateS());
				}
				if (treepInfo.getTypeId() != null) {
					model.setTypeId(treepInfo.getTypeId());
				}
				model.setCell1(treepInfo.getCell1());
				model.setCell2(treepInfo.getCell2());
				model.setCell3(treepInfo.getCell3());
				if (treepInfo.getStrfileLocate() != null) {
					model.setStrfileLocate(treepInfo.getStrfileLocate());
				}
				model.setIntpfile1(treepInfo.getIntpfile1());
				model.setIntpfile2(treepInfo.getIntpfile2());
				model.setIntpfile3(treepInfo.getIntpfile3());
				model.setIntcellfinish(treepInfo.getIntcellfinish());
				if (treepInfo.getSysId() != null) {
					model.setSysId(treepInfo.getSysId());
				}
				model.setIndexIn(treepInfo.getIndexIn());
				if (treepInfo.getStrButtonStar() != null) {
					model.setStrButtonStar(treepInfo.getStrButtonStar());
				}
				model.setIntisuse(treepInfo.getIntisuse());
				model.setWbsindexIn(treepInfo.getWbsindexIn());
				isdpTreepInfoMapper.updateTreepInfo(model);
			}
		}
	}

	@javax.annotation.Resource(name = "myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name = "myBatisDbIdGenerator")
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setIsdpTreepInfoMapper(IsdpTreepInfoMapper isdpTreepInfoMapper) {
		this.isdpTreepInfoMapper = isdpTreepInfoMapper;
	}

}
