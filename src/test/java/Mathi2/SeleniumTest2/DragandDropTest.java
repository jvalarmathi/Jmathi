package Mathi2.SeleniumTest2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DragandDropTest {
	@Test
	public void Draganddroptest() throws InterruptedException
	{
		
		File file=new File("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/drag_drop.html");
		Thread.sleep(2000);
		
	WebElement From=driver.findElement(By.xpath(".//*[@id='credit2']/a"));
	WebElement To=driver.findElement(By.xpath(".//*[@id='bank']/li"));
				
		Actions act=new Actions(driver);
	act.dragAndDrop(From, To).build().perform();
	}

}
