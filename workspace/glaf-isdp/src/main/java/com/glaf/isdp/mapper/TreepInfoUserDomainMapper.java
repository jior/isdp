package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface TreepInfoUserDomainMapper {

	void deleteTreepInfoUserDomains(TreepInfoUserDomainQuery query);

	void deleteTreepInfoUserDomainById(String id);

	TreepInfoUserDomain getTreepInfoUserDomainById(String id);

	int getTreepInfoUserDomainCount(Map<String, Object> parameter);

	int getTreepInfoUserDomainCountByQueryCriteria(TreepInfoUserDomainQuery query);

	List<TreepInfoUserDomain> getTreepInfoUserDomains(Map<String, Object> parameter);

	List<Map<String,Object>> getTreepInfoUserDomainMapList(Map<String, Object> parameter);

	List<TreepInfoUserDomain> getTreepInfoUserDomainsByQueryCriteria(TreepInfoUserDomainQuery query);

	void insertTreepInfoUserDomain(TreepInfoUserDomain model);

	void updateTreepInfoUserDomain(TreepInfoUserDomain model);

}
