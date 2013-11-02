package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface MailNewMapper {

	void deleteMailNews(MailNewQuery query);

	void deleteMailNewById(String id);

	MailNew getMailNewById(String id);

	int getMailNewCount(Map<String, Object> parameter);

	int getMailNewCountByQueryCriteria(MailNewQuery query);

	List<MailNew> getMailNews(Map<String, Object> parameter);

	List<Map<String,Object>> getMailNewMapList(Map<String, Object> parameter);

	List<MailNew> getMailNewsByQueryCriteria(MailNewQuery query);

	void insertMailNew(MailNew model);

	void updateMailNew(MailNew model);

}
