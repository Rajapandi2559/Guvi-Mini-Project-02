
package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod  {

	public LoginPage(WebDriver driver) throws IOException {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	  }
	
	     @FindBy(id="email")
	     WebElement enterEmail;
	
	     @FindBy(id="password")
	     WebElement enterPassword;
	
	     @FindBy(id="submit")
	     WebElement Submit;

    public void enterEmail(String email) {
	     enterEmail.sendKeys(email);
      }

    public void enterPassword(String pass) {
	     enterPassword.sendKeys(pass);
      }

    public void submitbtn() {
	     Submit.click();
      }
   }
