package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.Volume;
import com.glaf.isdp.query.VolumeQuery;

@Component
public interface VolumeMapper {

	void deleteVolumeById(String id);

	void deleteVolumes(VolumeQuery query);

	Volume getVolumeById(String id);

	int getVolumeCount(Map<String, Object> parameter);

	int getVolumeCountByQueryCriteria(VolumeQuery query);

	List<Volume> getVolumes(Map<String, Object> parameter);

	List<Volume> getVolumesByQueryCriteria(VolumeQuery query);

	void insertVolume(Volume model);

	void updateVolume(Volume model);

}
