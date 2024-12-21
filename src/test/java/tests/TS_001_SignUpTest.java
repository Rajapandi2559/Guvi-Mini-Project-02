
package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.SignUpPage;

public class TS_001_SignUpTest extends ProjectSpecificMethod {

	public TS_001_SignUpTest() throws IOException {
		super();		
	}
	
	    SignUpPage signup;
	    String fName=configProperties.getProperty("FirstName");
	    String lName=configProperties.getProperty("LastName");
	    String email=configProperties.getProperty("email");
	    String password=configProperties.getProperty("password");

	@Test
	public void SignUpToContactList() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		signup=new SignUpPage(driver);
		Thread.sleep(1000);
		signup.signupBtn();
		Thread.sleep(1000);
		signup.seeTitle();
		signup.addUser(fName, lName, email, password);
		Thread.sleep(1000);
		signup.submit();		
	}
}
