package com.ifs.testcases;

import com.google.common.annotations.VisibleForTesting;
import com.ifs.businessfunctions.bc_main;
import com.ifs.testbase.TestBase;

public class EbayAssignment extends TestBase {
	
	public final void tc_01() {
		bc_main.openEbayURL(this, "chrome", "https://www.google.com");
		bc_main.CloseAutomation(this);
	}

}
