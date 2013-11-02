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
import com.glaf.isdp.domain.IsdpPfile;
import com.glaf.isdp.mapper.IsdpPfileMapper;
import com.glaf.isdp.query.PfileQuery;
import com.glaf.isdp.service.IsdpPfileService;

@Service("isdpPfileService")
@Transactional(readOnly = true)
public class MxPfileServiceImpl implements IsdpPfileService {
	protected static final Log logger = LogFactory
			.getLog(MxPfileServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpPfileMapper isdpPfileMapper;

	public MxPfileServiceImpl() {

	}

	public int count(PfileQuery query) {
		query.ensureInitialized();
		return isdpPfileMapper.getPfileCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpPfileMapper.deletePfileById(id);
	}

	public IsdpPfile getPfile(String id) {
		IsdpPfile pfile = isdpPfileMapper.getPfileById(id);
		return pfile;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getPfileCount(Map<String, Object> parameter) {
		return isdpPfileMapper.getPfileCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getPfileCountByQueryCriteria(PfileQuery query) {
		return isdpPfileMapper.getPfileCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpPfile> getPfiles(Map<String, Object> parameter) {
		return isdpPfileMapper.getPfiles(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IsdpPfile> getPfilesByQueryCriteria(int start, int pageSize,
			PfileQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpPfile> rows = sqlSession.selectList("getPfilesByQueryCriteria",
				query, rowBounds);
		return rows;
	}

	public int getTreePfileCount(String treepinfoIdLike, String nodetype,
			String filingflag) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("treepinfoIdLike", treepinfoIdLike);
		parameter.put("nodetype", nodetype);
		parameter.put("filingflag", filingflag);
		return isdpPfileMapper.getTreePfileCount(parameter);
	}

	public List<IsdpPfile> getTreePfiles(String treepinfoIdLike, String nodetype,
			String filingflag) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("treepinfoIdLike", treepinfoIdLike);
		parameter.put("nodetype", nodetype);
		parameter.put("filingflag", filingflag);
		return isdpPfileMapper.getTreePfiles(parameter);
	}

	public List<IsdpPfile> list(PfileQuery query) {
		query.ensureInitialized();
		List<IsdpPfile> list = isdpPfileMapper.getPfilesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpPfile pfile) {
		if (StringUtils.isEmpty(pfile.getId())) {
			pfile.setId(idGenerator.getNextId());
			// pfile.setId(idGenerator.getNextId());
			// pfile.setCreateDate(new Date());
			isdpPfileMapper.insertPfile(pfile);
		} else {
			IsdpPfile model = this.getPfile(pfile.getId());
			if (model != null) {
				model.setEfilenum(pfile.getEfilenum());
				if (pfile.getListnum() != null) {
					model.setListnum(pfile.getListnum());
				}
				model.setListId(pfile.getListId());
				model.setIndexId(pfile.getIndexId());
				model.setPid(pfile.getPid());
				model.setProjid(pfile.getProjid());
				model.setDwid(pfile.getDwid());
				model.setFbid(pfile.getFbid());
				model.setFxid(pfile.getFxid());
				if (pfile.getJid() != null) {
					model.setJid(pfile.getJid());
				}
				if (pfile.getFlid() != null) {
					model.setFlid(pfile.getFlid());
				}
				if (pfile.getTopnode() != null) {
					model.setTopnode(pfile.getTopnode());
				}
				if (pfile.getTopnodem() != null) {
					model.setTopnodem(pfile.getTopnodem());
				}
				if (pfile.getVid() != null) {
					model.setVid(pfile.getVid());
				}
				if (pfile.getOldvid() != null) {
					model.setOldvid(pfile.getOldvid());
				}
				if (pfile.getVisflag() != null) {
					model.setVisflag(pfile.getVisflag());
				}
				model.setListno(pfile.getListno());
				if (pfile.getFilingflag() != null) {
					model.setFilingflag(pfile.getFilingflag());
				}
				if (pfile.getSaveflag() != null) {
					model.setSaveflag(pfile.getSaveflag());
				}
				if (pfile.getOpenflag() != null) {
					model.setOpenflag(pfile.getOpenflag());
				}
				if (pfile.getCheckupflag() != null) {
					model.setCheckupflag(pfile.getCheckupflag());
				}
				if (pfile.getFinishflag() != null) {
					model.setFinishflag(pfile.getFinishflag());
				}
				if (pfile.getFromID() != null) {
					model.setFromID(pfile.getFromID());
				}
				if (pfile.getTname() != null) {
					model.setTname(pfile.getTname());
				}
				if (pfile.getDuty() != null) {
					model.setDuty(pfile.getDuty());
				}
				if (pfile.getTagnum() != null) {
					model.setTagnum(pfile.getTagnum());
				}
				if (pfile.getFilenum() != null) {
					model.setFilenum(pfile.getFilenum());
				}
				if (pfile.getThematic() != null) {
					model.setThematic(pfile.getThematic());
				}
				if (pfile.getCtime() != null) {
					model.setCtime(pfile.getCtime());
				}
				if (pfile.getPageno() != null) {
					model.setPageno(pfile.getPageno());
				}
				if (pfile.getSlevel() != null) {
					model.setSlevel(pfile.getSlevel());
				}
				model.setPage(pfile.getPage());
				if (pfile.getFiletype() != null) {
					model.setFiletype(pfile.getFiletype());
				}
				if (pfile.getFontsnum() != null) {
					model.setFontsnum(pfile.getFontsnum());
				}
				if (pfile.getSavetime() != null) {
					model.setSavetime(pfile.getSavetime());
				}
				if (pfile.getCompany() != null) {
					model.setCompany(pfile.getCompany());
				}
				model.setYear(pfile.getYear());
				if (pfile.getFileatt() != null) {
					model.setFileatt(pfile.getFileatt());
				}
				if (pfile.getAnnotations() != null) {
					model.setAnnotations(pfile.getAnnotations());
				}
				if (pfile.getCarriertype() != null) {
					model.setCarriertype(pfile.getCarriertype());
				}
				if (pfile.getSummary() != null) {
					model.setSummary(pfile.getSummary());
				}
				if (pfile.getPtext() != null) {
					model.setPtext(pfile.getPtext());
				}
				if (pfile.getCarrieru() != null) {
					model.setCarrieru(pfile.getCarrieru());
				}
				if (pfile.getGlidenum() != null) {
					model.setGlidenum(pfile.getGlidenum());
				}
				if (pfile.getEfile() != null) {
					model.setEfile(pfile.getEfile());
				}
				if (pfile.getFtime() != null) {
					model.setFtime(pfile.getFtime());
				}
				if (pfile.getTotalnum() != null) {
					model.setTotalnum(pfile.getTotalnum());
				}
				if (pfile.getInputman() != null) {
					model.setInputman(pfile.getInputman());
				}
				if (pfile.getEtime() != null) {
					model.setEtime(pfile.getEtime());
				}
				if (pfile.getDotnum() != null) {
					model.setDotnum(pfile.getDotnum());
				}
				if (pfile.getPicnum() != null) {
					model.setPicnum(pfile.getPicnum());
				}
				if (pfile.getRecnum() != null) {
					model.setRecnum(pfile.getRecnum());
				}
				model.setTotal(pfile.getTotal());
				if (pfile.getPagetype() != null) {
					model.setPagetype(pfile.getPagetype());
				}
				if (pfile.getIscom() != null) {
					model.setIscom(pfile.getIscom());
				}
				if (pfile.getIslocate() != null) {
					model.setIslocate(pfile.getIslocate());
				}
				if (pfile.getWcompany() != null) {
					model.setWcompany(pfile.getWcompany());
				}
				if (pfile.getWcompanyID() != null) {
					model.setWcompanyID(pfile.getWcompanyID());
				}
				if (pfile.getSendflag() != null) {
					model.setSendflag(pfile.getSendflag());
				}
				if (pfile.getLcontent() != null) {
					model.setLcontent(pfile.getLcontent());
				}
				if (pfile.getLcompany() != null) {
					model.setLcompany(pfile.getLcompany());
				}
				if (pfile.getLman() != null) {
					model.setLman(pfile.getLman());
				}
				if (pfile.getLlen() != null) {
					model.setLlen(pfile.getLlen());
				}
				if (pfile.getLdate() != null) {
					model.setLdate(pfile.getLdate());
				}
				if (pfile.getJconten() != null) {
					model.setJconten(pfile.getJconten());
				}
				if (pfile.getJplace() != null) {
					model.setJplace(pfile.getJplace());
				}
				if (pfile.getJman() != null) {
					model.setJman(pfile.getJman());
				}
				if (pfile.getJback() != null) {
					model.setJback(pfile.getJback());
				}
				if (pfile.getJactor() != null) {
					model.setJactor(pfile.getJactor());
				}
				if (pfile.getJnum() != null) {
					model.setJnum(pfile.getJnum());
				}
				if (pfile.getJbnum() != null) {
					model.setJbnum(pfile.getJbnum());
				}
				if (pfile.getTnum() != null) {
					model.setTnum(pfile.getTnum());
				}
				if (pfile.getTzoom() != null) {
					model.setTzoom(pfile.getTzoom());
				}
				if (pfile.getTflag() != null) {
					model.setTflag(pfile.getTflag());
				}
				if (pfile.getTdesigner() != null) {
					model.setTdesigner(pfile.getTdesigner());
				}
				if (pfile.getTviewer() != null) {
					model.setTviewer(pfile.getTviewer());
				}
				if (pfile.getTassessor() != null) {
					model.setTassessor(pfile.getTassessor());
				}
				if (pfile.getTvision() != null) {
					model.setTvision(pfile.getTvision());
				}
				model.setClistno(pfile.getClistno());
				if (pfile.getCpageno() != null) {
					model.setCpageno(pfile.getCpageno());
				}
				if (pfile.getVnum() != null) {
					model.setVnum(pfile.getVnum());
				}
				if (pfile.getCvnum() != null) {
					model.setCvnum(pfile.getCvnum());
				}
				if (pfile.getTreeDliststr() != null) {
					model.setTreeDliststr(pfile.getTreeDliststr());
				}
				if (pfile.getCtimeEnd() != null) {
					model.setCtimeEnd(pfile.getCtimeEnd());
				}
				model.setProjIndex(pfile.getProjIndex());
				model.setTreeParent(pfile.getTreeParent());
				model.setTreeList(pfile.getTreeList());
				isdpPfileMapper.updatePfile(model);
			}
		}
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
	public void setIsdpPfileMapper(IsdpPfileMapper isdpPfileMapper) {
		this.isdpPfileMapper = isdpPfileMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
