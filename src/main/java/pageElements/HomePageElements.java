package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.UserDriver;

public class HomePageElements extends UserDriver {

	public HomePageElements(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(xpath = "//input[@id = 'gbqfbb']") 
	  public WebElement feelingLucky;
	  
	  @FindBy(xpath = "//div[@class = 'gbqfba gbqfba-hvr']") 
	  public WebElement feelingHungry;
	  
	  @FindBy(tagName = "a") 
	  public WebElement tagA;
	 

}
