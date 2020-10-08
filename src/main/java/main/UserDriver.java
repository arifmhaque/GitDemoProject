package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class UserDriver {
	
	public WebDriver driver;
	
	public UserDriver(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void moveToElement(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}


}
