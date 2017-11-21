package Mathi2.SeleniumTest2;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Objects.GmailLoginPage;

public class Alertandpopup {
	protected WebDriver driver;
	@Test
	public void AlertTest() throws Exception
	{
		File file= new File ("src/main/java/Drivers/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		GmailLoginPage gmail=new GmailLoginPage(driver);
	    gmail.Gmail();
		gmail.Next();
		gmail.Password();
		gmail.PNext();
		gmail.Compose();
		gmail.Send();
		Thread.sleep(2000);	
		Alert alert=driver.switchTo().alert();
		alert.accept();
			}

}
