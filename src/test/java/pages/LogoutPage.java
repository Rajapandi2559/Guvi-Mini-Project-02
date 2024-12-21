
package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;
import junit.framework.Assert;

public class LogoutPage extends ProjectSpecificMethod{

	public LogoutPage(WebDriver driver) throws IOException {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	  }
	
	    @FindBy(id="logout")
	    WebElement logoutbtn;

	    @FindBy(xpath="//p[text()='Log In:']")
	    WebElement loginPage;
	
	public void clickonlogout() {
		
		logoutbtn.click();
	  }
	
	public void seeLoginPage() {
		
		String msg=loginPage.getText();
		Assert.assertEquals("Log In:", msg);
	  }	
   }
