package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class GmailLoginPage {
	public GmailLoginPage(WebDriver driver) throws Exception {
		//super(driver);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		}
	@FindBy(id="identifierId")
	WebElement gmailid;
	@FindBy(id="identifierNext")
	WebElement Next;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(id="passwordNext")
	WebElement Pnext;
	@FindBy(xpath=".//*[contains(text(),'COMPOSE')]")
	WebElement Compose;
	@FindBy(name="to")
	WebElement To;
	@FindBy(name="subjectbox")
	WebElement Subject;
	@FindBy(xpath="//*[contains(@class,'Am Al editable')]")
	WebElement Body;
	@FindBy(xpath="//*[contains(@class,'T-I J-J5-Ji aoO T-I-atl L3')]")
	WebElement Send;
	@FindBy(className="CJ")
	WebElement More;
	@FindBy(xpath="//*[contains(@title,'Spam')]")
	WebElement Spam;
	@FindBy(id=":lg")
	WebElement Selectall;
	@FindBy(id=":t8")
	WebElement Unread;
	@FindBy(xpath=".//*[@id=':5']/div[2]/div[1]/div[1]/div/div/div[2]/div/div")
	WebElement Delete;
		
	
		
	public void Gmail()
	{
	gmailid.sendKeys("jvalar1@gmail.com");
	}
	public void Next() throws InterruptedException
	{
		Next.click();
		Thread.sleep(2000);
			}
	
	public void Password()
	{
		Password.sendKeys("naksha1970");
	}
	
	public void PNext() throws InterruptedException
	{
		Pnext.click();
		Thread.sleep(4000);
	}
	
	public void Compose()
	{
		Compose.click();
	}
		
public void To()
{
	To.sendKeys("jvalar1@gmail.com");
	}
public void Subject() throws InterruptedException
{
Subject.sendKeys("SubjectTest");	
Thread.sleep(2000);
}

public void Body()
{
 Body.sendKeys("BodyTest");
	
	}
public void Send()
{
			Send.click();
	}

public void More() throws InterruptedException

{
	More.click();
	Thread.sleep(2000);
	}
public void Spam() throws InterruptedException
{
	Spam.click();
	Thread.sleep(2000);
}
public void SelectAll()
{
	Selectall.click();
	}

public void Unread()
{
	Unread.click();
}

public void Delete()
{
	Delete.click();
}

}




