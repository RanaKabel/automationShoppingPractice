package ShoppingWebsitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
	
	WebDriver driver;
	private By emailAddressTxtLoc= By.id("email_create");
	private By creatAccountBtnLoc=By.xpath("//button[@id='SubmitCreate']");
	
	
	
	public AuthenticationPage (WebDriver driver) 
	{
		this.driver= driver;
	}
	
	public void clickCreateAccount(String emailAddress) {
		driver.findElement(emailAddressTxtLoc).sendKeys(emailAddress);
		driver.findElement(creatAccountBtnLoc).click();
		
	}

}
