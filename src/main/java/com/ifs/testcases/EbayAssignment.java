package com.ifs.testcases;

import java.io.IOException;

import com.google.common.annotations.VisibleForTesting;
import com.ifs.businessfunctions.bc_main;
import com.ifs.testbase.TestBase;

public class EbayAssignment extends TestBase {
	
	public final void tc_01() throws IOException, InterruptedException {
		bc_main.openEbayURL(this, "chrome", "https://www.google.com");
		bc_main.NavigateToEbay(this, "ebay");
		//bc_main.LoginToEbay(this, "tharinduasintha1@gmailcom", "98989898e");
		//bc_main.VerifyUser(this, "tharindu");
		bc_main.SearchProduct(this, "SmartWatch");
		bc_main.NavigateToCart(this);
		bc_main.CloseAutomation(this);
	}

}
