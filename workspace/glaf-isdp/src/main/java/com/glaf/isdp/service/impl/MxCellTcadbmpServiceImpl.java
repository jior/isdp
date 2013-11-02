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

@Service("cellTcadbmpService")
@Transactional(readOnly = true) 
public class MxCellTcadbmpServiceImpl implements ICellTcadbmpService {
	protected static final Log logger = LogFactory.getLog(MxCellTcadbmpServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;
 
	protected SqlSession sqlSession;

	protected CellTcadbmpMapper cellTcadbmpMapper;

	public MxCellTcadbmpServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellTcadbmpMapper.deleteCellTcadbmpById(id);
	}


	public int count(CellTcadbmpQuery query) {
		query.ensureInitialized();
		return cellTcadbmpMapper.getCellTcadbmpCountByQueryCriteria(query);
	}

	public List<CellTcadbmp> list(CellTcadbmpQuery query) {
		query.ensureInitialized();
		List<CellTcadbmp> list = cellTcadbmpMapper.getCellTcadbmpsByQueryCriteria(query);
		return list;
	}


    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 public int getCellTcadbmpCount(Map<String, Object> parameter){
         return cellTcadbmpMapper.getCellTcadbmpCount(parameter);
	 }

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTcadbmpCountByQueryCriteria(CellTcadbmpQuery query) {
		return cellTcadbmpMapper.getCellTcadbmpCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellTcadbmp> getCellTcadbmpsByQueryCriteria(int start, int pageSize,
			CellTcadbmpQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellTcadbmp> rows = sqlSession.selectList(
				"getCellTcadbmpsByQueryCriteria", query, rowBounds);
		return rows;
	}

     /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellTcadbmp> getCellTcadbmps(Map<String, Object> parameter){
        return cellTcadbmpMapper.getCellTcadbmps(parameter);
	}

	public CellTcadbmp getCellTcadbmp(String id) {
		CellTcadbmp cellTcadbmp = cellTcadbmpMapper.getCellTcadbmpById(id);
		return cellTcadbmp;
	}

	@Transactional
	public void save(CellTcadbmp cellTcadbmp) {
           if (StringUtils.isEmpty(cellTcadbmp.getId())) {
		       cellTcadbmp.setId(idGenerator.getNextId());
               //cellTcadbmp.setId(idGenerator.getNextId());
               //cellTcadbmp.setCreateDate(new Date());
               cellTcadbmpMapper.insertCellTcadbmp(cellTcadbmp);
            } else {
                CellTcadbmp model = this.getCellTcadbmp(cellTcadbmp.getId());
                if(model !=null){
                    model.setFiletype(cellTcadbmp.getFiletype());
                    if (cellTcadbmp.getFileid() != null) {
                        model.setFileid(cellTcadbmp.getFileid());
                    }
                    if (cellTcadbmp.getOstTablename() != null) {
                        model.setOstTablename(cellTcadbmp.getOstTablename());
                    }
                    model.setOstRow(cellTcadbmp.getOstRow());
                    model.setOstCol(cellTcadbmp.getOstCol());
                    if (cellTcadbmp.getOstCellid() != null) {
                        model.setOstCellid(cellTcadbmp.getOstCellid());
                    }
                    if (cellTcadbmp.getFileName() != null) {
                        model.setFileName(cellTcadbmp.getFileName());
                    }
                    model.setFileContent(cellTcadbmp.getFileContent());
                    model.setOldContent(cellTcadbmp.getOldContent());
                    cellTcadbmpMapper.updateCellTcadbmp(model);
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
	public void setCellTcadbmpMapper(CellTcadbmpMapper cellTcadbmpMapper) {
		this.cellTcadbmpMapper = cellTcadbmpMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
