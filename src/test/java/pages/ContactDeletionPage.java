
package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificMethod;

public class ContactDeletionPage extends ProjectSpecificMethod{

	public ContactDeletionPage(WebDriver driver) throws IOException {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	  }
	
	    @FindBy(xpath="(//tr[@class='contactTableBodyRow']/td[2])[1]")
	    List<WebElement> nametobedelete;
	
	    @FindBy(id="delete")
	    WebElement deleteBtn;
	
	    @FindBy(xpath="//tr[@class='contactTableBodyRow']/td/following-sibling::td")
	    List<WebElement> seeAllDetails;
	
	public void clickforedit(String nametobedeleted) throws InterruptedException {
		
		List<WebElement> namedeletes=nametobedelete;
		Thread.sleep(2000);
		try {
			for(WebElement namedelete:namedeletes) {
			if(namedelete.getText().equalsIgnoreCase(nametobedeleted)) {
				namedelete.click();
			}			
		  }
		} catch (Exception e) {
			namedeletes=nametobedelete;
		}
	}
	
	public void clickondelete() {
		
		deleteBtn.click();
		driver.switchTo().alert().accept();
	}
	
	public void seeAllDetails() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement> details=seeAllDetails;
		for(WebElement detail:details) {
			wait.until(ExpectedConditions.visibilityOf(detail));
			System.out.println(detail.getText());
			Thread.sleep(2000);
		}
	}
}

