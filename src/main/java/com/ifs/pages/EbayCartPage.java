package com.ifs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartPage {
private WebDriver driver;
	
	public EbayCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath  = "//span[text()='Add to cart']")
	WebElement addToCart;
	
	public void cart() {
		driver.findElement((By) addToCart);
	}
}
