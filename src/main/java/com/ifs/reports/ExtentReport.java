package com.ifs.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
        	ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Tharindu Asintha\\eclipse-workspace\\IFS-Assignment\\extent-report.html");
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }

}
