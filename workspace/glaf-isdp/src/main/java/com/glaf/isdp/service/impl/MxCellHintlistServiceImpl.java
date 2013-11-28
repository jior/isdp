package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.*;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("cellHintlistService")
@Transactional(readOnly = true) 
public class MxCellHintlistServiceImpl implements ICellHintlistService {
	protected static final Log logger = LogFactory.getLog(MxCellHintlistServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;
 
	protected SqlSession sqlSession;

	protected CellHintlistMapper cellHintlistMapper;

	public MxCellHintlistServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellHintlistMapper.deleteCellHintlistById(id);
	}


	public int count(CellHintlistQuery query) {
		query.ensureInitialized();
		return cellHintlistMapper.getCellHintlistCountByQueryCriteria(query);
	}

	public List<CellHintlist> list(CellHintlistQuery query) {
		query.ensureInitialized();
		List<CellHintlist> list = cellHintlistMapper.getCellHintlistsByQueryCriteria(query);
		return list;
	}


    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 public int getCellHintlistCount(Map<String, Object> parameter){
         return cellHintlistMapper.getCellHintlistCount(parameter);
	 }

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellHintlistCountByQueryCriteria(CellHintlistQuery query) {
		return cellHintlistMapper.getCellHintlistCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellHintlist> getCellHintlistsByQueryCriteria(int start, int pageSize,
			CellHintlistQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellHintlist> rows = sqlSession.selectList(
				"getCellHintlistsByQueryCriteria", query, rowBounds);
		return rows;
	}

     /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellHintlist> getCellHintlists(Map<String, Object> parameter){
        return cellHintlistMapper.getCellHintlists(parameter);
	}

	public CellHintlist getCellHintlist(String id) {
		CellHintlist cellHintlist = cellHintlistMapper.getCellHintlistById(id);
		return cellHintlist;
	}

	@Transactional
	public void save(CellHintlist cellHintlist) {
           if (StringUtils.isEmpty(cellHintlist.getId())) {
		       cellHintlist.setId(idGenerator.getNextId());
               //cellHintlist.setId(idGenerator.getNextId());
               //cellHintlist.setCreateDate(new Date());
               cellHintlistMapper.insertCellHintlist(cellHintlist);
            } else {
                CellHintlist model = this.getCellHintlist(cellHintlist.getId());
                if(model !=null){
                    model.setIndexId(cellHintlist.getIndexId());
                    if (cellHintlist.getHint() != null) {
                        model.setHint(cellHintlist.getHint());
                    }
                    cellHintlistMapper.updateCellHintlist(model);
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
	public void setCellHintlistMapper(CellHintlistMapper cellHintlistMapper) {
		this.cellHintlistMapper = cellHintlistMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
