package com.glaf.isdp.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
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
import com.glaf.isdp.domain.IsdpDotuse;
import com.glaf.isdp.mapper.IsdpDotuseMapper;
import com.glaf.isdp.query.DotuseQuery;
import com.glaf.isdp.service.IsdpDotuseService;

@Service("isdpDotuseService")
@Transactional(readOnly = true)
public class MxDotuseServiceImpl implements IsdpDotuseService {
	protected static final Log logger = LogFactory
			.getLog(MxDotuseServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpDotuseMapper isdpDotuseMapper;

	public MxDotuseServiceImpl() {

	}

	public int count(DotuseQuery query) {
		query.ensureInitialized();
		return isdpDotuseMapper.getDotuseCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpDotuseMapper.deleteDotuseById(id);
	}

	public IsdpDotuse getDotuse(String id) {
		IsdpDotuse dotuse = null;
		if (StringUtils
				.equals(DBUtils.POSTGRESQL, Environment.getCurrentDatabaseType())) {
			dotuse = isdpDotuseMapper.getDotuseById_postgres(id);
		} else {
			dotuse = isdpDotuseMapper.getDotuseById(id);
		}
		return dotuse;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getDotuseCount(Map<String, Object> parameter) {
		return isdpDotuseMapper.getDotuseCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getDotuseCountByQueryCriteria(DotuseQuery query) {
		return isdpDotuseMapper.getDotuseCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpDotuse> getDotuses(Map<String, Object> parameter) {
		return isdpDotuseMapper.getDotuses(parameter);
	}

	public List<IsdpDotuse> getDotuses(String topId, int type) {
		DotuseQuery query = new DotuseQuery();
		query.topid(topId).type(type);
		return this.list(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IsdpDotuse> getDotusesByQueryCriteria(int start, int pageSize,
			DotuseQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpDotuse> rows = sqlSession.selectList("getDotusesByQueryCriteria",
				query, rowBounds);
		return rows;
	}

	public List<IsdpDotuse> list(DotuseQuery query) {
		query.ensureInitialized();
		List<IsdpDotuse> list = isdpDotuseMapper.getDotusesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpDotuse dotuse) {
		if (StringUtils.isEmpty(dotuse.getFileID())) {
			dotuse.setFileID(idGenerator.getNextId());
			// dotuse.setFileID(idGenerator.getNextId());
			// dotuse.setCreateDate(new Date());
			isdpDotuseMapper.insertDotuse(dotuse);
		} else {
			IsdpDotuse model = this.getDotuse(dotuse.getFileID());
			if (model != null) {
				model.setIndexId(dotuse.getIndexId());
				model.setProjid(dotuse.getProjid());
				model.setPid(dotuse.getPid());
				if (dotuse.getDotid() != null) {
					model.setDotid(dotuse.getDotid());
				}
				if (dotuse.getNum() != null) {
					model.setNum(dotuse.getNum());
				}
				if (dotuse.getName() != null) {
					model.setName(dotuse.getName());
				}
				if (dotuse.getCman() != null) {
					model.setCman(dotuse.getCman());
				}
				if (dotuse.getCtime() != null) {
					model.setCtime(dotuse.getCtime());
				}
				if (dotuse.getFileName() != null) {
					model.setFileName(dotuse.getFileName());
				}
				model.setFileContent(dotuse.getFileContent());
				model.setFilesize(dotuse.getFilesize());
				if (dotuse.getVision() != null) {
					model.setVision(dotuse.getVision());
				}
				if (dotuse.getSavetime() != null) {
					model.setSavetime(dotuse.getSavetime());
				}
				if (dotuse.getRemark() != null) {
					model.setRemark(dotuse.getRemark());
				}
				model.setDwid(dotuse.getDwid());
				model.setFbid(dotuse.getFbid());
				model.setFxid(dotuse.getFxid());
				if (dotuse.getJid() != null) {
					model.setJid(dotuse.getJid());
				}
				if (dotuse.getFlid() != null) {
					model.setFlid(dotuse.getFlid());
				}
				if (dotuse.getTopnode() != null) {
					model.setTopnode(dotuse.getTopnode());
				}
				if (dotuse.getTopid() != null) {
					model.setTopid(dotuse.getTopid());
				}
				model.setType(dotuse.getType());
				if (dotuse.getFname() != null) {
					model.setFname(dotuse.getFname());
				}
				if (dotuse.getIsink() != null) {
					model.setIsink(dotuse.getIsink());
				}
				if (dotuse.getOldId() != null) {
					model.setOldId(dotuse.getOldId());
				}
				if (dotuse.getTaskId() != null) {
					model.setTaskId(dotuse.getTaskId());
				}
				model.setIscheck(dotuse.getIscheck());
				isdpDotuseMapper.updateDotuse(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setIsdpDotuseMapper(IsdpDotuseMapper isdpDotuseMapper) {
		this.isdpDotuseMapper = isdpDotuseMapper;
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
