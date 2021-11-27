package ShoppingWebsitePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewUserPage {
	
	
	
	WebDriver driver;
	private By stateDropDownListLoc= By.id("id_state");
	private By lastnameloc= By.xpath("//input[@id='customer_lastname']");
	private By firstnameLoc= By.xpath("//input[@id='customer_firstname']");
	private By passwordLoc= By.xpath("//input[@id='passwd']");
	private By addressLoc= By.xpath("//input[@id='address1']");
	private By cityLoc= By.xpath("//input[@id='city']");
	private By postcodeLoc= By.xpath("//input[@id='postcode']");
	private By phoneLoc= By.xpath("//input[@id='phone_mobile']");
	private By aliasLoc= By.xpath("//input[@id='alias']");
	private By registerLoc= By.xpath("//*[@id=\"submitAccount\"]/span");
	
	
	public CreateNewUserPage (WebDriver driver) {
		this.driver=driver;
	}

	public void createNewUser(String firstname, String lastname, String password, String address, String city, int postcode, int mobile, String alias ) 
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(firstnameLoc).sendKeys(firstname);
		driver.findElement(lastnameloc).sendKeys(lastname);
		driver.findElement(passwordLoc).sendKeys(password);
		driver.findElement(addressLoc).sendKeys(address);
		driver.findElement(cityLoc).sendKeys(city);
		
		
		
		
		WebElement dropDownBox= driver.findElement(stateDropDownListLoc);
		
		Select dropdown= new Select(dropDownBox);
		//BY VISBLE TEXT
		dropdown.selectByVisibleText("Florida");
		
		driver.findElement(postcodeLoc).sendKeys(String.valueOf(postcode));
		driver.findElement(phoneLoc).sendKeys(String.valueOf(mobile));
		driver.findElement(aliasLoc).sendKeys(alias);
		driver.findElement(registerLoc).click();
		
	}
}
