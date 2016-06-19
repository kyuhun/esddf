package comgilbut;
import org.apache.commons.mail.*;
import org.apache.log4j.*;
import comgilbut.GilbutConst;;
public class MailSender {
	private static Logger logger = Logger.getLogger(MailSender.class);
	
	private String smtpHost;
	private int smtpPort;
	private String smtpUser,smtpPassword;
	private boolean isTLS = false;
	
	public MailSender(String smtpHost,int smtpPort,String smtpUser,String smtpPassword) {
		this.smtpHost= smtpHost;
		this.smtpPort = smtpPort;
		this.smtpUser = smtpUser;
		this.smtpPassword = smtpPassword;
		
	}
	public int send(MailMessage msg){
		int rt = GilbutConst.RT_INTERNAL_ERROR;
		if(msg == null)
		{
			logger.info("MailMessage object is  null");
			return GilbutConst.RT_WRONG_PARAMETER;
		}
	
	Email mail = new SimpleEmail();
	mail.setDebug(true);
	mail.setHostName(smtpHost);
	mail.setSmtpPort(smtpPort);
	mail.setTLS(isTLS);
	if(smtpUser != null && smtpPassword != null)
		mail.setAuthentication(smtpUser, smtpPassword);
		
		mail.setSubject(msg.getMailSubject());
		try{
				mail.setFrom(msg.getMailFrom());
				mail.setMsg(msg.getMailbody());
				mail.addTo(msg.getMailTo());
				mail.send();
				rt = GilbutConst.RT_SUCCESS;
				
			
		}
		catch(EmailException e)
		{ 
			logger.warn("Email Error",e);
			rt = GilbutConst.RT_MAIL_ERROR;
		}
		return rt;
	}
}