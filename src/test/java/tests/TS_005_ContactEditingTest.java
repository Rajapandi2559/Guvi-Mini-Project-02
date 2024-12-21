
package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.ContactEditingPage;
import pages.LoginPage;

public class TS_005_ContactEditingTest extends ProjectSpecificMethod{

	public TS_005_ContactEditingTest() throws IOException {
		super();		
	  }
	
      	LoginPage loginpg;
    	ContactEditingPage contacteditpage;
    	String email=configProperties.getProperty("email");
	    String password=configProperties.getProperty("password");
     	String efirstname=configProperties.getProperty("editfirstname");
	    String elastname=configProperties.getProperty("editlastname");
	    String edob=configProperties.getProperty("editdOB");
    	String eemail=configProperties.getProperty("editemail");
	
	@Test
	public void editContact() throws InterruptedException, IOException {
		
		loginpg=new LoginPage(driver);
		Thread.sleep(3000);
		loginpg.enterEmail(email);
		Thread.sleep(1000);
		loginpg.enterPassword(password);
		Thread.sleep(1000);
		loginpg.submitbtn();
		Thread.sleep(1000);
		contacteditpage=new ContactEditingPage(driver);
		Thread.sleep(1000);
		contacteditpage.clickforedit();
		Thread.sleep(1000);
		contacteditpage.clickOnEditContactBtn();
		Thread.sleep(1000);
		contacteditpage.addEditDetails(efirstname, elastname, eemail);
		Thread.sleep(1000);
		contacteditpage.clickonsubmit();		
		Thread.sleep(1000);
		contacteditpage.clickonreturn();
		Thread.sleep(500);
	}
}
