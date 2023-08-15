package com.ifs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage {
	
private WebDriver driver;
	
	public EbayHomePage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath  = "//b[text()='Tharindu']")
	WebElement verifyUser;
	
	@FindBy(xpath  = "//input[@type='text']")
	WebElement ebaySearch;
	
	@FindBy(xpath  = "//input[@type='submit']")
	WebElement ebaySearchButton;

	@FindBy(xpath  = "(//div[@class=\"s-item__title\"])[2]")
	WebElement ebayResult;
	
	public void verifyUser() {
		driver.findElement((By) verifyUser);
	}
	
	public void searchEbay() {
		driver.findElement((By) ebaySearch);
	}
	
	public void searchButton() {
		driver.findElement((By) ebaySearchButton);
	}
	
	public void result() {
		driver.findElement((By) ebayResult);
	}
	

}
