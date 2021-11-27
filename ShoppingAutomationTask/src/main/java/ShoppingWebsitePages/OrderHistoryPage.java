package ShoppingWebsitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage {
	
	WebDriver driver;
	private By orderRefLoc= By.xpath("//a[@class='color-myaccount']");
	
	public OrderHistoryPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getorderRef () {
		String orderRef= driver.findElement(orderRefLoc).getText();
		return orderRef;
	}
	
	
}
