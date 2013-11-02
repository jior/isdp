package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.IsdpPinfo;
import com.glaf.isdp.query.PinfoQuery;

@Component
public interface IsdpPinfoMapper {

	void deletePinfoById(String id);

	void deletePinfos(PinfoQuery query);

	IsdpPinfo getPinfoById(String id);

	int getPinfoCount(Map<String, Object> parameter);

	int getPinfoCountByQueryCriteria(PinfoQuery query);

	List<IsdpPinfo> getPinfos(Map<String, Object> parameter);

	List<IsdpPinfo> getPinfosByQueryCriteria(PinfoQuery query);

	void insertPinfo(IsdpPinfo model);

	void updatePinfo(IsdpPinfo model);

}
