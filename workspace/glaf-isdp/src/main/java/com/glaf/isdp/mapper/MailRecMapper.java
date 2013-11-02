package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface MailRecMapper {

	void deleteMailRecs(MailRecQuery query);

	void deleteMailRecById(String id);

	MailRec getMailRecById(String id);
	
	MailRec getMailRecByMessageId(String messageId);

	int getMailRecCount(Map<String, Object> parameter);

	int getMailRecCountByQueryCriteria(MailRecQuery query);

	List<MailRec> getMailRecs(Map<String, Object> parameter);

	List<Map<String, Object>> getMailRecMapList(Map<String, Object> parameter);

	List<MailRec> getMailRecsByQueryCriteria(MailRecQuery query);

	void insertMailRec(MailRec model);

	void updateMailRec(MailRec model);

}
