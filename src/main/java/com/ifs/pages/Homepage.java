package com.ifs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
private WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath  = "//textarea[@name='q']")
	WebElement googleSearch;
	
	@FindBy(xpath  = "//h3[text()='eBay: Electronics, Cars, Fashion, Collectibles & More']")
	WebElement searchResult;
	
	public void searchGoogle() {
		driver.findElement((By) googleSearch);
	}
	
	public void clickResult() {
		driver.findElement((By) searchResult);
	}
	
}
