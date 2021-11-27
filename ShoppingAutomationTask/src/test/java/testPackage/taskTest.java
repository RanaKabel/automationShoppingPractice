package testPackage;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import ShoppingWebsitePages.AuthenticationPage;
import ShoppingWebsitePages.BlousesPage;
import ShoppingWebsitePages.CreateNewUserPage;
import ShoppingWebsitePages.HomePage;
import ShoppingWebsitePages.MyAccountPage;
import ShoppingWebsitePages.OrderConfirmationPage;
import ShoppingWebsitePages.OrderHistoryPage;
import ShoppingWebsitePages.ShoppingCartPage;
import Utility.ExcelUtils;

public class taskTest {
	
	
	WebDriver driver;
	HomePage homepage;
	AuthenticationPage authenticationpage;
	static ExcelUtils excelTestData;
	CreateNewUserPage createnewuserpage;
	MyAccountPage myaccountpage;
	BlousesPage blousespage;
	ShoppingCartPage shoppingcartpage;
	OrderConfirmationPage orderconfirmationpage;
	OrderHistoryPage orderhistorypage;
	private String orderRefLine;
	
	
	
	@Test
	public void navigateToUrl() {
	
		homepage.navigateToUrl();
		
	}
	@Test
	public void clickSignIn() {
		homepage.clickSignIn();
		
	}
	
	@Test
	public void clickSignUp() {
		String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
		String email= "ranaUser"+userName+"@example.com";
		authenticationpage.clickCreateAccount(email);
	}
	
	@Test
	public void createNewUser() {
		
		String firstname=excelTestData.getCellData(1,1);
		String lastname=excelTestData.getCellData(2,1);
		String password=excelTestData.getCellData(3,1);
		String address=excelTestData.getCellData(4,1);
		String city=excelTestData.getCellData(5,1);
		int postalcode=excelTestData.getCellNumData(7, 1);
		int phone=excelTestData.getCellNumData(8, 1);
		String alias=excelTestData.getCellData(9,1);
		
		createnewuserpage.createNewUser(firstname,lastname,password,address,city,postalcode,phone,alias);
		
	}
	
	
	@Test
	
	public void assertAccountAuthenticated () {
		
		assertTrue(myaccountpage.isAccountAuthenticated());
	}
	
	
	@Test
	public void selectBlouseWomen () {
		myaccountpage.selectSubCat();
	}
	
	@Test
	public void addBlouseToCart() {
		blousespage.addBlouseToCart();
	}
	
	
	@Test
	public void carryCheckoutProcess () {
		shoppingcartpage.checkoutProcess();
	}
	
	@Test
	public void getOrderRef() {
		orderRefLine= orderconfirmationpage.getOrderRef();
		
	}
	
	@Test
	public void goToOrdersPage() {
		orderconfirmationpage.goToOrderPage();
	}
	
	@Test
	public void assertOrderFromOrderHistory () {
		assertTrue(orderRefLine.contains(orderhistorypage.getorderRef()));
		
		
	}
	
	@BeforeClass 
	public void beforeClass () {
	System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");	 
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	homepage= new HomePage (driver);
	authenticationpage= new AuthenticationPage (driver);
	excelTestData= new ExcelUtils ("src/test/resources/testData/testDataFile.xlsx","Sheet1");
	createnewuserpage= new CreateNewUserPage(driver);
	myaccountpage= new MyAccountPage (driver);
	blousespage= new BlousesPage (driver);
	shoppingcartpage= new ShoppingCartPage(driver);
	orderconfirmationpage= new OrderConfirmationPage (driver);
	orderhistorypage= new OrderHistoryPage (driver);
	
		
	}
	
	
	 @AfterClass
	  public void afterClass() {
		 driver.quit();
	  }

}
