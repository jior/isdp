package com.glaf.isdp.mapper;

import java.util.List;

import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.query.BaseTreeQuery;
import com.glaf.isdp.query.IsdpTreeQuery;

public interface IsdpTreeMapper {

	List<ITree> getBaseTreesByQueryCriteria(BaseTreeQuery query);

	List<ITree> getIsdpTreesByQueryCriteria(IsdpTreeQuery query);

}
