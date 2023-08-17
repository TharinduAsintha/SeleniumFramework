package com.ifs.runner;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ifs.reports.ExtentTestManager;
import com.ifs.testcases.EbayAssignment;

public class runner {
	static ExtentTest test;
	static ExtentReports report;

//	@BeforeClass
//	public static void startTest() {
//		report = new ExtentReports();
//	}

	@Test
	public void main() throws IOException, InterruptedException {
		//ExtentTest test = ExtentTestManager.createTest("IFS Test");
		EbayAssignment es = new EbayAssignment();
		es.tc_01();
		//test.log(Status.PASS, "Open Passed");

	}

}
