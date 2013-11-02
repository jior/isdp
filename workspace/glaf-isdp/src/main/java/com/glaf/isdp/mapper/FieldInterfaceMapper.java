package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.query.FieldInterfaceQuery;

@Component
public interface FieldInterfaceMapper {

	void deleteFieldInterfaceById(String id);

	void deleteFieldInterfaces(FieldInterfaceQuery query);

	FieldInterface getFieldInterfaceById(String id);

	int getFieldInterfaceCount(Map<String, Object> parameter);

	int getFieldInterfaceCountByQueryCriteria(FieldInterfaceQuery query);

	List<FieldInterface> getFieldInterfaces(Map<String, Object> parameter);
	
	List<FieldInterface> getListShowFields(Map<String, Object> parameter);

	List<FieldInterface> getFieldInterfacesByQueryCriteria(
			FieldInterfaceQuery query);

	List<FieldInterface> getFieldsByFrmType(String frmType);
	
	List<FieldInterface> getListShowFieldsByFrmType(String frmType);

	void insertFieldInterface(FieldInterface model);

	void updateFieldInterface(FieldInterface model);

}
