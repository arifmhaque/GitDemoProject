package pageActions;

import org.openqa.selenium.WebDriver;

import pageElements.HomePageElements;

public class HomePageActions extends HomePageElements {

	public HomePageActions(WebDriver driver) {
		super(driver);

	}

	public void getResults() throws InterruptedException {

		boolean b = true;

		while (b) {
			Thread.sleep(3000);
			moveToElement(feelingLucky);
			Thread.sleep(3000);
			String attributeValue = feelingHungry.getAttribute("aria-label");
			Thread.sleep(1000);

			if (attributeValue.equalsIgnoreCase("I'm Feeling Hungry")) {
				b = false;
			} else {
				moveToElement(tagA);
			}
		}
	}
	

}
