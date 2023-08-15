package com.ifs.pages;

public enum App {
	
	googleSearch("//textarea[@name='q']"),searchButton("(//input[@name='btnK'])[1]"),searchResult("//h3[text()='eBay: Electronics, Cars, Fashion, Collectibles & More']"),
	verifyUser("//b[text()='Tharindu']"),ebaySearch("//input[@type='text']"),ebaySearchButton("//input[@type='submit']"),
	ebayResult("(//div[@class='s-item__title'])[2]"),signIn("(//a[text()='Sign in'])[1]"),userName("//input[@id='userid']"),buttonContinue("//button[@name='signin-continue-btn]"),
	signInButton("//button[@name='sgnBt']"),password("//input[@id='pass']"),addToCart("//span[text()='Add to cart']");
	
	private final String xpath;

    private App(final String xpath) {
    	this.xpath = xpath;
	}

    public final String getXpath() {
        return xpath;
    }
	
}
