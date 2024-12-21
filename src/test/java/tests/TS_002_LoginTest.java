
package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TS_002_LoginTest extends ProjectSpecificMethod{

	public TS_002_LoginTest() throws IOException {
		super();		
	  }
	
	    LoginPage loginpg;
	    String email=configProperties.getProperty("email");
	    String password=configProperties.getProperty("password");
	
	@Test
	public void login() throws IOException, InterruptedException {
		
		loginpg=new LoginPage(driver);
		Thread.sleep(2000);
		loginpg.enterEmail(email);
		Thread.sleep(1000);
		loginpg.enterPassword(password);
		Thread.sleep(1000);
		loginpg.submitbtn();		
	}
}
