package managers;

import org.openqa.selenium.WebDriver;
import pageobject.CommonPageElements;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.UserProfilePage;


public class PageObjectManager {
	
	private HomePage homepage;
	private LoginPage loginpage;
	private UserProfilePage profile;
	private WebDriver driver;

	private CommonPageElements commonPageElement;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	

	public HomePage getHomePage() {
		return (homepage == null) ? homepage = new HomePage(driver) : homepage;
	}
	
	public LoginPage getLogingPage() {
		return (loginpage == null) ? loginpage = new LoginPage(driver) : loginpage;		
	}
	
	
	public CommonPageElements getCommonPageElements() {
		return (commonPageElement == null) ? commonPageElement =  new CommonPageElements(driver) : commonPageElement;
	}

	public UserProfilePage getUserProfilePage()
	{
		return (profile == null) ? profile = new UserProfilePage(driver) : profile;	
	}
}
