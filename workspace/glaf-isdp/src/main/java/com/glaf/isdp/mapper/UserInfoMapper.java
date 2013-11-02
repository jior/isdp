package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.UserInfo;
import com.glaf.isdp.query.UserInfoQuery;

@Component
public interface UserInfoMapper {

	void deleteUserInfoById(String id);

	void deleteUserInfos(UserInfoQuery query);

	UserInfo getUserInfoById(String id);

	int getUserInfoCount(Map<String, Object> parameter);

	int getUserInfoCountByQueryCriteria(UserInfoQuery query);

	List<UserInfo> getUserInfos(Map<String, Object> parameter);

	List<UserInfo> getUserInfosByQueryCriteria(UserInfoQuery query);
	
	List<UserInfo> searchUsers(String searchWord);

	void insertUserInfo(UserInfo model);

	void updateUserInfo(UserInfo model);

}
