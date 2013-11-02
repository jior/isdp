package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface MailSendMapper {

	void deleteMailSends(MailSendQuery query);

	void deleteMailSendById(String id);

	MailSend getMailSendById(String id);

	int getMailSendCount(Map<String, Object> parameter);

	int getMailSendCountByQueryCriteria(MailSendQuery query);

	List<MailSend> getMailSends(Map<String, Object> parameter);

	List<Map<String, Object>> getMailSendMapList(Map<String, Object> parameter);

	List<MailSend> getMailSendsByQueryCriteria(MailSendQuery query);

	void insertMailSend(MailSend model);

	void updateMailSend(MailSend model);

}
