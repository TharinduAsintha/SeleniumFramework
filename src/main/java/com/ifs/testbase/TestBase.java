package com.ifs.testbase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	private static WebDriver driver;
	
	public WebDriver open(String browserName,String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
		}
		return driver; 
	}
	
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	public void click(String object) {
		driver.findElement(By.xpath(object)).click();
	}
	
	public void type(String object, String value) {
		driver.findElement(By.xpath(object)).sendKeys(value);
	}

	public String getText(String object) {
		return object;
		//object.gettext
	}
	
	public void getScreenShot(String filePath) throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(filePath);
        FileUtils.copyFile(SrcFile, DestFile);
	}
}
