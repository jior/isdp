package com.glaf.liferay.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.liferay.domain.User;
import com.glaf.liferay.mapper.UserMapper;
import com.glaf.liferay.query.UserQuery;

@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected UserMapper userMapper;

	public UserServiceImpl() {

	}

	@Transactional
	public void deleteById(Long id) {
		if (id != null) {
			userMapper.deleteLiferayUserById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<Long> ids) {
		if (ids != null && !ids.isEmpty()) {
			for (Long id : ids) {
				userMapper.deleteLiferayUserById(id);
			}
		}
	}

	public int count(UserQuery query) {
		query.ensureInitialized();
		return userMapper.getLiferayUserCount(query);
	}

	public List<User> list(UserQuery query) {
		query.ensureInitialized();
		List<User> list = userMapper.getLiferayUsers(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getUserCountByQueryCriteria(UserQuery query) {
		return userMapper.getLiferayUserCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<User> getUsersByQueryCriteria(int start, int pageSize,
			UserQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<User> rows = sqlSessionTemplate.selectList("getLiferayUsers", query,
				rowBounds);
		return rows;
	}

	public User getUser(Long id) {
		if (id == null) {
			return null;
		}
		User user = userMapper.getLiferayUserById(id);
		return user;
	}

	@Transactional
	public void save(User user) {
		if (user.getUserId() == null) {
			user.setUserId(idGenerator.nextId());
			user.setCreateDate(new Date());
			// user.setDeleteFlag(0);
			userMapper.insertLiferayUser(user);
		} else {
			userMapper.updateLiferayUser(user);
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@javax.annotation.Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
