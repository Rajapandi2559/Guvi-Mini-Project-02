
package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.LogoutPage;

public class TS_007_LogoutTest extends ProjectSpecificMethod{

	public TS_007_LogoutTest() throws IOException {
		super();		
	  }
	
    	LoginPage loginpg;
     	LogoutPage logoutpg;
    	String email=configProperties.getProperty("email");
    	String password=configProperties.getProperty("password");

	@Test
	public void logoutfunctionality() throws IOException, InterruptedException {
		
		loginpg=new LoginPage(driver);
		Thread.sleep(3000);
		loginpg.enterEmail(email);
		Thread.sleep(1000);
		loginpg.enterPassword(password);
		Thread.sleep(1000);
		loginpg.submitbtn();
		Thread.sleep(1000);
		logoutpg=new LogoutPage(driver);
		Thread.sleep(1000);
		logoutpg.clickonlogout();
		Thread.sleep(3000);
		logoutpg.seeLoginPage();		
	}
}
