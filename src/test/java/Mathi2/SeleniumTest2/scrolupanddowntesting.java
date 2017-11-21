package Mathi2.SeleniumTest2;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class scrolupanddowntesting {
@Test
	public void scrolltesting() throws InterruptedException
	
	{
		File file= new File("src/main/java/Drivers/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://w3.ibm.com");
		Thread.sleep(4000);
		JavascriptExecutor jse=  (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		
		
		
		
		
	}
}
