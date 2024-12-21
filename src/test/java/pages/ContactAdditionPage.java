
package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class ContactAdditionPage extends ProjectSpecificMethod {

	public ContactAdditionPage(WebDriver driver) throws IOException {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	  }

	    @FindBy(id="add-contact")
	    WebElement addNewContact;
	
	    @FindBy(id="firstName")
	    WebElement firstname;
	
	    @FindBy(id="lastName")
	    WebElement lastname;
	
	    @FindBy(id="birthdate")
	    WebElement birthdate;
	
	    @FindBy(id="email")
	    WebElement Emaill;
	
	    @FindBy(id="phone")
	    WebElement Phone;
	
	    @FindBy(id="street1")
	    WebElement Street1;
	
	    @FindBy(id="street2")
	    WebElement Street2;
	
	    @FindBy(id="city")
	    WebElement City;
	
	    @FindBy(id="stateProvince")
	    WebElement state;
	
	    @FindBy(id="postalCode")
	    WebElement pcode;
	
	    @FindBy(id="country")
	    WebElement Country;
	
	    @FindBy(id="submit")
	    WebElement submit;
	
	    @FindBy(id="error")
	    WebElement errorDOBmsg;
	
	public void addnewContact() {
		addNewContact.click();
	  }
	
	public void addContactDetails(String Firstname, String Lastname,String dOB,String Email,String phone,
			String street1,String street2,String city,String State,String Pcode,String country) {
		
		firstname.sendKeys(Firstname);
		lastname.sendKeys(Lastname);
		birthdate.sendKeys(dOB);
		Emaill.sendKeys(Email);
		Phone.sendKeys(phone);
		Street1.sendKeys(street1);
		Street2.sendKeys(street2);
		City.sendKeys(city);
		state.sendKeys(State);
		pcode.sendKeys(Pcode);
		Country.sendKeys(country);
	}
	public void clickOnsubmit() {
		submit.click();
    }
	public void seeDOBmsg() {
		try {
		String msg=errorDOBmsg.getText();
		if(msg.contains("Birthdate is invalid")) {
			System.out.println("Wrong birth date format given");
		}
	} catch (Exception e) {
		e.printStackTrace();
	    }
	}
}

