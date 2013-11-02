package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang.StringUtils;
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
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("mailRecAttService")
@Transactional(readOnly = true)
public class MxMailRecAttServiceImpl implements IMailRecAttService {
	protected static final Log logger = LogFactory
			.getLog(MxMailRecAttServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected MailRecAttMapper mailRecAttMapper;

	public MxMailRecAttServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		mailRecAttMapper.deleteMailRecAttById(id);
	}

	public int count(MailRecAttQuery query) {
		query.ensureInitialized();
		return mailRecAttMapper.getMailRecAttCountByQueryCriteria(query);
	}

	public List<MailRecAtt> list(MailRecAttQuery query) {
		query.ensureInitialized();
		List<MailRecAtt> list = mailRecAttMapper
				.getMailRecAttsByQueryCriteria(query);
		return list;
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	public int getMailRecAttCount(Map<String, Object> parameter) {
		return mailRecAttMapper.getMailRecAttCount(parameter);
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	public int getMailRecAttCountByQueryCriteria(MailRecAttQuery query) {
		return mailRecAttMapper.getMailRecAttCountByQueryCriteria(query);
	}

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	public List<MailRecAtt> getMailRecAttsByQueryCriteria(int start,
			int pageSize, MailRecAttQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<MailRecAtt> rows = sqlSession.selectList(
				"getMailRecAttsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	public List<MailRecAtt> getMailRecAtts(Map<String, Object> parameter) {
		return mailRecAttMapper.getMailRecAtts(parameter);
	}

	public MailRecAtt getMailRecAtt(String id) {
		MailRecAtt mailRecAtt = mailRecAttMapper.getMailRecAttById(id);
		return mailRecAtt;
	}

	@Transactional
	public void save(MailRecAtt mailRecAtt) {
		if (StringUtils.isEmpty(mailRecAtt.getFileId())) {
			mailRecAtt.setFileId(idGenerator.getNextId());
			// mailRecAtt.setFileId(idGenerator.getNextId());
			// mailRecAtt.setCreateDate(new Date());
			if (StringUtils.equals(DBUtils.POSTGRESQL,
					Environment.getCurrentDatabaseType())) {
				mailRecAttMapper.insertMailRecAtt_postgres(mailRecAtt);
			} else {
				mailRecAttMapper.insertMailRecAtt(mailRecAtt);
			}
		} else {
			MailRecAtt model = this.getMailRecAtt(mailRecAtt.getFileId());
			if (model != null) {
				if (mailRecAtt.getTopid() != null) {
					model.setTopid(mailRecAtt.getTopid());
				}
				if (mailRecAtt.getFileName() != null) {
					model.setFileName(mailRecAtt.getFileName());
				}
				model.setFileContent(mailRecAtt.getFileContent());
				if (mailRecAtt.getCtime() != null) {
					model.setCtime(mailRecAtt.getCtime());
				}
				model.setFilesize(mailRecAtt.getFilesize());
				mailRecAttMapper.updateMailRecAtt(model);
			}
		}
	}

	@javax.annotation.Resource(name = "myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name = "myBatisDbIdGenerator")
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
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
