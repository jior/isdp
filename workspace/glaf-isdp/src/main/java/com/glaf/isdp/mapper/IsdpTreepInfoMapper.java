package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.base.modules.sys.model.ObjectEntity;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.isdp.query.TreepInfoQuery;

@Component
public interface IsdpTreepInfoMapper {

	void deleteTreepInfoById(String id);

	void deleteTreepInfoByIndexId(int indexId);

	IsdpTreepInfo getTreepInfoById(String id);

	IsdpTreepInfo getTreepInfoByIndexId(int indexId);

	int getTreepInfoCount(Map<String, Object> parameter);

	int getTreepInfoCountByQueryCriteria(TreepInfoQuery query);

	List<ObjectEntity> getTreepInfoIds(String strfuntion);

	List<IsdpTreepInfo> getTreepInfoList(Map<String, Object> parameter);

	List<IsdpTreepInfo> getTreepInfos(Map<String, Object> parameter);

	List<IsdpTreepInfo> getTreepInfosByQueryCriteria(TreepInfoQuery query);

	List<IsdpTreepInfo> getTreepInfosByTopId(Map<String, Object> parameter);

	List<IsdpTreepInfo> getTreepInfosByTreedotIndexId(int indexId);

	List<IsdpTreepInfo> getTreepInfosFromSql(Map<String, Object> parameter);

	List<IsdpTreepInfo> getWbsTreepInfosByIndexId(int indexId);

	List<IsdpTreepInfo> getWfTreepInfos(Map<String, Object> parameter);

	void insertTreepInfo(IsdpTreepInfo model);

	void updateTreepInfo(IsdpTreepInfo model);

}
