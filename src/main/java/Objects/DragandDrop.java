package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DragandDrop {
	public DragandDrop(WebDriver driver) throws Exception {
		//super(driver);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}
	
	@FindBy(xpath=".//*[@id='credit2']/a")
	WebElement From;
	@FindBy(xpath=".//*[@id='bank']/li")
	WebElement To;		
	
}
