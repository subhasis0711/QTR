package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	public WebDriver driver;
	
	By sendKudos =By.cssSelector(".nav-item.nav-link[href='#myModal']");
	By kudosFromMe =By.xpath("//span[normalize-space()='Kudos from me']");
	By kudosToMe =By.xpath("//span[normalize-space()='Kudos to me']");
	By kudosSearch =By.xpath("//span[normalize-space()='Kudos Search']");
	By userName =By.xpath("//div[@class='jumbotron']//div[1]//div[1]//h5[1]");
	By userPic=By.xpath("//img[@alt='Sample Image']");
	By activity=By.xpath("//span[normalize-space()='Activity']");
	By recentActivity=By.xpath("//div[@id='shoutout_to_me']");

		
	
	public homePage(WebDriver driver) {
		
		this.driver=driver;
	
	}
	public WebElement getsendKudos() {
		return driver.findElement(sendKudos);
		
	}
	public WebElement getkudosFromMe() {
		return driver.findElement(kudosFromMe);
		
	}
	public WebElement getkudosToMe() {
		return driver.findElement(kudosToMe);	
	}
	public WebElement getkudosSearch() {
		return driver.findElement(kudosSearch);
		
	}
	public WebElement getuserName() {
		return driver.findElement(userName);
		
	}
	public WebElement getuserPic() {
		return driver.findElement(userPic);
		
	}
	public WebElement getActivity() {
		return driver.findElement(activity);
		
	}
	
	public WebElement getrecentActivity() {
		return driver.findElement(recentActivity);
		
	}
	
		
	
	
	
}
