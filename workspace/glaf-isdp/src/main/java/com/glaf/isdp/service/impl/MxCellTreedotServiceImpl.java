package com.glaf.isdp.service.impl;

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
import com.glaf.isdp.domain.CellTreedot;
import com.glaf.isdp.mapper.CellTreedotMapper;
import com.glaf.isdp.query.CellTreedotQuery;
import com.glaf.isdp.service.ICellTreedotService;

@Service("cellTreedotService")
@Transactional(readOnly = true)
public class MxCellTreedotServiceImpl implements ICellTreedotService {
	protected static final Log logger = LogFactory
			.getLog(MxCellTreedotServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellTreedotMapper cellTreedotMapper;

	public MxCellTreedotServiceImpl() {

	}

	public int count(CellTreedotQuery query) {
		query.ensureInitialized();
		return cellTreedotMapper.getCellTreedotCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellTreedotMapper.deleteCellTreedotById(id);
	}

	public void deleteByPrimaryKey(int indexId) {
		cellTreedotMapper.deleteCellTreedotByIndexId(indexId);
	}

	public CellTreedot getCellTreedotById(String id) {
		CellTreedot cellTreedot = cellTreedotMapper.getCellTreedotById(id);
		return cellTreedot;
	}

	public CellTreedot getCellTreedotByPrimaryKey(int indexId) {
		return cellTreedotMapper.getCellTreedotByIndexId(indexId);
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	public int getCellTreedotCount(Map<String, Object> parameter) {
		return cellTreedotMapper.getCellTreedotCount(parameter);
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	public int getCellTreedotCountByQueryCriteria(CellTreedotQuery query) {
		return cellTreedotMapper.getCellTreedotCountByQueryCriteria(query);
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	public List<CellTreedot> getCellTreedots(Map<String, Object> parameter) {
		return cellTreedotMapper.getCellTreedots(parameter);
	}

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	public List<CellTreedot> getCellTreedotsByQueryCriteria(int start,
			int pageSize, CellTreedotQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellTreedot> rows = sqlSession.selectList(
				"getCellTreedotsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellTreedot> getCellTreedotsByTopId(String topId) {
		return cellTreedotMapper.getCellTreedotsByTopId(topId);
	}

	/**
	 * ���ݸ�ID��ȡ�����˵�
	 * 
	 * @param parentId
	 * @return
	 */
	public List<CellTreedot> getChildrenCellTreedots(int parentId) {
		return cellTreedotMapper.getChildrenCellTreedots(parentId);
	}

	public List<CellTreedot> getSystemInitCellTreedots() {
		return cellTreedotMapper.getCellTreedotsByTopId("system_init");
	}

	/**
	 * ����topId��ȡ����˵�
	 * 
	 * @param topId
	 * @return
	 */
	public List<CellTreedot> getTopLevelCellTreedotsByTopId(String topId) {
		return cellTreedotMapper.getTopLevelCellTreedotsByTopId(topId);
	}

	public List<CellTreedot> list(CellTreedotQuery query) {
		query.ensureInitialized();
		List<CellTreedot> list = cellTreedotMapper
				.getCellTreedotsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellTreedot cellTreedot) {
		if (cellTreedot.getIndexId() == 0) {
			cellTreedot.setIndexId(idGenerator.nextId().intValue());
			// cellTreedot.setIndexId(idGenerator.getNextId());
			// cellTreedot.setCreateDate(new Date());
			cellTreedotMapper.insertCellTreedot(cellTreedot);
		} else {
			CellTreedot model = this.getCellTreedotByPrimaryKey(cellTreedot
					.getIndexId());
			if (model != null) {
				if (cellTreedot.getId() != null) {
					model.setId(cellTreedot.getId());
				}
				if (cellTreedot.getIndexName() != null) {
					model.setIndexName(cellTreedot.getIndexName());
				}
				model.setNlevel(cellTreedot.getNlevel());
				if (cellTreedot.getNum() != null) {
					model.setNum(cellTreedot.getNum());
				}
				if (cellTreedot.getContent() != null) {
					model.setContent(cellTreedot.getContent());
				}
				model.setNodeico(cellTreedot.getNodeico());
				if (cellTreedot.getSindexName() != null) {
					model.setSindexName(cellTreedot.getSindexName());
				}
				model.setListno(cellTreedot.getListno());
				model.setViewtype(cellTreedot.getViewtype());
				if (cellTreedot.getIsmode() != null) {
					model.setIsmode(cellTreedot.getIsmode());
				}
				if (cellTreedot.getModetableId() != null) {
					model.setModetableId(cellTreedot.getModetableId());
				}
				model.setIssystem(cellTreedot.getIssystem());
				if (cellTreedot.getCustomData() != null) {
					model.setCustomData(cellTreedot.getCustomData());
				}
				model.setIntsystemselect(cellTreedot.getIntsystemselect());
				model.setIntused(cellTreedot.getIntused());
				model.setIntdel(cellTreedot.getIntdel());
				if (cellTreedot.getTypeTablename() != null) {
					model.setTypeTablename(cellTreedot.getTypeTablename());
				}
				model.setIntoperation(cellTreedot.getIntoperation());
				if (cellTreedot.getPicfile() != null) {
					model.setPicfile(cellTreedot.getPicfile());
				}
				model.setFileContent(cellTreedot.getFileContent());
				model.setIntMuiFrm(cellTreedot.getIntMuiFrm());
				model.setIntnoshow(cellTreedot.getIntnoshow());
				if (cellTreedot.getTypeBasetable() != null) {
					model.setTypeBasetable(cellTreedot.getTypeBasetable());
				}
				model.setTypeIndex(cellTreedot.getTypeIndex());
				if (cellTreedot.getGid() != null) {
					model.setGid(cellTreedot.getGid());
				}
				cellTreedotMapper.updateCellTreedot(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellTreedotMapper(
			CellTreedotMapper cellTreedotMapper) {
		this.cellTreedotMapper = cellTreedotMapper;
	}

 
	@javax.annotation.Resource(name="myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name="myBatisDbIdGenerator")
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
