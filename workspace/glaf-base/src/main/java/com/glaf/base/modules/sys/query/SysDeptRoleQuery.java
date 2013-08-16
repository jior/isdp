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

package com.glaf.base.modules.sys.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class SysDeptRoleQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String code;
	protected String codeLike;
	protected List<String> codes;
	protected Long deptId;
	protected List<Long> deptIds;
	protected Integer grade;
	protected Integer gradeGreaterThanOrEqual;
	protected Integer gradeLessThanOrEqual;
	protected List<Integer> grades;
	protected String roleCode;
	protected List<String> roleCodes;
	protected Integer sortGreaterThan;
	protected Integer sortGreaterThanOrEqual;
	protected Integer sortLessThan;
	protected Integer sortLessThanOrEqual;
	protected Long roleId;
	protected List<Long> roleIds;

	public SysDeptRoleQuery() {

	}

	public SysDeptRoleQuery code(String code) {
		if (code == null) {
			throw new RuntimeException("code is null");
		}
		this.code = code;
		return this;
	}

	public SysDeptRoleQuery codeLike(String codeLike) {
		if (codeLike == null) {
			throw new RuntimeException("code is null");
		}
		this.codeLike = codeLike;
		return this;
	}

	public SysDeptRoleQuery codes(List<String> codes) {
		if (codes == null) {
			throw new RuntimeException("codes is empty ");
		}
		this.codes = codes;
		return this;
	}

	public SysDeptRoleQuery deptId(Long deptId) {
		if (deptId == null) {
			throw new RuntimeException("deptId is null");
		}
		this.deptId = deptId;
		return this;
	}

	public SysDeptRoleQuery deptIds(List<Long> deptIds) {
		if (deptIds == null) {
			throw new RuntimeException("deptIds is empty ");
		}
		this.deptIds = deptIds;
		return this;
	}

	public String getCode() {
		return code;
	}

	public String getCodeLike() {
		if (codeLike != null && codeLike.trim().length() > 0) {
			if (!codeLike.startsWith("%")) {
				codeLike = "%" + codeLike;
			}
			if (!codeLike.endsWith("%")) {
				codeLike = codeLike + "%";
			}
		}
		return codeLike;
	}

	public List<String> getCodes() {
		return codes;
	}

	public Long getDeptId() {
		return deptId;
	}

	public List<Long> getDeptIds() {
		return deptIds;
	}

	public Integer getGrade() {
		return grade;
	}

	public Integer getGradeGreaterThanOrEqual() {
		return gradeGreaterThanOrEqual;
	}

	public Integer getGradeLessThanOrEqual() {
		return gradeLessThanOrEqual;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public String getOrderBy() {
		if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

			if ("grade".equals(sortColumn)) {
				orderBy = "E.GRADE" + a_x;
			}

			if ("code".equals(sortColumn)) {
				orderBy = "E.CODE" + a_x;
			}

			if ("sort".equals(sortColumn)) {
				orderBy = "E.SORT" + a_x;
			}

			if ("sysRoleId".equals(sortColumn)) {
				orderBy = "E.SYSROLEID" + a_x;
			}

			if ("deptId".equals(sortColumn)) {
				orderBy = "E.DEPTID" + a_x;
			}

		}
		return orderBy;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public List<String> getRoleCodes() {
		return roleCodes;
	}

	public Long getRoleId() {
		return roleId;
	}

	public List<Long> getRoleIds() {
		return roleIds;
	}

	public Integer getSortGreaterThan() {
		return sortGreaterThan;
	}

	public Integer getSortGreaterThanOrEqual() {
		return sortGreaterThanOrEqual;
	}

	public Integer getSortLessThan() {
		return sortLessThan;
	}

	public Integer getSortLessThanOrEqual() {
		return sortLessThanOrEqual;
	}

	public SysDeptRoleQuery grade(Integer grade) {
		if (grade == null) {
			throw new RuntimeException("grade is null");
		}
		this.grade = grade;
		return this;
	}

	public SysDeptRoleQuery gradeGreaterThanOrEqual(
			Integer gradeGreaterThanOrEqual) {
		if (gradeGreaterThanOrEqual == null) {
			throw new RuntimeException("grade is null");
		}
		this.gradeGreaterThanOrEqual = gradeGreaterThanOrEqual;
		return this;
	}

	public SysDeptRoleQuery gradeLessThanOrEqual(Integer gradeLessThanOrEqual) {
		if (gradeLessThanOrEqual == null) {
			throw new RuntimeException("grade is null");
		}
		this.gradeLessThanOrEqual = gradeLessThanOrEqual;
		return this;
	}

	public SysDeptRoleQuery grades(List<Integer> grades) {
		if (grades == null) {
			throw new RuntimeException("grades is empty ");
		}
		this.grades = grades;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "ID");
		addColumn("grade", "GRADE");
		addColumn("code", "CODE");
		addColumn("sort", "SORT");
		addColumn("sysRoleId", "SYSROLEID");
		addColumn("deptId", "DEPTID");
	}

	public SysDeptRoleQuery roleId(Long roleId) {
		if (roleId == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleId = roleId;
		return this;
	}

	public SysDeptRoleQuery roleIds(List<Long> roleIds) {
		if (roleIds == null) {
			throw new RuntimeException("roleIds is empty ");
		}
		this.roleIds = roleIds;
		return this;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCodeLike(String codeLike) {
		this.codeLike = codeLike;
	}

	public void setCodes(List<String> codes) {
		this.codes = codes;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public void setDeptIds(List<Long> deptIds) {
		this.deptIds = deptIds;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public void setGradeGreaterThanOrEqual(Integer gradeGreaterThanOrEqual) {
		this.gradeGreaterThanOrEqual = gradeGreaterThanOrEqual;
	}

	public void setGradeLessThanOrEqual(Integer gradeLessThanOrEqual) {
		this.gradeLessThanOrEqual = gradeLessThanOrEqual;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public void setRoleCodes(List<String> roleCodes) {
		this.roleCodes = roleCodes;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public void setRoleIds(List<Long> roleIds) {
		this.roleIds = roleIds;
	}

	public void setSortGreaterThan(Integer sortGreaterThan) {
		this.sortGreaterThan = sortGreaterThan;
	}

	public void setSortGreaterThanOrEqual(Integer sortGreaterThanOrEqual) {
		this.sortGreaterThanOrEqual = sortGreaterThanOrEqual;
	}

	public void setSortLessThan(Integer sortLessThan) {
		this.sortLessThan = sortLessThan;
	}

	public void setSortLessThanOrEqual(Integer sortLessThanOrEqual) {
		this.sortLessThanOrEqual = sortLessThanOrEqual;
	}

	public SysDeptRoleQuery sortGreaterThanOrEqual(
			Integer sortGreaterThanOrEqual) {
		if (sortGreaterThanOrEqual == null) {
			throw new RuntimeException("sort is null");
		}
		this.sortGreaterThanOrEqual = sortGreaterThanOrEqual;
		return this;
	}

	public SysDeptRoleQuery sortLessThanOrEqual(Integer sortLessThanOrEqual) {
		if (sortLessThanOrEqual == null) {
			throw new RuntimeException("sort is null");
		}
		this.sortLessThanOrEqual = sortLessThanOrEqual;
		return this;
	}

}