package com.glaf.isdp.test;

import java.io.InputStream;
import java.util.ArrayList;

import java.util.List;
import java.util.Properties;

import org.apache.commons.io.input.ReaderInputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.net.pop3.POP3Client;
import org.apache.commons.net.pop3.POP3MessageInfo;

import com.glaf.core.util.FileUtils;

public class FetchPopMailTest {
	protected static final Log logger = LogFactory
			.getLog(FetchPopMailTest.class);

	public static void main(String[] args) throws Exception {
		FetchPopMailTest test = new FetchPopMailTest();
		test.fetchMail("mail.gzgi.com", "joy.huang@gzgi.com", "joy",
				"c:\\temp", false);
	}

	public int fetchMail(String pop3Server, String user, String pwd,
			String savePath, boolean deleteAfterGet) throws Exception {
		int count = 0;
		POP3Client pop = new POP3Client();
		pop.connect(pop3Server);
		pop.login(user, pwd);
		pop.setState(POP3Client.TRANSACTION_STATE);
		POP3MessageInfo[] messages = pop.listUniqueIdentifiers();
		if (messages == null) {
			throw new RuntimeException("用户没有通过认证，请检查您的用户名和密码。");
		}
		List<POP3MessageInfo> received = new ArrayList<POP3MessageInfo>();
		for (int i = 0; i < messages.length; i++) {
			POP3MessageInfo messageInfo = messages[i];
			String messageId = messageInfo.identifier;
			logger.debug("Id:" + messageId);
			logger.debug("Number:" + messageInfo.number);
			logger.debug("Size:" + messageInfo.size);

			if (messageId == null) {
				continue;
			}
			if (messageInfo.size > 20480000) {
				continue;
			}

			InputStream inputStream = new ReaderInputStream(
					pop.retrieveMessage(messages[i].number));
			Properties props = new Properties();
			props.put("mail.pop3.host", "abcd.com");
			// Session session = Session.getInstance(props);
			// MimeMessage mimeMessage = new MimeMessage(session, inputStream);
			FileUtils.save(savePath + "/" + messageId + ".eml", inputStream);
			logger.debug("save: " + savePath + "/" + messageId + ".eml");
			inputStream.close();
			inputStream = null;

			received.add(messages[i]);

			count++;
		}
		if (received.size() > 0) {
			if (deleteAfterGet) {
				for (POP3MessageInfo element : received) {
					pop.deleteMessage(element.number);
				}
			}
		}
		received = null;
		pop.logout();
		pop.disconnect();
		return count;
	}

}
