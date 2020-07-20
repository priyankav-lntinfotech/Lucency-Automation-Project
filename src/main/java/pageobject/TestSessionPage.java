package pageobject;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonParser;

import Base.BaseActions;


public class TestSessionPage extends BaseActions{
	
	public TestSessionPage(WebDriver driver) {
		super(driver);
		}
	

	By AddTestSession = By.xpath("//span[text()='Add Test Session']");
	By CreateButton = By.xpath("//button[text()='Create']");	
	By Model_Msg = By.xpath("//DIV[@class='f-title f-bold f-color-b f-lh-38 f-size-32 f-title'][text()='Create Success!']");
	By PopUp_TxtMsg = By.xpath("//div[@id='modal-test-session-success-modal-content']/div[3]");
	By ErrorPopUp_CloseBtn = By.xpath("//i[@class='icon icon-close-4 f-abs-all'][1]");	
	By ErrorPopUp_Valivation = By.xpath("//div[@class='f-title f-bold f-color-b f-lh-38 f-size-32 f-title'][text()='Error!']");	                                 
	By SuccesssPopUp = By.xpath("//div[@class='f-title f-bold f-color-b f-lh-38 f-size-32 f-title'][text()='Create Success!']");
	By SuccessPopUp_CloseBtn = By.xpath("(//I[@class='icon icon-close-4 f-abs-all'])[1]");		
	By TestSessions = By.xpath("//div[@id='page-2-content']/div[5]/div/a/span/span[3]");
	By Numbers = By.xpath("//div[@id='choices--test_session_add_number-item-choice-2']");
	By SelectedNumber = By.xpath("//div[@class='p-choice-list p-choice-list-multiple'][2]");	
	By campaignName = By.id("campaign_name");
	By EnterSessionData = By.xpath("//textarea[@id='test_session_add_data']");
	By SearchNumber_TxtBox = By.xpath("//select[@id='test_session_add_number']//following::input[1]");	
	By name = By.id("campaign_name");	
	By DevTools = By.xpath("//SPAN[@class='f-title'][text()='Dev Tools']");
	By SelectCampaign = By.xpath("//div[@class='p-choice-item p-choice-item-selectable']");		
	By selectCampaignValue = By.xpath("//div[@id='choices--test_session_add_campaign-item-choice-2']");
	By ExpirationDate = By.xpath("//INPUT[@id='test_session_add_date']");		
	By todayDate = By.xpath("//*[@class='pika-row']/descendant::td[contains(@class,'is-today')]");	
	By CampaignID = By.xpath("//table[@id='test-session-table']/descendant::tr[2]/td[2]//div[@class='f-ellip']");
	By PhoneNumber = By.xpath("//table[@id='test-session-table']/descendant::tr[2]/td[4]//div[@class='f-ellip']");
	By SessionLookup = By.xpath("//SPAN[@class='f-title'][text()='Session Lookup']");
	By CheckBoxPhoneNumber = By.xpath("//div[@id='rogue-session-search-by-phone-number']");
	By TextBoxPhone = By.xpath("//input[@id='rogue_session_search_phone_number']");
	By SearchBtn = By.xpath("//button[@type='submit']");
	By CodeResponse = By.xpath("//div[@id='code-response']/pre");		
	By Edit_TestSession = By.xpath("(//span[text()='Edit'])[1]");
	By Save_Button = By.xpath("//button[text()='Save']"); 
	By ExpirationDate_OnEditPage = By.xpath("//input[@id='test_session_edit_date']");		
	By BtnDeleteTestSession = By.xpath("(//span[text()='Delete'])[1]");
	By PopUp_DeleteTestSeeion = By.xpath("//button[text()='Delete']");
	By PopUp_DeleteSuccess = By.xpath("(//I[@class='icon icon-close-4 f-abs-all'])[1]");
	By Copy_JSON = By.xpath("//textarea[@id='test_session_edit_data']");
	By Verify_TestSessionPage = By.xpath("//div[text()='Test Sessions']");
	
		
	public void linkTestSession() throws Exception {
		try {
			System.out.println("Inside Link_Test_Session TestSession Page Method");			
			WebDriverWait wait = new WebDriverWait (driver, 25);			
			scrollToBottomOfPage();
			clickElement(TestSessions);			
			System.out.println("TestSessions link clicked");			
		}catch (Exception e) {
			System.out.println("TestSessions link not found");
			throw (e);
		}
	}	
		
	public void btn_AddTestSession() throws Exception {
		try {					
			WebDriverWait wait = new WebDriverWait (driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(AddTestSession));
			clickElement(AddTestSession);				
			System.out.println("AddTestSession button clicked");
		}catch (Exception e) {
			System.out.println("AddTestSession button not found");
			throw (e);
		}
	}	
	
	public void dropDown_SelectCampaign() throws Exception {
		try {					
			WebDriverWait wait = new WebDriverWait (driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(SelectCampaign));
			clickElement(SelectCampaign);
			System.out.println("SelectCampaign drop-down open");			
			clickElement(selectCampaignValue);
			System.out.println("Campaign Value selected");
		}catch (Exception e) {
			System.out.println("SelectCampaign drop-down not found");
			throw (e);
		}
	}	
	
	public void select_ExpirationDate() throws Exception {
		try {				
			WebDriverWait wait = new WebDriverWait (driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ExpirationDate));
			clickElement(ExpirationDate);
			System.out.println("ExpirationDate selected");			
			clickElement(todayDate);
			System.out.println("todayDate selected");
		}catch (Exception e) {
			System.out.println("ExpirationDate not selected");
			throw (e);
		}
	}
	
	public void select_Numbers() throws Exception {
		try {				
			WebDriverWait wait = new WebDriverWait (driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(Numbers));
			clickElement(Numbers);
			System.out.println("Numbers selected");			
		}catch (Exception e) {
			System.out.println("Numbers not selected");
			throw (e);
		}
	}
	
	public void enter_SessionData() {		
		try {				
			JSONObject jsonObject = jsonReader("Binaries/SampleJson.json");
			driver.findElement(EnterSessionData).sendKeys(jsonObject.toJSONString());
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
	}
	
	public void btn_Create_Method() {		
		try {				
			WebDriverWait wait = new WebDriverWait (driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(CreateButton));
			clickElement(CreateButton);			
			System.out.println("Create Button clicked......");
		}catch (Exception e) {
			System.out.println("Create Button not clicked......");
			e.printStackTrace();
		}		
	}
	
	public void successPopUp_Method() {		
		try {			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			if (!driver.findElement(Model_Msg).getText().equals("Error!")) {
				System.out.println("Test Session Successflly Created......"+ driver.findElement(Model_Msg).getText());				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clickElement(SuccessPopUp_CloseBtn);
		    	System.out.println("SuccessPopUp_Close Btn clicked......");				
		     }else {		    	 
		    	 System.out.println(driver.findElement(Model_Msg).getText()+"--------"+ driver.findElement(PopUp_TxtMsg).getText());
		    	 Assert.fail();
		     }					
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
	}
	
	public void edit_TestSession_Method() throws Exception {
		try {				
			WebDriverWait wait = new WebDriverWait (driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(Edit_TestSession));
			clickElement(Edit_TestSession);
			System.out.println("Edit button Clicked............");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(Copy_JSON).getText();			
			clickElement(Save_Button);
			System.out.println("Save Button Clicked............");					
			clickElement(SuccessPopUp_CloseBtn);
			System.out.println("Edit Modal Save PopUp Closed Successfully............");
		}catch (Exception e) {
			System.out.println("");
			throw (e);
		}
	}	
	
	public void delete_Test_Session_Method() {		
		try {			
			WebDriverWait wait = new WebDriverWait (driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(BtnDeleteTestSession));
			clickElement(BtnDeleteTestSession);			
			System.out.println("Delete_Test_Session Button clicked......");			
			clickElement(PopUp_DeleteTestSeeion);
			System.out.println("Delete_Test_Session Pop-UP's Delete Button clicked......");			
			WebDriverWait waits = new WebDriverWait (driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(PopUp_DeleteSuccess));
			clickElement(PopUp_DeleteSuccess);
			System.out.println("Delete_Test_Session Success Pop_UP Closed......");
		}catch (Exception e) {
			System.out.println("Delete Test Session Success PopUp Not Closed......");
			e.printStackTrace();
		}
		
	}	
	
	
}
