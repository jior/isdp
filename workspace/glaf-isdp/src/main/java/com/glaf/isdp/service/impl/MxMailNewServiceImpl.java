package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.*;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("mailNewService")
@Transactional(readOnly = true)
public class MxMailNewServiceImpl implements IMailNewService {
	protected static final Log logger = LogFactory
			.getLog(MxMailNewServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected MailNewMapper mailNewMapper;

	public MxMailNewServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		mailNewMapper.deleteMailNewById(id);
	}

	public int count(MailNewQuery query) {
		query.ensureInitialized();
		return mailNewMapper.getMailNewCountByQueryCriteria(query);
	}

	public List<MailNew> list(MailNewQuery query) {
		query.ensureInitialized();
		List<MailNew> list = mailNewMapper
				.getMailNewsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMailNewCount(Map<String, Object> parameter) {
		return mailNewMapper.getMailNewCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMailNewCountByQueryCriteria(MailNewQuery query) {
		return mailNewMapper.getMailNewCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<MailNew> getMailNewsByQueryCriteria(int start, int pageSize,
			MailNewQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<MailNew> rows = sqlSession.selectList(
				"getMailNewsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<MailNew> getMailNews(Map<String, Object> parameter) {
		return mailNewMapper.getMailNews(parameter);
	}

	public MailNew getMailNew(String id) {
		MailNew mailNew = mailNewMapper.getMailNewById(id);
		return mailNew;
	}

	@Transactional
	public void save(MailNew mailNew) {
		if (StringUtils.isEmpty(mailNew.getId())) {
			mailNew.setId(idGenerator.getNextId());
			// mailNew.setId(idGenerator.getNextId());
			// mailNew.setCreateDate(new Date());
			mailNewMapper.insertMailNew(mailNew);
		} else {
			MailNew model = this.getMailNew(mailNew.getId());
			if (model != null) {
				if (mailNew.getEmail() != null) {
					model.setEmail(mailNew.getEmail());
				}
				if (mailNew.getEmailId() != null) {
					model.setEmailId(mailNew.getEmailId());
				}
				model.setIntrec(mailNew.getIntrec());
				mailNewMapper.updateMailNew(model);
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
	public void setMailNewMapper(MailNewMapper mailNewMapper) {
		this.mailNewMapper = mailNewMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
