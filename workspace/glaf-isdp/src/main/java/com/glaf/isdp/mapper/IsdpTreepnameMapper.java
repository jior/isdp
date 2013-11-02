package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.IsdpTreepname;
import com.glaf.isdp.query.TreepnameQuery;

@Component
public interface IsdpTreepnameMapper {

	void deleteTreepnameById(String id);

	void deleteTreepnames(TreepnameQuery query);

	IsdpTreepname getTreepnameById(String id);

	int getTreepnameCount(Map<String, Object> parameter);

	int getTreepnameCountByQueryCriteria(TreepnameQuery query);
	
	List<IsdpTreepname> getTreepnamesByDomainIndex(int domainIndex);

	List<IsdpTreepname> getTreepnames(Map<String, Object> parameter);

	List<IsdpTreepname> getTreepnamesByQueryCriteria(TreepnameQuery query);

	void insertTreepname(IsdpTreepname model);

	void updateTreepname(IsdpTreepname model);

}
