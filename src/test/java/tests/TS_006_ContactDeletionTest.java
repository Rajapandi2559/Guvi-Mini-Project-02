
package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.ContactDeletionPage;
import pages.LoginPage;

public class TS_006_ContactDeletionTest extends ProjectSpecificMethod{

	public TS_006_ContactDeletionTest() throws IOException {
		super();		
	  }
	
    	LoginPage loginpg;
    	ContactDeletionPage contactdeletepg;
    	String email=configProperties.getProperty("email");
    	String password=configProperties.getProperty("password");
    	String deletecontact=configProperties.getProperty("deletecontact");
	
	@Test
	public void deleteContact() throws InterruptedException, IOException {
		
		loginpg=new LoginPage(driver);
		Thread.sleep(3000);
		loginpg.enterEmail(email);
		Thread.sleep(1000);
		loginpg.enterPassword(password);
		Thread.sleep(1000);
		loginpg.submitbtn();
		Thread.sleep(3000);
		contactdeletepg=new ContactDeletionPage(driver);
		Thread.sleep(1500);
		contactdeletepg.clickforedit(deletecontact);
		Thread.sleep(1500);
		contactdeletepg.clickondelete();
		Thread.sleep(1000);
		contactdeletepg.seeAllDetails();		
	}
}
