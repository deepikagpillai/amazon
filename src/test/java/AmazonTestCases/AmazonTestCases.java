package AmazonTestCases;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseFunction.BaseClass;

public class AmazonTestCases extends BaseClass{
public WebDriver driver;
@BeforeMethod
public void initializeSetup()
     {
	driver=intiallizeBrowser();
     }
@Test
public void Tc001() 
    {
	String URL="https://www.amazon.com/";
	driver.get(URL);/*url of amazon loading method in selenium,get-selenium method
	driver already loaded the invoked browser-chrome*/
	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));// search box is a variable,webelement is a datatype
	searchbox.sendKeys("samsung");/* to search iphone */
	driver.findElement(By.id("nav-search-submit-button")).click();
	// driver.getCurrentUrl();
	/*driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.navigate().to("https://www.flipkart.com/");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
	driver.close();*/
    }
    }
 