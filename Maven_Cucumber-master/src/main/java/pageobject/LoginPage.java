package pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	@FindBy(xpath="//BUTTON[@class='a-button f-b pure-input-1 f-b-4A90E2-a f-b-4A90E2-h f-border-4A90E2 f-c-FFFFFF-a f-c-FFFFFF-h f-c-4A90E2 f-l-38 f-m-a f-r-20 f-s-16 f-w-90 f-600'][text()='Login']")
	WebElement firstLoginbutton;
	
	@FindBy(xpath="//INPUT[@id='tooltip_auth_login_email']")
	WebElement email;
	
	@FindBy(xpath="//INPUT[@id='tooltip_auth_login_password']")
	WebElement password;

	//@FindBy(name="commit")
	//WebElement submit;
	
	@FindBy(xpath="//BUTTON[@class='a-button f-b f-b-293B50-a f-b-293B50-h f-b-4A90E2 f-c-FFFFFF f-h-40 f-l-40 f-m-a f-p-10-h f-r-20 f-s-14 f-w-175 f-600 pure-input-1'][text()='Log In']")
	WebElement submit;
	
	@FindBy(xpath="//div[contains(@class,'alert-danger')]")
	WebElement errorMsg;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	
	public void loginbutton() {
		try {
			firstLoginbutton.click();
			Thread.sleep(1000);
			System.out.println("First Login button clicked");
		}catch(Exception e) {
			System.out.println("First Login button not found");
		}
	}
	
	public void enterEmail(String strEmail) {
		try {
				email.sendKeys(strEmail);
				Thread.sleep(1000);
				System.out.println("Entered Email");
		}catch (Exception e) {
			System.out.println("Email not entered");
		}
	}
	
	public void enterPassword(String strPassword) {
		try {
				password.sendKeys(strPassword);
				System.out.println("Entered Password");
		}catch (Exception e) {
			System.out.println("Password not entered");
		}
	}
	
	public void clickSubmit() {
		try {
				submit.click();
				System.out.println("Submit button clicked");
		}catch (Exception e) {
			System.out.println("Submit button not clicked");
		}
	}
	
	public void enterEmailandPassword(String email, String pasword) {
		enterEmail(email);
		enterPassword(pasword);
		System.out.println("In enterEmailandPassword method");
	}
	
	public String getErrorMessageText() throws Exception {
		String text = null;
		try {
			text = errorMsg.getAttribute("innerText");
		} catch (Exception e) {
			System.out.println("Could not get Success message text");
			throw (e);
		}
		return text;
	}
	
	public void doValidLogin(String email, String pasword) {
		loginbutton();
		enterEmail(email);
		enterPassword(pasword);
		clickSubmit();
	}

}
