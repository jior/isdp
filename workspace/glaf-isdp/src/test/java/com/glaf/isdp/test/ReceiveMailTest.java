package com.glaf.isdp.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.URLName;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.core.util.FileUtils;
import com.glaf.core.util.IOUtils;
import com.glaf.mail.util.MailUtils;
 

public class ReceiveMailTest {

	protected static final Log logger = LogFactory.getLog(ReceiveMailTest.class);

	private MimeMessage msg = null;
	private String saveAttchPath = "";
	private StringBuffer bodytext = new StringBuffer();
	private String dateFormat = "yyyy-MM-dd HH:mm";

	public ReceiveMailTest(MimeMessage msg) {
		this.msg = msg;
	}

	public void setMsg(MimeMessage msg) {
		this.msg = msg;
	}

	/**
	 * ��ȡ�����ʼ�����Ϣ
	 * 
	 * @return
	 * @throws MessagingException
	 */
	public String getFrom() throws MessagingException {
		InternetAddress[] address = (InternetAddress[]) msg.getFrom();
		String from = address[0].getAddress();
		if (from == null) {
			from = "";
		}
		String personal = address[0].getPersonal();
		if (personal == null) {
			personal = "";
		}
		String fromaddr = personal + "<" + from + ">";
		return fromaddr;
	}

	/**
	 * ��ȡ�ʼ��ռ��ˣ����ͣ����͵ĵ�ַ����Ϣ�����������ݵĲ�����ͬ "to"-->�ռ���,"cc"-->�����˵�ַ,"bcc"-->���͵�ַ
	 * 
	 * @param type
	 * @return
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 */
	public String getMailAddress(String type) throws MessagingException,
			UnsupportedEncodingException {
		String mailaddr = "";
		String addrType = type.toUpperCase();
		InternetAddress[] address = null;

		if (addrType.equals("TO") || addrType.equals("CC")
				|| addrType.equals("BCC")) {
			if (addrType.equals("TO")) {
				address = (InternetAddress[]) msg
						.getRecipients(Message.RecipientType.TO);
			}
			if (addrType.equals("CC")) {
				address = (InternetAddress[]) msg
						.getRecipients(Message.RecipientType.CC);
			}
			if (addrType.equals("BCC")) {
				address = (InternetAddress[]) msg
						.getRecipients(Message.RecipientType.BCC);
			}

			if (address != null) {
				for (int i = 0; i < address.length; i++) {
					String mail = address[i].getAddress();
					if (mail == null) {
						mail = "";
					} else {
						mail = MimeUtility.decodeText(mail);
					}
					String personal = address[i].getPersonal();
					if (personal == null) {
						personal = "";
					} else {
						personal = MimeUtility.decodeText(personal);
					}
					String compositeto = personal + "<" + mail + ">";
					mailaddr += "," + compositeto;
				}
				mailaddr = mailaddr.substring(1);
			}
		} else {
			throw new RuntimeException("Error email Type!");
		}
		mailaddr = MailUtils.convertString(mailaddr);
		return mailaddr;
	}

	/**
	 * ��ȡ�ʼ�����
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws MessagingException
	 */
	public String getSubject() throws UnsupportedEncodingException,
			MessagingException {
		String subject = "";
		if (msg.getSubject() != null) {
			String text = msg.getSubject();
			logger.debug("orgi:"+text);
			text = MimeUtility.decodeText(msg.getSubject());
			logger.debug("MimeUtility.decodeText:"+text);
			text = MailUtils.convertString(msg.getSubject());
			logger.debug("MailUtils.convertString:"+text);
			subject = text;
		}
		if (subject == null) {
			subject = "";
		}
		return subject;
	}

	/**
	 * ��ȡ�ʼ���������
	 * 
	 * @return
	 * @throws MessagingException
	 */
	public String getSendDate() throws MessagingException {
		Date sendDate = msg.getSentDate();
		SimpleDateFormat smd = new SimpleDateFormat(dateFormat);
		return smd.format(sendDate);
	}

	/**
	 * ��ȡ�ʼ���������
	 * 
	 * @return
	 */
	public String getBodyText() {
		return bodytext.toString();
	}

	/**
	 * �����ʼ������õ����ʼ����ݱ��浽һ��stringBuffer�����У������ʼ� ��Ҫ����MimeType�Ĳ�ִͬ�в�ͬ�Ĳ�����һ��һ���Ľ���
	 * 
	 * @param part
	 * @throws MessagingException
	 * @throws IOException
	 */
	public void getMailContent(Part part) throws MessagingException,
			IOException {
		String contentType = part.getContentType();
		int nameindex = contentType.indexOf("name");
		boolean conname = false;
		if (nameindex != -1) {
			conname = true;
		}
		logger.debug("CONTENTTYPE:" + contentType);
		if (part.isMimeType("text/plain") && !conname) {
			bodytext.append((String) part.getContent());
		} else if (part.isMimeType("text/html") && !conname) {
			bodytext.append((String) part.getContent());
		} else if (part.isMimeType("multipart/*")) {
			Multipart multipart = (Multipart) part.getContent();
			int count = multipart.getCount();
			for (int i = 0; i < count; i++) {
				getMailContent(multipart.getBodyPart(i));
			}
		} else if (part.isMimeType("message/rfc822")) {
			getMailContent((Part) part.getContent());
		}

	}

	/**
	 * �ж��ʼ��Ƿ���Ҫ��ִ�������ִ����true�����򷵻�false
	 * 
	 * @return
	 * @throws MessagingException
	 */
	public boolean getReplySign() throws MessagingException {
		boolean replySign = false;
		String needreply[] = msg.getHeader("Disposition-Notification-TO");
		if (needreply != null) {
			replySign = true;
		}
		return replySign;
	}

	/**
	 * ��ȡ���ʼ���message-id
	 * 
	 * @return
	 * @throws MessagingException
	 */
	public String getMessageId() throws MessagingException {
		return msg.getMessageID();
	}

	/**
	 * �жϴ��ʼ��Ƿ��Ѷ������δ���򷵻�false���Ѷ�����true
	 * 
	 * @return
	 * @throws MessagingException
	 */
	public boolean isNew() throws MessagingException {
		boolean isnew = false;
		Flags flags = ((Message) msg).getFlags();
		Flags.Flag[] flag = flags.getSystemFlags();
		logger.debug("flags's length:" + flag.length);
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == Flags.Flag.SEEN) {
				isnew = true;
				logger.debug("seen message .......");
				break;
			}
		}

		return isnew;
	}

	/**
	 * �ж����Ƿ��������
	 * 
	 * @param part
	 * @return
	 * @throws MessagingException
	 * @throws IOException
	 */
	public boolean isContainAttch(Part part) throws MessagingException,
			IOException {
		boolean flag = false;
		if (part.isMimeType("multipart/*")) {
			Multipart multipart = (Multipart) part.getContent();
			int count = multipart.getCount();
			for (int i = 0; i < count; i++) {
				BodyPart bodypart = multipart.getBodyPart(i);
				String dispostion = bodypart.getDisposition();
				if ((dispostion != null)
						&& (dispostion.equals(Part.ATTACHMENT) || dispostion
								.equals(Part.INLINE))) {
					flag = true;
				} else if (bodypart.isMimeType("multipart/*")) {
					flag = isContainAttch(bodypart);
				} else {
					String conType = bodypart.getContentType();
					if (conType.toLowerCase().indexOf("appliaction") != -1) {
						flag = true;
					}
					if (conType.toLowerCase().indexOf("name") != -1) {
						flag = true;
					}
				}
			}
		} else if (part.isMimeType("message/rfc822")) {
			flag = isContainAttch((Part) part.getContent());
		}

		return flag;
	}

	/**
	 * ���渽��
	 * 
	 * @param part
	 * @throws MessagingException
	 * @throws IOException
	 */
	public void saveAttachment(Part part) throws MessagingException,
			IOException {
		String filename = "";
		if (part.isMimeType("multipart/*")) {
			Multipart mp = (Multipart) part.getContent();
			for (int i = 0; i < mp.getCount(); i++) {
				BodyPart mpart = mp.getBodyPart(i);
				String dispostion = mpart.getDisposition();
				if ((dispostion != null)
						&& (dispostion.equals(Part.ATTACHMENT) || dispostion
								.equals(Part.INLINE))) {
					filename = mpart.getFileName();
					if (filename.toLowerCase().indexOf("gb2312") != -1) {
						filename = MimeUtility.decodeText(filename);
					}
					// saveFile(filename, mpart.getInputStream());
					filename = MailUtils.convertString(filename);
					logger.debug("filename=" + filename);
				} else if (mpart.isMimeType("multipart/*")) {
					saveAttachment(mpart);
				} else {
					filename = mpart.getFileName();
					if (filename != null
							&& (filename.toLowerCase().indexOf("gb2312") != -1)) {
						filename = MimeUtility.decodeText(filename);
					}
					filename = MailUtils.convertString(filename);
					// saveFile(filename, mpart.getInputStream());
					logger.debug("filename=" + filename);
				}
			}

		} else if (part.isMimeType("message/rfc822")) {
			saveAttachment((Part) part.getContent());
		}
	}

	/**
	 * ��ñ��渽���ĵ�ַ
	 * 
	 * @return
	 */
	public String getSaveAttchPath() {
		return saveAttchPath;
	}

	/**
	 * ���ñ��渽����ַ
	 * 
	 * @param saveAttchPath
	 */
	public void setSaveAttchPath(String saveAttchPath) {
		this.saveAttchPath = saveAttchPath;
	}

	/**
	 * �������ڸ�ʽ
	 * 
	 * @param dateFormat
	 */
	public void setDateformate(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	/**
	 * �����ļ�����
	 * 
	 * @param filename
	 * @param inputStream
	 * @throws IOException
	 */
	public void saveFile(String filename, InputStream inputStream)
			throws IOException {
		if (filename == null) {
			return;
		}
		String osname = System.getProperty("os.name");
		String storedir = getSaveAttchPath();
		String sepatror = "";
		if (osname == null) {
			osname = "";
		}

		if (osname.toLowerCase().indexOf("win") != -1) {
			sepatror = "//";
			if (storedir == null || "".equals(storedir)) {
				storedir = "c://temp";
			}
		} else {
			sepatror = "/";
			storedir = "/temp";
		}

		filename = MailUtils.convertString(filename);
		filename = FileUtils.replaceWin32FileName(filename);
		logger.debug("filename:" + filename);
		File storeDir = new File(storedir);
		FileUtils.mkdirsWithExistsCheck(storeDir);
		File storefile = new File(storedir + sepatror + filename);

		logger.debug("store file's path:" + storefile.toString());

		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;

		try {
			bos = new BufferedOutputStream(new FileOutputStream(storefile));
			bis = new BufferedInputStream(inputStream);
			int c;
			while ((c = bis.read()) != -1) {
				bos.write(c);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeStream(bis);
			IOUtils.closeStream(bos);
		}
	}

	public void recive(Part part, int i) throws MessagingException, IOException {
		logger.debug("------------------START-----------------------");
		logger.debug("Message" + i + " subject:" + getSubject());
		logger.debug("Message" + i + " from:" + getFrom());
		logger.debug("Message" + i + " isNew:" + isNew());
		boolean flag = isContainAttch(part);
		logger.debug("Message" + i + " isContainAttch:" + flag);
		logger.debug("Message" + i + " replySign:" + getReplySign());
		getMailContent(part);
		//logger.debug("Message" + i + " content:" + getBodyText());

		if (flag) {
			saveAttachment(part);
		}
		logger.debug("------------------END-----------------------");
	}

	public static void main(String[] args) throws MessagingException,
			IOException {
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", "smtp.163.com");
		props.setProperty("mail.smtp.auth", "true");
		Session session = Session.getDefaultInstance(props, null);
		// URLName urlname = new URLName("pop3", "pop3.163.com", 110, null,
		// "cinsoft2013@163.com", "cinsoft@2013");

		URLName urlname = new URLName("pop3", "mail.gzgi.com", 110, null,
				"joy.huang@gzgi.com", "joy");

		Store store = session.getStore(urlname);
		store.connect();
		Folder folder = store.getFolder("INBOX");
		folder.open(Folder.READ_ONLY);
		Message msgs[] = folder.getMessages();
		int count = msgs.length;
		logger.debug("Message Count:" + count);
		ReceiveMailTest rm = null;
		for (int i = 0; i < count; i++) {
			rm = new ReceiveMailTest((MimeMessage) msgs[i]);
			rm.setSaveAttchPath("c:/temp/" + i);
			rm.recive(msgs[i], i);
		}

	}

}