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

import com.glaf.core.config.Environment;
import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.util.DBUtils;
import com.glaf.isdp.domain.IsdpFiledot;
import com.glaf.isdp.mapper.IsdpFiledotMapper;
import com.glaf.isdp.query.FiledotQuery;
import com.glaf.isdp.service.IsdpFiledotService;

@Service("isdpFiledotService")
@Transactional(readOnly = true)
public class MxFiledotServiceImpl implements IsdpFiledotService {
	protected static final Log logger = LogFactory
			.getLog(MxFiledotServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpFiledotMapper isdpFiledotMapper;

	public MxFiledotServiceImpl() {

	}

	public int count(FiledotQuery query) {
		query.ensureInitialized();
		return isdpFiledotMapper.getFiledotCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpFiledotMapper.deleteFiledotById(id);
	}

	public IsdpFiledot getFiledot(String id) {
		IsdpFiledot filedot = null;
		if (StringUtils
				.equals(DBUtils.POSTGRESQL, Environment.getCurrentDatabaseType())) {
			filedot = isdpFiledotMapper.getFiledotById_postgres(id);
		} else {
			filedot = isdpFiledotMapper.getFiledotById(id);
		}
		return filedot;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFiledotCount(Map<String, Object> parameter) {
		return isdpFiledotMapper.getFiledotCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFiledotCountByQueryCriteria(FiledotQuery query) {
		return isdpFiledotMapper.getFiledotCountByQueryCriteria(query);
	}

	public List<IsdpFiledot> getMyCellTaskFiles(int indexId, int intistasks) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("indexId", indexId);
		parameter.put("intistasks", intistasks);
		return isdpFiledotMapper.getMyCellTaskFiles(parameter);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpFiledot> getFiledots(Map<String, Object> parameter) {
		return isdpFiledotMapper.getFiledots(parameter);
	}
	
	public List<IsdpFiledot> getFiledotsByCheckItemId(String proj_chkitem_id){
		return isdpFiledotMapper.getFiledotsByCheckItemId(proj_chkitem_id);
	}

	/**
	 * 获取挂接到某个分类的文件定义
	 * 
	 * @param indexId
	 * @return
	 */
	public List<IsdpFiledot> getFiledotsOfTreedot(int indexId) {
		return isdpFiledotMapper.getFiledotsOfTreedot(indexId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IsdpFiledot> getFiledotsByQueryCriteria(int start, int pageSize,
			FiledotQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpFiledot> rows = sqlSession.selectList(
				"getFiledotsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<IsdpFiledot> list(FiledotQuery query) {
		query.ensureInitialized();
		List<IsdpFiledot> list = isdpFiledotMapper
				.getFiledotsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpFiledot filedot) {
		if (StringUtils.isEmpty(filedot.getFileID())) {
			filedot.setFileID(idGenerator.getNextId());
			// filedot.setFileID(idGenerator.getNextId());
			// filedot.setCreateDate(new Date());
			isdpFiledotMapper.insertFiledot(filedot);
		} else {
			IsdpFiledot model = this.getFiledot(filedot.getFileID());
			if (model != null) {
				model.setIndexId(filedot.getIndexId());
				if (filedot.getFbelong() != null) {
					model.setFbelong(filedot.getFbelong());
				}
				if (filedot.getFnum() != null) {
					model.setFnum(filedot.getFnum());
				}
				if (filedot.getPbelong() != null) {
					model.setPbelong(filedot.getPbelong());
				}
				if (filedot.getNum() != null) {
					model.setNum(filedot.getNum());
				}
				if (filedot.getFname() != null) {
					model.setFname(filedot.getFname());
				}
				if (filedot.getDotname() != null) {
					model.setDotname(filedot.getDotname());
				}
				if (filedot.getCtime() != null) {
					model.setCtime(filedot.getCtime());
				}
				if (filedot.getDtime() != null) {
					model.setDtime(filedot.getDtime());
				}
				if (filedot.getFileName() != null) {
					model.setFileName(filedot.getFileName());
				}
				model.setFileContent(filedot.getFileContent());
				model.setFilesize(filedot.getFilesize());
				model.setDwid(filedot.getDwid());
				model.setFbid(filedot.getFbid());
				model.setFxid(filedot.getFxid());
				if (filedot.getJid() != null) {
					model.setJid(filedot.getJid());
				}
				if (filedot.getFlid() != null) {
					model.setFlid(filedot.getFlid());
				}
				if (filedot.getTopnode() != null) {
					model.setTopnode(filedot.getTopnode());
				}
				if (filedot.getCman() != null) {
					model.setCman(filedot.getCman());
				}
				if (filedot.getContent() != null) {
					model.setContent(filedot.getContent());
				}
				if (filedot.getListflag() != null) {
					model.setListflag(filedot.getListflag());
				}
				model.setTofile(filedot.getTofile());
				if (filedot.getIsink() != null) {
					model.setIsink(filedot.getIsink());
				}
				model.setDottype(filedot.getDottype());
				if (filedot.getCtimedname() != null) {
					model.setCtimedname(filedot.getCtimedname());
				}
				model.setType(filedot.getType());
				model.setListno(filedot.getListno());
				model.setUtreeIndex(filedot.getUtreeIndex());
				if (filedot.getIsquan() != null) {
					model.setIsquan(filedot.getIsquan());
				}
				model.setIntsysform(filedot.getIntsysform());
				isdpFiledotMapper.updateFiledot(model);
			}
		}
	}

	 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setIsdpFiledotMapper(IsdpFiledotMapper isdpFiledotMapper) {
		this.isdpFiledotMapper = isdpFiledotMapper;
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
