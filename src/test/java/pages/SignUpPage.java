
package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;
import junit.framework.Assert;

public class SignUpPage extends ProjectSpecificMethod {

	public SignUpPage(WebDriver driver) throws IOException {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	  }
	
	    @FindBy(id="signup")
	    WebElement signUp;
	
	    @FindBy(id="firstName")
	    WebElement fName;
	
 	    @FindBy(id="lastName")
	    WebElement lName;
	
	    @FindBy(id="email")
	    WebElement email;
	
	    @FindBy(id="password")
	    WebElement password;
	
	    @FindBy(id="submit")
	    WebElement submitBtn;
	
	public void signupBtn() {
		
		boolean signupvisible=signUp.isDisplayed();
		Assert.assertTrue(signupvisible);
		boolean signupclickable=signUp.isEnabled();
		Assert.assertTrue(signupclickable);
		signUp.click();
	  }
	
	public void seeTitle() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Add User");
	  }
	
	public void addUser(String fname,String lname,String Email, String pwd) {
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		email.sendKeys(Email);
		password.sendKeys(pwd);
	  }
	
	public void submit() {
	submitBtn.click();
   }
}
