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
import com.glaf.isdp.domain.TreevmainUser;
import com.glaf.isdp.mapper.TreevmainUserMapper;
import com.glaf.isdp.query.TreevmainUserQuery;
import com.glaf.isdp.service.ITreevmainUserService;

@Service("treevmainUserService")
@Transactional(readOnly = true)
public class MxTreevmainUserServiceImpl implements ITreevmainUserService {
	protected static final Log logger = LogFactory
			.getLog(MxTreevmainUserServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreevmainUserMapper treevmainUserMapper;

	public MxTreevmainUserServiceImpl() {

	}

	public int count(TreevmainUserQuery query) {
		query.ensureInitialized();
		return treevmainUserMapper
				.getTreevmainUserCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treevmainUserMapper.deleteTreevmainUserById(id);
	}

	public TreevmainUser getTreevmainUser(String id) {
		TreevmainUser treevmainUser = treevmainUserMapper
				.getTreevmainUserById(id);
		return treevmainUser;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreevmainUserCount(Map<String, Object> parameter) {
		return treevmainUserMapper.getTreevmainUserCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreevmainUserCountByQueryCriteria(TreevmainUserQuery query) {
		return treevmainUserMapper
				.getTreevmainUserCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<TreevmainUser> getTreevmainUsers(Map<String, Object> parameter) {
		return treevmainUserMapper.getTreevmainUsers(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TreevmainUser> getTreevmainUsersByQueryCriteria(int start,
			int pageSize, TreevmainUserQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreevmainUser> rows = sqlSession.selectList(
				"getTreevmainUsersByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreevmainUser> list(TreevmainUserQuery query) {
		query.ensureInitialized();
		List<TreevmainUser> list = treevmainUserMapper
				.getTreevmainUsersByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreevmainUser treevmainUser) {
		if (StringUtils.isEmpty(treevmainUser.getId())) {
			treevmainUser.setId(idGenerator.getNextId());
			// treevmainUser.setID(idGenerator.getNextId());
			// treevmainUser.setCreateDate(new Date());
			treevmainUserMapper.insertTreevmainUser(treevmainUser);
		} else {
			TreevmainUser model = this.getTreevmainUser(treevmainUser.getId());
			if (model != null) {
				model.setIndexId(treevmainUser.getIndexId());
				if (treevmainUser.getIndexName() != null) {
					model.setIndexName(treevmainUser.getIndexName());
				}
				model.setNlevel(treevmainUser.getNlevel());
				if (treevmainUser.getNum() != null) {
					model.setNum(treevmainUser.getNum());
				}
				if (treevmainUser.getFilenum() != null) {
					model.setFilenum(treevmainUser.getFilenum());
				}
				if (treevmainUser.getContent() != null) {
					model.setContent(treevmainUser.getContent());
				}
				if (treevmainUser.getVflag() != null) {
					model.setVflag(treevmainUser.getVflag());
				}
				if (treevmainUser.getSindexName() != null) {
					model.setSindexName(treevmainUser.getSindexName());
				}
				model.setZtype(treevmainUser.getZtype());
				if (treevmainUser.getContent2() != null) {
					model.setContent2(treevmainUser.getContent2());
				}
				if (treevmainUser.getTopnode() != null) {
					model.setTopnode(treevmainUser.getTopnode());
				}
				model.setNodeico(treevmainUser.getNodeico());
				if (treevmainUser.getNodetype() != null) {
					model.setNodetype(treevmainUser.getNodetype());
				}
				model.setFromid(treevmainUser.getFromid());
				model.setListno(treevmainUser.getListno());
				model.setFrmtypeindex(treevmainUser.getFrmtypeindex());
				model.setShowid(treevmainUser.getShowid());
				if (treevmainUser.getShowfrmid() != null) {
					model.setShowfrmid(treevmainUser.getShowfrmid());
				}
				model.setShowfrmindexId(treevmainUser.getShowfrmindexId());
				model.setDwid(treevmainUser.getDwid());
				if (treevmainUser.getJid() != null) {
					model.setJid(treevmainUser.getJid());
				}
				if (treevmainUser.getFlid() != null) {
					model.setFlid(treevmainUser.getFlid());
				}
				if (treevmainUser.getCtypeId() != null) {
					model.setCtypeId(treevmainUser.getCtypeId());
				}
				treevmainUserMapper.updateTreevmainUser(model);
			}
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
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setTreevmainUserMapper(
			TreevmainUserMapper treevmainUserMapper) {
		this.treevmainUserMapper = treevmainUserMapper;
	}

}
