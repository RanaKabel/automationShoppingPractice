package ShoppingWebsitePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BlousesPage {
	
	WebDriver driver;
	private By resultBlouseLoc= By.xpath("//img[@title='Blouse']");
	private By addToCartLoc= By.xpath("//span[contains(text(),'Add to cart')]");
	
	public BlousesPage (WebDriver driver) {
		this.driver=driver;
	}
	
	public void addBlouseToCart() {
		
		Actions action= new Actions (driver);
		action.moveToElement(driver.findElement(resultBlouseLoc)).perform();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(addToCartLoc).click();
	}
	
	
	

}
