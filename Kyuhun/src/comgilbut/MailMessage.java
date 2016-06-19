package comgilbut;

public class MailMessage {
	private String mailFrom;
	private String mailTo;
	private String mailSubject,mailbody;
	public MailMessage() {
		// TODO Auto-generated constructor stub
	}
	public String getMailFrom() {
		return mailFrom;
	}
	public String getMailTo() {
		return mailTo;
	}
	public String getMailSubject() {
		return mailSubject;
	}
	public String getMailbody() {
		return mailbody;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}
	public void setMailbody(String mailbody) {
		this.mailbody = mailbody;
	}
	
}
