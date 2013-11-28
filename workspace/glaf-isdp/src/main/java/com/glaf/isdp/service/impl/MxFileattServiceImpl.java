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
import com.glaf.isdp.domain.IsdpFileatt;
import com.glaf.isdp.mapper.IsdpFileattMapper;
import com.glaf.isdp.query.FileattQuery;
import com.glaf.isdp.service.IsdpFileattService;

@Service("isdpFileattService")
@Transactional(readOnly = true)
public class MxFileattServiceImpl implements IsdpFileattService {
	protected static final Log logger = LogFactory
			.getLog(MxFileattServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpFileattMapper isdpFileattMapper;

	public MxFileattServiceImpl() {

	}

	public int count(FileattQuery query) {
		query.ensureInitialized();
		return isdpFileattMapper.getFileattCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpFileattMapper.deleteFileattById(id);
	}

	public IsdpFileatt getFileatt(String id) {
		IsdpFileatt fileatt = null;
		if (StringUtils
				.equals(DBUtils.POSTGRESQL, Environment.getCurrentDatabaseType())) {
			fileatt = isdpFileattMapper.getFileattById_postgres(id);
		} else {
			fileatt = isdpFileattMapper.getFileattById(id);
		}
		return fileatt;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFileattCount(Map<String, Object> parameter) {
		return isdpFileattMapper.getFileattCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFileattCountByQueryCriteria(FileattQuery query) {
		return isdpFileattMapper.getFileattCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpFileatt> getFileatts(Map<String, Object> parameter) {
		return isdpFileattMapper.getFileatts(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IsdpFileatt> getFileattsByQueryCriteria(int start, int pageSize,
			FileattQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpFileatt> rows = sqlSession.selectList(
				"getFileattsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<IsdpFileatt> list(FileattQuery query) {
		query.ensureInitialized();
		List<IsdpFileatt> list = isdpFileattMapper
				.getFileattsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpFileatt fileatt) {
		if (StringUtils.isEmpty(fileatt.getFileID())) {
			fileatt.setFileID(idGenerator.getNextId());
			// fileatt.setFileID(idGenerator.getNextId());
			// fileatt.setCreateDate(new Date());
			isdpFileattMapper.insertFileatt(fileatt);
		} else {
			IsdpFileatt model = this.getFileatt(fileatt.getFileID());
			if (model != null) {
				if (fileatt.getTopid() != null) {
					model.setTopid(fileatt.getTopid());
				}
				if (fileatt.getNum() != null) {
					model.setNum(fileatt.getNum());
				}
				if (fileatt.getActor() != null) {
					model.setActor(fileatt.getActor());
				}
				if (fileatt.getFname() != null) {
					model.setFname(fileatt.getFname());
				}
				if (fileatt.getFileName() != null) {
					model.setFileName(fileatt.getFileName());
				}
				model.setFileContent(fileatt.getFileContent());
				if (fileatt.getVision() != null) {
					model.setVision(fileatt.getVision());
				}
				if (fileatt.getCtime() != null) {
					model.setCtime(fileatt.getCtime());
				}
				model.setFilesize(fileatt.getFilesize());
				if (fileatt.getVisID() != null) {
					model.setVisID(fileatt.getVisID());
				}
				if (fileatt.getAttID() != null) {
					model.setAttID(fileatt.getAttID());
				}
				model.setIstextcontent(fileatt.getIstextcontent());
				if (fileatt.getTextcontent() != null) {
					model.setTextcontent(fileatt.getTextcontent());
				}
				isdpFileattMapper.updateFileatt(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setIsdpFileattMapper(IsdpFileattMapper isdpFileattMapper) {
		this.isdpFileattMapper = isdpFileattMapper;
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
