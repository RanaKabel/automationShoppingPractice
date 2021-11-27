package ShoppingWebsitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {
	
	private By welcomeAccountLoc= By.xpath("//p[contains(text(),'Welcome to your account')]");
	
	WebDriver driver;
	
	private By womenCategoryLoc= By.xpath("//a[@title='Women']");
	private By blousesSubCategoryLoc= By.xpath("//a[@title='Blouses']");
	
	
	
	
	public MyAccountPage (WebDriver driver) {
		this.driver=driver;
	}
	
	
	public boolean isAccountAuthenticated() {
		
		boolean accountAuthenticated= driver.findElement(welcomeAccountLoc).isDisplayed();
		
		return accountAuthenticated;
		
		
	}
	
	public void selectSubCat() {
		Actions action= new Actions (driver);
		
		action.moveToElement(driver.findElement(womenCategoryLoc)).perform();
		driver.findElement(blousesSubCategoryLoc).click();
		
		
	}

}
