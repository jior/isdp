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
import com.glaf.isdp.domain.Volume;
import com.glaf.isdp.mapper.VolumeMapper;
import com.glaf.isdp.query.VolumeQuery;
import com.glaf.isdp.service.IVolumeService;

@Service("volumeService")
@Transactional(readOnly = true)
public class MxVolumeServiceImpl implements IVolumeService {
	protected static final Log logger = LogFactory
			.getLog(MxVolumeServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected VolumeMapper volumeMapper;

	public MxVolumeServiceImpl() {

	}

	public int count(VolumeQuery query) {
		query.ensureInitialized();
		return volumeMapper.getVolumeCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		volumeMapper.deleteVolumeById(id);
	}

	public Volume getVolume(String id) {
		Volume volume = volumeMapper.getVolumeById(id);
		return volume;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getVolumeCount(Map<String, Object> parameter) {
		return volumeMapper.getVolumeCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getVolumeCountByQueryCriteria(VolumeQuery query) {
		return volumeMapper.getVolumeCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<Volume> getVolumes(Map<String, Object> parameter) {
		return volumeMapper.getVolumes(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<Volume> getVolumesByQueryCriteria(int start, int pageSize,
			VolumeQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<Volume> rows = sqlSession.selectList("getVolumesByQueryCriteria",
				query, rowBounds);
		return rows;
	}

	public List<Volume> list(VolumeQuery query) {
		query.ensureInitialized();
		List<Volume> list = volumeMapper.getVolumesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(Volume volume) {
		if (StringUtils.isEmpty(volume.getId())) {
			volume.setId(idGenerator.getNextId());
			// volume.setId(idGenerator.getNextId());
			// volume.setCreateDate(new Date());
			volumeMapper.insertVolume(volume);
		} else {
			Volume model = this.getVolume(volume.getId());
			if (model != null) {
				model.setListno(volume.getListno());
				if (volume.getOldid() != null) {
					model.setOldid(volume.getOldid());
				}
				if (volume.getRuleID() != null) {
					model.setRuleID(volume.getRuleID());
				}
				if (volume.getRuleflag() != null) {
					model.setRuleflag(volume.getRuleflag());
				}
				if (volume.getRulepid() != null) {
					model.setRulepid(volume.getRulepid());
				}
				if (volume.getVid() != null) {
					model.setVid(volume.getVid());
				}
				if (volume.getSumflag() != null) {
					model.setSumflag(volume.getSumflag());
				}
				model.setTopid(volume.getTopid());
				model.setIndexId(volume.getIndexId());
				model.setProjid(volume.getProjid());
				model.setPid(volume.getPid());
				if (volume.getPname() != null) {
					model.setPname(volume.getPname());
				}
				if (volume.getVflag() != null) {
					model.setVflag(volume.getVflag());
				}
				if (volume.getVname() != null) {
					model.setVname(volume.getVname());
				}
				model.setYear(volume.getYear());
				if (volume.getGlidenum() != null) {
					model.setGlidenum(volume.getGlidenum());
				}
				if (volume.getFilingflag() != null) {
					model.setFilingflag(volume.getFilingflag());
				}
				if (volume.getCheckupflag() != null) {
					model.setCheckupflag(volume.getCheckupflag());
				}
				if (volume.getOpenflag() != null) {
					model.setOpenflag(volume.getOpenflag());
				}
				if (volume.getFinishflag() != null) {
					model.setFinishflag(volume.getFinishflag());
				}
				if (volume.getVtagnum() != null) {
					model.setVtagnum(volume.getVtagnum());
				}
				if (volume.getVtype() != null) {
					model.setVtype(volume.getVtype());
				}
				if (volume.getVnum() != null) {
					model.setVnum(volume.getVnum());
				}
				if (volume.getVtmpnum() != null) {
					model.setVtmpnum(volume.getVtmpnum());
				}
				if (volume.getRoomnum() != null) {
					model.setRoomnum(volume.getRoomnum());
				}
				if (volume.getZoonum() != null) {
					model.setZoonum(volume.getZoonum());
				}
				if (volume.getEfilenum() != null) {
					model.setEfilenum(volume.getEfilenum());
				}
				if (volume.getBoxnum() != null) {
					model.setBoxnum(volume.getBoxnum());
				}
				if (volume.getPlace() != null) {
					model.setPlace(volume.getPlace());
				}
				if (volume.getTname() != null) {
					model.setTname(volume.getTname());
				}
				if (volume.getWcompany() != null) {
					model.setWcompany(volume.getWcompany());
				}
				if (volume.getWdate() != null) {
					model.setWdate(volume.getWdate());
				}
				if (volume.getCarriertype() != null) {
					model.setCarriertype(volume.getCarriertype());
				}
				if (volume.getNumunit() != null) {
					model.setNumunit(volume.getNumunit());
				}
				if (volume.getSpec() != null) {
					model.setSpec(volume.getSpec());
				}
				if (volume.getStartday() != null) {
					model.setStartday(volume.getStartday());
				}
				if (volume.getEndday() != null) {
					model.setEndday(volume.getEndday());
				}
				if (volume.getSavetime() != null) {
					model.setSavetime(volume.getSavetime());
				}
				if (volume.getSlevel() != null) {
					model.setSlevel(volume.getSlevel());
				}
				if (volume.getThematic() != null) {
					model.setThematic(volume.getThematic());
				}
				if (volume.getAnnotations() != null) {
					model.setAnnotations(volume.getAnnotations());
				}
				model.setTotalfile(volume.getTotalfile());
				model.setTotalpage(volume.getTotalpage());
				model.setTxtpage(volume.getTxtpage());
				model.setPicpage(volume.getPicpage());
				model.setPhotopage(volume.getPhotopage());
				if (volume.getCman() != null) {
					model.setCman(volume.getCman());
				}
				if (volume.getCtime() != null) {
					model.setCtime(volume.getCtime());
				}
				if (volume.getAssessor() != null) {
					model.setAssessor(volume.getAssessor());
				}
				if (volume.getAtime() != null) {
					model.setAtime(volume.getAtime());
				}
				if (volume.getContent() != null) {
					model.setContent(volume.getContent());
				}
				if (volume.getIslocate() != null) {
					model.setIslocate(volume.getIslocate());
				}
				if (volume.getTopnode() != null) {
					model.setTopnode(volume.getTopnode());
				}
				if (volume.getLcontent() != null) {
					model.setLcontent(volume.getLcontent());
				}
				if (volume.getLcompany() != null) {
					model.setLcompany(volume.getLcompany());
				}
				if (volume.getLman() != null) {
					model.setLman(volume.getLman());
				}
				if (volume.getLlen() != null) {
					model.setLlen(volume.getLlen());
				}
				if (volume.getLdate() != null) {
					model.setLdate(volume.getLdate());
				}
				if (volume.getJconten() != null) {
					model.setJconten(volume.getJconten());
				}
				if (volume.getJplace() != null) {
					model.setJplace(volume.getJplace());
				}
				if (volume.getJman() != null) {
					model.setJman(volume.getJman());
				}
				if (volume.getJback() != null) {
					model.setJback(volume.getJback());
				}
				if (volume.getJactor() != null) {
					model.setJactor(volume.getJactor());
				}
				if (volume.getTnum() != null) {
					model.setTnum(volume.getTnum());
				}
				if (volume.getTzoom() != null) {
					model.setTzoom(volume.getTzoom());
				}
				if (volume.getTflag() != null) {
					model.setTflag(volume.getTflag());
				}
				if (volume.getTdesigner() != null) {
					model.setTdesigner(volume.getTdesigner());
				}
				if (volume.getTviewer() != null) {
					model.setTviewer(volume.getTviewer());
				}
				if (volume.getTassessor() != null) {
					model.setTassessor(volume.getTassessor());
				}
				if (volume.getTvision() != null) {
					model.setTvision(volume.getTvision());
				}
				if (volume.getFinishday() != null) {
					model.setFinishday(volume.getFinishday());
				}
				volumeMapper.updateVolume(model);
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
	public void setVolumeMapper(VolumeMapper volumeMapper) {
		this.volumeMapper = volumeMapper;
	}

}
