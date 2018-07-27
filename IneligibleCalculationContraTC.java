package com.cync.AblTS;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.cync.base.BaseTest;
import com.cync.base.CyncMenus;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.FileClassification;
import com.cync.pages.IneligibilityReasonsPage;
import com.cync.pages.IneligibleCalculationContra;
import com.cync.pages.IneligibleUninsuiredReason;
import com.cync.pages.LoginPage;
import com.cync.pages.SalesRegion;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class IneligibleCalculationContraTC extends BaseTest {
	static final Logger logger = Logger.getLogger(LoginPage.class);

	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Contra Calculation in Ineligible Summary screen for UnApproved BBC, when Customer Balance is less than Vendor Balance")
	public void contraCalnInIneligibleSummaryScreen() {

		ExtentTestManager.getTest().getTest().setName("Check the Contra Calculation in Ineligible Summary screen for UnApproved BBC, when Customer Balance is less than Vendor Balance");
		ExtentTestManager.getTest().assignCategory("Module: ABL");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String ClientData ="AUTOMATION_CONTRA_0001";
		@SuppressWarnings("unused")
		IneligibleCalculationContra IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculationn(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

		
		Assert.assertTrue(IneligibleCalculationScreen.selectContraAsReason());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
        
        Assert.assertTrue(IneligibleCalculationScreen.navigateToContra());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
        
        String selectCustomerName ="1000 CAPITAL INC";
        String selectVendorName ="VENDOR1 V001";
        Assert.assertTrue(IneligibleCalculationScreen.mapVendor(selectCustomerName,selectVendorName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
        
        
        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
        
         Assert.assertTrue(IneligibleCalculationScreen.navigateToIneligibleSummary());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Navigation to the Ineligible Summary Screen is done sucessfully");
        
        String ReasonData = "Contra";
        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason(ReasonData));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
        
       	String ReasonAmount = "6250";
        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount(ReasonAmount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
       
        
   	}
	
}
