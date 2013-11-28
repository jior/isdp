package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang.StringUtils;
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

@Service("mailSendService")
@Transactional(readOnly = true)
public class MxMailSendServiceImpl implements IMailSendService {
	protected static final Log logger = LogFactory
			.getLog(MxMailSendServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected MailSendMapper mailSendMapper;

	public MxMailSendServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		mailSendMapper.deleteMailSendById(id);
	}

	public int count(MailSendQuery query) {
		query.ensureInitialized();
		return mailSendMapper.getMailSendCountByQueryCriteria(query);
	}

	public List<MailSend> list(MailSendQuery query) {
		query.ensureInitialized();
		List<MailSend> list = mailSendMapper
				.getMailSendsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMailSendCount(Map<String, Object> parameter) {
		return mailSendMapper.getMailSendCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMailSendCountByQueryCriteria(MailSendQuery query) {
		return mailSendMapper.getMailSendCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<MailSend> getMailSendsByQueryCriteria(int start, int pageSize,
			MailSendQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<MailSend> rows = sqlSession.selectList(
				"getMailSendsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<MailSend> getMailSends(Map<String, Object> parameter) {
		return mailSendMapper.getMailSends(parameter);
	}

	public MailSend getMailSend(String id) {
		MailSend mailSend = mailSendMapper.getMailSendById(id);
		return mailSend;
	}

	@Transactional
	public void save(MailSend mailSend) {
		if (StringUtils.isEmpty(mailSend.getId())) {
			mailSend.setId(idGenerator.getNextId());
			// mailSend.setId(idGenerator.getNextId());
			// mailSend.setCreateDate(new Date());
			mailSendMapper.insertMailSend(mailSend);
		} else {
			MailSend model = this.getMailSend(mailSend.getId());
			if (model != null) {
				if (mailSend.getMsgId() != null) {
					model.setMsgId(mailSend.getMsgId());
				}
				if (mailSend.getInReplyTo() != null) {
					model.setInReplyTo(mailSend.getInReplyTo());
				}
				if (mailSend.getFrom() != null) {
					model.setFrom(mailSend.getFrom());
				}
				if (mailSend.getTo() != null) {
					model.setTo(mailSend.getTo());
				}
				if (mailSend.getCc() != null) {
					model.setCc(mailSend.getCc());
				}
				if (mailSend.getDate() != null) {
					model.setDate(mailSend.getDate());
				}
				if (mailSend.getSubject() != null) {
					model.setSubject(mailSend.getSubject());
				}
				if (mailSend.getReplyTo() != null) {
					model.setReplyTo(mailSend.getReplyTo());
				}
				model.setText(mailSend.getText());
				model.setHtml(mailSend.getHtml());
				model.setIntflag(mailSend.getIntflag());
				if (mailSend.getEmail() != null) {
					model.setEmail(mailSend.getEmail());
				}
				mailSendMapper.updateMailSend(model);
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
	public void setMailSendMapper(MailSendMapper mailSendMapper) {
		this.mailSendMapper = mailSendMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
