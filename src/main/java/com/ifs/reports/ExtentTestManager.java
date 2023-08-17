package com.ifs.reports;

import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
	 private static Map<Long, ExtentTest> extentTestMap = new HashMap<>();
	    private static ExtentReports extent = ExtentReport.getInstance();

	    public static synchronized ExtentTest createTest(String testName) {
	        ExtentTest test = extent.createTest(testName);
	        extentTestMap.put(Thread.currentThread().getId(), test);
	        return test;
	    }

	    public static synchronized ExtentTest getTest() {
	        return extentTestMap.get(Thread.currentThread().getId());
	    }
}
