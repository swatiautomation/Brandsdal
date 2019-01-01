package Email_Configuration;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail 
{

   public static void main(String[] args) throws EmailException 
   
   {
	
	  System.out.println("==============Test Started===============");
	  sendemail();
	  System.out.println(("==============Test Ended==============="));
	   
	   
   }
	  
   public static void sendemail() throws EmailException
   {
	   Email email = new SimpleEmail();
	   email.setHostName("smtp.office365.com");
	   email.setSmtpPort(587);
	   //email.setAuthenticator(new DefaultAuthenticator("Pankaj.Mehta", "Hc3SUWn6"));
	   email.setAuthenticator(new DefaultAuthenticator("pankaj.mehta@espire.com", "Hc3SUWn6"));
	   email.setSSLOnConnect(true);
	   email.setFrom("pankaj.mehta@espire.com");
	   email.setSubject("Test Mailfor fuji reports");
	   email.setMsg("This is a test mail ... :-)");
	   email.addTo("swati.sharma@espire.com");
	   email.send();
   
   }
     








}
