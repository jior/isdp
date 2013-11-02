package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreevmainUser;
import com.glaf.isdp.query.TreevmainUserQuery;

@Component
public interface TreevmainUserMapper {

	void deleteTreevmainUserById(String id);

	void deleteTreevmainUsers(TreevmainUserQuery query);

	TreevmainUser getTreevmainUserById(String id);

	int getTreevmainUserCount(Map<String, Object> parameter);

	int getTreevmainUserCountByQueryCriteria(TreevmainUserQuery query);

	List<TreevmainUser> getTreevmainUsers(Map<String, Object> parameter);

	List<TreevmainUser> getTreevmainUsersByQueryCriteria(
			TreevmainUserQuery query);

	void insertTreevmainUser(TreevmainUser model);

	void updateTreevmainUser(TreevmainUser model);

}
