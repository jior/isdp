package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellCriterionQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer typeint;
	protected Integer typeintGreaterThanOrEqual;
	protected Integer typeintLessThanOrEqual;
	protected List<Integer> typeints;
	protected String type;
	protected String typeLike;
	protected List<String> types;
	protected String numLike;
	protected String contentLike;
	protected String unit;
	protected String unitLike;
	protected List<String> units;
	protected String alltextLike;
	protected String chkwayLike;
	protected Integer scale;
	protected Integer scaleGreaterThanOrEqual;
	protected Integer scaleLessThanOrEqual;
	protected List<Integer> scales;
	protected Long point;
	protected Long pointGreaterThanOrEqual;
	protected Long pointLessThanOrEqual;
	protected List<Long> points;
	protected Integer usetypeint;
	protected Integer usetypeintGreaterThanOrEqual;
	protected Integer usetypeintLessThanOrEqual;
	protected List<Integer> usetypeints;
	protected Integer checktype;
	protected Integer checktypeGreaterThanOrEqual;
	protected Integer checktypeLessThanOrEqual;
	protected List<Integer> checktypes;
	protected String keytextLike;
	protected String minallow;
	protected String minallowLike;
	protected List<String> minallows;
	protected String minallowS;
	protected String minallowSLike;
	protected List<String> minallowSs;
	protected String maxallow;
	protected String maxallowLike;
	protected List<String> maxallows;
	protected String maxallowS;
	protected String maxallowSLike;
	protected List<String> maxallowSs;
	protected Integer conint;
	protected Integer conintGreaterThanOrEqual;
	protected Integer conintLessThanOrEqual;
	protected List<Integer> conints;
	protected String conmin;
	protected String conminLike;
	protected List<String> conmins;
	protected String conminS;
	protected String conminSLike;
	protected List<String> conminSs;
	protected String conmax;
	protected String conmaxLike;
	protected List<String> conmaxs;
	protected String conmaxS;
	protected String conmaxSLike;
	protected List<String> conmaxSs;
	protected String constr;
	protected String constrLike;
	protected List<String> constrs;
	protected String usingstr;
	protected String usingstrLike;
	protected List<String> usingstrs;
	protected String subnum;
	protected String subnumLike;
	protected List<String> subnums;
	protected Integer chkvalueint;
	protected Integer chkvalueintGreaterThanOrEqual;
	protected Integer chkvalueintLessThanOrEqual;
	protected List<Integer> chkvalueints;
	protected String strposc;
	protected String strposcLike;
	protected List<String> strposcs;
	protected String strposc2;
	protected String strposc2Like;
	protected List<String> strposc2s;
	protected String strpos;
	protected String strposLike;
	protected List<String> strposs;
	protected String strpos2;
	protected String strpos2Like;
	protected List<String> strpos2s;
	protected String chkfield;
	protected String chkfieldLike;
	protected List<String> chkfields;
	protected String chkunit;
	protected String chkunitLike;
	protected List<String> chkunits;
	protected String chkfieldId;
	protected String chkfieldIdLike;
	protected List<String> chkfieldIds;
	protected String chkformual;
	protected String chkformualLike;
	protected List<String> chkformuals;
	protected String chkformualD;
	protected String chkformualDLike;
	protected List<String> chkformualDs;
	protected Long ichecknum;
	protected Long ichecknumGreaterThanOrEqual;
	protected Long ichecknumLessThanOrEqual;
	protected List<Long> ichecknums;
	protected String toolsnameLike;
	protected String constr1;
	protected String constr1Like;
	protected List<String> constr1s;
	protected String constr2;
	protected String constr2Like;
	protected List<String> constr2s;
	protected String ichecknumLess;
	protected String ichecknumLessLike;
	protected List<String> ichecknumLesss;
	protected String clevel;
	protected String clevelLike;
	protected List<String> clevels;
	

	public CellCriterionQuery() {

	}

	public CellCriterionQuery alltextLike(String alltextLike) {
		if (alltextLike == null) {
			throw new RuntimeException("alltext is null");
		}
		this.alltextLike = alltextLike;
		return this;
	}

	public CellCriterionQuery checktype(Integer checktype) {
		if (checktype == null) {
			throw new RuntimeException("checktype is null");
		}
		this.checktype = checktype;
		return this;
	}

	public CellCriterionQuery checktypeGreaterThanOrEqual(
			Integer checktypeGreaterThanOrEqual) {
		if (checktypeGreaterThanOrEqual == null) {
			throw new RuntimeException("checktype is null");
		}
		this.checktypeGreaterThanOrEqual = checktypeGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery checktypeLessThanOrEqual(
			Integer checktypeLessThanOrEqual) {
		if (checktypeLessThanOrEqual == null) {
			throw new RuntimeException("checktype is null");
		}
		this.checktypeLessThanOrEqual = checktypeLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery checktypes(List<Integer> checktypes) {
		if (checktypes == null) {
			throw new RuntimeException("checktypes is empty ");
		}
		this.checktypes = checktypes;
		return this;
	}

	public CellCriterionQuery chkfield(String chkfield) {
		if (chkfield == null) {
			throw new RuntimeException("chkfield is null");
		}
		this.chkfield = chkfield;
		return this;
	}

	public CellCriterionQuery chkfieldId(String chkfieldId) {
		if (chkfieldId == null) {
			throw new RuntimeException("chkfieldId is null");
		}
		this.chkfieldId = chkfieldId;
		return this;
	}

	public CellCriterionQuery chkfieldIdLike(String chkfieldIdLike) {
		if (chkfieldIdLike == null) {
			throw new RuntimeException("chkfieldId is null");
		}
		this.chkfieldIdLike = chkfieldIdLike;
		return this;
	}

	public CellCriterionQuery chkfieldIds(List<String> chkfieldIds) {
		if (chkfieldIds == null) {
			throw new RuntimeException("chkfieldIds is empty ");
		}
		this.chkfieldIds = chkfieldIds;
		return this;
	}

	public CellCriterionQuery chkfieldLike(String chkfieldLike) {
		if (chkfieldLike == null) {
			throw new RuntimeException("chkfield is null");
		}
		this.chkfieldLike = chkfieldLike;
		return this;
	}

	public CellCriterionQuery chkfields(List<String> chkfields) {
		if (chkfields == null) {
			throw new RuntimeException("chkfields is empty ");
		}
		this.chkfields = chkfields;
		return this;
	}

	public CellCriterionQuery chkformual(String chkformual) {
		if (chkformual == null) {
			throw new RuntimeException("chkformual is null");
		}
		this.chkformual = chkformual;
		return this;
	}

	public CellCriterionQuery chkformualD(String chkformualD) {
		if (chkformualD == null) {
			throw new RuntimeException("chkformualD is null");
		}
		this.chkformualD = chkformualD;
		return this;
	}

	public CellCriterionQuery chkformualDLike(String chkformualDLike) {
		if (chkformualDLike == null) {
			throw new RuntimeException("chkformualD is null");
		}
		this.chkformualDLike = chkformualDLike;
		return this;
	}

	public CellCriterionQuery chkformualDs(List<String> chkformualDs) {
		if (chkformualDs == null) {
			throw new RuntimeException("chkformualDs is empty ");
		}
		this.chkformualDs = chkformualDs;
		return this;
	}

	public CellCriterionQuery chkformualLike(String chkformualLike) {
		if (chkformualLike == null) {
			throw new RuntimeException("chkformual is null");
		}
		this.chkformualLike = chkformualLike;
		return this;
	}

	public CellCriterionQuery chkformuals(List<String> chkformuals) {
		if (chkformuals == null) {
			throw new RuntimeException("chkformuals is empty ");
		}
		this.chkformuals = chkformuals;
		return this;
	}

	public CellCriterionQuery chkunit(String chkunit) {
		if (chkunit == null) {
			throw new RuntimeException("chkunit is null");
		}
		this.chkunit = chkunit;
		return this;
	}

	public CellCriterionQuery chkunitLike(String chkunitLike) {
		if (chkunitLike == null) {
			throw new RuntimeException("chkunit is null");
		}
		this.chkunitLike = chkunitLike;
		return this;
	}

	public CellCriterionQuery chkunits(List<String> chkunits) {
		if (chkunits == null) {
			throw new RuntimeException("chkunits is empty ");
		}
		this.chkunits = chkunits;
		return this;
	}

	public CellCriterionQuery chkvalueint(Integer chkvalueint) {
		if (chkvalueint == null) {
			throw new RuntimeException("chkvalueint is null");
		}
		this.chkvalueint = chkvalueint;
		return this;
	}

	public CellCriterionQuery chkvalueintGreaterThanOrEqual(
			Integer chkvalueintGreaterThanOrEqual) {
		if (chkvalueintGreaterThanOrEqual == null) {
			throw new RuntimeException("chkvalueint is null");
		}
		this.chkvalueintGreaterThanOrEqual = chkvalueintGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery chkvalueintLessThanOrEqual(
			Integer chkvalueintLessThanOrEqual) {
		if (chkvalueintLessThanOrEqual == null) {
			throw new RuntimeException("chkvalueint is null");
		}
		this.chkvalueintLessThanOrEqual = chkvalueintLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery chkvalueints(List<Integer> chkvalueints) {
		if (chkvalueints == null) {
			throw new RuntimeException("chkvalueints is empty ");
		}
		this.chkvalueints = chkvalueints;
		return this;
	}

	public CellCriterionQuery chkwayLike(String chkwayLike) {
		if (chkwayLike == null) {
			throw new RuntimeException("chkway is null");
		}
		this.chkwayLike = chkwayLike;
		return this;
	}

	public CellCriterionQuery clevel(String clevel) {
		if (clevel == null) {
			throw new RuntimeException("clevel is null");
		}
		this.clevel = clevel;
		return this;
	}

	public CellCriterionQuery clevelLike(String clevelLike) {
		if (clevelLike == null) {
			throw new RuntimeException("clevel is null");
		}
		this.clevelLike = clevelLike;
		return this;
	}

	public CellCriterionQuery clevels(List<String> clevels) {
		if (clevels == null) {
			throw new RuntimeException("clevels is empty ");
		}
		this.clevels = clevels;
		return this;
	}

	public CellCriterionQuery conint(Integer conint) {
		if (conint == null) {
			throw new RuntimeException("conint is null");
		}
		this.conint = conint;
		return this;
	}

	public CellCriterionQuery conintGreaterThanOrEqual(
			Integer conintGreaterThanOrEqual) {
		if (conintGreaterThanOrEqual == null) {
			throw new RuntimeException("conint is null");
		}
		this.conintGreaterThanOrEqual = conintGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery conintLessThanOrEqual(
			Integer conintLessThanOrEqual) {
		if (conintLessThanOrEqual == null) {
			throw new RuntimeException("conint is null");
		}
		this.conintLessThanOrEqual = conintLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery conints(List<Integer> conints) {
		if (conints == null) {
			throw new RuntimeException("conints is empty ");
		}
		this.conints = conints;
		return this;
	}

	public CellCriterionQuery conmax(String conmax) {
		if (conmax == null) {
			throw new RuntimeException("conmax is null");
		}
		this.conmax = conmax;
		return this;
	}

	public CellCriterionQuery conmaxLike(String conmaxLike) {
		if (conmaxLike == null) {
			throw new RuntimeException("conmax is null");
		}
		this.conmaxLike = conmaxLike;
		return this;
	}

	public CellCriterionQuery conmaxs(List<String> conmaxs) {
		if (conmaxs == null) {
			throw new RuntimeException("conmaxs is empty ");
		}
		this.conmaxs = conmaxs;
		return this;
	}

	public CellCriterionQuery conmaxS(String conmaxS) {
		if (conmaxS == null) {
			throw new RuntimeException("conmaxS is null");
		}
		this.conmaxS = conmaxS;
		return this;
	}

	public CellCriterionQuery conmaxSLike(String conmaxSLike) {
		if (conmaxSLike == null) {
			throw new RuntimeException("conmaxS is null");
		}
		this.conmaxSLike = conmaxSLike;
		return this;
	}

	public CellCriterionQuery conmaxSs(List<String> conmaxSs) {
		if (conmaxSs == null) {
			throw new RuntimeException("conmaxSs is empty ");
		}
		this.conmaxSs = conmaxSs;
		return this;
	}

	public CellCriterionQuery conmin(String conmin) {
		if (conmin == null) {
			throw new RuntimeException("conmin is null");
		}
		this.conmin = conmin;
		return this;
	}

	public CellCriterionQuery conminLike(String conminLike) {
		if (conminLike == null) {
			throw new RuntimeException("conmin is null");
		}
		this.conminLike = conminLike;
		return this;
	}

	public CellCriterionQuery conmins(List<String> conmins) {
		if (conmins == null) {
			throw new RuntimeException("conmins is empty ");
		}
		this.conmins = conmins;
		return this;
	}

	public CellCriterionQuery conminS(String conminS) {
		if (conminS == null) {
			throw new RuntimeException("conminS is null");
		}
		this.conminS = conminS;
		return this;
	}

	public CellCriterionQuery conminSLike(String conminSLike) {
		if (conminSLike == null) {
			throw new RuntimeException("conminS is null");
		}
		this.conminSLike = conminSLike;
		return this;
	}

	public CellCriterionQuery conminSs(List<String> conminSs) {
		if (conminSs == null) {
			throw new RuntimeException("conminSs is empty ");
		}
		this.conminSs = conminSs;
		return this;
	}

	public CellCriterionQuery constr(String constr) {
		if (constr == null) {
			throw new RuntimeException("constr is null");
		}
		this.constr = constr;
		return this;
	}

	public CellCriterionQuery constr1(String constr1) {
		if (constr1 == null) {
			throw new RuntimeException("constr1 is null");
		}
		this.constr1 = constr1;
		return this;
	}

	public CellCriterionQuery constr1Like(String constr1Like) {
		if (constr1Like == null) {
			throw new RuntimeException("constr1 is null");
		}
		this.constr1Like = constr1Like;
		return this;
	}

	public CellCriterionQuery constr1s(List<String> constr1s) {
		if (constr1s == null) {
			throw new RuntimeException("constr1s is empty ");
		}
		this.constr1s = constr1s;
		return this;
	}

	public CellCriterionQuery constr2(String constr2) {
		if (constr2 == null) {
			throw new RuntimeException("constr2 is null");
		}
		this.constr2 = constr2;
		return this;
	}

	public CellCriterionQuery constr2Like(String constr2Like) {
		if (constr2Like == null) {
			throw new RuntimeException("constr2 is null");
		}
		this.constr2Like = constr2Like;
		return this;
	}

	public CellCriterionQuery constr2s(List<String> constr2s) {
		if (constr2s == null) {
			throw new RuntimeException("constr2s is empty ");
		}
		this.constr2s = constr2s;
		return this;
	}

	public CellCriterionQuery constrLike(String constrLike) {
		if (constrLike == null) {
			throw new RuntimeException("constr is null");
		}
		this.constrLike = constrLike;
		return this;
	}

	public CellCriterionQuery constrs(List<String> constrs) {
		if (constrs == null) {
			throw new RuntimeException("constrs is empty ");
		}
		this.constrs = constrs;
		return this;
	}

	public CellCriterionQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public String getAlltextLike() {
		if (alltextLike != null && alltextLike.trim().length() > 0) {
			if (!alltextLike.startsWith("%")) {
				alltextLike = "%" + alltextLike;
			}
			if (!alltextLike.endsWith("%")) {
				alltextLike = alltextLike + "%";
			}
		}
		return alltextLike;
	}

	public Integer getChecktype() {
		return checktype;
	}

	public Integer getChecktypeGreaterThanOrEqual() {
		return checktypeGreaterThanOrEqual;
	}

	public Integer getChecktypeLessThanOrEqual() {
		return checktypeLessThanOrEqual;
	}

	public List<Integer> getChecktypes() {
		return checktypes;
	}

	public String getChkfield() {
		return chkfield;
	}

	public String getChkfieldId() {
		return chkfieldId;
	}

	public String getChkfieldIdLike() {
		if (chkfieldIdLike != null && chkfieldIdLike.trim().length() > 0) {
			if (!chkfieldIdLike.startsWith("%")) {
				chkfieldIdLike = "%" + chkfieldIdLike;
			}
			if (!chkfieldIdLike.endsWith("%")) {
				chkfieldIdLike = chkfieldIdLike + "%";
			}
		}
		return chkfieldIdLike;
	}

	public List<String> getChkfieldIds() {
		return chkfieldIds;
	}

	public String getChkfieldLike() {
		if (chkfieldLike != null && chkfieldLike.trim().length() > 0) {
			if (!chkfieldLike.startsWith("%")) {
				chkfieldLike = "%" + chkfieldLike;
			}
			if (!chkfieldLike.endsWith("%")) {
				chkfieldLike = chkfieldLike + "%";
			}
		}
		return chkfieldLike;
	}

	public List<String> getChkfields() {
		return chkfields;
	}

	public String getChkformual() {
		return chkformual;
	}

	public String getChkformualD() {
		return chkformualD;
	}

	public String getChkformualDLike() {
		if (chkformualDLike != null && chkformualDLike.trim().length() > 0) {
			if (!chkformualDLike.startsWith("%")) {
				chkformualDLike = "%" + chkformualDLike;
			}
			if (!chkformualDLike.endsWith("%")) {
				chkformualDLike = chkformualDLike + "%";
			}
		}
		return chkformualDLike;
	}

	public List<String> getChkformualDs() {
		return chkformualDs;
	}

	public String getChkformualLike() {
		if (chkformualLike != null && chkformualLike.trim().length() > 0) {
			if (!chkformualLike.startsWith("%")) {
				chkformualLike = "%" + chkformualLike;
			}
			if (!chkformualLike.endsWith("%")) {
				chkformualLike = chkformualLike + "%";
			}
		}
		return chkformualLike;
	}

	public List<String> getChkformuals() {
		return chkformuals;
	}

	public String getChkunit() {
		return chkunit;
	}

	public String getChkunitLike() {
		if (chkunitLike != null && chkunitLike.trim().length() > 0) {
			if (!chkunitLike.startsWith("%")) {
				chkunitLike = "%" + chkunitLike;
			}
			if (!chkunitLike.endsWith("%")) {
				chkunitLike = chkunitLike + "%";
			}
		}
		return chkunitLike;
	}

	public List<String> getChkunits() {
		return chkunits;
	}

	public Integer getChkvalueint() {
		return chkvalueint;
	}

	public Integer getChkvalueintGreaterThanOrEqual() {
		return chkvalueintGreaterThanOrEqual;
	}

	public Integer getChkvalueintLessThanOrEqual() {
		return chkvalueintLessThanOrEqual;
	}

	public List<Integer> getChkvalueints() {
		return chkvalueints;
	}

	public String getChkwayLike() {
		if (chkwayLike != null && chkwayLike.trim().length() > 0) {
			if (!chkwayLike.startsWith("%")) {
				chkwayLike = "%" + chkwayLike;
			}
			if (!chkwayLike.endsWith("%")) {
				chkwayLike = chkwayLike + "%";
			}
		}
		return chkwayLike;
	}

	public String getClevel() {
		return clevel;
	}

	public String getClevelLike() {
		if (clevelLike != null && clevelLike.trim().length() > 0) {
			if (!clevelLike.startsWith("%")) {
				clevelLike = "%" + clevelLike;
			}
			if (!clevelLike.endsWith("%")) {
				clevelLike = clevelLike + "%";
			}
		}
		return clevelLike;
	}

	public List<String> getClevels() {
		return clevels;
	}

	public Integer getConint() {
		return conint;
	}

	public Integer getConintGreaterThanOrEqual() {
		return conintGreaterThanOrEqual;
	}

	public Integer getConintLessThanOrEqual() {
		return conintLessThanOrEqual;
	}

	public List<Integer> getConints() {
		return conints;
	}

	public String getConmax() {
		return conmax;
	}

	public String getConmaxLike() {
		if (conmaxLike != null && conmaxLike.trim().length() > 0) {
			if (!conmaxLike.startsWith("%")) {
				conmaxLike = "%" + conmaxLike;
			}
			if (!conmaxLike.endsWith("%")) {
				conmaxLike = conmaxLike + "%";
			}
		}
		return conmaxLike;
	}

	public List<String> getConmaxs() {
		return conmaxs;
	}

	public String getConmaxS() {
		return conmaxS;
	}

	public String getConmaxSLike() {
		if (conmaxSLike != null && conmaxSLike.trim().length() > 0) {
			if (!conmaxSLike.startsWith("%")) {
				conmaxSLike = "%" + conmaxSLike;
			}
			if (!conmaxSLike.endsWith("%")) {
				conmaxSLike = conmaxSLike + "%";
			}
		}
		return conmaxSLike;
	}

	public List<String> getConmaxSs() {
		return conmaxSs;
	}

	public String getConmin() {
		return conmin;
	}

	public String getConminLike() {
		if (conminLike != null && conminLike.trim().length() > 0) {
			if (!conminLike.startsWith("%")) {
				conminLike = "%" + conminLike;
			}
			if (!conminLike.endsWith("%")) {
				conminLike = conminLike + "%";
			}
		}
		return conminLike;
	}

	public List<String> getConmins() {
		return conmins;
	}

	public String getConminS() {
		return conminS;
	}

	public String getConminSLike() {
		if (conminSLike != null && conminSLike.trim().length() > 0) {
			if (!conminSLike.startsWith("%")) {
				conminSLike = "%" + conminSLike;
			}
			if (!conminSLike.endsWith("%")) {
				conminSLike = conminSLike + "%";
			}
		}
		return conminSLike;
	}

	public List<String> getConminSs() {
		return conminSs;
	}

	public String getConstr() {
		return constr;
	}

	public String getConstr1() {
		return constr1;
	}

	public String getConstr1Like() {
		if (constr1Like != null && constr1Like.trim().length() > 0) {
			if (!constr1Like.startsWith("%")) {
				constr1Like = "%" + constr1Like;
			}
			if (!constr1Like.endsWith("%")) {
				constr1Like = constr1Like + "%";
			}
		}
		return constr1Like;
	}

	public List<String> getConstr1s() {
		return constr1s;
	}

	public String getConstr2() {
		return constr2;
	}

	public String getConstr2Like() {
		if (constr2Like != null && constr2Like.trim().length() > 0) {
			if (!constr2Like.startsWith("%")) {
				constr2Like = "%" + constr2Like;
			}
			if (!constr2Like.endsWith("%")) {
				constr2Like = constr2Like + "%";
			}
		}
		return constr2Like;
	}

	public List<String> getConstr2s() {
		return constr2s;
	}

	public String getConstrLike() {
		if (constrLike != null && constrLike.trim().length() > 0) {
			if (!constrLike.startsWith("%")) {
				constrLike = "%" + constrLike;
			}
			if (!constrLike.endsWith("%")) {
				constrLike = constrLike + "%";
			}
		}
		return constrLike;
	}

	public List<String> getConstrs() {
		return constrs;
	}

	public String getContentLike() {
		if (contentLike != null && contentLike.trim().length() > 0) {
			if (!contentLike.startsWith("%")) {
				contentLike = "%" + contentLike;
			}
			if (!contentLike.endsWith("%")) {
				contentLike = contentLike + "%";
			}
		}
		return contentLike;
	}

	public Long getIchecknum() {
		return ichecknum;
	}

	public Long getIchecknumGreaterThanOrEqual() {
		return ichecknumGreaterThanOrEqual;
	}

	public String getIchecknumLess() {
		return ichecknumLess;
	}

	public String getIchecknumLessLike() {
		if (ichecknumLessLike != null && ichecknumLessLike.trim().length() > 0) {
			if (!ichecknumLessLike.startsWith("%")) {
				ichecknumLessLike = "%" + ichecknumLessLike;
			}
			if (!ichecknumLessLike.endsWith("%")) {
				ichecknumLessLike = ichecknumLessLike + "%";
			}
		}
		return ichecknumLessLike;
	}

	public List<String> getIchecknumLesss() {
		return ichecknumLesss;
	}

	public Long getIchecknumLessThanOrEqual() {
		return ichecknumLessThanOrEqual;
	}

	public List<Long> getIchecknums() {
		return ichecknums;
	}

	public Integer getIndexId() {
		return indexId;
	}

	public Integer getIndexIdGreaterThanOrEqual() {
		return indexIdGreaterThanOrEqual;
	}

	public Integer getIndexIdLessThanOrEqual() {
		return indexIdLessThanOrEqual;
	}

	public List<Integer> getIndexIds() {
		return indexIds;
	}

	public String getKeytextLike() {
		if (keytextLike != null && keytextLike.trim().length() > 0) {
			if (!keytextLike.startsWith("%")) {
				keytextLike = "%" + keytextLike;
			}
			if (!keytextLike.endsWith("%")) {
				keytextLike = keytextLike + "%";
			}
		}
		return keytextLike;
	}

	public String getMaxallow() {
		return maxallow;
	}

	public String getMaxallowLike() {
		if (maxallowLike != null && maxallowLike.trim().length() > 0) {
			if (!maxallowLike.startsWith("%")) {
				maxallowLike = "%" + maxallowLike;
			}
			if (!maxallowLike.endsWith("%")) {
				maxallowLike = maxallowLike + "%";
			}
		}
		return maxallowLike;
	}

	public List<String> getMaxallows() {
		return maxallows;
	}

	public String getMaxallowS() {
		return maxallowS;
	}

	public String getMaxallowSLike() {
		if (maxallowSLike != null && maxallowSLike.trim().length() > 0) {
			if (!maxallowSLike.startsWith("%")) {
				maxallowSLike = "%" + maxallowSLike;
			}
			if (!maxallowSLike.endsWith("%")) {
				maxallowSLike = maxallowSLike + "%";
			}
		}
		return maxallowSLike;
	}

	public List<String> getMaxallowSs() {
		return maxallowSs;
	}

	public String getMinallow() {
		return minallow;
	}

	public String getMinallowLike() {
		if (minallowLike != null && minallowLike.trim().length() > 0) {
			if (!minallowLike.startsWith("%")) {
				minallowLike = "%" + minallowLike;
			}
			if (!minallowLike.endsWith("%")) {
				minallowLike = minallowLike + "%";
			}
		}
		return minallowLike;
	}

	public List<String> getMinallows() {
		return minallows;
	}

	public String getMinallowS() {
		return minallowS;
	}

	public String getMinallowSLike() {
		if (minallowSLike != null && minallowSLike.trim().length() > 0) {
			if (!minallowSLike.startsWith("%")) {
				minallowSLike = "%" + minallowSLike;
			}
			if (!minallowSLike.endsWith("%")) {
				minallowSLike = minallowSLike + "%";
			}
		}
		return minallowSLike;
	}

	public List<String> getMinallowSs() {
		return minallowSs;
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

	public Long getPoint() {
		return point;
	}

	public Long getPointGreaterThanOrEqual() {
		return pointGreaterThanOrEqual;
	}

	public Long getPointLessThanOrEqual() {
		return pointLessThanOrEqual;
	}

	public List<Long> getPoints() {
		return points;
	}

	public Integer getScale() {
		return scale;
	}

	public Integer getScaleGreaterThanOrEqual() {
		return scaleGreaterThanOrEqual;
	}

	public Integer getScaleLessThanOrEqual() {
		return scaleLessThanOrEqual;
	}

	public List<Integer> getScales() {
		return scales;
	}

	public String getStrpos() {
		return strpos;
	}

	public String getStrpos2() {
		return strpos2;
	}

	public String getStrpos2Like() {
		if (strpos2Like != null && strpos2Like.trim().length() > 0) {
			if (!strpos2Like.startsWith("%")) {
				strpos2Like = "%" + strpos2Like;
			}
			if (!strpos2Like.endsWith("%")) {
				strpos2Like = strpos2Like + "%";
			}
		}
		return strpos2Like;
	}

	public List<String> getStrpos2s() {
		return strpos2s;
	}

	public String getStrposc() {
		return strposc;
	}

	public String getStrposc2() {
		return strposc2;
	}

	public String getStrposc2Like() {
		if (strposc2Like != null && strposc2Like.trim().length() > 0) {
			if (!strposc2Like.startsWith("%")) {
				strposc2Like = "%" + strposc2Like;
			}
			if (!strposc2Like.endsWith("%")) {
				strposc2Like = strposc2Like + "%";
			}
		}
		return strposc2Like;
	}

	public List<String> getStrposc2s() {
		return strposc2s;
	}

	public String getStrposcLike() {
		if (strposcLike != null && strposcLike.trim().length() > 0) {
			if (!strposcLike.startsWith("%")) {
				strposcLike = "%" + strposcLike;
			}
			if (!strposcLike.endsWith("%")) {
				strposcLike = strposcLike + "%";
			}
		}
		return strposcLike;
	}

	public List<String> getStrposcs() {
		return strposcs;
	}

	public String getStrposLike() {
		if (strposLike != null && strposLike.trim().length() > 0) {
			if (!strposLike.startsWith("%")) {
				strposLike = "%" + strposLike;
			}
			if (!strposLike.endsWith("%")) {
				strposLike = strposLike + "%";
			}
		}
		return strposLike;
	}

	public List<String> getStrposs() {
		return strposs;
	}

	public String getSubnum() {
		return subnum;
	}

	public String getSubnumLike() {
		if (subnumLike != null && subnumLike.trim().length() > 0) {
			if (!subnumLike.startsWith("%")) {
				subnumLike = "%" + subnumLike;
			}
			if (!subnumLike.endsWith("%")) {
				subnumLike = subnumLike + "%";
			}
		}
		return subnumLike;
	}

	public List<String> getSubnums() {
		return subnums;
	}

	public String getToolsnameLike() {
		if (toolsnameLike != null && toolsnameLike.trim().length() > 0) {
			if (!toolsnameLike.startsWith("%")) {
				toolsnameLike = "%" + toolsnameLike;
			}
			if (!toolsnameLike.endsWith("%")) {
				toolsnameLike = toolsnameLike + "%";
			}
		}
		return toolsnameLike;
	}

	public String getType() {
		return type;
	}

	public Integer getTypeint() {
		return typeint;
	}

	public Integer getTypeintGreaterThanOrEqual() {
		return typeintGreaterThanOrEqual;
	}

	public Integer getTypeintLessThanOrEqual() {
		return typeintLessThanOrEqual;
	}

	public List<Integer> getTypeints() {
		return typeints;
	}

	public String getTypeLike() {
		if (typeLike != null && typeLike.trim().length() > 0) {
			if (!typeLike.startsWith("%")) {
				typeLike = "%" + typeLike;
			}
			if (!typeLike.endsWith("%")) {
				typeLike = typeLike + "%";
			}
		}
		return typeLike;
	}

	public List<String> getTypes() {
		return types;
	}

	public String getUnit() {
		return unit;
	}

	public String getUnitLike() {
		if (unitLike != null && unitLike.trim().length() > 0) {
			if (!unitLike.startsWith("%")) {
				unitLike = "%" + unitLike;
			}
			if (!unitLike.endsWith("%")) {
				unitLike = unitLike + "%";
			}
		}
		return unitLike;
	}

	public List<String> getUnits() {
		return units;
	}

	public Integer getUsetypeint() {
		return usetypeint;
	}

	public Integer getUsetypeintGreaterThanOrEqual() {
		return usetypeintGreaterThanOrEqual;
	}

	public Integer getUsetypeintLessThanOrEqual() {
		return usetypeintLessThanOrEqual;
	}

	public List<Integer> getUsetypeints() {
		return usetypeints;
	}

	public String getUsingstr() {
		return usingstr;
	}

	public String getUsingstrLike() {
		if (usingstrLike != null && usingstrLike.trim().length() > 0) {
			if (!usingstrLike.startsWith("%")) {
				usingstrLike = "%" + usingstrLike;
			}
			if (!usingstrLike.endsWith("%")) {
				usingstrLike = usingstrLike + "%";
			}
		}
		return usingstrLike;
	}

	public List<String> getUsingstrs() {
		return usingstrs;
	}

	public CellCriterionQuery ichecknum(Long ichecknum) {
		if (ichecknum == null) {
			throw new RuntimeException("ichecknum is null");
		}
		this.ichecknum = ichecknum;
		return this;
	}

	public CellCriterionQuery ichecknumGreaterThanOrEqual(
			Long ichecknumGreaterThanOrEqual) {
		if (ichecknumGreaterThanOrEqual == null) {
			throw new RuntimeException("ichecknum is null");
		}
		this.ichecknumGreaterThanOrEqual = ichecknumGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery ichecknumLess(String ichecknumLess) {
		if (ichecknumLess == null) {
			throw new RuntimeException("ichecknumLess is null");
		}
		this.ichecknumLess = ichecknumLess;
		return this;
	}

	public CellCriterionQuery ichecknumLessLike(String ichecknumLessLike) {
		if (ichecknumLessLike == null) {
			throw new RuntimeException("ichecknumLess is null");
		}
		this.ichecknumLessLike = ichecknumLessLike;
		return this;
	}

	public CellCriterionQuery ichecknumLesss(List<String> ichecknumLesss) {
		if (ichecknumLesss == null) {
			throw new RuntimeException("ichecknumLesss is empty ");
		}
		this.ichecknumLesss = ichecknumLesss;
		return this;
	}

	public CellCriterionQuery ichecknumLessThanOrEqual(
			Long ichecknumLessThanOrEqual) {
		if (ichecknumLessThanOrEqual == null) {
			throw new RuntimeException("ichecknum is null");
		}
		this.ichecknumLessThanOrEqual = ichecknumLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery ichecknums(List<Long> ichecknums) {
		if (ichecknums == null) {
			throw new RuntimeException("ichecknums is empty ");
		}
		this.ichecknums = ichecknums;
		return this;
	}

	public CellCriterionQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellCriterionQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("indexId", "index_id");
		addColumn("typeint", "typeint");
		addColumn("type", "type");
		addColumn("num", "num");
		addColumn("content", "content");
		addColumn("unit", "unit");
		addColumn("alltext", "alltext");
		addColumn("chkway", "chkway");
		addColumn("scale", "scale");
		addColumn("point", "point");
		addColumn("usetypeint", "usetypeint");
		addColumn("checktype", "checktype");
		addColumn("keytext", "keytext");
		addColumn("minallow", "minallow");
		addColumn("minallowS", "minallow_s");
		addColumn("maxallow", "maxallow");
		addColumn("maxallowS", "maxallow_s");
		addColumn("listno", "listno");
		addColumn("conint", "conint");
		addColumn("conmin", "conmin");
		addColumn("conminS", "conmin_s");
		addColumn("conmax", "conmax");
		addColumn("conmaxS", "conmax_s");
		addColumn("constr", "constr");
		addColumn("usingstr", "usingstr");
		addColumn("subnum", "subnum");
		addColumn("chkvalueint", "chkvalueint");
		addColumn("strposc", "strposc");
		addColumn("strposc2", "strposc2");
		addColumn("strpos", "strpos");
		addColumn("strpos2", "strpos2");
		addColumn("chkfield", "chkfield");
		addColumn("chkunit", "chkunit");
		addColumn("chkfieldId", "chkfield_id");
		addColumn("chkformual", "chkformual");
		addColumn("chkformualD", "chkformualD");
		addColumn("ichecknum", "ichecknum");
		addColumn("toolsname", "Toolsname");
		addColumn("constr1", "constr1");
		addColumn("constr2", "constr2");
		addColumn("ichecknumLess", "ichecknum_less");
		addColumn("clevel", "clevel");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellCriterionQuery keytextLike(String keytextLike) {
		if (keytextLike == null) {
			throw new RuntimeException("keytext is null");
		}
		this.keytextLike = keytextLike;
		return this;
	}

	public CellCriterionQuery maxallow(String maxallow) {
		if (maxallow == null) {
			throw new RuntimeException("maxallow is null");
		}
		this.maxallow = maxallow;
		return this;
	}

	public CellCriterionQuery maxallowLike(String maxallowLike) {
		if (maxallowLike == null) {
			throw new RuntimeException("maxallow is null");
		}
		this.maxallowLike = maxallowLike;
		return this;
	}

	public CellCriterionQuery maxallows(List<String> maxallows) {
		if (maxallows == null) {
			throw new RuntimeException("maxallows is empty ");
		}
		this.maxallows = maxallows;
		return this;
	}

	public CellCriterionQuery maxallowS(String maxallowS) {
		if (maxallowS == null) {
			throw new RuntimeException("maxallowS is null");
		}
		this.maxallowS = maxallowS;
		return this;
	}

	public CellCriterionQuery maxallowSLike(String maxallowSLike) {
		if (maxallowSLike == null) {
			throw new RuntimeException("maxallowS is null");
		}
		this.maxallowSLike = maxallowSLike;
		return this;
	}

	public CellCriterionQuery maxallowSs(List<String> maxallowSs) {
		if (maxallowSs == null) {
			throw new RuntimeException("maxallowSs is empty ");
		}
		this.maxallowSs = maxallowSs;
		return this;
	}

	public CellCriterionQuery minallow(String minallow) {
		if (minallow == null) {
			throw new RuntimeException("minallow is null");
		}
		this.minallow = minallow;
		return this;
	}

	public CellCriterionQuery minallowLike(String minallowLike) {
		if (minallowLike == null) {
			throw new RuntimeException("minallow is null");
		}
		this.minallowLike = minallowLike;
		return this;
	}

	public CellCriterionQuery minallows(List<String> minallows) {
		if (minallows == null) {
			throw new RuntimeException("minallows is empty ");
		}
		this.minallows = minallows;
		return this;
	}

	public CellCriterionQuery minallowS(String minallowS) {
		if (minallowS == null) {
			throw new RuntimeException("minallowS is null");
		}
		this.minallowS = minallowS;
		return this;
	}

	public CellCriterionQuery minallowSLike(String minallowSLike) {
		if (minallowSLike == null) {
			throw new RuntimeException("minallowS is null");
		}
		this.minallowSLike = minallowSLike;
		return this;
	}

	public CellCriterionQuery minallowSs(List<String> minallowSs) {
		if (minallowSs == null) {
			throw new RuntimeException("minallowSs is empty ");
		}
		this.minallowSs = minallowSs;
		return this;
	}

	public CellCriterionQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public CellCriterionQuery point(Long point) {
		if (point == null) {
			throw new RuntimeException("point is null");
		}
		this.point = point;
		return this;
	}

	public CellCriterionQuery pointGreaterThanOrEqual(
			Long pointGreaterThanOrEqual) {
		if (pointGreaterThanOrEqual == null) {
			throw new RuntimeException("point is null");
		}
		this.pointGreaterThanOrEqual = pointGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery pointLessThanOrEqual(Long pointLessThanOrEqual) {
		if (pointLessThanOrEqual == null) {
			throw new RuntimeException("point is null");
		}
		this.pointLessThanOrEqual = pointLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery points(List<Long> points) {
		if (points == null) {
			throw new RuntimeException("points is empty ");
		}
		this.points = points;
		return this;
	}

	public CellCriterionQuery scale(Integer scale) {
		if (scale == null) {
			throw new RuntimeException("scale is null");
		}
		this.scale = scale;
		return this;
	}

	public CellCriterionQuery scaleGreaterThanOrEqual(
			Integer scaleGreaterThanOrEqual) {
		if (scaleGreaterThanOrEqual == null) {
			throw new RuntimeException("scale is null");
		}
		this.scaleGreaterThanOrEqual = scaleGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery scaleLessThanOrEqual(Integer scaleLessThanOrEqual) {
		if (scaleLessThanOrEqual == null) {
			throw new RuntimeException("scale is null");
		}
		this.scaleLessThanOrEqual = scaleLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery scales(List<Integer> scales) {
		if (scales == null) {
			throw new RuntimeException("scales is empty ");
		}
		this.scales = scales;
		return this;
	}

	public void setAlltextLike(String alltextLike) {
		this.alltextLike = alltextLike;
	}

	public void setChecktype(Integer checktype) {
		this.checktype = checktype;
	}

	public void setChecktypeGreaterThanOrEqual(
			Integer checktypeGreaterThanOrEqual) {
		this.checktypeGreaterThanOrEqual = checktypeGreaterThanOrEqual;
	}

	public void setChecktypeLessThanOrEqual(Integer checktypeLessThanOrEqual) {
		this.checktypeLessThanOrEqual = checktypeLessThanOrEqual;
	}

	public void setChecktypes(List<Integer> checktypes) {
		this.checktypes = checktypes;
	}

	public void setChkfield(String chkfield) {
		this.chkfield = chkfield;
	}

	public void setChkfieldId(String chkfieldId) {
		this.chkfieldId = chkfieldId;
	}

	public void setChkfieldIdLike(String chkfieldIdLike) {
		this.chkfieldIdLike = chkfieldIdLike;
	}

	public void setChkfieldIds(List<String> chkfieldIds) {
		this.chkfieldIds = chkfieldIds;
	}

	public void setChkfieldLike(String chkfieldLike) {
		this.chkfieldLike = chkfieldLike;
	}

	public void setChkfields(List<String> chkfields) {
		this.chkfields = chkfields;
	}

	public void setChkformual(String chkformual) {
		this.chkformual = chkformual;
	}

	public void setChkformualD(String chkformualD) {
		this.chkformualD = chkformualD;
	}

	public void setChkformualDLike(String chkformualDLike) {
		this.chkformualDLike = chkformualDLike;
	}

	public void setChkformualDs(List<String> chkformualDs) {
		this.chkformualDs = chkformualDs;
	}

	public void setChkformualLike(String chkformualLike) {
		this.chkformualLike = chkformualLike;
	}

	public void setChkformuals(List<String> chkformuals) {
		this.chkformuals = chkformuals;
	}

	public void setChkunit(String chkunit) {
		this.chkunit = chkunit;
	}

	public void setChkunitLike(String chkunitLike) {
		this.chkunitLike = chkunitLike;
	}

	public void setChkunits(List<String> chkunits) {
		this.chkunits = chkunits;
	}

	public void setChkvalueint(Integer chkvalueint) {
		this.chkvalueint = chkvalueint;
	}

	public void setChkvalueintGreaterThanOrEqual(
			Integer chkvalueintGreaterThanOrEqual) {
		this.chkvalueintGreaterThanOrEqual = chkvalueintGreaterThanOrEqual;
	}

	public void setChkvalueintLessThanOrEqual(Integer chkvalueintLessThanOrEqual) {
		this.chkvalueintLessThanOrEqual = chkvalueintLessThanOrEqual;
	}

	public void setChkvalueints(List<Integer> chkvalueints) {
		this.chkvalueints = chkvalueints;
	}

	public void setChkwayLike(String chkwayLike) {
		this.chkwayLike = chkwayLike;
	}

	public void setClevel(String clevel) {
		this.clevel = clevel;
	}

	public void setClevelLike(String clevelLike) {
		this.clevelLike = clevelLike;
	}

	public void setClevels(List<String> clevels) {
		this.clevels = clevels;
	}

	public void setConint(Integer conint) {
		this.conint = conint;
	}

	public void setConintGreaterThanOrEqual(Integer conintGreaterThanOrEqual) {
		this.conintGreaterThanOrEqual = conintGreaterThanOrEqual;
	}

	public void setConintLessThanOrEqual(Integer conintLessThanOrEqual) {
		this.conintLessThanOrEqual = conintLessThanOrEqual;
	}

	public void setConints(List<Integer> conints) {
		this.conints = conints;
	}

	public void setConmax(String conmax) {
		this.conmax = conmax;
	}

	public void setConmaxLike(String conmaxLike) {
		this.conmaxLike = conmaxLike;
	}

	public void setConmaxs(List<String> conmaxs) {
		this.conmaxs = conmaxs;
	}

	public void setConmaxS(String conmaxS) {
		this.conmaxS = conmaxS;
	}

	public void setConmaxSLike(String conmaxSLike) {
		this.conmaxSLike = conmaxSLike;
	}

	public void setConmaxSs(List<String> conmaxSs) {
		this.conmaxSs = conmaxSs;
	}

	public void setConmin(String conmin) {
		this.conmin = conmin;
	}

	public void setConminLike(String conminLike) {
		this.conminLike = conminLike;
	}

	public void setConmins(List<String> conmins) {
		this.conmins = conmins;
	}

	public void setConminS(String conminS) {
		this.conminS = conminS;
	}

	public void setConminSLike(String conminSLike) {
		this.conminSLike = conminSLike;
	}

	public void setConminSs(List<String> conminSs) {
		this.conminSs = conminSs;
	}

	public void setConstr(String constr) {
		this.constr = constr;
	}

	public void setConstr1(String constr1) {
		this.constr1 = constr1;
	}

	public void setConstr1Like(String constr1Like) {
		this.constr1Like = constr1Like;
	}

	public void setConstr1s(List<String> constr1s) {
		this.constr1s = constr1s;
	}

	public void setConstr2(String constr2) {
		this.constr2 = constr2;
	}

	public void setConstr2Like(String constr2Like) {
		this.constr2Like = constr2Like;
	}

	public void setConstr2s(List<String> constr2s) {
		this.constr2s = constr2s;
	}

	public void setConstrLike(String constrLike) {
		this.constrLike = constrLike;
	}

	public void setConstrs(List<String> constrs) {
		this.constrs = constrs;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setIchecknum(Long ichecknum) {
		this.ichecknum = ichecknum;
	}

	public void setIchecknumGreaterThanOrEqual(Long ichecknumGreaterThanOrEqual) {
		this.ichecknumGreaterThanOrEqual = ichecknumGreaterThanOrEqual;
	}

	public void setIchecknumLess(String ichecknumLess) {
		this.ichecknumLess = ichecknumLess;
	}

	public void setIchecknumLessLike(String ichecknumLessLike) {
		this.ichecknumLessLike = ichecknumLessLike;
	}

	public void setIchecknumLesss(List<String> ichecknumLesss) {
		this.ichecknumLesss = ichecknumLesss;
	}

	public void setIchecknumLessThanOrEqual(Long ichecknumLessThanOrEqual) {
		this.ichecknumLessThanOrEqual = ichecknumLessThanOrEqual;
	}

	public void setIchecknums(List<Long> ichecknums) {
		this.ichecknums = ichecknums;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setIndexIdGreaterThanOrEqual(Integer indexIdGreaterThanOrEqual) {
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
	}

	public void setIndexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
	}

	public void setIndexIds(List<Integer> indexIds) {
		this.indexIds = indexIds;
	}

	public void setKeytextLike(String keytextLike) {
		this.keytextLike = keytextLike;
	}

	public void setMaxallow(String maxallow) {
		this.maxallow = maxallow;
	}

	public void setMaxallowLike(String maxallowLike) {
		this.maxallowLike = maxallowLike;
	}

	public void setMaxallows(List<String> maxallows) {
		this.maxallows = maxallows;
	}

	public void setMaxallowS(String maxallowS) {
		this.maxallowS = maxallowS;
	}

	public void setMaxallowSLike(String maxallowSLike) {
		this.maxallowSLike = maxallowSLike;
	}

	public void setMaxallowSs(List<String> maxallowSs) {
		this.maxallowSs = maxallowSs;
	}

	public void setMinallow(String minallow) {
		this.minallow = minallow;
	}

	public void setMinallowLike(String minallowLike) {
		this.minallowLike = minallowLike;
	}

	public void setMinallows(List<String> minallows) {
		this.minallows = minallows;
	}

	public void setMinallowS(String minallowS) {
		this.minallowS = minallowS;
	}

	public void setMinallowSLike(String minallowSLike) {
		this.minallowSLike = minallowSLike;
	}

	public void setMinallowSs(List<String> minallowSs) {
		this.minallowSs = minallowSs;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setPoint(Long point) {
		this.point = point;
	}

	public void setPointGreaterThanOrEqual(Long pointGreaterThanOrEqual) {
		this.pointGreaterThanOrEqual = pointGreaterThanOrEqual;
	}

	public void setPointLessThanOrEqual(Long pointLessThanOrEqual) {
		this.pointLessThanOrEqual = pointLessThanOrEqual;
	}

	public void setPoints(List<Long> points) {
		this.points = points;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public void setScaleGreaterThanOrEqual(Integer scaleGreaterThanOrEqual) {
		this.scaleGreaterThanOrEqual = scaleGreaterThanOrEqual;
	}

	public void setScaleLessThanOrEqual(Integer scaleLessThanOrEqual) {
		this.scaleLessThanOrEqual = scaleLessThanOrEqual;
	}

	public void setScales(List<Integer> scales) {
		this.scales = scales;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStrpos(String strpos) {
		this.strpos = strpos;
	}

	public void setStrpos2(String strpos2) {
		this.strpos2 = strpos2;
	}

	public void setStrpos2Like(String strpos2Like) {
		this.strpos2Like = strpos2Like;
	}

	public void setStrpos2s(List<String> strpos2s) {
		this.strpos2s = strpos2s;
	}

	public void setStrposc(String strposc) {
		this.strposc = strposc;
	}

	public void setStrposc2(String strposc2) {
		this.strposc2 = strposc2;
	}

	public void setStrposc2Like(String strposc2Like) {
		this.strposc2Like = strposc2Like;
	}

	public void setStrposc2s(List<String> strposc2s) {
		this.strposc2s = strposc2s;
	}

	public void setStrposcLike(String strposcLike) {
		this.strposcLike = strposcLike;
	}

	public void setStrposcs(List<String> strposcs) {
		this.strposcs = strposcs;
	}

	public void setStrposLike(String strposLike) {
		this.strposLike = strposLike;
	}

	public void setStrposs(List<String> strposs) {
		this.strposs = strposs;
	}

	public void setSubnum(String subnum) {
		this.subnum = subnum;
	}

	public void setSubnumLike(String subnumLike) {
		this.subnumLike = subnumLike;
	}

	public void setSubnums(List<String> subnums) {
		this.subnums = subnums;
	}

	public void setToolsnameLike(String toolsnameLike) {
		this.toolsnameLike = toolsnameLike;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTypeint(Integer typeint) {
		this.typeint = typeint;
	}

	public void setTypeintGreaterThanOrEqual(Integer typeintGreaterThanOrEqual) {
		this.typeintGreaterThanOrEqual = typeintGreaterThanOrEqual;
	}

	public void setTypeintLessThanOrEqual(Integer typeintLessThanOrEqual) {
		this.typeintLessThanOrEqual = typeintLessThanOrEqual;
	}

	public void setTypeints(List<Integer> typeints) {
		this.typeints = typeints;
	}

	public void setTypeLike(String typeLike) {
		this.typeLike = typeLike;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setUnitLike(String unitLike) {
		this.unitLike = unitLike;
	}

	public void setUnits(List<String> units) {
		this.units = units;
	}

	public void setUsetypeint(Integer usetypeint) {
		this.usetypeint = usetypeint;
	}

	public void setUsetypeintGreaterThanOrEqual(
			Integer usetypeintGreaterThanOrEqual) {
		this.usetypeintGreaterThanOrEqual = usetypeintGreaterThanOrEqual;
	}

	public void setUsetypeintLessThanOrEqual(Integer usetypeintLessThanOrEqual) {
		this.usetypeintLessThanOrEqual = usetypeintLessThanOrEqual;
	}

	public void setUsetypeints(List<Integer> usetypeints) {
		this.usetypeints = usetypeints;
	}

	public void setUsingstr(String usingstr) {
		this.usingstr = usingstr;
	}

	public void setUsingstrLike(String usingstrLike) {
		this.usingstrLike = usingstrLike;
	}

	public void setUsingstrs(List<String> usingstrs) {
		this.usingstrs = usingstrs;
	}

	public CellCriterionQuery strpos(String strpos) {
		if (strpos == null) {
			throw new RuntimeException("strpos is null");
		}
		this.strpos = strpos;
		return this;
	}

	public CellCriterionQuery strpos2(String strpos2) {
		if (strpos2 == null) {
			throw new RuntimeException("strpos2 is null");
		}
		this.strpos2 = strpos2;
		return this;
	}

	public CellCriterionQuery strpos2Like(String strpos2Like) {
		if (strpos2Like == null) {
			throw new RuntimeException("strpos2 is null");
		}
		this.strpos2Like = strpos2Like;
		return this;
	}

	public CellCriterionQuery strpos2s(List<String> strpos2s) {
		if (strpos2s == null) {
			throw new RuntimeException("strpos2s is empty ");
		}
		this.strpos2s = strpos2s;
		return this;
	}

	public CellCriterionQuery strposc(String strposc) {
		if (strposc == null) {
			throw new RuntimeException("strposc is null");
		}
		this.strposc = strposc;
		return this;
	}

	public CellCriterionQuery strposc2(String strposc2) {
		if (strposc2 == null) {
			throw new RuntimeException("strposc2 is null");
		}
		this.strposc2 = strposc2;
		return this;
	}

	public CellCriterionQuery strposc2Like(String strposc2Like) {
		if (strposc2Like == null) {
			throw new RuntimeException("strposc2 is null");
		}
		this.strposc2Like = strposc2Like;
		return this;
	}

	public CellCriterionQuery strposc2s(List<String> strposc2s) {
		if (strposc2s == null) {
			throw new RuntimeException("strposc2s is empty ");
		}
		this.strposc2s = strposc2s;
		return this;
	}

	public CellCriterionQuery strposcLike(String strposcLike) {
		if (strposcLike == null) {
			throw new RuntimeException("strposc is null");
		}
		this.strposcLike = strposcLike;
		return this;
	}

	public CellCriterionQuery strposcs(List<String> strposcs) {
		if (strposcs == null) {
			throw new RuntimeException("strposcs is empty ");
		}
		this.strposcs = strposcs;
		return this;
	}

	public CellCriterionQuery strposLike(String strposLike) {
		if (strposLike == null) {
			throw new RuntimeException("strpos is null");
		}
		this.strposLike = strposLike;
		return this;
	}

	public CellCriterionQuery strposs(List<String> strposs) {
		if (strposs == null) {
			throw new RuntimeException("strposs is empty ");
		}
		this.strposs = strposs;
		return this;
	}

	public CellCriterionQuery subnum(String subnum) {
		if (subnum == null) {
			throw new RuntimeException("subnum is null");
		}
		this.subnum = subnum;
		return this;
	}

	public CellCriterionQuery subnumLike(String subnumLike) {
		if (subnumLike == null) {
			throw new RuntimeException("subnum is null");
		}
		this.subnumLike = subnumLike;
		return this;
	}

	public CellCriterionQuery subnums(List<String> subnums) {
		if (subnums == null) {
			throw new RuntimeException("subnums is empty ");
		}
		this.subnums = subnums;
		return this;
	}

	public CellCriterionQuery toolsnameLike(String toolsnameLike) {
		if (toolsnameLike == null) {
			throw new RuntimeException("toolsname is null");
		}
		this.toolsnameLike = toolsnameLike;
		return this;
	}

	public CellCriterionQuery type(String type) {
		if (type == null) {
			throw new RuntimeException("type is null");
		}
		this.type = type;
		return this;
	}

	public CellCriterionQuery typeint(Integer typeint) {
		if (typeint == null) {
			throw new RuntimeException("typeint is null");
		}
		this.typeint = typeint;
		return this;
	}

	public CellCriterionQuery typeintGreaterThanOrEqual(
			Integer typeintGreaterThanOrEqual) {
		if (typeintGreaterThanOrEqual == null) {
			throw new RuntimeException("typeint is null");
		}
		this.typeintGreaterThanOrEqual = typeintGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery typeintLessThanOrEqual(
			Integer typeintLessThanOrEqual) {
		if (typeintLessThanOrEqual == null) {
			throw new RuntimeException("typeint is null");
		}
		this.typeintLessThanOrEqual = typeintLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery typeints(List<Integer> typeints) {
		if (typeints == null) {
			throw new RuntimeException("typeints is empty ");
		}
		this.typeints = typeints;
		return this;
	}

	public CellCriterionQuery typeLike(String typeLike) {
		if (typeLike == null) {
			throw new RuntimeException("type is null");
		}
		this.typeLike = typeLike;
		return this;
	}

	public CellCriterionQuery types(List<String> types) {
		if (types == null) {
			throw new RuntimeException("types is empty ");
		}
		this.types = types;
		return this;
	}

	public CellCriterionQuery unit(String unit) {
		if (unit == null) {
			throw new RuntimeException("unit is null");
		}
		this.unit = unit;
		return this;
	}

	public CellCriterionQuery unitLike(String unitLike) {
		if (unitLike == null) {
			throw new RuntimeException("unit is null");
		}
		this.unitLike = unitLike;
		return this;
	}

	public CellCriterionQuery units(List<String> units) {
		if (units == null) {
			throw new RuntimeException("units is empty ");
		}
		this.units = units;
		return this;
	}

	public CellCriterionQuery usetypeint(Integer usetypeint) {
		if (usetypeint == null) {
			throw new RuntimeException("usetypeint is null");
		}
		this.usetypeint = usetypeint;
		return this;
	}

	public CellCriterionQuery usetypeintGreaterThanOrEqual(
			Integer usetypeintGreaterThanOrEqual) {
		if (usetypeintGreaterThanOrEqual == null) {
			throw new RuntimeException("usetypeint is null");
		}
		this.usetypeintGreaterThanOrEqual = usetypeintGreaterThanOrEqual;
		return this;
	}

	public CellCriterionQuery usetypeintLessThanOrEqual(
			Integer usetypeintLessThanOrEqual) {
		if (usetypeintLessThanOrEqual == null) {
			throw new RuntimeException("usetypeint is null");
		}
		this.usetypeintLessThanOrEqual = usetypeintLessThanOrEqual;
		return this;
	}

	public CellCriterionQuery usetypeints(List<Integer> usetypeints) {
		if (usetypeints == null) {
			throw new RuntimeException("usetypeints is empty ");
		}
		this.usetypeints = usetypeints;
		return this;
	}

	public CellCriterionQuery usingstr(String usingstr) {
		if (usingstr == null) {
			throw new RuntimeException("usingstr is null");
		}
		this.usingstr = usingstr;
		return this;
	}

	public CellCriterionQuery usingstrLike(String usingstrLike) {
		if (usingstrLike == null) {
			throw new RuntimeException("usingstr is null");
		}
		this.usingstrLike = usingstrLike;
		return this;
	}

	public CellCriterionQuery usingstrs(List<String> usingstrs) {
		if (usingstrs == null) {
			throw new RuntimeException("usingstrs is empty ");
		}
		this.usingstrs = usingstrs;
		return this;
	}

}