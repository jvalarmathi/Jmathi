package Mathi2.SeleniumTest2;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownSelection {
	@Test
	
	public void DropdownTest() throws InterruptedException
	{
		File file =new File ("src/main/java/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
					if(driver.findElement(By.name("country")).isDisplayed());
		Select country=new Select (driver.findElement(By.name("country")));
		List<WebElement> elements=country.getOptions();
		System.out.println("Fruitsdropdownisvisible"+elements.size());
		
	/*	System.out.println(country.getOptions());
		country.selectByVisibleText("ANGOLA");*/
		
		driver.get("http://jsbin.com/osebed/2");
		
		try{
		if (driver.findElement(By.id("fruits")).isDisplayed());
			
			{
				Select fruits=new Select(driver.findElement(By.id("fruits")));
				List<WebElement> fruitsname=fruits.getOptions();
				//fruitsname.size();
				System.out.println("Dropddownisvisible"+fruitsname.size());
				
			}}
						catch(Throwable t){
				System.out.println("Dropdown is not visible");
			}
		
		/*fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		fruits.selectByValue("grape");
		fruits.selectByIndex(3);*/
		
		
	}

}
