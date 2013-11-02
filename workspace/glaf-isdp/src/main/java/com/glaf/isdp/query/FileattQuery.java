package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class FileattQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected String numLike;
	protected String actorLike;
	protected String fnameLike;
	protected String fileNameLike;
	protected String vision;
	protected String visionLike;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected Integer filesizeGreaterThanOrEqual;
	protected Integer filesizeLessThanOrEqual;
	protected String visID;
	protected String visIDLike;
	protected List<String> visIDs;
	protected String attID;
	protected String attIDLike;
	protected List<String> attIDs;
	protected Integer istextcontent;
	protected Integer istextcontentGreaterThanOrEqual;
	protected Integer istextcontentLessThanOrEqual;
	protected String textcontentLike;
	

	public FileattQuery() {

	}

	public FileattQuery actorLike(String actorLike) {
		if (actorLike == null) {
			throw new RuntimeException("actor is null");
		}
		this.actorLike = actorLike;
		return this;
	}

	public FileattQuery attID(String attID) {
		if (attID == null) {
			throw new RuntimeException("attID is null");
		}
		this.attID = attID;
		return this;
	}

	public FileattQuery attIDLike(String attIDLike) {
		if (attIDLike == null) {
			throw new RuntimeException("attID is null");
		}
		this.attIDLike = attIDLike;
		return this;
	}

	public FileattQuery attIDs(List<String> attIDs) {
		if (attIDs == null) {
			throw new RuntimeException("attIDs is empty ");
		}
		this.attIDs = attIDs;
		return this;
	}

	public FileattQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public FileattQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public FileattQuery fileNameLike(String fileNameLike) {
		if (fileNameLike == null) {
			throw new RuntimeException("fileName is null");
		}
		this.fileNameLike = fileNameLike;
		return this;
	}

	public FileattQuery filesizeGreaterThanOrEqual(
			Integer filesizeGreaterThanOrEqual) {
		if (filesizeGreaterThanOrEqual == null) {
			throw new RuntimeException("filesize is null");
		}
		this.filesizeGreaterThanOrEqual = filesizeGreaterThanOrEqual;
		return this;
	}

	public FileattQuery filesizeLessThanOrEqual(Integer filesizeLessThanOrEqual) {
		if (filesizeLessThanOrEqual == null) {
			throw new RuntimeException("filesize is null");
		}
		this.filesizeLessThanOrEqual = filesizeLessThanOrEqual;
		return this;
	}

	public FileattQuery fnameLike(String fnameLike) {
		if (fnameLike == null) {
			throw new RuntimeException("fname is null");
		}
		this.fnameLike = fnameLike;
		return this;
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

	public String getAttID() {
		return attID;
	}

	public String getAttIDLike() {
		if (attIDLike != null && attIDLike.trim().length() > 0) {
			if (!attIDLike.startsWith("%")) {
				attIDLike = "%" + attIDLike;
			}
			if (!attIDLike.endsWith("%")) {
				attIDLike = attIDLike + "%";
			}
		}
		return attIDLike;
	}

	public List<String> getAttIDs() {
		return attIDs;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
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

	public Integer getIstextcontent() {
		return istextcontent;
	}

	public Integer getIstextcontentGreaterThanOrEqual() {
		return istextcontentGreaterThanOrEqual;
	}

	public Integer getIstextcontentLessThanOrEqual() {
		return istextcontentLessThanOrEqual;
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

	public String getTextcontentLike() {
		if (textcontentLike != null && textcontentLike.trim().length() > 0) {
			if (!textcontentLike.startsWith("%")) {
				textcontentLike = "%" + textcontentLike;
			}
			if (!textcontentLike.endsWith("%")) {
				textcontentLike = textcontentLike + "%";
			}
		}
		return textcontentLike;
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

	public String getVisID() {
		return visID;
	}

	public String getVisIDLike() {
		if (visIDLike != null && visIDLike.trim().length() > 0) {
			if (!visIDLike.startsWith("%")) {
				visIDLike = "%" + visIDLike;
			}
			if (!visIDLike.endsWith("%")) {
				visIDLike = visIDLike + "%";
			}
		}
		return visIDLike;
	}

	public List<String> getVisIDs() {
		return visIDs;
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

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("fileID", "fileID");
		addColumn("topid", "topid");
		addColumn("num", "num");
		addColumn("actor", "actor");
		addColumn("fname", "fname");
		addColumn("fileName", "file_name");
		addColumn("vision", "vision");
		addColumn("ctime", "ctime");
		addColumn("filesize", "filesize");
		addColumn("visID", "visID");
		addColumn("attID", "attID");
		addColumn("istextcontent", "Istextcontent");
		addColumn("textcontent", "textcontent");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FileattQuery istextcontent(Integer istextcontent) {
		if (istextcontent == null) {
			throw new RuntimeException("istextcontent is null");
		}
		this.istextcontent = istextcontent;
		return this;
	}

	public FileattQuery istextcontentGreaterThanOrEqual(
			Integer istextcontentGreaterThanOrEqual) {
		if (istextcontentGreaterThanOrEqual == null) {
			throw new RuntimeException("istextcontent is null");
		}
		this.istextcontentGreaterThanOrEqual = istextcontentGreaterThanOrEqual;
		return this;
	}

	public FileattQuery istextcontentLessThanOrEqual(
			Integer istextcontentLessThanOrEqual) {
		if (istextcontentLessThanOrEqual == null) {
			throw new RuntimeException("istextcontent is null");
		}
		this.istextcontentLessThanOrEqual = istextcontentLessThanOrEqual;
		return this;
	}

	public FileattQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public void setActorLike(String actorLike) {
		this.actorLike = actorLike;
	}

	public void setAttID(String attID) {
		this.attID = attID;
	}

	public void setAttIDLike(String attIDLike) {
		this.attIDLike = attIDLike;
	}

	public void setAttIDs(List<String> attIDs) {
		this.attIDs = attIDs;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
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

	public void setFnameLike(String fnameLike) {
		this.fnameLike = fnameLike;
	}

	public void setIstextcontent(Integer istextcontent) {
		this.istextcontent = istextcontent;
	}

	public void setIstextcontentGreaterThanOrEqual(
			Integer istextcontentGreaterThanOrEqual) {
		this.istextcontentGreaterThanOrEqual = istextcontentGreaterThanOrEqual;
	}

	public void setIstextcontentLessThanOrEqual(
			Integer istextcontentLessThanOrEqual) {
		this.istextcontentLessThanOrEqual = istextcontentLessThanOrEqual;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTextcontentLike(String textcontentLike) {
		this.textcontentLike = textcontentLike;
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

	public void setVisID(String visID) {
		this.visID = visID;
	}

	public void setVisIDLike(String visIDLike) {
		this.visIDLike = visIDLike;
	}

	public void setVisIDs(List<String> visIDs) {
		this.visIDs = visIDs;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public void setVisionLike(String visionLike) {
		this.visionLike = visionLike;
	}

	public FileattQuery textcontentLike(String textcontentLike) {
		if (textcontentLike == null) {
			throw new RuntimeException("textcontent is null");
		}
		this.textcontentLike = textcontentLike;
		return this;
	}

	public FileattQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public FileattQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public FileattQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public FileattQuery visID(String visID) {
		if (visID == null) {
			throw new RuntimeException("visID is null");
		}
		this.visID = visID;
		return this;
	}

	public FileattQuery visIDLike(String visIDLike) {
		if (visIDLike == null) {
			throw new RuntimeException("visID is null");
		}
		this.visIDLike = visIDLike;
		return this;
	}

	public FileattQuery visIDs(List<String> visIDs) {
		if (visIDs == null) {
			throw new RuntimeException("visIDs is empty ");
		}
		this.visIDs = visIDs;
		return this;
	}

	public FileattQuery vision(String vision) {
		if (vision == null) {
			throw new RuntimeException("vision is null");
		}
		this.vision = vision;
		return this;
	}

	public FileattQuery visionLike(String visionLike) {
		if (visionLike == null) {
			throw new RuntimeException("vision is null");
		}
		this.visionLike = visionLike;
		return this;
	}

}