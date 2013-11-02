package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface MailSendAttMapper {

	void deleteMailSendAtts(MailSendAttQuery query);

	void deleteMailSendAttById(String id);

	MailSendAtt getMailSendAttById(String id);

	int getMailSendAttCount(Map<String, Object> parameter);

	int getMailSendAttCountByQueryCriteria(MailSendAttQuery query);

	List<MailSendAtt> getMailSendAtts(Map<String, Object> parameter);

	List<Map<String, Object>> getMailSendAttMapList(
			Map<String, Object> parameter);

	List<MailSendAtt> getMailSendAttsByQueryCriteria(MailSendAttQuery query);

	void insertMailSendAtt(MailSendAtt model);

	void updateMailSendAtt(MailSendAtt model);

}
