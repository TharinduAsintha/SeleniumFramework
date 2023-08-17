package com.ifs.businessfunctions;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ifs.pages.App;
import com.ifs.reports.ExtentTestManager;
import com.ifs.testbase.TestBase;

public class bc_main {
	static ExtentTest test = ExtentTestManager.createTest("IFS Test");
	
	public final static void openEbayURL(final TestBase caller, String browserName, String url) {
		caller.open(browserName, url);
		test.log(Status.PASS, "Open Passed");
		//caller.type(App.googleSearch.getXpath(),"ebay");
	}
	
	public final static void NavigateToEbay(final TestBase caller, String SearchName) throws InterruptedException {
		caller.type(App.googleSearch.getXpath(),SearchName);
		caller.click(App.searchButton.getXpath());
		caller.click(App.searchResult.getXpath());
		test.log(Status.PASS, "Navigate To Ebay Passed");
	}
	
	public final static void LoginToEbay(final TestBase caller,String UserName, String Password) {
		caller.click(App.signIn.getXpath());
		caller.type(App.userName.getXpath(),UserName);
		caller.click(App.buttonContinue.getXpath());
		caller.type(App.userName.getXpath(),Password);
		caller.click(App.signInButton.getXpath());
		test.log(Status.PASS, "Login To Ebay Passed");
	}
	
	public final static void VerifyUser(final TestBase caller, String expectedText) {
		String actualText = caller.getText("");
		if (actualText.equals(expectedText)) {
		    System.out.println("User verification successful!");
		} else {
		    System.out.println("User verification failed!");
		}
		test.log(Status.PASS, "Verify Ebay User Passed");
	}
	
	public final static void SearchProduct(final TestBase caller, String productName) {
		caller.type(App.ebaySearch.getXpath(),productName);
		caller.click(App.ebaySearchButton.getXpath());
		test.log(Status.PASS, "Search Ebay Porduct Passed");
	}
	
	public final static void NavigateToCart(final TestBase caller) throws IOException {
		caller.click(App.ebayResult.getXpath());
		String text = caller.getText(App.ebayResult.getXpath());
		caller.switchWindow();
		caller.click(App.addToCart.getXpath());
		String cartText = caller.getText(App.verifyCart.getXpath());
		WebDriver dri = caller.getDriver();
	     if (text.equals(cartText)){
	         System.out.println("Cart Added Successfully");
	      } else {
	         System.out.println("Cart Empty");
	      }
	     test.log(Status.PASS, "Add To Cart Passed");
		//caller.getScreenShot(filePath);
	}
	
	public final static void CloseAutomation(final TestBase caller) {
		caller.closeBrowser();
	}
}
