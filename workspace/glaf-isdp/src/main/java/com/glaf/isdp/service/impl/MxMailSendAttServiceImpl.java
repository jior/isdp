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

@Service("mailSendAttService")
@Transactional(readOnly = true)
public class MxMailSendAttServiceImpl implements IMailSendAttService {
	protected static final Log logger = LogFactory
			.getLog(MxMailSendAttServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected MailSendAttMapper mailSendAttMapper;

	public MxMailSendAttServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		mailSendAttMapper.deleteMailSendAttById(id);
	}

	public int count(MailSendAttQuery query) {
		query.ensureInitialized();
		return mailSendAttMapper.getMailSendAttCountByQueryCriteria(query);
	}

	public List<MailSendAtt> list(MailSendAttQuery query) {
		query.ensureInitialized();
		List<MailSendAtt> list = mailSendAttMapper
				.getMailSendAttsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMailSendAttCount(Map<String, Object> parameter) {
		return mailSendAttMapper.getMailSendAttCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMailSendAttCountByQueryCriteria(MailSendAttQuery query) {
		return mailSendAttMapper.getMailSendAttCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<MailSendAtt> getMailSendAttsByQueryCriteria(int start,
			int pageSize, MailSendAttQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<MailSendAtt> rows = sqlSession.selectList(
				"getMailSendAttsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<MailSendAtt> getMailSendAtts(Map<String, Object> parameter) {
		return mailSendAttMapper.getMailSendAtts(parameter);
	}

	public MailSendAtt getMailSendAtt(String id) {
		MailSendAtt mailSendAtt = mailSendAttMapper.getMailSendAttById(id);
		return mailSendAtt;
	}

	@Transactional
	public void save(MailSendAtt mailSendAtt) {
		if (StringUtils.isEmpty(mailSendAtt.getFileId())) {
			mailSendAtt.setFileId(idGenerator.getNextId());
			// mailSendAtt.setFileId(idGenerator.getNextId());
			// mailSendAtt.setCreateDate(new Date());
			mailSendAttMapper.insertMailSendAtt(mailSendAtt);
		} else {
			MailSendAtt model = this.getMailSendAtt(mailSendAtt.getFileId());
			if (model != null) {
				if (mailSendAtt.getTopid() != null) {
					model.setTopid(mailSendAtt.getTopid());
				}
				if (mailSendAtt.getFileName() != null) {
					model.setFileName(mailSendAtt.getFileName());
				}
				model.setFileContent(mailSendAtt.getFileContent());
				if (mailSendAtt.getCtime() != null) {
					model.setCtime(mailSendAtt.getCtime());
				}
				model.setFilesize(mailSendAtt.getFilesize());
				mailSendAttMapper.updateMailSendAtt(model);
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
	public void setMailSendAttMapper(
			MailSendAttMapper mailSendAttMapper) {
		this.mailSendAttMapper = mailSendAttMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
