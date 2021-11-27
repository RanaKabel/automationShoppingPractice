package ShoppingWebsitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage {
	
	WebDriver driver;
	private By orderReferenceLoc= By.className("box");
	private By backOrderHistoryLoc= By.xpath("//a[contains(@title,'Back to orders')]");
	
	public OrderConfirmationPage (WebDriver driver)
	{
		this.driver=driver;
	}	
	
	public String getOrderRef () {
		String orderRefLine=driver.findElement(orderReferenceLoc).getText();
		
		
		return orderRefLine;
	}
	
public void goToOrderPage() {
	driver.findElement(backOrderHistoryLoc).click();
}	

}
