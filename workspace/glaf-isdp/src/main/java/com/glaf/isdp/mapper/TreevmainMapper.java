package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.Treevmain;
import com.glaf.isdp.query.TreevmainQuery;

@Component
public interface TreevmainMapper {

	void deleteTreevmainById(String id);

	void deleteTreevmainByIndexId(int indexId);

	void deleteTreevmains(TreevmainQuery query);

	Treevmain getTreevmainById(String id);

	Treevmain getTreevmainByIndexId(int indexId);

	int getTreevmainCount(Map<String, Object> parameter);

	int getTreevmainCountByQueryCriteria(TreevmainQuery query);

	List<Treevmain> getTreevmains(Map<String, Object> parameter);

	List<Treevmain> getTreevmainsByQueryCriteria(TreevmainQuery query);

	void insertTreevmain(Treevmain model);

	void updateTreevmain(Treevmain model);

}
