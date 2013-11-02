package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class DotuseQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected List<Integer> indexIds;
	protected Integer projid;
	protected List<Integer> projids;
	protected Integer pid;
	protected List<Integer> pids;
	protected String dotid;
	protected String dotidLike;
	protected List<String> dotids;
	protected String numLike;
	protected String nameLike;
	protected String cmanLike;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected String fileNameLike;
	protected Integer filesizeGreaterThanOrEqual;
	protected Integer filesizeLessThanOrEqual;
	protected String vision;
	protected String visionLike;
	protected List<String> visions;
	protected String savetimeLike;
	protected String remarkLike;
	protected Integer dwid;
	protected List<Integer> dwids;
	protected Integer fbid;
	protected Integer fbidGreaterThanOrEqual;
	protected Integer fbidLessThanOrEqual;
	protected List<Integer> fbids;
	protected Integer fxid;
	protected List<Integer> fxids;
	protected String jid;
	protected String jidLike;
	protected List<String> jids;
	protected String flid;
	protected String flidLike;
	protected List<String> flids;
	protected String topnode;
	protected String topnodeLike;
	protected List<String> topnodes;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected Integer type;
	protected List<Integer> types;
	protected String fnameLike;
	protected String isink;
	protected String isinkLike;
	protected List<String> isinks;
	protected String oldId;
	protected String oldIdLike;
	protected List<String> oldIds;
	protected String taskId;
	protected String taskIdLike;
	protected List<String> taskIds;

	

	public DotuseQuery() {

	}

	public DotuseQuery cmanLike(String cmanLike) {
		if (cmanLike == null) {
			throw new RuntimeException("cman is null");
		}
		this.cmanLike = cmanLike;
		return this;
	}

	public DotuseQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public DotuseQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public DotuseQuery dotid(String dotid) {
		if (dotid == null) {
			throw new RuntimeException("dotid is null");
		}
		this.dotid = dotid;
		return this;
	}

	public DotuseQuery dotidLike(String dotidLike) {
		if (dotidLike == null) {
			throw new RuntimeException("dotid is null");
		}
		this.dotidLike = dotidLike;
		return this;
	}

	public DotuseQuery dotids(List<String> dotids) {
		if (dotids == null) {
			throw new RuntimeException("dotids is empty ");
		}
		this.dotids = dotids;
		return this;
	}

	public DotuseQuery dwid(Integer dwid) {
		if (dwid == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwid = dwid;
		return this;
	}

	public DotuseQuery dwids(List<Integer> dwids) {
		if (dwids == null) {
			throw new RuntimeException("dwids is empty ");
		}
		this.dwids = dwids;
		return this;
	}

	public DotuseQuery fbid(Integer fbid) {
		if (fbid == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbid = fbid;
		return this;
	}

	public DotuseQuery fbidGreaterThanOrEqual(Integer fbidGreaterThanOrEqual) {
		if (fbidGreaterThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidGreaterThanOrEqual = fbidGreaterThanOrEqual;
		return this;
	}

	public DotuseQuery fbidLessThanOrEqual(Integer fbidLessThanOrEqual) {
		if (fbidLessThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidLessThanOrEqual = fbidLessThanOrEqual;
		return this;
	}

	public DotuseQuery fbids(List<Integer> fbids) {
		if (fbids == null) {
			throw new RuntimeException("fbids is empty ");
		}
		this.fbids = fbids;
		return this;
	}

	public DotuseQuery fileNameLike(String fileNameLike) {
		if (fileNameLike == null) {
			throw new RuntimeException("fileName is null");
		}
		this.fileNameLike = fileNameLike;
		return this;
	}

	public DotuseQuery filesizeGreaterThanOrEqual(
			Integer filesizeGreaterThanOrEqual) {
		if (filesizeGreaterThanOrEqual == null) {
			throw new RuntimeException("filesize is null");
		}
		this.filesizeGreaterThanOrEqual = filesizeGreaterThanOrEqual;
		return this;
	}

	public DotuseQuery filesizeLessThanOrEqual(Integer filesizeLessThanOrEqual) {
		if (filesizeLessThanOrEqual == null) {
			throw new RuntimeException("filesize is null");
		}
		this.filesizeLessThanOrEqual = filesizeLessThanOrEqual;
		return this;
	}

	public DotuseQuery flid(String flid) {
		if (flid == null) {
			throw new RuntimeException("flid is null");
		}
		this.flid = flid;
		return this;
	}

	public DotuseQuery flidLike(String flidLike) {
		if (flidLike == null) {
			throw new RuntimeException("flid is null");
		}
		this.flidLike = flidLike;
		return this;
	}

	public DotuseQuery flids(List<String> flids) {
		if (flids == null) {
			throw new RuntimeException("flids is empty ");
		}
		this.flids = flids;
		return this;
	}

	public DotuseQuery fnameLike(String fnameLike) {
		if (fnameLike == null) {
			throw new RuntimeException("fname is null");
		}
		this.fnameLike = fnameLike;
		return this;
	}

	public DotuseQuery fxid(Integer fxid) {
		if (fxid == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxid = fxid;
		return this;
	}

	public DotuseQuery fxids(List<Integer> fxids) {
		if (fxids == null) {
			throw new RuntimeException("fxids is empty ");
		}
		this.fxids = fxids;
		return this;
	}

	public String getCmanLike() {
		if (cmanLike != null && cmanLike.trim().length() > 0) {
			if (!cmanLike.startsWith("%")) {
				cmanLike = "%" + cmanLike;
			}
			if (!cmanLike.endsWith("%")) {
				cmanLike = cmanLike + "%";
			}
		}
		return cmanLike;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public String getDotid() {
		return dotid;
	}

	public String getDotidLike() {
		if (dotidLike != null && dotidLike.trim().length() > 0) {
			if (!dotidLike.startsWith("%")) {
				dotidLike = "%" + dotidLike;
			}
			if (!dotidLike.endsWith("%")) {
				dotidLike = dotidLike + "%";
			}
		}
		return dotidLike;
	}

	public List<String> getDotids() {
		return dotids;
	}

	public Integer getDwid() {
		return dwid;
	}

	public List<Integer> getDwids() {
		return dwids;
	}

	public Integer getFbid() {
		return fbid;
	}

	public Integer getFbidGreaterThanOrEqual() {
		return fbidGreaterThanOrEqual;
	}

	public Integer getFbidLessThanOrEqual() {
		return fbidLessThanOrEqual;
	}

	public List<Integer> getFbids() {
		return fbids;
	}

	public String getFileNameLike() {
		if (fileNameLike != null && fileNameLike.trim().length() > 0) {
			if (!fileNameLike.startsWith("%")) {
				fileNameLike = "%" + fileNameLike;
			}
			if (!fileNameLike.endsWith("%")) {
				fileNameLike = fileNameLike + "%";
			}
		}
		return fileNameLike;
	}

	public Integer getFilesizeGreaterThanOrEqual() {
		return filesizeGreaterThanOrEqual;
	}

	public Integer getFilesizeLessThanOrEqual() {
		return filesizeLessThanOrEqual;
	}

	public String getFlid() {
		return flid;
	}

	public String getFlidLike() {
		if (flidLike != null && flidLike.trim().length() > 0) {
			if (!flidLike.startsWith("%")) {
				flidLike = "%" + flidLike;
			}
			if (!flidLike.endsWith("%")) {
				flidLike = flidLike + "%";
			}
		}
		return flidLike;
	}

	public List<String> getFlids() {
		return flids;
	}

	public String getFnameLike() {
		if (fnameLike != null && fnameLike.trim().length() > 0) {
			if (!fnameLike.startsWith("%")) {
				fnameLike = "%" + fnameLike;
			}
			if (!fnameLike.endsWith("%")) {
				fnameLike = fnameLike + "%";
			}
		}
		return fnameLike;
	}

	public Integer getFxid() {
		return fxid;
	}

	public List<Integer> getFxids() {
		return fxids;
	}

	public Integer getIndexId() {
		return indexId;
	}

	public List<Integer> getIndexIds() {
		return indexIds;
	}

	public String getIsink() {
		return isink;
	}

	public String getIsinkLike() {
		if (isinkLike != null && isinkLike.trim().length() > 0) {
			if (!isinkLike.startsWith("%")) {
				isinkLike = "%" + isinkLike;
			}
			if (!isinkLike.endsWith("%")) {
				isinkLike = isinkLike + "%";
			}
		}
		return isinkLike;
	}

	public List<String> getIsinks() {
		return isinks;
	}

	public String getJid() {
		return jid;
	}

	public String getJidLike() {
		if (jidLike != null && jidLike.trim().length() > 0) {
			if (!jidLike.startsWith("%")) {
				jidLike = "%" + jidLike;
			}
			if (!jidLike.endsWith("%")) {
				jidLike = jidLike + "%";
			}
		}
		return jidLike;
	}

	public List<String> getJids() {
		return jids;
	}

	public String getNameLike() {
		if (nameLike != null && nameLike.trim().length() > 0) {
			if (!nameLike.startsWith("%")) {
				nameLike = "%" + nameLike;
			}
			if (!nameLike.endsWith("%")) {
				nameLike = nameLike + "%";
			}
		}
		return nameLike;
	}

	public String getNumLike() {
		if (numLike != null && numLike.trim().length() > 0) {
			if (!numLike.startsWith("%")) {
				numLike = "%" + numLike;
			}
			if (!numLike.endsWith("%")) {
				numLike = numLike + "%";
			}
		}
		return numLike;
	}

	public String getOldId() {
		return oldId;
	}

	public String getOldIdLike() {
		if (oldIdLike != null && oldIdLike.trim().length() > 0) {
			if (!oldIdLike.startsWith("%")) {
				oldIdLike = "%" + oldIdLike;
			}
			if (!oldIdLike.endsWith("%")) {
				oldIdLike = oldIdLike + "%";
			}
		}
		return oldIdLike;
	}

	public List<String> getOldIds() {
		return oldIds;
	}

	public String getOrderBy() {
		if (sortField != null) {
			String a_x = " asc ";
			if (getSortOrder()!= null) {
				a_x = " desc ";
			}

			if (columns.get(sortField) != null) {
				orderBy = " E." + columns.get(sortField) + a_x;
			}
		}
		return orderBy;
	}

	public Integer getPid() {
		return pid;
	}

	public List<Integer> getPids() {
		return pids;
	}

	public Integer getProjid() {
		return projid;
	}

	public List<Integer> getProjids() {
		return projids;
	}

	public String getRemarkLike() {
		if (remarkLike != null && remarkLike.trim().length() > 0) {
			if (!remarkLike.startsWith("%")) {
				remarkLike = "%" + remarkLike;
			}
			if (!remarkLike.endsWith("%")) {
				remarkLike = remarkLike + "%";
			}
		}
		return remarkLike;
	}

	public String getSavetimeLike() {
		if (savetimeLike != null && savetimeLike.trim().length() > 0) {
			if (!savetimeLike.startsWith("%")) {
				savetimeLike = "%" + savetimeLike;
			}
			if (!savetimeLike.endsWith("%")) {
				savetimeLike = savetimeLike + "%";
			}
		}
		return savetimeLike;
	}

	public String getTaskId() {
		return taskId;
	}

	public String getTaskIdLike() {
		if (taskIdLike != null && taskIdLike.trim().length() > 0) {
			if (!taskIdLike.startsWith("%")) {
				taskIdLike = "%" + taskIdLike;
			}
			if (!taskIdLike.endsWith("%")) {
				taskIdLike = taskIdLike + "%";
			}
		}
		return taskIdLike;
	}

	public List<String> getTaskIds() {
		return taskIds;
	}

	public String getTopid() {
		return topid;
	}

	public String getTopidLike() {
		if (topidLike != null && topidLike.trim().length() > 0) {
			if (!topidLike.startsWith("%")) {
				topidLike = "%" + topidLike;
			}
			if (!topidLike.endsWith("%")) {
				topidLike = topidLike + "%";
			}
		}
		return topidLike;
	}

	public List<String> getTopids() {
		return topids;
	}

	public String getTopnode() {
		return topnode;
	}

	public String getTopnodeLike() {
		if (topnodeLike != null && topnodeLike.trim().length() > 0) {
			if (!topnodeLike.startsWith("%")) {
				topnodeLike = "%" + topnodeLike;
			}
			if (!topnodeLike.endsWith("%")) {
				topnodeLike = topnodeLike + "%";
			}
		}
		return topnodeLike;
	}

	public List<String> getTopnodes() {
		return topnodes;
	}

	public Integer getType() {
		return type;
	}

	public List<Integer> getTypes() {
		return types;
	}

	public String getVision() {
		return vision;
	}

	public String getVisionLike() {
		if (visionLike != null && visionLike.trim().length() > 0) {
			if (!visionLike.startsWith("%")) {
				visionLike = "%" + visionLike;
			}
			if (!visionLike.endsWith("%")) {
				visionLike = visionLike + "%";
			}
		}
		return visionLike;
	}

	public List<String> getVisions() {
		return visions;
	}

	public DotuseQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public DotuseQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("fileID", "fileID");
		addColumn("indexId", "index_id");
		addColumn("projid", "projid");
		addColumn("pid", "pid");
		addColumn("dotid", "dotid");
		addColumn("num", "num");
		addColumn("name", "name");
		addColumn("cman", "cman");
		addColumn("ctime", "Ctime");
		addColumn("fileName", "file_name");
		addColumn("filesize", "filesize");
		addColumn("vision", "vision");
		addColumn("savetime", "savetime");
		addColumn("remark", "remark");
		addColumn("dwid", "dwid");
		addColumn("fbid", "fbid");
		addColumn("fxid", "fxid");
		addColumn("jid", "jid");
		addColumn("flid", "flid");
		addColumn("topnode", "topnode");
		addColumn("topid", "topid");
		addColumn("type", "type");
		addColumn("fname", "fname");
		addColumn("isink", "isink");
		addColumn("oldId", "old_id");
		addColumn("taskId", "Task_id");
		addColumn("ischeck", "ischeck");
	}

	public DotuseQuery isink(String isink) {
		if (isink == null) {
			throw new RuntimeException("isink is null");
		}
		this.isink = isink;
		return this;
	}

	public DotuseQuery isinkLike(String isinkLike) {
		if (isinkLike == null) {
			throw new RuntimeException("isink is null");
		}
		this.isinkLike = isinkLike;
		return this;
	}

	public DotuseQuery isinks(List<String> isinks) {
		if (isinks == null) {
			throw new RuntimeException("isinks is empty ");
		}
		this.isinks = isinks;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public DotuseQuery jid(String jid) {
		if (jid == null) {
			throw new RuntimeException("jid is null");
		}
		this.jid = jid;
		return this;
	}

	public DotuseQuery jidLike(String jidLike) {
		if (jidLike == null) {
			throw new RuntimeException("jid is null");
		}
		this.jidLike = jidLike;
		return this;
	}

	public DotuseQuery jids(List<String> jids) {
		if (jids == null) {
			throw new RuntimeException("jids is empty ");
		}
		this.jids = jids;
		return this;
	}

	public DotuseQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public DotuseQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public DotuseQuery oldId(String oldId) {
		if (oldId == null) {
			throw new RuntimeException("oldId is null");
		}
		this.oldId = oldId;
		return this;
	}

	public DotuseQuery oldIdLike(String oldIdLike) {
		if (oldIdLike == null) {
			throw new RuntimeException("oldId is null");
		}
		this.oldIdLike = oldIdLike;
		return this;
	}

	public DotuseQuery oldIds(List<String> oldIds) {
		if (oldIds == null) {
			throw new RuntimeException("oldIds is empty ");
		}
		this.oldIds = oldIds;
		return this;
	}

	public DotuseQuery pid(Integer pid) {
		if (pid == null) {
			throw new RuntimeException("pid is null");
		}
		this.pid = pid;
		return this;
	}

	public DotuseQuery pids(List<Integer> pids) {
		if (pids == null) {
			throw new RuntimeException("pids is empty ");
		}
		this.pids = pids;
		return this;
	}

	public DotuseQuery projid(Integer projid) {
		if (projid == null) {
			throw new RuntimeException("projid is null");
		}
		this.projid = projid;
		return this;
	}

	public DotuseQuery projids(List<Integer> projids) {
		if (projids == null) {
			throw new RuntimeException("projids is empty ");
		}
		this.projids = projids;
		return this;
	}

	public DotuseQuery remarkLike(String remarkLike) {
		if (remarkLike == null) {
			throw new RuntimeException("remark is null");
		}
		this.remarkLike = remarkLike;
		return this;
	}

	public DotuseQuery savetimeLike(String savetimeLike) {
		if (savetimeLike == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetimeLike = savetimeLike;
		return this;
	}

	public void setCmanLike(String cmanLike) {
		this.cmanLike = cmanLike;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setDotid(String dotid) {
		this.dotid = dotid;
	}

	public void setDotidLike(String dotidLike) {
		this.dotidLike = dotidLike;
	}

	public void setDotids(List<String> dotids) {
		this.dotids = dotids;
	}

	public void setDwid(Integer dwid) {
		this.dwid = dwid;
	}

	public void setDwids(List<Integer> dwids) {
		this.dwids = dwids;
	}

	public void setFbid(Integer fbid) {
		this.fbid = fbid;
	}

	public void setFbidGreaterThanOrEqual(Integer fbidGreaterThanOrEqual) {
		this.fbidGreaterThanOrEqual = fbidGreaterThanOrEqual;
	}

	public void setFbidLessThanOrEqual(Integer fbidLessThanOrEqual) {
		this.fbidLessThanOrEqual = fbidLessThanOrEqual;
	}

	public void setFbids(List<Integer> fbids) {
		this.fbids = fbids;
	}

	public void setFileNameLike(String fileNameLike) {
		this.fileNameLike = fileNameLike;
	}

	public void setFilesizeGreaterThanOrEqual(Integer filesizeGreaterThanOrEqual) {
		this.filesizeGreaterThanOrEqual = filesizeGreaterThanOrEqual;
	}

	public void setFilesizeLessThanOrEqual(Integer filesizeLessThanOrEqual) {
		this.filesizeLessThanOrEqual = filesizeLessThanOrEqual;
	}

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFlidLike(String flidLike) {
		this.flidLike = flidLike;
	}

	public void setFlids(List<String> flids) {
		this.flids = flids;
	}

	public void setFnameLike(String fnameLike) {
		this.fnameLike = fnameLike;
	}

	public void setFxid(Integer fxid) {
		this.fxid = fxid;
	}

	public void setFxids(List<Integer> fxids) {
		this.fxids = fxids;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setIndexIds(List<Integer> indexIds) {
		this.indexIds = indexIds;
	}

	public void setIsink(String isink) {
		this.isink = isink;
	}

	public void setIsinkLike(String isinkLike) {
		this.isinkLike = isinkLike;
	}

	public void setIsinks(List<String> isinks) {
		this.isinks = isinks;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	public void setJidLike(String jidLike) {
		this.jidLike = jidLike;
	}

	public void setJids(List<String> jids) {
		this.jids = jids;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public void setOldIdLike(String oldIdLike) {
		this.oldIdLike = oldIdLike;
	}

	public void setOldIds(List<String> oldIds) {
		this.oldIds = oldIds;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPids(List<Integer> pids) {
		this.pids = pids;
	}

	public void setProjid(Integer projid) {
		this.projid = projid;
	}

	public void setProjids(List<Integer> projids) {
		this.projids = projids;
	}

	public void setRemarkLike(String remarkLike) {
		this.remarkLike = remarkLike;
	}

	public void setSavetimeLike(String savetimeLike) {
		this.savetimeLike = savetimeLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTaskIdLike(String taskIdLike) {
		this.taskIdLike = taskIdLike;
	}

	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTopidLike(String topidLike) {
		this.topidLike = topidLike;
	}

	public void setTopids(List<String> topids) {
		this.topids = topids;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTopnodeLike(String topnodeLike) {
		this.topnodeLike = topnodeLike;
	}

	public void setTopnodes(List<String> topnodes) {
		this.topnodes = topnodes;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void setTypes(List<Integer> types) {
		this.types = types;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public void setVisionLike(String visionLike) {
		this.visionLike = visionLike;
	}

	public void setVisions(List<String> visions) {
		this.visions = visions;
	}

	public DotuseQuery taskId(String taskId) {
		if (taskId == null) {
			throw new RuntimeException("taskId is null");
		}
		this.taskId = taskId;
		return this;
	}

	public DotuseQuery taskIdLike(String taskIdLike) {
		if (taskIdLike == null) {
			throw new RuntimeException("taskId is null");
		}
		this.taskIdLike = taskIdLike;
		return this;
	}

	public DotuseQuery taskIds(List<String> taskIds) {
		if (taskIds == null) {
			throw new RuntimeException("taskIds is empty ");
		}
		this.taskIds = taskIds;
		return this;
	}

	public DotuseQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public DotuseQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public DotuseQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public DotuseQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public DotuseQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public DotuseQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public DotuseQuery type(Integer type) {
		if (type == null) {
			throw new RuntimeException("type is null");
		}
		this.type = type;
		return this;
	}

	public DotuseQuery types(List<Integer> types) {
		if (types == null) {
			throw new RuntimeException("types is empty ");
		}
		this.types = types;
		return this;
	}

	public DotuseQuery vision(String vision) {
		if (vision == null) {
			throw new RuntimeException("vision is null");
		}
		this.vision = vision;
		return this;
	}

	public DotuseQuery visionLike(String visionLike) {
		if (visionLike == null) {
			throw new RuntimeException("vision is null");
		}
		this.visionLike = visionLike;
		return this;
	}

	public DotuseQuery visions(List<String> visions) {
		if (visions == null) {
			throw new RuntimeException("visions is empty ");
		}
		this.visions = visions;
		return this;
	}

}