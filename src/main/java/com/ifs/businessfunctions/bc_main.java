package com.ifs.businessfunctions;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.ifs.testbase.TestBase;

public class bc_main {
	
	public final static void openEbayURL(final TestBase caller, String browserName, String url) {
		caller.open(browserName, url);
		caller.type("App.googleSearch","ebay");
	}
	
	public final static void NavigateToEbay(final TestBase caller, String SearchName) {
		caller.type("App.googleSearch","ebay");
		caller.click("App.searchButton");
		caller.click("App.searchResult");
	}
	
	public final static void LoginToEbay(final TestBase caller,String UserName, String Password) {
		caller.click("App.signIn");
		caller.type("App.userName",UserName);
		caller.click("App.buttonContinue");
		caller.type("App.userName",Password);
		caller.click("App.signInButton");
	}
	
	public final static void LoginToEbay(final TestBase caller, String expectedText) {
		String actualText = null;
		if (actualText.equals(expectedText)) {
		    System.out.println("User verification successful!");
		} else {
		    System.out.println("User verification failed!");
		}
	}
	
	public final static void SearchProduct(final TestBase caller, String productName) {
		caller.type("App.ebaySearch",productName);
		caller.click("App.ebaySearchButton");
	}
	
	public final static void NavigateToCart(final TestBase caller, String filePath) throws IOException {
		caller.click("App.ebayResult");
//		Set<String>s=driver.getWindowHandles();
//		Iterator<String> I1= s.iterator();
//		while(I1.hasNext())
//		{
//		String child_window=I1.next();
//		if(!parent.equals(child_window))
//		{
//		driver.switchTo().window(child_window);
		caller.click("App.addToCart");
		caller.getScreenShot(filePath);
	}
	
	public final static void CloseAutomation(final TestBase caller) {
		caller.closeBrowser();
	}
}
