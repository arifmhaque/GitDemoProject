package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Utility.Utility;
import com.base.BaseTest;

import pageActions.HomePageActions;

public class Search_GitDemo extends BaseTest {
	
	
	
	@Test
	public void searchTest() throws InterruptedException, IOException  {
		
		  HomePageActions homePage = new HomePageActions(driver);
		  homePage.getResults();
		  Utility.captureScreenshot(driver, "Git_Demo_screenshot");
		 
		 
	
		}

	}


