package com.glaf.isdp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.CellCriterion;
import com.glaf.isdp.domain.IsdpFiledot;
import com.glaf.isdp.mapper.CellCriterionMapper;
import com.glaf.isdp.query.CellCriterionQuery;
import com.glaf.isdp.service.ICellCriterionService;
import com.glaf.isdp.service.IsdpFiledotService;

@Service("cellCriterionService")
@Transactional(readOnly = true)
public class MxCellCriterionServiceImpl implements ICellCriterionService {
	protected static final Log logger = LogFactory
			.getLog(MxCellCriterionServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellCriterionMapper cellCriterionMapper;

	protected IsdpFiledotService filedotService;

	public MxCellCriterionServiceImpl() {

	}

	public int count(CellCriterionQuery query) {
		query.ensureInitialized();
		return cellCriterionMapper
				.getCellCriterionCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellCriterionMapper.deleteCellCriterionById(id);
	}

	public CellCriterion getCellCriterion(String id) {
		CellCriterion cellCriterion = cellCriterionMapper
				.getCellCriterionById(id);
		return cellCriterion;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellCriterionCount(Map<String, Object> parameter) {
		return cellCriterionMapper.getCellCriterionCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellCriterionCountByQueryCriteria(CellCriterionQuery query) {
		return cellCriterionMapper
				.getCellCriterionCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellCriterion> getCellCriterions(Map<String, Object> parameter) {
		return cellCriterionMapper.getCellCriterions(parameter);
	}

	public List<CellCriterion> getCellCriterionByWBS(int wbsIndexId,
			int intistasks) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("index_id", wbsIndexId);
		parameter.put("intistasks", intistasks);
		List<CellCriterion> list = cellCriterionMapper
				.getCellCriterionByWBS(parameter);
		if (list != null && !list.isEmpty()) {
			for (CellCriterion cell : list) {
				List<IsdpFiledot> files = filedotService
						.getFiledotsByCheckItemId(cell.getId());
				cell.setFiledots(files);
			}
		}
		return list;
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<CellCriterion> getCellCriterionsByQueryCriteria(int start,
			int pageSize, CellCriterionQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellCriterion> rows = sqlSession.selectList(
				"getCellCriterionsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellCriterion> list(CellCriterionQuery query) {
		query.ensureInitialized();
		List<CellCriterion> list = cellCriterionMapper
				.getCellCriterionsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellCriterion cellCriterion) {
		if (StringUtils.isEmpty(cellCriterion.getId())) {
			cellCriterion.setId(idGenerator.getNextId());
			// cellCriterion.setId(idGenerator.getNextId());
			// cellCriterion.setCreateDate(new Date());
			cellCriterionMapper.insertCellCriterion(cellCriterion);
		} else {
			CellCriterion model = this.getCellCriterion(cellCriterion.getId());
			if (model != null) {
				model.setIndexId(cellCriterion.getIndexId());
				model.setTypeint(cellCriterion.getTypeint());
				if (cellCriterion.getType() != null) {
					model.setType(cellCriterion.getType());
				}
				if (cellCriterion.getNum() != null) {
					model.setNum(cellCriterion.getNum());
				}
				if (cellCriterion.getContent() != null) {
					model.setContent(cellCriterion.getContent());
				}
				if (cellCriterion.getUnit() != null) {
					model.setUnit(cellCriterion.getUnit());
				}
				if (cellCriterion.getAlltext() != null) {
					model.setAlltext(cellCriterion.getAlltext());
				}
				if (cellCriterion.getChkway() != null) {
					model.setChkway(cellCriterion.getChkway());
				}
				model.setScale(cellCriterion.getScale());
				model.setPoint(cellCriterion.getPoint());
				model.setUsetypeint(cellCriterion.getUsetypeint());
				model.setChecktype(cellCriterion.getChecktype());
				if (cellCriterion.getKeytext() != null) {
					model.setKeytext(cellCriterion.getKeytext());
				}
				if (cellCriterion.getMinallow() != null) {
					model.setMinallow(cellCriterion.getMinallow());
				}
				if (cellCriterion.getMinallowS() != null) {
					model.setMinallowS(cellCriterion.getMinallowS());
				}
				if (cellCriterion.getMaxallow() != null) {
					model.setMaxallow(cellCriterion.getMaxallow());
				}
				if (cellCriterion.getMaxallowS() != null) {
					model.setMaxallowS(cellCriterion.getMaxallowS());
				}
				model.setListno(cellCriterion.getListno());
				model.setConint(cellCriterion.getConint());
				if (cellCriterion.getConmin() != null) {
					model.setConmin(cellCriterion.getConmin());
				}
				if (cellCriterion.getConminS() != null) {
					model.setConminS(cellCriterion.getConminS());
				}
				if (cellCriterion.getConmax() != null) {
					model.setConmax(cellCriterion.getConmax());
				}
				if (cellCriterion.getConmaxS() != null) {
					model.setConmaxS(cellCriterion.getConmaxS());
				}
				if (cellCriterion.getConstr() != null) {
					model.setConstr(cellCriterion.getConstr());
				}
				if (cellCriterion.getUsingstr() != null) {
					model.setUsingstr(cellCriterion.getUsingstr());
				}
				if (cellCriterion.getSubnum() != null) {
					model.setSubnum(cellCriterion.getSubnum());
				}
				model.setChkvalueint(cellCriterion.getChkvalueint());
				if (cellCriterion.getStrposc() != null) {
					model.setStrposc(cellCriterion.getStrposc());
				}
				if (cellCriterion.getStrposc2() != null) {
					model.setStrposc2(cellCriterion.getStrposc2());
				}
				if (cellCriterion.getStrpos() != null) {
					model.setStrpos(cellCriterion.getStrpos());
				}
				if (cellCriterion.getStrpos2() != null) {
					model.setStrpos2(cellCriterion.getStrpos2());
				}
				if (cellCriterion.getChkfield() != null) {
					model.setChkfield(cellCriterion.getChkfield());
				}
				if (cellCriterion.getChkunit() != null) {
					model.setChkunit(cellCriterion.getChkunit());
				}
				if (cellCriterion.getChkfieldId() != null) {
					model.setChkfieldId(cellCriterion.getChkfieldId());
				}
				if (cellCriterion.getChkformual() != null) {
					model.setChkformual(cellCriterion.getChkformual());
				}
				if (cellCriterion.getChkformualD() != null) {
					model.setChkformualD(cellCriterion.getChkformualD());
				}
				model.setIchecknum(cellCriterion.getIchecknum());
				if (cellCriterion.getToolsname() != null) {
					model.setToolsname(cellCriterion.getToolsname());
				}
				if (cellCriterion.getConstr1() != null) {
					model.setConstr1(cellCriterion.getConstr1());
				}
				if (cellCriterion.getConstr2() != null) {
					model.setConstr2(cellCriterion.getConstr2());
				}
				if (cellCriterion.getIchecknumLess() != null) {
					model.setIchecknumLess(cellCriterion.getIchecknumLess());
				}
				if (cellCriterion.getClevel() != null) {
					model.setClevel(cellCriterion.getClevel());
				}
				cellCriterionMapper.updateCellCriterion(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellCriterionMapper(
			CellCriterionMapper cellCriterionMapper) {
		this.cellCriterionMapper = cellCriterionMapper;
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
	public void setFiledotService(IsdpFiledotService filedotService) {
		this.filedotService = filedotService;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
