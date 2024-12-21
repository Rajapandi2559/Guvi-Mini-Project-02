
package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class ContactEditingPage  extends ProjectSpecificMethod{

	public ContactEditingPage(WebDriver driver) throws IOException {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	   }
	
	    @FindBy(xpath="(//tr[@class='contactTableBodyRow']/td[2])[1]")
	    WebElement dob;
	
	    @FindBy(id="edit-contact")
	    WebElement contact;
	
	    @FindBy(id="firstName")
	    WebElement fname;
	
	    @FindBy(id="lastName")
	    WebElement lname;
	
	    @FindBy(id="email")
	    WebElement Email;
	
	    @FindBy(id="submit")
	    WebElement Submit;
	    
	    @FindBy(id="return")
	    WebElement Return;
		
	public void clickforedit() {
		dob.click();
	  }
	public void clickOnEditContactBtn() {
		contact.click();
	 }
	public void addEditDetails(String fnames,String lnames,String email) {
		
		fname.clear();
		fname.sendKeys(fnames);
		lname.clear();
		lname.sendKeys(lnames);
		Email.clear();
		Email.sendKeys(email);
	  }
	
	public void clickonsubmit() {
		Submit.click();
		//driver.switchTo().alert().dismiss();
	  }
	
	public void clickonreturn() {
		Return.click();
	  }
   }
