package com.glaf.isdp.domain;

import java.util.Date;

public class IsdpTaskItem implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	protected String activityId;
	protected String taskMainId;
	protected Date createTime;
	protected Date startTime;
	protected Date endTime;
	protected int timelimit;
	protected int indexId;
	protected int listno;
	protected int typeIndexId;
	protected int flagint;
	protected int intfinish;
	protected int intisflow;
	protected int intStop;
	protected int filetypeIndex;
	protected int state;
	protected String taskId;
	protected String name;
	protected String subject;
	protected String projectName;
	protected String mycellTasksId;
	protected String fromTasksId;
	protected String toTaskId;
	protected String typeTablename;
	protected String typeId;
	protected String actorId;
	protected String netRoleId;

	public String getActivityId() {
		return activityId;
	}

	public String getActorId() {
		return actorId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public int getFiletypeIndex() {
		return filetypeIndex;
	}

	public int getFlagint() {
		return flagint;
	}

	public String getFromTasksId() {
		return fromTasksId;
	}

	public int getIndexId() {
		return indexId;
	}

	public int getIntfinish() {
		return intfinish;
	}

	public int getIntisflow() {
		return intisflow;
	}

	public int getIntStop() {
		return intStop;
	}

	public int getListno() {
		return listno;
	}

	public String getMycellTasksId() {
		return mycellTasksId;
	}

	public String getName() {
		return name;
	}

	public String getNetRoleId() {
		return netRoleId;
	}

	public String getProjectName() {
		return projectName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public int getState() {
		return state;
	}

	public String getSubject() {
		return subject;
	}

	public String getTaskId() {
		return taskId;
	}

	public String getTaskMainId() {
		return taskMainId;
	}

	public int getTimelimit() {
		return timelimit;
	}

	public String getToTaskId() {
		return toTaskId;
	}

	public String getTypeId() {
		return typeId;
	}

	public int getTypeIndexId() {
		return typeIndexId;
	}

	public String getTypeTablename() {
		return typeTablename;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void setFiletypeIndex(int filetypeIndex) {
		this.filetypeIndex = filetypeIndex;
	}

	public void setFlagint(int flagint) {
		this.flagint = flagint;
	}

	public void setFromTasksId(String fromTasksId) {
		this.fromTasksId = fromTasksId;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntfinish(int intfinish) {
		this.intfinish = intfinish;
	}

	public void setIntisflow(int intisflow) {
		this.intisflow = intisflow;
	}

	public void setIntStop(int intStop) {
		this.intStop = intStop;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMycellTasksId(String mycellTasksId) {
		this.mycellTasksId = mycellTasksId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNetRoleId(String netRoleId) {
		this.netRoleId = netRoleId;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTaskMainId(String taskMainId) {
		this.taskMainId = taskMainId;
	}

	public void setTimelimit(int timelimit) {
		this.timelimit = timelimit;
	}

	public void setToTaskId(String toTaskId) {
		this.toTaskId = toTaskId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIndexId(int typeIndexId) {
		this.typeIndexId = typeIndexId;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

}
