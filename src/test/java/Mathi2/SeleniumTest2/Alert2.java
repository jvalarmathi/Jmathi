package Mathi2.SeleniumTest2;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objects.Alertpage;

public class Alert2 {
	@Test(priority=1)
	public void Alert2Test() throws Exception
	{
File file = new File("src/main/java/Drivers/chromedriver.exe");
System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/selenium/delete_customer.php");

Alertpage alerttest= new Alertpage(driver);
alerttest.cusid();
alerttest.Submit();
Thread.sleep(2000);
driver.switchTo().alert().accept();
Thread.sleep(2000);
String alertmessage=driver.switchTo().alert().getText();
System.out.println(alertmessage);
Thread.sleep(2000);
driver.switchTo().alert().accept();


	}
	
}
