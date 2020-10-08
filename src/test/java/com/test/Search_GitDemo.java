package com.test;

import org.testng.annotations.Test;

import com.base.BaseTest;

import pageActions.HomePageActions;

public class Search_GitDemo extends BaseTest {
	
	
	
	@Test
	public void searchTest() throws InterruptedException {
		
		  HomePageActions homePage = new HomePageActions(driver);
		  homePage.getResults();
		 
	
		}

	}


