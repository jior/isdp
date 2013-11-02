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
import com.glaf.isdp.domain.TreeFolder;
import com.glaf.isdp.mapper.TreeFolderMapper;
import com.glaf.isdp.query.TreeFolderQuery;
import com.glaf.isdp.service.ITreeFolderService;

@Service("treeFolderService")
@Transactional(readOnly = true)
public class MxTreeFolderServiceImpl implements ITreeFolderService {
	protected static final Log logger = LogFactory
			.getLog(MxTreeFolderServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreeFolderMapper treeFolderMapper;

	public MxTreeFolderServiceImpl() {

	}

	public int count(TreeFolderQuery query) {
		query.ensureInitialized();
		return treeFolderMapper.getTreeFolderCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treeFolderMapper.deleteTreeFolderById(id);
	}

	public void deleteByPrimaryKey(int indexId) {
		treeFolderMapper.deleteTreeFolderByIndexId(indexId);
	}

	public TreeFolder getTreeFolderById(String id) {
		TreeFolder treeFolder = treeFolderMapper.getTreeFolderById(id);
		return treeFolder;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreeFolderCount(Map<String, Object> parameter) {
		return treeFolderMapper.getTreeFolderCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreeFolderCountByQueryCriteria(TreeFolderQuery query) {
		return treeFolderMapper.getTreeFolderCountByQueryCriteria(query);
	}
	
	public TreeFolder getTreeFolderPrimaryKey(int indexId) {
		return treeFolderMapper.getTreeFolderByIndexId(indexId);
	}

	public List<TreeFolder> getTreeFolders(int inttype, int menuindex){
		TreeFolderQuery query = new TreeFolderQuery();
		query.inttype(inttype).menuindex(menuindex);
		return this.list(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<TreeFolder> getTreeFolders(Map<String, Object> parameter) {
		return treeFolderMapper.getTreeFolders(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TreeFolder> getTreeFoldersByQueryCriteria(int start,
			int pageSize, TreeFolderQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreeFolder> rows = sqlSession.selectList(
				"getTreeFoldersByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreeFolder> list(TreeFolderQuery query) {
		query.ensureInitialized();
		List<TreeFolder> list = treeFolderMapper
				.getTreeFoldersByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreeFolder treeFolder) {
		if (treeFolder.getIndexId() == 0) {
			treeFolder.setIndexId(idGenerator.nextId().intValue());
			// treeFolder.setIndexId(idGenerator.getNextId());
			// treeFolder.setCreateDate(new Date());
			treeFolderMapper.insertTreeFolder(treeFolder);
		} else {
			TreeFolder model = this.getTreeFolderPrimaryKey(treeFolder
					.getIndexId());
			if (model != null) {
				if (treeFolder.getId() != null) {
					model.setId(treeFolder.getId());
				}
				if (treeFolder.getIndexName() != null) {
					model.setIndexName(treeFolder.getIndexName());
				}
				model.setNlevel(treeFolder.getNlevel());
				if (treeFolder.getContent() != null) {
					model.setContent(treeFolder.getContent());
				}
				model.setNodeico(treeFolder.getNodeico());
				model.setListno(treeFolder.getListno());
				model.setInttype(treeFolder.getInttype());
				if (treeFolder.getSindexName() != null) {
					model.setSindexName(treeFolder.getSindexName());
				}
				if (treeFolder.getNum() != null) {
					model.setNum(treeFolder.getNum());
				}
				if (treeFolder.getFilenum() != null) {
					model.setFilenum(treeFolder.getFilenum());
				}
				if (treeFolder.getFtype() != null) {
					model.setFtype(treeFolder.getFtype());
				}
				model.setZtype(treeFolder.getZtype());
				if (treeFolder.getSlevel() != null) {
					model.setSlevel(treeFolder.getSlevel());
				}
				if (treeFolder.getSavetime() != null) {
					model.setSavetime(treeFolder.getSavetime());
				}
				model.setDomainIndex(treeFolder.getDomainIndex());
				model.setMenuindex(treeFolder.getMenuindex());
				treeFolderMapper.updateTreeFolder(model);
			}
		}
	}

	 
	@javax.annotation.Resource(name="myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name="myBatisDbIdGenerator")
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setTreeFolderMapper(
			TreeFolderMapper treeFolderMapper) {
		this.treeFolderMapper = treeFolderMapper;
	}

}
