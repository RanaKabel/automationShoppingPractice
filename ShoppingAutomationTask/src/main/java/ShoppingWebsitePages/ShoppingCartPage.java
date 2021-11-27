package ShoppingWebsitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
	
	WebDriver driver;
	private By proceedToCheckoutPopupLoc= By.xpath("//span[contains(text(),'Proceed to checkout')]");
	private By proceedToCheckoutLoc= By.xpath("//a[@title='Proceed to checkout']/span[text()='Proceed to checkout']");
	private By cartProceedToCheckoutLoc= By.xpath("//button[@name='processAddress']");
	private By cartProceedToCheckoutLoc1= By.xpath("//button[@name='processCarrier']");
	
	private By agreeTermCheckLoc= By.xpath("//input[@id=\"cgv\"]");
	private By payByBankWireLoc= By.xpath("//a[@title='Pay by bank wire']");
	private By confirmOrderLoc= By.xpath("//span[contains(text(),'I confirm my order')]");
	
	public ShoppingCartPage (WebDriver driver) {
		this.driver=driver;
	}
	
	public void checkoutProcess() {
		
		driver.findElement(proceedToCheckoutPopupLoc).click();
		driver.findElement(proceedToCheckoutLoc).click();
		driver.findElement(cartProceedToCheckoutLoc).click();
	
		driver.findElement(agreeTermCheckLoc).click();
		driver.findElement(cartProceedToCheckoutLoc1).click();
		driver.findElement(payByBankWireLoc).click();
		driver.findElement(confirmOrderLoc).click();
	
	}
	
	

}
