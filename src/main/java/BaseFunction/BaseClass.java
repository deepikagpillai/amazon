package BaseFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass /*to set ppty for entire test */
    {
	public WebDriver driver;/*creating object for webdriver*/
	public WebDriver intiallizeBrowser()/*to open browser*/
    {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Amazon\\src\\main\\resources\\Drivers\\chromedriver.exe");
             /*system.setppty-javamethod used to set path of file ,
               system - class, setproperty-static method
               parameters- which driver we are calling and there path*/
		driver=new ChromeDriver();/*invoking chromedriver*/
		return driver;
	}
	}


