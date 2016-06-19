package comgilbut;
import javax.xml.ws.FaultAction;

import org.apache.commons.mail.*;
import org.apache.log4j.*;
public class SimpleEmailExample {
	private static Logger logger = Logger.getLogger(SimpleEmailExample.class);
	
	public static void main(String[] args) {
		SimpleEmailExample emailExample = new SimpleEmailExample();
		emailExample.testEmail();
	}

	public SimpleEmailExample() {
		// TODO Auto-generated constructor stub
	}
	private void testEmail() {
		long beginTime = System.currentTimeMillis();
		SimpleEmail simpleEmail = new SimpleEmail();
		
		simpleEmail.setHostName("smtp.gmail.com");
		simpleEmail.setSmtpPort(587);
		simpleEmail.setAuthentication("byungboor", "********");
		String rt = "Failure";
		try{
			
			 simpleEmail.setSSL(true);
			 simpleEmail.setTLS(true);
			 simpleEmail.addTo("byungboor@empal.com","Byungboor Kim","utf-8");
			 simpleEmail.setFrom("byungboor@gmail.com","Benjamin kim","utf-8");
			 simpleEmail.setSubject("This is a simple email for a test");
			 simpleEmail.setMsg("To whom it may concern \n\n This is simple message"
			 		+ "for a test \n\n Regards \n Kyuhun Kim.");
			 rt = simpleEmail.send();
		}catch(EmailException e){
			logger.warn("Error",e);
		}finally {
			long execTime = System.currentTimeMillis()-beginTime;
			logger.info("exec time:"+execTime+"ms");
			logger.info("Rt Msg:"+rt);
		}
	}
}
