package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Base.BaseActions;

public class HomePage extends BaseActions{
	
	
	By Dashboard = By.xpath("//SPAN[@class='f-title'][text()='Dashboard']");
	By ProfileIcon = By.xpath("//div[@id='f-header-menu-account']");
	public By AccountSettings = By.linkText("My Account Settings");
		
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String verifyDashboard() {
		return findAnyElement(Dashboard).getText();
	}
	
	public void clickonProfileIcon()
	{
		clickElement(ProfileIcon);
	}
	
	public void clickonAccountSettings()
	{
		//clickElementByText("My Account Settings", AccountSettings);
		clickElement(AccountSettings);
	}
}
