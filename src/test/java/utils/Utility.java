
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	public static WebDriver driver;
	public static Properties configProperties;
	public static WebDriverWait wait;
	public Logger logger;
	public Alert alert;
	String path=System.getProperty("user.dir")+"\\Resources\\Config.properties";
	
	public Utility() throws IOException {
		
		configProperties=new Properties();
		FileInputStream fs = new FileInputStream(path);
		configProperties.load(fs);
	}
	
	public void LaunchBrowser() {
		
		String browserName=configProperties.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
        }
	
    public void closing() {
		driver.close();
	}

    public static WebElement  elementClickWait(WebElement ele, int duration) {
	wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
	return wait.until(ExpectedConditions.visibilityOf(ele));
    }	
}
