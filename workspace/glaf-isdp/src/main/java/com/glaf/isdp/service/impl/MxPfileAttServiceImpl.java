package com.glaf.isdp.service.impl;

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
import com.glaf.isdp.domain.IsdpPfileAtt;
import com.glaf.isdp.mapper.IsdpPfileAttMapper;
import com.glaf.isdp.query.PfileAttQuery;
import com.glaf.isdp.service.IsdpPfileAttService;

@Service("isdpPfileAttService")
@Transactional(readOnly = true)
public class MxPfileAttServiceImpl implements IsdpPfileAttService {
	protected static final Log logger = LogFactory
			.getLog(MxPfileAttServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpPfileAttMapper isdpPfileAttMapper;

	public MxPfileAttServiceImpl() {

	}

	public int count(PfileAttQuery query) {
		query.ensureInitialized();
		return isdpPfileAttMapper.getPfileAttCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpPfileAttMapper.deletePfileAttById(id);
	}

	public IsdpPfileAtt getPfileAtt(String id) {
		IsdpPfileAtt pfileAtt = isdpPfileAttMapper.getPfileAttById(id);
		return pfileAtt;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getPfileAttCount(Map<String, Object> parameter) {
		return isdpPfileAttMapper.getPfileAttCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getPfileAttCountByQueryCriteria(PfileAttQuery query) {
		return isdpPfileAttMapper.getPfileAttCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpPfileAtt> getPfileAtts(Map<String, Object> parameter) {
		return isdpPfileAttMapper.getPfileAtts(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<IsdpPfileAtt> getPfileAttsByQueryCriteria(int start,
			int pageSize, PfileAttQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpPfileAtt> rows = sqlSession.selectList(
				"getPfileAttsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<IsdpPfileAtt> list(PfileAttQuery query) {
		query.ensureInitialized();
		List<IsdpPfileAtt> list = isdpPfileAttMapper
				.getPfileAttsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpPfileAtt pfileAtt) {
		if (StringUtils.isEmpty(pfileAtt.getId())) {
			pfileAtt.setId(idGenerator.getNextId());
			// pfileAtt.setId(idGenerator.getNextId());
			// pfileAtt.setCreateDate(new Date());
			isdpPfileAttMapper.insertPfileAtt(pfileAtt);
		} else {
			IsdpPfileAtt model = this.getPfileAtt(pfileAtt.getId());
			if (model != null) {
				model.setListId(pfileAtt.getListId());
				if (pfileAtt.getTopid() != null) {
					model.setTopid(pfileAtt.getTopid());
				}
				if (pfileAtt.getTname() != null) {
					model.setTname(pfileAtt.getTname());
				}
				if (pfileAtt.getDuty() != null) {
					model.setDuty(pfileAtt.getDuty());
				}
				if (pfileAtt.getTagnum() != null) {
					model.setTagnum(pfileAtt.getTagnum());
				}
				if (pfileAtt.getCtime() != null) {
					model.setCtime(pfileAtt.getCtime());
				}
				if (pfileAtt.getPageno() != null) {
					model.setPageno(pfileAtt.getPageno());
				}
				model.setPage(pfileAtt.getPage());
				if (pfileAtt.getFiletype() != null) {
					model.setFiletype(pfileAtt.getFiletype());
				}
				if (pfileAtt.getSavetime() != null) {
					model.setSavetime(pfileAtt.getSavetime());
				}
				if (pfileAtt.getAnnotations() != null) {
					model.setAnnotations(pfileAtt.getAnnotations());
				}
				if (pfileAtt.getCarriertype() != null) {
					model.setCarriertype(pfileAtt.getCarriertype());
				}
				if (pfileAtt.getSummary() != null) {
					model.setSummary(pfileAtt.getSummary());
				}
				if (pfileAtt.getPtext() != null) {
					model.setPtext(pfileAtt.getPtext());
				}
				if (pfileAtt.getCarrieru() != null) {
					model.setCarrieru(pfileAtt.getCarrieru());
				}
				if (pfileAtt.getGlidenum() != null) {
					model.setGlidenum(pfileAtt.getGlidenum());
				}
				if (pfileAtt.getPagetype() != null) {
					model.setPagetype(pfileAtt.getPagetype());
				}
				model.setClistno(pfileAtt.getClistno());
				if (pfileAtt.getCpageno() != null) {
					model.setCpageno(pfileAtt.getCpageno());
				}
				if (pfileAtt.getVnum() != null) {
					model.setVnum(pfileAtt.getVnum());
				}
				if (pfileAtt.getCvnum() != null) {
					model.setCvnum(pfileAtt.getCvnum());
				}
				isdpPfileAttMapper.updatePfileAtt(model);
			}
		}
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
	public void setIsdpPfileAttMapper(IsdpPfileAttMapper isdpPfileAttMapper) {
		this.isdpPfileAttMapper = isdpPfileAttMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
