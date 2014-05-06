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
import com.glaf.isdp.domain.IsdpPinfo;
import com.glaf.isdp.mapper.IsdpPinfoMapper;
import com.glaf.isdp.query.PinfoQuery;
import com.glaf.isdp.service.IsdpPinfoService;

@Service("isdpPinfoService")
@Transactional(readOnly = true)
public class MxPinfoServiceImpl implements IsdpPinfoService {
	protected static final Log logger = LogFactory
			.getLog(MxPinfoServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpPinfoMapper isdpPinfoMapper;

	public MxPinfoServiceImpl() {

	}

	public int count(PinfoQuery query) {
		query.ensureInitialized();
		return isdpPinfoMapper.getPinfoCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpPinfoMapper.deletePinfoById(id);
	}

	public IsdpPinfo getPinfo(String id) {
		IsdpPinfo pinfo = isdpPinfoMapper.getPinfoById(id);
		return pinfo;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getPinfoCount(Map<String, Object> parameter) {
		return isdpPinfoMapper.getPinfoCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getPinfoCountByQueryCriteria(PinfoQuery query) {
		return isdpPinfoMapper.getPinfoCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpPinfo> getPinfos(Map<String, Object> parameter) {
		return isdpPinfoMapper.getPinfos(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IsdpPinfo> getPinfosByQueryCriteria(int start, int pageSize,
			PinfoQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpPinfo> rows = sqlSession.selectList("getPinfosByQueryCriteria",
				query, rowBounds);
		return rows;
	}

	public List<IsdpPinfo> list(PinfoQuery query) {
		query.ensureInitialized();
		List<IsdpPinfo> list = isdpPinfoMapper.getPinfosByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpPinfo pinfo) {
		if (StringUtils.isEmpty(pinfo.getId())) {
			pinfo.setId(idGenerator.getNextId());
			// pinfo.setId(idGenerator.getNextId());
			// pinfo.setCreateDate(new Date());
			isdpPinfoMapper.insertPinfo(pinfo);
		} else {
			IsdpPinfo model = this.getPinfo(pinfo.getId());
			if (model != null) {
				model.setIndexId(pinfo.getIndexId());
				if (pinfo.getItemnum() != null) {
					model.setItemnum(pinfo.getItemnum());
				}
				if (pinfo.getDtag() != null) {
					model.setDtag(pinfo.getDtag());
				}
				if (pinfo.getFtag() != null) {
					model.setFtag(pinfo.getFtag());
				}
				if (pinfo.getName() != null) {
					model.setName(pinfo.getName());
				}
				if (pinfo.getAllname() != null) {
					model.setAllname(pinfo.getAllname());
				}
				if (pinfo.getBcompany() != null) {
					model.setBcompany(pinfo.getBcompany());
				}
				if (pinfo.getCcompany() != null) {
					model.setCcompany(pinfo.getCcompany());
				}
				if (pinfo.getDcompany() != null) {
					model.setDcompany(pinfo.getDcompany());
				}
				if (pinfo.getConcompany() != null) {
					model.setConcompany(pinfo.getConcompany());
				}
				if (pinfo.getIcompany() != null) {
					model.setIcompany(pinfo.getIcompany());
				}
				if (pinfo.getCmark() != null) {
					model.setCmark(pinfo.getCmark());
				}
				if (pinfo.getPmark() != null) {
					model.setPmark(pinfo.getPmark());
				}
				if (pinfo.getTpmark() != null) {
					model.setTpmark(pinfo.getTpmark());
				}
				if (pinfo.getTmark() != null) {
					model.setTmark(pinfo.getTmark());
				}
				if (pinfo.getConmark() != null) {
					model.setConmark(pinfo.getConmark());
				}
				if (pinfo.getMapnum() != null) {
					model.setMapnum(pinfo.getMapnum());
				}
				if (pinfo.getConstart() != null) {
					model.setConstart(pinfo.getConstart());
				}
				if (pinfo.getConend() != null) {
					model.setConend(pinfo.getConend());
				}
				model.setTotallen(pinfo.getTotallen());
				if (pinfo.getStartdate() != null) {
					model.setStartdate(pinfo.getStartdate());
				}
				if (pinfo.getEnddate() != null) {
					model.setEnddate(pinfo.getEnddate());
				}
				model.setCost(pinfo.getCost());
				model.setBalance(pinfo.getBalance());
				if (pinfo.getPmannager() != null) {
					model.setPmannager(pinfo.getPmannager());
				}
				if (pinfo.getEnginee() != null) {
					model.setEnginee(pinfo.getEnginee());
				}
				if (pinfo.getOwner() != null) {
					model.setOwner(pinfo.getOwner());
				}
				if (pinfo.getPlandate() != null) {
					model.setPlandate(pinfo.getPlandate());
				}
				model.setHintday(pinfo.getHintday());
				if (pinfo.getDuty() != null) {
					model.setDuty(pinfo.getDuty());
				}
				if (pinfo.getRemovedate() != null) {
					model.setRemovedate(pinfo.getRemovedate());
				}
				if (pinfo.getRemoveduty() != null) {
					model.setRemoveduty(pinfo.getRemoveduty());
				}
				if (pinfo.getRemovefile() != null) {
					model.setRemovefile(pinfo.getRemovefile());
				}
				if (pinfo.getPartproj() != null) {
					model.setPartproj(pinfo.getPartproj());
				}
				if (pinfo.getCnum() != null) {
					model.setCnum(pinfo.getCnum());
				}
				if (pinfo.getConcompany2() != null) {
					model.setConcompany2(pinfo.getConcompany2());
				}
				if (pinfo.getIcompany2() != null) {
					model.setIcompany2(pinfo.getIcompany2());
				}
				model.setMileage(pinfo.getMileage());
				if (pinfo.getPlace() != null) {
					model.setPlace(pinfo.getPlace());
				}
				model.setPlace1(pinfo.getPlace1());
				model.setPlace2(pinfo.getPlace2());
				model.setPlace3(pinfo.getPlace3());
				model.setPlace4(pinfo.getPlace4());
				if (pinfo.getSetplace() != null) {
					model.setSetplace(pinfo.getSetplace());
				}
				if (pinfo.getSettemp() != null) {
					model.setSettemp(pinfo.getSettemp());
				}
				if (pinfo.getBdnum() != null) {
					model.setBdnum(pinfo.getBdnum());
				}
				if (pinfo.getDtnum() != null) {
					model.setDtnum(pinfo.getDtnum());
				}
				if (pinfo.getPinfoUser2() != null) {
					model.setPinfoUser2(pinfo.getPinfoUser2());
				}
				model.setPinfoUser3(pinfo.getPinfoUser3());
				model.setPinfoUser4(pinfo.getPinfoUser4());
				if (pinfo.getPinfoUser5() != null) {
					model.setPinfoUser5(pinfo.getPinfoUser5());
				}
				model.setPinfoUser6(pinfo.getPinfoUser6());
				model.setPinfoUser7(pinfo.getPinfoUser7());
				model.setPinfoUser8(pinfo.getPinfoUser8());
				if (pinfo.getPinfoUser9() != null) {
					model.setPinfoUser9(pinfo.getPinfoUser9());
				}
				if (pinfo.getPinfoUser10() != null) {
					model.setPinfoUser10(pinfo.getPinfoUser10());
				}
				isdpPinfoMapper.updatePinfo(model);
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
	public void setIsdpPinfoMapper(IsdpPinfoMapper isdpPinfoMapper) {
		this.isdpPinfoMapper = isdpPinfoMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
