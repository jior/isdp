package com.glaf.isdp.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.TreepInfoUser;
import com.glaf.isdp.mapper.TreepInfoUserMapper;
import com.glaf.isdp.query.TreepInfoUserQuery;
import com.glaf.isdp.service.ITreepInfoUserService;

@Service("treepInfoUserService")
@Transactional(readOnly = true)
public class MxTreepInfoUserServiceImpl implements ITreepInfoUserService {
	protected static final Log logger = LogFactory
			.getLog(MxTreepInfoUserServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreepInfoUserMapper treepInfoUserMapper;

	public MxTreepInfoUserServiceImpl() {

	}

	public int count(TreepInfoUserQuery query) {
		query.ensureInitialized();
		return treepInfoUserMapper
				.getTreepInfoUserCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(int id) {
		treepInfoUserMapper.deleteTreepInfoUserById(id);
	}

	public TreepInfoUser getTreepInfoUser(int id) {
		TreepInfoUser treepInfoUser = treepInfoUserMapper
				.getTreepInfoUserById(id);
		return treepInfoUser;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreepInfoUserCount(Map<String, Object> parameter) {
		return treepInfoUserMapper.getTreepInfoUserCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreepInfoUserCountByQueryCriteria(TreepInfoUserQuery query) {
		return treepInfoUserMapper
				.getTreepInfoUserCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<TreepInfoUser> getTreepInfoUsers(Map<String, Object> parameter) {
		return treepInfoUserMapper.getTreepInfoUsers(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TreepInfoUser> getTreepInfoUsersByQueryCriteria(int start,
			int pageSize, TreepInfoUserQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreepInfoUser> rows = sqlSession.selectList(
				"getTreepInfoUsersByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreepInfoUser> list(TreepInfoUserQuery query) {
		query.ensureInitialized();
		List<TreepInfoUser> list = treepInfoUserMapper
				.getTreepInfoUsersByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreepInfoUser treepInfoUser) {
		if (treepInfoUser.getIndexId() == 0) {
			treepInfoUser.setIndexId(idGenerator.nextId().intValue());
			// treepInfoUser.setIndexId(idGenerator.getNextId());
			// treepInfoUser.setCreateDate(new Date());
			treepInfoUserMapper.insertTreepInfoUser(treepInfoUser);
		} else {
			TreepInfoUser model = this.getTreepInfoUser(treepInfoUser
					.getIndexId());
			if (model != null) {
				if (treepInfoUser.getId() != null) {
					model.setId(treepInfoUser.getId());
				}
				if (treepInfoUser.getNum() != null) {
					model.setNum(treepInfoUser.getNum());
				}
				if (treepInfoUser.getIndexName() != null) {
					model.setIndexName(treepInfoUser.getIndexName());
				}
				model.setNlevel(treepInfoUser.getNlevel());
				if (treepInfoUser.getNodetype() != null) {
					model.setNodetype(treepInfoUser.getNodetype());
				}
				model.setFromid(treepInfoUser.getFromid());
				model.setShowid(treepInfoUser.getShowid());
				if (treepInfoUser.getProjtype() != null) {
					model.setProjtype(treepInfoUser.getProjtype());
				}
				model.setNodeico(treepInfoUser.getNodeico());
				model.setListno(treepInfoUser.getListno());
				model.setPartId(treepInfoUser.getPartId());
				model.setPfilesIndex(treepInfoUser.getPfilesIndex());
				if (treepInfoUser.getTypeTablename() != null) {
					model.setTypeTablename(treepInfoUser.getTypeTablename());
				}
				if (treepInfoUser.getStrfileLocate() != null) {
					model.setStrfileLocate(treepInfoUser.getStrfileLocate());
				}
				treepInfoUserMapper.updateTreepInfoUser(model);
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
	public void setTreepInfoUserMapper(
			TreepInfoUserMapper treepInfoUserMapper) {
		this.treepInfoUserMapper = treepInfoUserMapper;
	}

}
