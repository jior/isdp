package com.glaf.isdp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.bpmn.domain.*;
import com.glaf.bpmn.service.*;

import com.glaf.isdp.domain.CellMyTaskMain;
import com.glaf.isdp.domain.MyCellTask;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.domain.ProjectTreeAllwbs;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.isdp.mapper.ProjectTreeAllwbsMapper;
import com.glaf.isdp.query.CellMyTaskMainQuery;
import com.glaf.isdp.query.ProjectTreeAllwbsQuery;
import com.glaf.isdp.service.ICellMyTaskMainService;
import com.glaf.isdp.service.IMyCellTaskService;
import com.glaf.isdp.service.IMyCellTaskSubService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.IProjectTreeAllwbsService;
import com.glaf.isdp.service.IsdpTreepInfoService;

@Service("projectTreeAllwbsService")
@Transactional(readOnly = true)
public class MxProjectTreeAllwbsServiceImpl implements
		IProjectTreeAllwbsService {
	protected static final Log logger = LogFactory
			.getLog(MxProjectTreeAllwbsServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected ProjectTreeAllwbsMapper projectTreeAllwbsMapper;

	protected IMyCellTaskService myCellTaskService;

	protected IMyCellTaskSubService myCellTaskSubService;

	protected ICellMyTaskMainService cellTaskMainService;

	protected BpmnActivityDefService flowActivityDefService;

	protected BpmnActivityService flowActivityService;

	protected BpmnProcessService flowProcessService;

	protected INetRoleService netRoleService;

	protected IsdpTreepInfoService treepInfoService;

	public MxProjectTreeAllwbsServiceImpl() {

	}

	public int count(ProjectTreeAllwbsQuery query) {
		query.ensureInitialized();
		return projectTreeAllwbsMapper
				.getProjectTreeAllwbsCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		projectTreeAllwbsMapper.deleteProjectTreeAllwbsById(id);
	}

	public ProjectTreeAllwbs getProjectTreeAllwbsById(String id) {
		ProjectTreeAllwbs projectTreeAllwbs = projectTreeAllwbsMapper
				.getProjectTreeAllwbsById(id);
		return projectTreeAllwbs;
	}

	public ProjectTreeAllwbs getProjectTreeAllwbsByPrimaryKey(int indexId) {
		return projectTreeAllwbsMapper.getProjectTreeAllwbsByIndexId(indexId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectTreeAllwbsCount(Map<String, Object> parameter) {
		return projectTreeAllwbsMapper.getProjectTreeAllwbsCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectTreeAllwbsCountByQueryCriteria(
			ProjectTreeAllwbsQuery query) {
		return projectTreeAllwbsMapper
				.getProjectTreeAllwbsCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<ProjectTreeAllwbs> getProjectTreeAllwbss(
			Map<String, Object> parameter) {
		return projectTreeAllwbsMapper.getProjectTreeAllwbss(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<ProjectTreeAllwbs> getProjectTreeAllwbssByQueryCriteria(
			int start, int pageSize, ProjectTreeAllwbsQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<ProjectTreeAllwbs> rows = sqlSession.selectList(
				"getProjectTreeAllwbssByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<ProjectTreeAllwbs> list(ProjectTreeAllwbsQuery query) {
		query.ensureInitialized();
		List<ProjectTreeAllwbs> list = projectTreeAllwbsMapper
				.getProjectTreeAllwbssByQueryCriteria(query);
		return list;
	}

	/**
	 * 重载执行情况
	 * 
	 * @param taskmainIndexId
	 * @param cellTaskIndexId
	 *            25441
	 */
	@Transactional
	public void reloadExecution(int treepinfoIndexId) {
		IsdpTreepInfo treepInfo = treepInfoService
				.getTreepInfoByPrimaryKey(treepinfoIndexId);
		if (treepInfo == null) {
			return;
		}
		int wbsIndex = treepInfo.getWbsindex();
		projectTreeAllwbsMapper
				.deleteProjectTreeAllwbsByCellTaskIndexId(wbsIndex);
		List<MyCellTask> cellTasks = myCellTaskService.getMyCellTasksByIndexId(
				wbsIndex, 0);
		if (cellTasks != null && !cellTasks.isEmpty()) {
			Map<Integer, NetRole> roleMap = netRoleService.getRoleMap();
			for (MyCellTask t : cellTasks) {
				ProjectTreeAllwbs m = new ProjectTreeAllwbs();
				m.setCellTaskIndexId(treepinfoIndexId);
				m.setIndexId(idGenerator.nextId().intValue());
				m.setParentId(-1);
				m.setIndexName(t.getName());
				m.setId(String.valueOf(m.getIndexId()) + "|");
				if (t.getIntflowortask() == 1) {
					m.setType(2);// 任务
					m.setNodeico(2);
				}

				CellMyTaskMainQuery query01 = new CellMyTaskMainQuery();
				query01.indexId(treepinfoIndexId).mycellTasksId(t.getId())
						.intisflow(2);
				List<CellMyTaskMain> taskMains = cellTaskMainService
						.list(query01);
				if (taskMains != null && !taskMains.isEmpty()) {
					CellMyTaskMain myTask = taskMains.get(0);
					m.setIntfinish(myTask.getIntfinish());
					m.setStarttime(myTask.getCtime());
				}

				projectTreeAllwbsMapper.insertProjectTreeAllwbs(m);

				Map<String, FlowActivityEntity> activityMap = new HashMap<String, FlowActivityEntity>();
				List<FlowProcessEntity> processes = flowProcessService
						.getFlowProcesses(treepinfoIndexId, t.getId(), 2);
				if (processes != null && !processes.isEmpty()) {
					for (FlowProcessEntity proc : processes) {
						List<FlowActivityEntity> activities = flowActivityService
								.getFlowActivitiesByProcessInstanceId(proc
										.getId());
						if (activities != null && !activities.isEmpty()) {
							for (FlowActivityEntity act : activities) {
								activityMap.put(act.getActivDefId(), act);
							}
						}
					}
				}

				List<FlowActivityDefEntity> actDefs = flowActivityDefService
						.getFlowActivityEntitiesByMainId(t.getId());
				if (actDefs != null && !actDefs.isEmpty()) {
					for (FlowActivityDefEntity def : actDefs) {
						ProjectTreeAllwbs mm = new ProjectTreeAllwbs();
						mm.setCellTaskIndexId(treepinfoIndexId);
						mm.setIndexId(idGenerator.nextId().intValue());
						mm.setParentId(m.getIndexId());
						mm.setIndexName(def.getName());
						mm.setId(m.getId() + mm.getIndexId() + "|");
						mm.setType(3);// 流程
						mm.setNodeico(3);

						projectTreeAllwbsMapper.insertProjectTreeAllwbs(mm);

						if (StringUtils.isNotEmpty(def.getStrfuntion())) {
							List<FlowActivityDefEntity> subActDefs = flowActivityDefService
									.getFlowActivityEntitiesByMainId(def
											.getStrfuntion());
							if (subActDefs != null && !subActDefs.isEmpty()) {
								for (FlowActivityDefEntity f : subActDefs) {
									ProjectTreeAllwbs mmm = new ProjectTreeAllwbs();
									mmm.setCellTaskIndexId(treepinfoIndexId);
									mmm.setIndexId(idGenerator.nextId()
											.intValue());
									mmm.setParentId(mm.getIndexId());
									mmm.setIndexName(f.getName());
									mmm.setId(mm.getId() + mmm.getIndexId()
											+ "|");
									mmm.setType(4);// 人工活动
									mmm.setNodeico(4);

									if (f.getNetroleid() != null
											&& StringUtils.isNumeric(f
													.getNetroleid())) {
										NetRole r = roleMap.get(Integer
												.valueOf(f.getNetroleid()));
										if (r != null) {
											mmm.setRoleid(r.getId());
											mmm.setRolename(r.getName());
										}
									}

									FlowActivityEntity act = activityMap.get(f
											.getId());
									if (act != null) {
										mmm.setStarttime(act.getCtimeStart());
										mmm.setEndtime(act.getCtimeEnd());
										if (act.getState() == 0) {
											mmm.setIntfinish(1);
										} else if (act.getState() == 1) {
											mmm.setIntfinish(2);
										}
									}

									projectTreeAllwbsMapper
											.insertProjectTreeAllwbs(mmm);
								}
							}
						}
					}
				}
			}
		}
	}

	@Transactional
	public void save(ProjectTreeAllwbs projectTreeAllwbs) {
		if (projectTreeAllwbs.getIndexId() == 0) {
			projectTreeAllwbs.setIndexId(idGenerator.nextId().intValue());
			// projectTreeAllwbs.setIndexId(idGenerator.getNextId());
			// projectTreeAllwbs.setCreateDate(new Date());
			projectTreeAllwbsMapper.insertProjectTreeAllwbs(projectTreeAllwbs);
		} else {
			ProjectTreeAllwbs model = this
					.getProjectTreeAllwbsByPrimaryKey(projectTreeAllwbs
							.getIndexId());
			if (model != null) {
				if (projectTreeAllwbs.getId() != null) {
					model.setId(projectTreeAllwbs.getId());
				}
				if (projectTreeAllwbs.getNum() != null) {
					model.setNum(projectTreeAllwbs.getNum());
				}
				if (projectTreeAllwbs.getIndexName() != null) {
					model.setIndexName(projectTreeAllwbs.getIndexName());
				}
				model.setNlevel(projectTreeAllwbs.getNlevel());
				if (projectTreeAllwbs.getContent() != null) {
					model.setContent(projectTreeAllwbs.getContent());
				}
				model.setNodeico(projectTreeAllwbs.getNodeico());
				model.setListno(projectTreeAllwbs.getListno());
				model.setType(projectTreeAllwbs.getType());
				model.setRoleid(projectTreeAllwbs.getRoleid());
				if (projectTreeAllwbs.getRolename() != null) {
					model.setRolename(projectTreeAllwbs.getRolename());
				}
				model.setLimtime(projectTreeAllwbs.getLimtime());
				if (projectTreeAllwbs.getUserid() != null) {
					model.setUserid(projectTreeAllwbs.getUserid());
				}
				if (projectTreeAllwbs.getUsername() != null) {
					model.setUsername(projectTreeAllwbs.getUsername());
				}
				if (projectTreeAllwbs.getStarttime() != null) {
					model.setStarttime(projectTreeAllwbs.getStarttime());
				}
				if (projectTreeAllwbs.getEndtime() != null) {
					model.setEndtime(projectTreeAllwbs.getEndtime());
				}
				model.setUseday(projectTreeAllwbs.getUseday());
				model.setIntfinish(projectTreeAllwbs.getIntfinish());
				if (projectTreeAllwbs.getMainId() != null) {
					model.setMainId(projectTreeAllwbs.getMainId());
				}
				projectTreeAllwbsMapper.updateProjectTreeAllwbs(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setFlowProcessService(BpmnProcessService flowProcessService) {
		this.flowProcessService = flowProcessService;
	}

	@javax.annotation.Resource
	public void setCellTaskMainService(
			ICellMyTaskMainService cellTaskMainService) {
		this.cellTaskMainService = cellTaskMainService;
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowActivityDefService(
			BpmnActivityDefService flowActivityDefService) {
		this.flowActivityDefService = flowActivityDefService;
	}

	@javax.annotation.Resource
	public void setFlowActivityService(BpmnActivityService flowActivityService) {
		this.flowActivityService = flowActivityService;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setMyCellTaskService(IMyCellTaskService myCellTaskService) {
		this.myCellTaskService = myCellTaskService;
	}

	@javax.annotation.Resource
	public void setMyCellTaskSubService(
			IMyCellTaskSubService myCellTaskSubService) {
		this.myCellTaskSubService = myCellTaskSubService;
	}

	@javax.annotation.Resource
	public void setNetRoleService(INetRoleService netRoleService) {
		this.netRoleService = netRoleService;
	}

	@javax.annotation.Resource
	public void setProjectTreeAllwbsMapper(
			ProjectTreeAllwbsMapper projectTreeAllwbsMapper) {
		this.projectTreeAllwbsMapper = projectTreeAllwbsMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setTreepInfoService(IsdpTreepInfoService treepInfoService) {
		this.treepInfoService = treepInfoService;
	}

}
