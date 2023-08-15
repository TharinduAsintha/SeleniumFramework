package com.ifs.runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.ifs.testcases.EbayAssignment;

public class runner {
	static ExtentTest test;
	static ExtentReports report;

//	@BeforeClass
//	public static void startTest() {
//		report = new ExtentReports();
//	}

	@Test
	public void main() {
		EbayAssignment es = new EbayAssignment();
		es.tc_01();

	}

}
