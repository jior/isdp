package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreeFolder;
import com.glaf.isdp.query.TreeFolderQuery;

@Component
public interface TreeFolderMapper {

	void deleteTreeFolderById(String id);

	void deleteTreeFolderByIndexId(int indexId);

	TreeFolder getTreeFolderById(String id);

	TreeFolder getTreeFolderByIndexId(int indexId);

	int getTreeFolderCount(Map<String, Object> parameter);

	int getTreeFolderCountByQueryCriteria(TreeFolderQuery query);

	List<TreeFolder> getTreeFolders(Map<String, Object> parameter);

	List<TreeFolder> getTreeFoldersByQueryCriteria(TreeFolderQuery query);

	void insertTreeFolder(TreeFolder model);

	void updateTreeFolder(TreeFolder model);

}
