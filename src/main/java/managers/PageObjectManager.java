package managers;

import org.openqa.selenium.WebDriver;

import pageobject.CommonPageElements;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.UsersPage;



public class PageObjectManager {
	
	private HomePage homepage;
	private LoginPage loginpage;
	private WebDriver driver;

	private CommonPageElements commonPageElement;
	private UsersPage user;
	
	
	
	
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
	
	
	public UsersPage getUsersPage() {
		return (user == null) ? user = new UsersPage(driver) : user;
	}
	
	/*public APIKeysPage getAPIKeysPage() {
		return (api == null) ? api = new APIKeysPage(driver) : api;
	}*/
	
	/*public AuthenticationPage getAuthenticationPage() {
		return (ipAddress == null) ? ipAddress = new AuthenticationPage(driver) : ipAddress;
	}*/

}
