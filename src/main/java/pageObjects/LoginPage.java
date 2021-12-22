package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By uaserNameID=By.cssSelector("input[placeholder='Enter Username']");
	By password=By.cssSelector("input[placeholder='Enter Password']");
	By login=By.cssSelector("button[type='submit']");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public WebElement getUserNameID()
	{
		return driver.findElement(uaserNameID);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
}
