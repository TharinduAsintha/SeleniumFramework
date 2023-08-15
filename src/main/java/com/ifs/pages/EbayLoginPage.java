package com.ifs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayLoginPage {
private WebDriver driver;
	
	public EbayLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath  = "(//a[text()='Sign in'])[1]")
	WebElement signIn;
	
	@FindBy(xpath  = "//input[@id='userid']")
	WebElement userName;
	
	@FindBy(xpath  = "//input[@id='pass']")
	WebElement password;
	
	public void signIn() {
		driver.findElement((By) userName);
	}
	
	public void enterUserName() {
		driver.findElement((By) signIn);
	}
	
	public void enterPassword() {
		driver.findElement((By) password);
	}
}
