package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Alertpage {
	public Alertpage(WebDriver driver) throws Exception {
		//super(driver);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}
	@FindBy(name="cusid")
	WebElement cusid;
	@FindBy(name="submit")
	WebElement Submit;
	
	public void cusid()
	{
		cusid.sendKeys("123");
	}
	
	public void Submit()
	{
		Submit.click();
	}
}
