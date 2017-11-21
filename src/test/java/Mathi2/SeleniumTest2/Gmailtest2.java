package Mathi2.SeleniumTest2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Objects.GmailLoginPage;

public class Gmailtest2 {
	protected WebDriver driver;
	@Test
	public void Gtest() throws Exception{
	/*File file = new File("src/main/java/Drivers/IEDriverServer.exe");
	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	WebDriver driver=new InternetExplorerDriver();*/
	File file = new File("src/main/java/Drivers/geckodriver.exe");
	System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
	WebDriver driver = new FirefoxDriver();
	/*File file = new File("src/main/java/Drivers/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	WebDriver driver=new ChromeDriver();*/
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
    
    	GmailLoginPage gmailid=new GmailLoginPage(driver);
    	gmailid.Gmail();
		gmailid.Next();
		gmailid.Password();
		gmailid.PNext();
		/*gmailid.Compose();
		gmailid.To();
		gmailid.Subject();
		gmailid.Body();
		gmailid.Send();*/
		gmailid.More();
		gmailid.Spam();
		gmailid.SelectAll();
		gmailid.Unread();
		gmailid.Delete();
				
	}
}
