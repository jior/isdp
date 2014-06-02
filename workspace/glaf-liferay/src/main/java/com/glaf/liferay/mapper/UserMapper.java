package com.glaf.liferay.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.glaf.liferay.domain.User;
import com.glaf.liferay.query.UserQuery;

/**
 * 
 * Mapper接口
 * 
 */

@Component
public interface UserMapper {

	void deleteLiferayUsers(UserQuery query);

	void deleteLiferayUserById(Long userId);

	User getLiferayUserById(Long userId);

	int getLiferayUserCount(UserQuery query);

	List<User> getLiferayUsers(UserQuery query);

	void insertLiferayUser(User model);

	void updateLiferayUser(User model);

}
