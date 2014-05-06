package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.config.Environment;
import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.*;
import com.glaf.core.util.DBUtils;
import com.glaf.core.util.UUID32;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("mailRecService")
@Transactional(readOnly = true)
public class MxMailRecServiceImpl implements IMailRecService {
	protected static final Log logger = LogFactory
			.getLog(MxMailRecServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected MailRecMapper mailRecMapper;

	protected MailRecAttMapper mailRecAttMapper;

	public MxMailRecServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		mailRecMapper.deleteMailRecById(id);
	}

	public int count(MailRecQuery query) {
		query.ensureInitialized();
		return mailRecMapper.getMailRecCountByQueryCriteria(query);
	}

	public List<MailRec> list(MailRecQuery query) {
		query.ensureInitialized();
		List<MailRec> list = mailRecMapper
				.getMailRecsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMailRecCount(Map<String, Object> parameter) {
		return mailRecMapper.getMailRecCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMailRecCountByQueryCriteria(MailRecQuery query) {
		return mailRecMapper.getMailRecCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<MailRec> getMailRecsByQueryCriteria(int start, int pageSize,
			MailRecQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<MailRec> rows = sqlSession.selectList(
				"getMailRecsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<MailRec> getMailRecs(Map<String, Object> parameter) {
		return mailRecMapper.getMailRecs(parameter);
	}

	public MailRec getMailRec(String id) {
		MailRec mailRec = mailRecMapper.getMailRecById(id);
		return mailRec;
	}

	public MailRec getMailRecByMessageId(String messageId) {
		MailRec mailRec = mailRecMapper.getMailRecByMessageId(messageId);
		return mailRec;
	}

	@Transactional
	public String nextId() {
		return idGenerator.getNextId();
	}

	@Transactional
	public void save(MailRec mailRec) {
		MailRec model = this.getMailRecByMessageId(mailRec.getMsgId());
		if (model != null) {
			if (mailRec.getEmail() != null) {
				model.setEmail(mailRec.getEmail());
			}
			if (mailRec.getMsgId() != null) {
				model.setMsgId(mailRec.getMsgId());
			}
			if (mailRec.getInReplyTo() != null) {
				model.setInReplyTo(mailRec.getInReplyTo());
			}
			if (mailRec.getFrom() != null) {
				model.setFrom(mailRec.getFrom());
			}
			if (mailRec.getTo() != null) {
				model.setTo(mailRec.getTo());
			}
			if (mailRec.getCc() != null) {
				model.setCc(mailRec.getCc());
			}
			if (mailRec.getDate() != null) {
				model.setDate(mailRec.getDate());
			}
			if (mailRec.getSubject() != null) {
				model.setSubject(mailRec.getSubject());
			}
			if (mailRec.getReplyTo() != null) {
				model.setReplyTo(mailRec.getReplyTo());
			}
			model.setText(mailRec.getText());
			model.setHtml(mailRec.getHtml());
			model.setIntflag(mailRec.getIntflag());
			if (mailRec.getGuidFrom() != null) {
				model.setGuidFrom(mailRec.getGuidFrom());
			}
			mailRecMapper.updateMailRec(model);
		} else {
			if (StringUtils.isEmpty(mailRec.getId())) {
				mailRec.setId(nextId());
			}
			mailRecMapper.insertMailRec(mailRec);
			if (mailRec.getFiles() != null && !mailRec.getFiles().isEmpty()) {
				for (MailRecAtt att : mailRec.getFiles()) {
					att.setTopid(mailRec.getId());
					att.setFileId(mailRec.getId() + "_" + UUID32.getUUID());
					if (StringUtils.equals(DBUtils.POSTGRESQL,
							Environment.getCurrentDatabaseType())) {
						mailRecAttMapper.insertMailRecAtt_postgres(att);
					} else {
						mailRecAttMapper.insertMailRecAtt(att);
					}
				}
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
	public void setMailRecMapper(MailRecMapper mailRecMapper) {
		this.mailRecMapper = mailRecMapper;
	}

	@javax.annotation.Resource
	public void setMailRecAttMapper(
			MailRecAttMapper mailRecAttMapper) {
		this.mailRecAttMapper = mailRecAttMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
