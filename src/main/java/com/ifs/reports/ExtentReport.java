package com.ifs.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReport {
	
	private ExtentReport report;
	private ExtentTest logger;

	public void setExtendReport(String Time) {
		String reportFilePath = "ExtentReport/"+Time+"_report.html";
		ExtentReports extent = new ExtentReports();
       // extent.attachReporter(reportFilePath);
	}

}
