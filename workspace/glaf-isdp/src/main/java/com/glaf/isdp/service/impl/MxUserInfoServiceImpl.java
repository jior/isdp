package com.glaf.isdp.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.UserInfo;
import com.glaf.isdp.mapper.UserInfoMapper;
import com.glaf.isdp.query.UserInfoQuery;
import com.glaf.isdp.service.IUserInfoService;

@Service("userInfoService")
@Transactional(readOnly = true)
public class MxUserInfoServiceImpl implements IUserInfoService {
	protected static final Log logger = LogFactory
			.getLog(MxUserInfoServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected UserInfoMapper userInfoMapper;

	public MxUserInfoServiceImpl() {

	}

	public int count(UserInfoQuery query) {
		query.ensureInitialized();
		return userInfoMapper.getUserInfoCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		userInfoMapper.deleteUserInfoById(id);
	}

	public UserInfo getUserInfo(String id) {
		UserInfo userInfo = userInfoMapper.getUserInfoById(id);
		return userInfo;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getUserInfoCount(Map<String, Object> parameter) {
		return userInfoMapper.getUserInfoCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getUserInfoCountByQueryCriteria(UserInfoQuery query) {
		return userInfoMapper.getUserInfoCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<UserInfo> getUserInfos(Map<String, Object> parameter) {
		return userInfoMapper.getUserInfos(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<UserInfo> getUserInfosByQueryCriteria(int start, int pageSize,
			UserInfoQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<UserInfo> rows = sqlSession.selectList(
				"getUserInfosByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<UserInfo> list(UserInfoQuery query) {
		query.ensureInitialized();
		List<UserInfo> list = userInfoMapper
				.getUserInfosByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(UserInfo userInfo) {
		if (StringUtils.isEmpty(userInfo.getUserId())) {
			userInfo.setUserId(idGenerator.getNextId());
			// userInfo.setUserID(idGenerator.getNextId());
			// userInfo.setCreateDate(new Date());
			userInfoMapper.insertUserInfo(userInfo);
		} else {
			UserInfo model = this.getUserInfo(userInfo.getUserId());
			if (model != null) {
				if (userInfo.getUsername() != null) {
					model.setUsername(userInfo.getUsername());
				}
				if (userInfo.getPassword() != null) {
					model.setPassword(userInfo.getPassword());
				}
				if (userInfo.getCtime() != null) {
					model.setCtime(userInfo.getCtime());
				}
				if (userInfo.getEtime() != null) {
					model.setEtime(userInfo.getEtime());
				}
				if (userInfo.getStatus() != null) {
					model.setStatus(userInfo.getStatus());
				}
				if (userInfo.getIsSystem() != null) {
					model.setIsSystem(userInfo.getIsSystem());
				}
				if (userInfo.getSetpruv() != null) {
					model.setSetpruv(userInfo.getSetpruv());
				}
				if (userInfo.getNote() != null) {
					model.setNote(userInfo.getNote());
				}
				model.setSlevel(userInfo.getSlevel());
				model.setDeptId(userInfo.getDeptId());
				if (userInfo.getIsBind() != null) {
					model.setIsBind(userInfo.getIsBind());
				}
				if (userInfo.getComputerId() != null) {
					model.setComputerId(userInfo.getComputerId());
				}
				if (userInfo.getMail() != null) {
					model.setMail(userInfo.getMail());
				}
				if (userInfo.getMailUser() != null) {
					model.setMailUser(userInfo.getMailUser());
				}
				if (userInfo.getMailPwd() != null) {
					model.setMailPwd(userInfo.getMailPwd());
				}
				if (userInfo.getMobile() != null) {
					model.setMobile(userInfo.getMobile());
				}
				model.setIntRemote(userInfo.getIntRemote());
				model.setDomainIndex(userInfo.getDomainIndex());
				model.setIntallwbs(userInfo.getIntallwbs());
				userInfoMapper.updateUserInfo(model);
			}
		}
	}

	public List<UserInfo> searchUsers(String searchWord) {
		return userInfoMapper.searchUsers(searchWord);
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
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}

}
