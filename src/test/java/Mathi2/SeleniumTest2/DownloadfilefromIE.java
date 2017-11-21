package Mathi2.SeleniumTest2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DownloadfilefromIE {
	public static String downloadpath="C:/Users/IBM_ADMIN/Documents/Selenium";
	@Test
	public void DownloadfileTest()
	{
		//File file = new File ("src/main/java/Drivers/IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
		File file = new File ("src/main/java/Drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",file.getAbsolutePath());
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[ contains(text(),'smilechart.xls')]")).click();
		
		
	}

}
