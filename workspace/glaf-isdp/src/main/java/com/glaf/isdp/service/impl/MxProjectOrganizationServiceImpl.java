package com.glaf.isdp.service.impl;

import java.util.*;

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

@Service("projectOrganizationService")
@Transactional(readOnly = true)
public class MxProjectOrganizationServiceImpl implements
		IProjectOrganizationService {
	protected static final Log logger = LogFactory
			.getLog(MxProjectOrganizationServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected ProjectOrganizationMapper projectOrganizationMapper;

	public MxProjectOrganizationServiceImpl() {

	}

	@Transactional
	public void deleteById(Integer id) {
		projectOrganizationMapper.deleteProjectOrganizationById(id);
	}

	public int count(ProjectOrganizationQuery query) {
		query.ensureInitialized();
		return projectOrganizationMapper
				.getProjectOrganizationCountByQueryCriteria(query);
	}

	public List<ProjectOrganization> list(ProjectOrganizationQuery query) {
		query.ensureInitialized();
		List<ProjectOrganization> list = projectOrganizationMapper
				.getProjectOrganizationsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectOrganizationCount(Map<String, Object> parameter) {
		return projectOrganizationMapper
				.getProjectOrganizationCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectOrganizationCountByQueryCriteria(
			ProjectOrganizationQuery query) {
		return projectOrganizationMapper
				.getProjectOrganizationCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<ProjectOrganization> getProjectOrganizationsByQueryCriteria(
			int start, int pageSize, ProjectOrganizationQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<ProjectOrganization> rows = sqlSession.selectList(
				"getProjectOrganizationsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<ProjectOrganization> getProjectOrganizations(
			Map<String, Object> parameter) {
		return projectOrganizationMapper
				.getProjectOrganizations(parameter);
	}

	public ProjectOrganization getProjectOrganization(Integer id) {
		ProjectOrganization projectOrganization = projectOrganizationMapper
				.getProjectOrganizationById(id);
		return projectOrganization;
	}

	@Transactional
	public void save(ProjectOrganization projectOrganization) {
		if (projectOrganization.getIndexId() == 0) {
			projectOrganization.setIndexId(idGenerator.nextId().intValue());
			projectOrganization.setCtime(new Date());
			projectOrganizationMapper
					.insertProjectOrganization(projectOrganization);
		} else {
			ProjectOrganization model = this
					.getProjectOrganization(projectOrganization.getIndexId());
			if (model != null) {
				if (projectOrganization.getId() != null) {
					model.setId(projectOrganization.getId());
				}
				model.setFlag(projectOrganization.getFlag());
				if (projectOrganization.getSysId() != null) {
					model.setSysId(projectOrganization.getSysId());
				}
				if (projectOrganization.getProjectName() != null) {
					model.setProjectName(projectOrganization.getProjectName());
				}
				if (projectOrganization.getNum() != null) {
					model.setNum(projectOrganization.getNum());
				}
				if (projectOrganization.getCtime() != null) {
					model.setCtime(projectOrganization.getCtime());
				}
				if (projectOrganization.getContent() != null) {
					model.setContent(projectOrganization.getContent());
				}
				if (projectOrganization.getDbname() != null) {
					model.setDbname(projectOrganization.getDbname());
				}
				if (projectOrganization.getServerName() != null) {
					model.setServerName(projectOrganization.getServerName());
				}
				if (projectOrganization.getUser() != null) {
					model.setUser(projectOrganization.getUser());
				}
				if (projectOrganization.getPassword() != null) {
					model.setPassword(projectOrganization.getPassword());
				}
				model.setListno(projectOrganization.getListno());
				if (projectOrganization.getEmail() != null) {
					model.setEmail(projectOrganization.getEmail());
				}
				model.setParentId(projectOrganization.getParentId());
				model.setNodeico(projectOrganization.getNodeico());
				model.setLine(projectOrganization.getLine());
				model.setDomainIndex(projectOrganization.getDomainIndex());
				model.setIntLocal(projectOrganization.getIntLocal());
				if (projectOrganization.getEmailPsw() != null) {
					model.setEmailPsw(projectOrganization.getEmailPsw());
				}
				model.setConnected(projectOrganization.getConnected());
				if (projectOrganization.getEmailS() != null) {
					model.setEmailS(projectOrganization.getEmailS());
				}
				model.setOrgLevel(projectOrganization.getOrgLevel());
				model.setSendType(projectOrganization.getSendType());
				projectOrganizationMapper.updateProjectOrganization(model);
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
	public void setProjectOrganizationMapper(
			ProjectOrganizationMapper projectOrganizationMapper) {
		this.projectOrganizationMapper = projectOrganizationMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
