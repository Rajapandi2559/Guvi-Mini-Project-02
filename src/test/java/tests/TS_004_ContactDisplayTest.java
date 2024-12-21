
package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;

import pages.ContactDisplayPage;
import pages.LoginPage;

public class TS_004_ContactDisplayTest extends ProjectSpecificMethod{

	public TS_004_ContactDisplayTest() throws IOException {
		super();		
	  }
		
	    LoginPage loginpg;
    	ContactDisplayPage contactdisplaypg;
    	String email=configProperties.getProperty("email");
    	String password=configProperties.getProperty("password");
	
	@Test
	public void seeContactDetails() throws IOException, InterruptedException {
		
		loginpg=new LoginPage(driver);
		Thread.sleep(3000);
		loginpg.enterEmail(email);
		Thread.sleep(1000);
		loginpg.enterPassword(password);
		Thread.sleep(1000);
		loginpg.submitbtn();
		Thread.sleep(1000);
		contactdisplaypg=new ContactDisplayPage(driver);
		Thread.sleep(1000);
		contactdisplaypg.seeAllDetails();
		Thread.sleep(1000);
		contactdisplaypg.seeContact();
		Thread.sleep(1000);
		contactdisplaypg.verifyPhoneNumberFormat();
		Thread.sleep(1000);
		contactdisplaypg.seeAlphabetical();		
	}	
}
