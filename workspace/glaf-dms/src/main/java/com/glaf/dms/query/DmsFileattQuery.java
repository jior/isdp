/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.dms.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

/**
 * 
 * 查询类
 * 
 */
public class DmsFileattQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected List<String> fileIds;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected String num;
	protected String numLike;
	protected List<String> nums;
	protected String actor;
	protected String actorLike;
	protected String fname;
	protected String fnameLike;
	protected String fileName;
	protected String fileNameLike;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected Integer filesizeGreaterThanOrEqual;
	protected Integer filesizeLessThanOrEqual;
	protected String choosePublishFlag;
	protected Long choosePublishTime;
	protected Long choosePublishTimeGreaterThanOrEqual;
	protected Long choosePublishTimeLessThanOrEqual;
	protected Integer publishdiskid;

	public DmsFileattQuery() {

	}

	public DmsFileattQuery actor(String actor) {
		if (actor == null) {
			throw new RuntimeException("actor is null");
		}
		this.actor = actor;
		return this;
	}

	public DmsFileattQuery actorLike(String actorLike) {
		if (actorLike == null) {
			throw new RuntimeException("actor is null");
		}
		this.actorLike = actorLike;
		return this;
	}

	public DmsFileattQuery choosePublishFlag(String choosePublishFlag) {
		if (choosePublishFlag == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlag = choosePublishFlag;
		return this;
	}

	public DmsFileattQuery choosePublishTime(Long choosePublishTime) {
		if (choosePublishTime == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTime = choosePublishTime;
		return this;
	}

	public DmsFileattQuery choosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		if (choosePublishTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
		return this;
	}

	public DmsFileattQuery choosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		if (choosePublishTimeLessThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
		return this;
	}

	public DmsFileattQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public DmsFileattQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public DmsFileattQuery fileName(String fileName) {
		if (fileName == null) {
			throw new RuntimeException("fileName is null");
		}
		this.fileName = fileName;
		return this;
	}

	public DmsFileattQuery fileNameLike(String fileNameLike) {
		if (fileNameLike == null) {
			throw new RuntimeException("fileName is null");
		}
		this.fileNameLike = fileNameLike;
		return this;
	}

	public DmsFileattQuery filesizeGreaterThanOrEqual(
			Integer filesizeGreaterThanOrEqual) {
		if (filesizeGreaterThanOrEqual == null) {
			throw new RuntimeException("filesize is null");
		}
		this.filesizeGreaterThanOrEqual = filesizeGreaterThanOrEqual;
		return this;
	}

	public DmsFileattQuery filesizeLessThanOrEqual(
			Integer filesizeLessThanOrEqual) {
		if (filesizeLessThanOrEqual == null) {
			throw new RuntimeException("filesize is null");
		}
		this.filesizeLessThanOrEqual = filesizeLessThanOrEqual;
		return this;
	}

	public DmsFileattQuery fname(String fname) {
		if (fname == null) {
			throw new RuntimeException("fname is null");
		}
		this.fname = fname;
		return this;
	}

	public DmsFileattQuery fnameLike(String fnameLike) {
		if (fnameLike == null) {
			throw new RuntimeException("fname is null");
		}
		this.fnameLike = fnameLike;
		return this;
	}

	public String getActor() {
		return actor;
	}

	public String getActorLike() {
		if (actorLike != null && actorLike.trim().length() > 0) {
			if (!actorLike.startsWith("%")) {
				actorLike = "%" + actorLike;
			}
			if (!actorLike.endsWith("%")) {
				actorLike = actorLike + "%";
			}
		}
		return actorLike;
	}

	public String getChoosePublishFlag() {
		return choosePublishFlag;
	}

	public Long getChoosePublishTime() {
		return choosePublishTime;
	}

	public Long getChoosePublishTimeGreaterThanOrEqual() {
		return choosePublishTimeGreaterThanOrEqual;
	}

	public Long getChoosePublishTimeLessThanOrEqual() {
		return choosePublishTimeLessThanOrEqual;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public String getFileName() {
		return fileName;
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

	public String getFname() {
		return fname;
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

	public String getNum() {
		return num;
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

	public List<String> getNums() {
		return nums;
	}

	public String getOrderBy() {
		if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

			if ("topid".equals(sortColumn)) {
				orderBy = "E.TOPID" + a_x;
			}

			if ("num".equals(sortColumn)) {
				orderBy = "E.NUM" + a_x;
			}

			if ("actor".equals(sortColumn)) {
				orderBy = "E.ACTOR" + a_x;
			}

			if ("fname".equals(sortColumn)) {
				orderBy = "E.FNAME" + a_x;
			}

			if ("fileName".equals(sortColumn)) {
				orderBy = "E.FILE_NAME" + a_x;
			}

			if ("vision".equals(sortColumn)) {
				orderBy = "E.VISION" + a_x;
			}

			if ("ctime".equals(sortColumn)) {
				orderBy = "E.CTIME" + a_x;
			}

			if ("filesize".equals(sortColumn)) {
				orderBy = "E.FILESIZE" + a_x;
			}

			if ("visID".equals(sortColumn)) {
				orderBy = "E.VISID" + a_x;
			}

			if ("attID".equals(sortColumn)) {
				orderBy = "E.ATTID" + a_x;
			}

			if ("isTextContent".equals(sortColumn)) {
				orderBy = "E.ISTEXTCONTENT" + a_x;
			}

			if ("choosePublishFlag".equals(sortColumn)) {
				orderBy = "E.CHOOSEPUBLISHFLAG" + a_x;
			}

			if ("choosePublishTime".equals(sortColumn)) {
				orderBy = "E.CHOOSEPUBLISHTIME" + a_x;
			}

			if ("publishdiskid".equals(sortColumn)) {
				orderBy = "E.PUBLISHDISKID" + a_x;
			}

		}
		return orderBy;
	}

	public Integer getPublishdiskid() {
		return publishdiskid;
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

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("fileId", "FILEID");
		addColumn("topid", "TOPID");
		addColumn("num", "NUM");
		addColumn("actor", "ACTOR");
		addColumn("fname", "FNAME");
		addColumn("fileName", "FILE_NAME");
		addColumn("vision", "VISION");
		addColumn("ctime", "CTIME");
		addColumn("filesize", "FILESIZE");
		addColumn("visID", "VISID");
		addColumn("attID", "ATTID");
		addColumn("isTextContent", "ISTEXTCONTENT");
		addColumn("choosePublishFlag", "CHOOSEPUBLISHFLAG");
		addColumn("choosePublishTime", "CHOOSEPUBLISHTIME");
		addColumn("publishdiskid", "PUBLISHDISKID");
	}

	public DmsFileattQuery num(String num) {
		if (num == null) {
			throw new RuntimeException("num is null");
		}
		this.num = num;
		return this;
	}

	public DmsFileattQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public DmsFileattQuery nums(List<String> nums) {
		if (nums == null) {
			throw new RuntimeException("nums is empty ");
		}
		this.nums = nums;
		return this;
	}

	public DmsFileattQuery publishdiskid(Integer publishdiskid) {
		if (publishdiskid == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskid = publishdiskid;
		return this;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setActorLike(String actorLike) {
		this.actorLike = actorLike;
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setChoosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
	}

	public void setChoosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setFnameLike(String fnameLike) {
		this.fnameLike = fnameLike;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setNums(List<String> nums) {
		this.nums = nums;
	}

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
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

	public DmsFileattQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public DmsFileattQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public DmsFileattQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

}