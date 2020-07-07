package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Base.BaseActions;

public class HomePage extends BaseActions{
	
	
	By Dashboard = By.xpath("//SPAN[@class='f-title'][text()='Dashboard']");
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String verifyDashboard() {
		return findAnyElement(Dashboard).getText();
	}
	
}
