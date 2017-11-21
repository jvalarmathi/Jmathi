package Mathi2.SeleniumTest2;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scrollupanddown {
@Test
	public void ScrollupandDowntest() throws InterruptedException
	{
		File file=new File("src/main/java/Drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	JavascriptExecutor jse=  (JavascriptExecutor)driver;
jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
Thread.sleep(2000);
jse.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}
}
