package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreepInfoUser;
import com.glaf.isdp.query.TreepInfoUserQuery;

@Component
public interface TreepInfoUserMapper {

	void deleteTreepInfoUserById(int id);

	void deleteTreepInfoUsers(TreepInfoUserQuery query);

	TreepInfoUser getTreepInfoUserById(int id);

	int getTreepInfoUserCount(Map<String, Object> parameter);

	int getTreepInfoUserCountByQueryCriteria(TreepInfoUserQuery query);

	List<TreepInfoUser> getTreepInfoUsers(Map<String, Object> parameter);

	List<TreepInfoUser> getTreepInfoUsersByQueryCriteria(
			TreepInfoUserQuery query);

	void insertTreepInfoUser(TreepInfoUser model);

	void updateTreepInfoUser(TreepInfoUser model);

}
