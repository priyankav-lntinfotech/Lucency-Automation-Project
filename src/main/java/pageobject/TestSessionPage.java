package pageobject;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.gson.JsonParser;

import Base.BaseActions;


public class TestSessionPage extends BaseActions{
	
	public TestSessionPage(WebDriver driver) {
		super(driver);
		}

	//SPAN[@class='f-title'][text()='Add Test Session']
	/* Buttons */
	public By AddTestSession = By.xpath("//BUTTON[@class='f-bg-1 f-bold f-button f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175 d-abs-r d-abs-v pure-input-1']");
	public By CreateButton = By.xpath("//button[@class='f-bg-1 f-bold f-button f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175 pure-input-1'][text()='Create']");
	
	
	/* Error PopUp while creating new test session */
	//DIV[@class='f-title f-bold f-color-b f-lh-38 f-size-32 f-title'][text()='Create Success!']
	public By Model_Msg = By.xpath("//DIV[@class='f-title f-bold f-color-b f-lh-38 f-size-32 f-title'][text()='Create Success!']");
	public By PopUp_TxtMsg = By.xpath("//div[@id='modal-test-session-success-modal-content']/div[3]");
	public By ErrorPopUp_CloseBtn = By.xpath("//i[@class='icon icon-close-4 f-abs-all'][1]");	
	public By ErrorPopUp_Valivation = By.xpath("//div[@class='f-title f-bold f-color-b f-lh-38 f-size-32 f-title'][text()='Error!']");
	                                 //div[@id='modal-test-session-success-modal-content']/div[1]
	public By SuccesssPopUp = By.xpath("//div[@class='f-title f-bold f-color-b f-lh-38 f-size-32 f-title'][text()='Create Success!']");
	public By SuccessPopUp_CloseBtn = By.xpath("(//I[@class='icon icon-close-4 f-abs-all'])[1]");
	
	/* Links */ 
	
	//SPAN[@class='f-bold f-color-w f-ellip f-lh-22 f-size-18 f-title'][text()='Test Sessions']
	public By TestSessions = By.xpath("//div[@id='page-2-content']/div[5]/div/a/span/span[3]");
	public By Numbers = By.xpath("//div[@id='choices--test_session_add_number-item-choice-2']");
	public By SelectedNumber = By.xpath("//div[@class='p-choice-list p-choice-list-multiple'][2]");

	/* TextBoxes */
	public By campaignName = By.id("campaign_name");
	public By EnterSessionData = By.xpath("//textarea[@id='test_session_add_data']");
	public By SearchNumber_TxtBox = By.xpath("//select[@id='test_session_add_number']//following::input[1]");

	/* Searchbox */
	By name = By.id("campaign_name");

	/* Dropdowns */
	By DevTools = By.xpath("//SPAN[@class='f-title'][text()='Dev Tools']");
	By SelectCampaign = By.xpath("//div[@class='p-choice-item p-choice-item-selectable']");
	//By SelectCampaign = By.xpath("(//DIV[@class='p-choice-inner'])[1]");
	
	
	By selectCampaignValue = By.xpath("//div[@id='choices--test_session_add_campaign-item-choice-2']");
	By ExpirationDate = By.xpath("//INPUT[@id='test_session_add_date']");
	
	
	/* Date Picker current day*/
	By todayDate = By.xpath("//*[@class='pika-row']/descendant::td[contains(@class,'is-today')]");
	
	
	/*required xpath to verify test session */
	public By CampaignID = By.xpath("//table[@id='test-session-table']/descendant::tr[2]/td[2]//div[@class='f-ellip']");
	public By PhoneNumber = By.xpath("//table[@id='test-session-table']/descendant::tr[2]/td[4]//div[@class='f-ellip']");
	public By SessionLookup = By.xpath("//SPAN[@class='f-title'][text()='Session Lookup']");
	By CheckBoxPhoneNumber = By.xpath("//div[@id='rogue-session-search-by-phone-number']");
	By TextBoxPhone = By.xpath("//input[@id='rogue_session_search_phone_number']");
	By SearchBtn = By.xpath("//button[@type='submit']");
	By CodeResponse = By.xpath("//div[@id='code-response']/pre");
	
	
	
	/* Xpath for Edit the 'TestSession' */
	By BtnEdit = By.xpath("//span[@class='f-title'][text()='Edit'][text()='Edit'][1]");
	By BtnSave = By.xpath("//BUTTON[@class='f-bg-1 f-bold f-button f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175 pure-input-1'][text()='Save']"); 
	By ExpirationDate_OnEditPage = By.xpath("//input[@id='test_session_edit_date']");
	
	/* Xpath for Delete the 'TestSession' */
	By BtnDeleteTestSession = By.xpath("(//SPAN[@class='f-title f-underline'][text()='Delete'])[1]");
	By PopUp_DeleteTestSeeion = By.xpath("//button[@class='f-button f-bg-1 f-bold f-button f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175 pure-input-1'][text()='Delete']");
	By PopUp_DeleteSuccess = By.xpath("(//I[@class='icon icon-close-4 f-abs-all'])[1]");
	
	
	
	/*public void linkDevTools() throws Exception {
		try {
			clickElement(DevTools);
			//driver.findElement(DevTools).click();
			System.out.println("DevTools link clicked");
		}

		catch (Exception e) {
			System.out.println("DevTools link not found");
			throw (e);
		}
	}*/
	
	public void linkTestSession() throws Exception {
		try {
			System.out.println("Inside Link_Test_Session TestSession Page Method");
			Thread.sleep(3000);
			//ajaxScroll(TestSessions);	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");			
			Thread.sleep(2000);
			clickElement(TestSessions);			
			System.out.println("TestSessions link clicked");
		}catch (Exception e) {
			System.out.println("TestSessions link not found");
			throw (e);
		}
	}
	
		
	public void btn_AddTestSession() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(AddTestSession);			
			System.out.println("AddTestSession button clicked");
		}catch (Exception e) {
			System.out.println("AddTestSession button not found");
			throw (e);
		}
	}
	
	
	public void dropDown_SelectCampaign() throws Exception {
		try {
			Thread.sleep(3000);
			clickElement(SelectCampaign);
			//driver.findElement(SelectCampaign).click();
			System.out.println("SelectCampaign drop-down open");
			Thread.sleep(3000);
			clickElement(selectCampaignValue);
			System.out.println("Campaign Value selected");
		}catch (Exception e) {
			System.out.println("SelectCampaign drop-down not found");
			throw (e);
	}
  }
	
	
	public void select_ExpirationDate() throws Exception {
		try {
			Thread.sleep(2000);
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
			Thread.sleep(2000);
			clickElement(Numbers);
			System.out.println("Numbers selected");
			
		}catch (Exception e) {
			System.out.println("Numbers not selected");
			throw (e);
	}
  }
	
	public void enter_SessionData() {		
		try {			
			
			Thread.sleep(2000);
			clickElement(EnterSessionData);
			FileReader reader = new FileReader("Binaries/SampleJson.json");
			
			//sendKeysWithAjax(EnterSessionData, "{}");
			//System.out.println("Session data Entered............");
			JSONParser jsonpaser = new JSONParser();
			//Convert json data into the Json Object by bellow line
			JSONObject jsonObject = (JSONObject) jsonpaser.parse(reader);
			System.out.println(jsonObject.toJSONString());
			driver.findElement(EnterSessionData).sendKeys(jsonObject.toJSONString());
			
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
	}
	
	public void btn_Create_Method() {		
		try {
			Thread.sleep(2000);
			clickElement(CreateButton);			
			System.out.println("Create Button clicked......");
		}catch (Exception e) {
			System.out.println("Create Button not clicked......");
			e.printStackTrace();
		}
		
	}
	
	public void successPopUp_Method() {		
		try {			
			Thread.sleep(3000);
			if (!driver.findElement(Model_Msg).getText().equals("Error!")) {
				System.out.println("Test Session Successflly Created......"+ driver.findElement(Model_Msg).getText());
				Thread.sleep(1000);
				clickElement(SuccessPopUp_CloseBtn);
		    	System.out.println("SuccessPopUp_CloseBtn clicked......");				
		     }else {		    	 
		    	 System.out.println(driver.findElement(Model_Msg).getText()+"--------"+ driver.findElement(PopUp_TxtMsg).getText());
		    	 Assert.fail();
		     }					
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
	}
	
	
	public void delete_Test_Session_Method() {		
		try {
			
			clickElement(BtnDeleteTestSession);			
			System.out.println("Delete_Test_Session Button clicked......");
			Thread.sleep(500);
			clickElement(PopUp_DeleteTestSeeion);
			System.out.println("Delete_Test_Session Pop-UP's Delete Button clicked......");
			Thread.sleep(500);
			clickElement(PopUp_DeleteSuccess);
			System.out.println("Delete_Test_Session Success Pop_UP Closed......");
		}catch (Exception e) {
			System.out.println("Delete Teste Session Button not clicked......");
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
