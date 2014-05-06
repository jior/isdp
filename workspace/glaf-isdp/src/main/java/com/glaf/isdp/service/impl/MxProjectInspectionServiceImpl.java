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

@Service("projectInspectionService")
@Transactional(readOnly = true) 
public class MxProjectInspectionServiceImpl implements IProjectInspectionService {
	protected static final Log logger = LogFactory.getLog(MxProjectInspectionServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;
 
	protected SqlSession sqlSession;

	protected ProjectInspectionMapper projectInspectionMapper;

	public MxProjectInspectionServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		projectInspectionMapper.deleteProjectInspectionById(id);
	}


	public int count(ProjectInspectionQuery query) {
		query.ensureInitialized();
		return projectInspectionMapper.getProjectInspectionCountByQueryCriteria(query);
	}

	public List<ProjectInspection> list(ProjectInspectionQuery query) {
		query.ensureInitialized();
		List<ProjectInspection> list = projectInspectionMapper.getProjectInspectionsByQueryCriteria(query);
		return list;
	}


    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 public int getProjectInspectionCount(Map<String, Object> parameter){
         return projectInspectionMapper.getProjectInspectionCount(parameter);
	 }

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectInspectionCountByQueryCriteria(ProjectInspectionQuery query) {
		return projectInspectionMapper.getProjectInspectionCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<ProjectInspection> getProjectInspectionsByQueryCriteria(int start, int pageSize,
			ProjectInspectionQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<ProjectInspection> rows = sqlSession.selectList(
				"getProjectInspectionsByQueryCriteria", query, rowBounds);
		return rows;
	}

     /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<ProjectInspection> getProjectInspections(Map<String, Object> parameter){
        return projectInspectionMapper.getProjectInspections(parameter);
	}

	public ProjectInspection getProjectInspection(String id) {
		ProjectInspection projectInspection = projectInspectionMapper.getProjectInspectionById(id);
		return projectInspection;
	}

	@Transactional
	public void save(ProjectInspection projectInspection) {
           if (StringUtils.isEmpty(projectInspection.getId())) {
		       projectInspection.setId(idGenerator.getNextId());
               //projectInspection.setId(idGenerator.getNextId());
               //projectInspection.setCreateDate(new Date());
               projectInspectionMapper.insertProjectInspection(projectInspection);
            } else {
                ProjectInspection model = this.getProjectInspection(projectInspection.getId());
                if(model !=null){
                    model.setIndexId(projectInspection.getIndexId());
                    model.setIntflag(projectInspection.getIntflag());
                    if (projectInspection.getCellTmpfiletypeId() != null) {
                        model.setCellTmpfiletypeId(projectInspection.getCellTmpfiletypeId());
                    }
                    model.setListno(projectInspection.getListno());
                    model.setChkresult(projectInspection.getChkresult());
                    if (projectInspection.getPfileId() != null) {
                        model.setPfileId(projectInspection.getPfileId());
                    }
                    model.setRefillflag(projectInspection.getRefillflag());
                    model.setGroupid(projectInspection.getGroupid());
                    if (projectInspection.getOldId() != null) {
                        model.setOldId(projectInspection.getOldId());
                    }
                    if (projectInspection.getEmailId() != null) {
                        model.setEmailId(projectInspection.getEmailId());
                    }
                    if (projectInspection.getRecemailId() != null) {
                        model.setRecemailId(projectInspection.getRecemailId());
                    }
                    if (projectInspection.getMainId() != null) {
                        model.setMainId(projectInspection.getMainId());
                    }
                    if (projectInspection.getTagnum() != null) {
                        model.setTagnum(projectInspection.getTagnum());
                    }
                    if (projectInspection.getCtime() != null) {
                        model.setCtime(projectInspection.getCtime());
                    }
                    if (projectInspection.getTname() != null) {
                        model.setTname(projectInspection.getTname());
                    }
                    model.setPage(projectInspection.getPage());
                    if (projectInspection.getDuty() != null) {
                        model.setDuty(projectInspection.getDuty());
                    }
                    if (projectInspection.getThematic() != null) {
                        model.setThematic(projectInspection.getThematic());
                    }
                    if (projectInspection.getAnnotations() != null) {
                        model.setAnnotations(projectInspection.getAnnotations());
                    }
                    projectInspectionMapper.updateProjectInspection(model);
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
	public void setProjectInspectionMapper(ProjectInspectionMapper projectInspectionMapper) {
		this.projectInspectionMapper = projectInspectionMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
