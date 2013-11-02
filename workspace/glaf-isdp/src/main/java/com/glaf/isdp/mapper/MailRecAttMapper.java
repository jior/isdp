package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface MailRecAttMapper {

	void deleteMailRecAtts(MailRecAttQuery query);

	void deleteMailRecAttById(String id);

	MailRecAtt getMailRecAttById(String id);

	int getMailRecAttCount(Map<String, Object> parameter);

	int getMailRecAttCountByQueryCriteria(MailRecAttQuery query);

	List<MailRecAtt> getMailRecAtts(Map<String, Object> parameter);

	List<Map<String, Object>> getMailRecAttMapList(Map<String, Object> parameter);

	List<MailRecAtt> getMailRecAttsByQueryCriteria(MailRecAttQuery query);

	void insertMailRecAtt(MailRecAtt model);
	
	void insertMailRecAtt_postgres(MailRecAtt model);

	void updateMailRecAtt(MailRecAtt model);

}
