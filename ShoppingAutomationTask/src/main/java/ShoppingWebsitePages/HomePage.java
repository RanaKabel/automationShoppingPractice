package ShoppingWebsitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private String siteURL= "http://automationpractice.com/index.php";
	WebDriver driver;
	private By signInLoc= By.xpath("//*[contains(text(),'Sign in')]");
	
	public HomePage (WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void navigateToUrl() {
		driver.navigate().to(siteURL);
	}
	
	public void clickSignIn () {
		driver.findElement(signInLoc).click();
	}

}
