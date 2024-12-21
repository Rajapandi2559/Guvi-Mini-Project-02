
package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.ContactAdditionPage;
import pages.LoginPage;

public class TS_003_ContactAdditionTest extends ProjectSpecificMethod{

	public TS_003_ContactAdditionTest() throws IOException {
		super();
	  }
	
	    LoginPage loginpg;
	    ContactAdditionPage contactpg;
	    String email=configProperties.getProperty("email");
	    String password=configProperties.getProperty("password");
	    String firstname=configProperties.getProperty("Firstname");
      	String lastname=configProperties.getProperty("Lastname");
    	String birthdate=configProperties.getProperty("dOB");
    	String Emaill=configProperties.getProperty("Email");
    	String phone=configProperties.getProperty("phone");
     	String Street1=configProperties.getProperty("street1");
    	String Street2=configProperties.getProperty("street2");
    	String City=configProperties.getProperty("city");
    	String state=configProperties.getProperty("state");
    	String Pcode=configProperties.getProperty("pincode");
    	String Country=configProperties.getProperty("country");
	
	@Test
	public void addContact() throws IOException, InterruptedException {
		
		loginpg=new LoginPage(driver);
		Thread.sleep(2000);
		loginpg.enterEmail(email);
		Thread.sleep(1000);
		loginpg.enterPassword(password);
		Thread.sleep(1000);
		loginpg.submitbtn();
		Thread.sleep(1000);
		contactpg=new ContactAdditionPage(driver);
		Thread.sleep(1000);
		contactpg.addnewContact();
		Thread.sleep(1000);
		contactpg.addContactDetails(firstname, lastname, birthdate, Emaill, phone,Street1, Street2, City, state, Pcode, Country);
		Thread.sleep(1000);	
		contactpg.clickOnsubmit();
		Thread.sleep(1000);	
		contactpg.seeDOBmsg();		
	}
}



