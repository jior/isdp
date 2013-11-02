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
import com.glaf.isdp.domain.MyCellBusiess;
import com.glaf.isdp.mapper.MyCellBusiessMapper;
import com.glaf.isdp.query.MyCellBusiessQuery;
import com.glaf.isdp.service.IMyCellBusiessService;

@Service("mycellBusiessService")
@Transactional(readOnly = true)
public class MxMyCellBusiessServiceImpl implements IMyCellBusiessService {
	protected static final Log logger = LogFactory
			.getLog(MxMyCellBusiessServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected MyCellBusiessMapper myCellBusiessMapper;

	public MxMyCellBusiessServiceImpl() {

	}

	public int count(MyCellBusiessQuery query) {
		query.ensureInitialized();
		return myCellBusiessMapper
				.getMyCellBusiessCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		myCellBusiessMapper.deleteMyCellBusiessById(id);
	}

	public MyCellBusiess getMyCellBusiess(String id) {
		MyCellBusiess mycellBusiess = null;
		if (StringUtils
				.equals(DBUtils.POSTGRESQL, Environment.getCurrentDatabaseType())) {
			mycellBusiess = myCellBusiessMapper
					.getMyCellBusiessById_postgres(id);
		} else {
			mycellBusiess = myCellBusiessMapper.getMyCellBusiessById(id);
		}
		return mycellBusiess;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMyCellBusiessCount(Map<String, Object> parameter) {
		return myCellBusiessMapper.getMyCellBusiessCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMyCellBusiessCountByQueryCriteria(MyCellBusiessQuery query) {
		return myCellBusiessMapper
				.getMyCellBusiessCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<MyCellBusiess> getMyCellBusiesss(Map<String, Object> parameter) {
		return myCellBusiessMapper.getMyCellBusiesss(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<MyCellBusiess> getMyCellBusiesssByQueryCriteria(int start,
			int pageSize, MyCellBusiessQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<MyCellBusiess> rows = sqlSession.selectList(
				"getMyCellBusiesssByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<MyCellBusiess> list(MyCellBusiessQuery query) {
		query.ensureInitialized();
		List<MyCellBusiess> list = myCellBusiessMapper
				.getMyCellBusiesssByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(MyCellBusiess mycellBusiess) {
		if (StringUtils.isEmpty(mycellBusiess.getId())) {
			mycellBusiess.setId(idGenerator.getNextId());
			// mycellBusiess.setId(idGenerator.getNextId());
			// mycellBusiess.setCreateDate(new Date());
			myCellBusiessMapper.insertMyCellBusiess(mycellBusiess);
		} else {
			MyCellBusiess model = this.getMyCellBusiess(mycellBusiess.getId());
			if (model != null) {
				if (mycellBusiess.getName() != null) {
					model.setName(mycellBusiess.getName());
				}
				if (mycellBusiess.getIsused() != null) {
					model.setIsused(mycellBusiess.getIsused());
				}
				if (mycellBusiess.getContent() != null) {
					model.setContent(mycellBusiess.getContent());
				}
				model.setIntsystype(mycellBusiess.getIntsystype());
				if (mycellBusiess.getPicfile() != null) {
					model.setPicfile(mycellBusiess.getPicfile());
				}
				model.setFileContent(mycellBusiess.getFileContent());
				if (mycellBusiess.getPicfileWelcom() != null) {
					model.setPicfileWelcom(mycellBusiess.getPicfileWelcom());
				}
				model.setFileContentW(mycellBusiess.getFileContentW());
				if (mycellBusiess.getPicfileMain() != null) {
					model.setPicfileMain(mycellBusiess.getPicfileMain());
				}
				model.setFileContentM(mycellBusiess.getFileContentM());
				if (mycellBusiess.getPicfileLogin() != null) {
					model.setPicfileLogin(mycellBusiess.getPicfileLogin());
				}
				model.setFileContentL(mycellBusiess.getFileContentL());
				if (mycellBusiess.getSysbuiesstypesId() != null) {
					model.setSysbuiesstypesId(mycellBusiess
							.getSysbuiesstypesId());
				}
				model.setListno(mycellBusiess.getListno());
				model.setDomainIndex(mycellBusiess.getDomainIndex());
				myCellBusiessMapper.updateMyCellBusiess(model);
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
	public void setMyCellBusiessMapper(
			MyCellBusiessMapper myCellBusiessMapper) {
		this.myCellBusiessMapper = myCellBusiessMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
