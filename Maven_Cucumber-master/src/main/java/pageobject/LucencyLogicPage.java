package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseActions;

public class LucencyLogicPage extends BaseActions{
	
	public LucencyLogicPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By LoginButton = By.xpath("//BUTTON[@class='a-button f-b pure-input-1 f-b-4A90E2-a f-b-4A90E2-h f-border-4A90E2 f-c-FFFFFF-a f-c-FFFFFF-h f-c-4A90E2 f-l-38 f-m-a f-r-20 f-s-16 f-w-90 f-600'][text()='Login']");
	By Email = By.xpath("//INPUT[@id='tooltip_auth_login_email']");
	By Password = By.xpath("//INPUT[@id='tooltip_auth_login_password']");
	By ClickLogin = By.xpath("//BUTTON[@class='a-button f-b f-b-293B50-a f-b-293B50-h f-b-4A90E2 f-c-FFFFFF f-h-40 f-l-40 f-m-a f-p-10-h f-r-20 f-s-14 f-w-175 f-600 pure-input-1'][text()='Log In']");

	
	
	
	public void LoginButton() {
		try {
			clickElement(LoginButton);
			System.out.println("Login Button clicked");
		}catch (Exception e) {
			
		}
	}
	
	public void enterEmail(String strEmail) {
		try {
				setElementText(Email, strEmail);
				System.out.println("Entered Email");
		}catch (Exception e) {
			System.out.println("Email not entered");
		}
	}
	
	public void enterPassword(String strPassword) {
		try {
				setElementText(Password, strPassword);
				System.out.println("Entered Password");
		}catch (Exception e) {
			System.out.println("Password not entered");
		}
	}
	
	public void clickOnLogin() {
		try {
			clickElement(ClickLogin);
			System.out.println("Login Button clicked");
		}catch (Exception e) {
			
		}
	}
	
	
	public void doValidLogin(String Email, String Password) {
	enterEmail(Email);
	enterPassword(Password);
		clickOnLogin();
	}
	
}
