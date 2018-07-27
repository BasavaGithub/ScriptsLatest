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
import com.cync.pages.IneligibleUninsuiredReason;
import com.cync.pages.LoginPage;
import com.cync.pages.SalesRegion;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class IneligibilityUninsuiredReasonTC extends BaseTest {
	static final Logger logger = Logger.getLogger(LoginPage.class);
	
	
	////////////////////////////////////////////////////////////////Approved BBC////////////////////////////////////////////////////////////
		
	///////////////////////////////Customer Balance is greater than Customer Insurance Limit////////////////////////////
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
	public void uninsuredCalnInIneligibleSummaryScreen() {

		ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
		
		String ClientData ="AUTO_INELIGIBLE_001";
		IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

		
		Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
        
        Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
        
        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
        
        Assert.assertTrue(IneligibleCalculationScreen.navigateToIneligibleSummary());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Navigation to the Ineligible Summary Screen is done sucessfully");
        
        String ReasonData = "Uninsured";
        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason(ReasonData));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
        
        String ReasonAmount = "48000";
        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount(ReasonAmount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
        
        
   	}


	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
	public void uninsuredCalnInBBCAvailabilityScreen() {

		ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
	
		String ClientData ="AUTO_INELIGIBLE_001";
		IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
	
	
		Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
    
		Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
    
		Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
    	
		Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Navigation to the BBC Availability Screen is done sucessfully");
    
		String ReasonData = "Uninsured";
		Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInBBCAvailability(ReasonData));
    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the BBC Availability Screen");
    	
    	String ReasonAmount = "48000";
    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability(ReasonAmount));
    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
    
    
	}

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
	public void uninsuredCalnInBBCReports() {

		ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
	
		String ClientData ="AUTO_INELIGIBLE_001";
		IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
	
	
		Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
    
		Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
    
		Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
    	
		Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReport());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generation of BBC Report is done sucessfully");
    		
    	String ReasonData = "Uninsured";
		Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInBBCReports(ReasonData));
    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the BBC Reports");
    	
    	String ReasonAmount = "48000";
    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports(ReasonAmount));
    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the BBC Reports");
    
    
	}
	
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
	public void uninsuredCalnInIneligibleReports_Reasons() {

		ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
	
		String ClientData ="AUTO_INELIGIBLE_001";
		IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
	
	
		Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
    
		Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
    
		Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
    	
		Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport1());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generating of Ineligible/Eligible Recivables Analysis By Reason Report is done sucessfully");
    		
    	String ReasonData = "Uninsured";
		Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports(ReasonData));
    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
    	
    	String ReasonAmount = "48000";
    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports(ReasonAmount));
    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
    
    
	}

	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
	public void uninsuredCalnInIneligibleReports_Debtor() {

		ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
	
		String ClientData ="AUTO_INELIGIBLE_001";
		IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
	
	
		Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
    
		Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
    
		Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
		
		
		Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generating of Ineligible/Eligible Recivables Analysis By Debtor Report is done sucessfully");
		
		String GroupBy = "Debtor";		
		Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on GroupBy Dropdown is done sucessfully");
		
		Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Clicking on HTML button is done sucessfully");
				
    	String ReasonData = "Uninsured";
		Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports(ReasonData));
    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
    	
    	String ReasonAmount = "48000";
    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports(ReasonAmount));
    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
    
    
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Clearing of all initial setup is done successfully for future use")
	public void ClearAllData1() {

		ExtentTestManager.getTest().getTest().setName("Clearing of all initial setup is done successfully for future use");
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
		
		String ClientData ="AUTO_INELIGIBLE_001";
		IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

		Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit2());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Setting of Insurance Limit Value is Done in Debtors screen.");
        
        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Recalculation of BBC is Done Successfully");
        
	}
	
	

	
	
	
	///////////////////////////////////////////////////LessThan/////////////////////////////////////////////////////////////////
			
		@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
		public void uninsuredCalnInIneligibleSummaryScreen_LesserThanInsuranceLimit() {

			ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
			
			String ClientData ="AUTO_INELIGIBLE_001";
			IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
			ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

			
			Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
	        
	        Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit1());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
	        
	        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
	        
	        Assert.assertTrue(IneligibleCalculationScreen.navigateToIneligibleSummary());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Navigation to the Ineligible Summary Screen is done sucessfully");
	        
	        String ReasonData = "Totals";
	        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason1(ReasonData));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
	        
	        String ReasonAmount = "0";
	        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount1(ReasonAmount));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
	        
	        
	   	}

	 


		@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
		public void uninsuredCalnInBBCAvailabilityScreen_LesserThanInsuranceLimit() {

			ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
		
			String ClientData ="AUTO_INELIGIBLE_001";
			IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
			ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
		
		
			Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
	    
			Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit1());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
	    
			Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
	    	
			Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Navigation to the BBC Availability Screen is done sucessfully");
	    
			String ReasonAmount = "0";
	    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability1(ReasonAmount));
	    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
	    
	    
		}

		@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
		public void uninsuredCalnInBBCReports_LesserThanInsuranceLimit() {

			ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
		
			String ClientData ="AUTO_INELIGIBLE_001";
			IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
			ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
		
		
			Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
	    
			Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit1());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
	    
			Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
	    	
			Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReport());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generation of BBC Report is done sucessfully");
	    		
	    	String ReasonAmount = "0";
	    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports1(ReasonAmount));
	    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the BBC Reports");
	    
	    
		}
		
		
		
		@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
		public void uninsuredCalnInIneligibleReports_Reasons_LesserThanInsuranceLimit() {

			ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
		
			String ClientData ="AUTO_INELIGIBLE_001";
			IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
			ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
		
		
			Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
	    
			Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit1());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
	    
			Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
	    	
			Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport1());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generating of Ineligible/Eligible Recivables Analysis By Reason Report is done sucessfully");
	    		
	    	String ReasonData = "Overall Total";
			Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports1(ReasonData));
	    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
	    	
	    	String ReasonAmount = "0";
	    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports1(ReasonAmount));
	    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
	    
	    
		}

		
		@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
		public void uninsuredCalnInIneligibleReports_Debtor_LesserThanInsuranceLimit() {

			ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
		
			String ClientData ="AUTO_INELIGIBLE_001";
			IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
			ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
		
		
			Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
	    
			Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit1());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
	    
			Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
						
			Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generating of Ineligible/Eligible Recivables Analysis By Debtor Report is done sucessfully");
			
			String GroupBy = "Debtor";		
			Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on GroupBy Dropdown is done sucessfully");
			
			Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Clicking on HTML button is done sucessfully");
					
	    	String ReasonData = "Total";
			Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports2(ReasonData));
	    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
	    	
	    	String ReasonAmount = "0";
	    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports2(ReasonAmount));
	    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
	    
	    
		}
		
		
		@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Clearing of all initial setup is done successfully for future use")
		public void ClearAllData2() {

			ExtentTestManager.getTest().getTest().setName("Clearing of all initial setup is done successfully for future use");
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
			
			String ClientData ="AUTO_INELIGIBLE_001";
			IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
			ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			   
	        Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit3());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Setting of Insurance Limit Value is Done in Debtors screen.");
	        
	        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Recalculation of bbc is done successfully");
		}
	
		///////////////////////////////////////////////////EqualsTo/////////////////////////////////////////////////////////////////
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleSummaryScreen_EqualsToInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        
		        String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit4());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.navigateToIneligibleSummary());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Navigation to the Ineligible Summary Screen is done sucessfully");
		        
		        String ReasonData = "Totals";
		        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason1(ReasonData));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
		        
		        String ReasonAmount = "0";
		        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount1(ReasonAmount));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
		        
		        
		   	}
			
			
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInBBCAvailabilityScreen_EqualsToInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ");
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
			
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			
			
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		    
				String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        				
				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit4());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		    
				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		    	
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Navigation to the BBC Availability Screen is done sucessfully");
		    
				String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
		    
		    
			}

			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInBBCReports_EqualsToInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ");
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
			
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			
			
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		    
				String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        				
				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit4());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		    
				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		    	
				Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Generation of BBC Report is done sucessfully");
		    		
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the BBC Reports");
		    
		    
			}
			
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleReports_Reasons_EqualsToInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ");
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
			
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			
			
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		    
				String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        				
				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit4());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		    
				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		    	
				
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport1());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Generating of Ineligible/Eligible Recivables Analysis By Reason Report is done sucessfully");
		    		
		    	String ReasonData = "Overall Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports1(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
		    	
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
		    
		    
			}

			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleReports_Debtor_EqualsToInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Equal to Insurance Limit ");
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
			
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			
			
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		    
				String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        
		    	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit4());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        
				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Generating of Ineligible/Eligible Recivables Analysis By Debtor Report is done sucessfully");
				
				String GroupBy = "Debtor";		
				Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Clicking on GroupBy Dropdown is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Clicking on HTML button is done sucessfully");
						
		    	String ReasonData = "Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports2(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
		    	
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports2(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step10:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
		    
		    
			}
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Clearing of all initial setup is done successfully for future use")
			public void ClearAllData3() {

				ExtentTestManager.getTest().getTest().setName("Clearing of all initial setup is done successfully for future use");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit8());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Setting of Insurance Limit Value is Done in Debtors screen.");
		        	        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Recalculation of BBC is Done Successfully");
		        
		          
		   	}
			
		
	
	///////////////////////////////////////////////////////////////////////////Negative//////////////////////////////////////////////////////////////
	
	
	
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInIneligibleSummaryScreen_NegativeInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Negative");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit5());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.navigateToIneligibleSummary());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Navigation to the Ineligible Summary Screen is done sucessfully");
		        
		        String ReasonData = "Totals";
		        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason1(ReasonData));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
		        
		        String ReasonAmount = "0";
		        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount1(ReasonAmount));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
		        
		        
		   	}
			
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInBBCAvailabilityScreen_NegativeInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Negative");
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
			
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit5());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
		        		    	
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Navigation to the BBC Availability Screen is done sucessfully");
		    
				String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
		    
		    
			}
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Report for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInBBCReports_NegativeInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Report for Approved BBC, when Customer Balance is Negative");
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
			
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit5());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generation of BBC Report is done sucessfully");
		    		
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the BBC Reports");
		    
		    
			}
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInIneligibleReports_Reasons_NegativeInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Negative");
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
			
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit5());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
		        
		        
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport1());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generating of Ineligible/Eligible Recivables Analysis By Reason Report is done sucessfully");
		    		
		    	String ReasonData = "Overall Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports1(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
		    	
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
		    
		    
			}
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInIneligibleReports_Debtors_NegativeInsuranceLimit() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Negative");
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
			
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit5());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
		        
		        
		        Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Generating of Ineligible/Eligible Recivables Analysis By Debtor Report is done sucessfully");
				
				String GroupBy = "Debtor";		
				Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on GroupBy Dropdown is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Clicking on HTML button is done sucessfully");
						
		    	String ReasonData = "Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports2(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
		    	
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports2(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
		    
		    
			}
			
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Clearing of all initial setup is done successfully for future use")
			public void ClearAllData4() {

				ExtentTestManager.getTest().getTest().setName("Clearing of all initial setup is done successfully for future use");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit10());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Setting of Insurance Limit Value is Done in Debtors screen.");
		        	        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Recalculation of BBC is Done Successfully");
		        
		          
		   	}
		
			//////////////////////////////////////////////////////////////////////////zero/////////////////////////////////////////////////////////////////
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInIneligibleSummaryScreen_DebtorBalance_Zero() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Zero");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        
		        String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit7());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.navigateToIneligibleSummary());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Navigation to the Ineligible Summary Screen is done sucessfully");
		        
		        String ReasonData = "Totals";
		        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason1(ReasonData));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
		        
		        String ReasonAmount = "0";
		        Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount1(ReasonAmount));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
		        
		        
		   	}
			
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInBBCAvailabilityScreen_DebtorBalance_Zero() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Zero");
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
			
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        
		        String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit7());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		        		    	
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Navigation to the BBC Availability Screen is done sucessfully");
		    
				String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
		    
		    
			}
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Report for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInBBCReports_DebtorBalance_Zero() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Report for Approved BBC, when Customer Balance is Zero");
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
			
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        
		        String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit7());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Generation of BBC Report is done sucessfully");
		    		
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Amount on the BBC Reports");
		    
		    
			}
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInIneligibleReports_Reasons_DebtorBalance_Zero() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Zero");
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
			
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        
		        String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit7());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		        
		        
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport1());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Generating of Ineligible/Eligible Recivables Analysis By Reason Report is done sucessfully");
		    		
		    	String ReasonData = "Overall Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports1(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
		    	
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports1(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
		    
		    
			}
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInIneligibleReports_Debtors_DebtorBalance_Zero() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Zero");
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
			
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
		        
		        String PageValue ="20";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
		        		        
		       	Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit7());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
		        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
		        
		        
		        Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleEligibleRecivablesAnalysisReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Generating of Ineligible/Eligible Recivables Analysis By Debtor Report is done sucessfully");
				
				String GroupBy = "Debtor";		
				Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Clicking on GroupBy Dropdown is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Clicking on HTML button is done sucessfully");
						
		    	String ReasonData = "Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports2(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
		    	
		    	String ReasonAmount = "0";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports2(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step10:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
		    
		    
			}
			
					
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Clearing of all initial setup is done successfully for future use")
			public void ClearAllData5() {

				ExtentTestManager.getTest().getTest().setName("Clearing of all initial setup is done successfully for future use");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");

				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit14());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Setting of Insurance Limit Value is Done in Debtors screen.");
		        	        
		        Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Recalculation of BBC is Done Successfully");
		        
		          
		   	}
			
/////////////////////////////////////////////////////////////////Approve BBC///////////////////////////////////////////////////////////			
			
///////////////////////////////Customer Balance is greater than Customer Insurance Limit////////////////////////////
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleSummaryScreen_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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

				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");


				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");

				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
				
				String SignatureData = "Basava";
				Assert.assertTrue(IneligibleCalculationScreen.approveTheBBC(SignatureData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Approval of BBC is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Clicking on the Records Per Page Dropdown is done Successfully");
				
		        Assert.assertTrue(IneligibleCalculationScreen.navigationToIneligibleSummary());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Navigation to Ineligible Summary Screen is Done Successfully");
				
				String ReasonData = "Uninsured";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
				
				String ReasonAmount = "48000";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step10:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
				
				
			}
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
			public void uninsuredCalnInBBCAvailabilityScreen_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
			
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
		    	
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability_History());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Navigation to the BBC Availability History Screen is done sucessfully");
				
				String ReasonData = "Uninsured";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInBBCAvailability(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Reason on the BBC Availability Screen");
		    	
		    	String ReasonAmount = "48000";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
		    
		    
			}

			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
			public void uninsuredCalnInBBCReports_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
			
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
		    	
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of BBC Report for Approved is done sucessfully");
		    		
		    	String ReasonData = "Uninsured";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInBBCReports(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Reason on the BBC Reports");
		    	
		    	String ReasonAmount = "48000";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the BBC Reports");
		    
		    
			}
			
			//////////////////////////////////////////////////////////////////
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleReports_Reasons_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
			
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
		    	
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleReasonReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation Ineligible Reason Report for Approved is done sucessfully");
				
		    	String ReasonData = "Uninsured";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
		    	
		    	String ReasonAmount = "48000";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
		    
		    
			}

			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleReports_Debtor_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is greater than Customer Insurance Limit ");
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
			
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
			
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
								
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleDebtorReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of Ineligible Debtor Report for Approved BBC is done sucessfully");
				
				String GroupBy = "Debtor";		
				Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Clicking on GroupBy Dropdown is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on HTML button is done sucessfully");
						
		    	String ReasonData = "Uninsured";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports(ReasonData));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
		    	
		    	String ReasonAmount = "48000";
		    	Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports(ReasonAmount));
		    	ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
		    
		    
			}

			
///////////////////////////////////////////////////LessThan/////////////////////////////////////////////////////////////////
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleSummaryScreen_LesserThanInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit1());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
				
				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
				
				String SignatureData = "Basava";
				Assert.assertTrue(IneligibleCalculationScreen.approveTheBBC(SignatureData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Approval of BBC is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Clicking on the Select BBC Dropdown is done Successfully");
		    					
				Assert.assertTrue(IneligibleCalculationScreen.navigationToIneligibleSummary());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Navigation to the Ineligible Summary History Screen is done sucessfully");
				
				String ReasonData = "Totals";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason1(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step10:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
				
				
				}



			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
			public void uninsuredCalnInBBCAvailabilityScreen_LesserThanInsuranceLimit_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
												
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
		    	
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability_History());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Navigation to the BBC Availability Screen is done sucessfully");
								
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability2(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
				
				
				}

			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Reports for Apprroved BBC, when Customer Balance is less than Customer Insurance Limit ")
			public void uninsuredCalnInBBCReports_LesserThanInsuranceLimit_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
								
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of BBC Report for approved is done sucessfully");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Amount on the BBC Reports");
				
				
				}



			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleReports_Reasons_LesserThanInsuranceLimit_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleReasonReportApproved(SelectBBCDate, SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String ReasonData = "Overall Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports1(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
				
				
				}

			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleReports_Debtor_LesserThanInsuranceLimit_Approved() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on theSelect BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleDebtorReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String GroupBy = "Debtor";		
				Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Clicking on GroupBy Dropdown is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on HTML button is done sucessfully");
				
				String ReasonData = "Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports2(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports2(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
				
				
				}		
			
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
			public void UnreleaseBBC() {

				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				String SelectApprovedClient ="AUTO_INELIGIBLE_001";
				Assert.assertTrue(IneligibleCalculationScreen.UnreleaseTheBBC(SelectApprovedClient ));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Unreleasinf of selected BBC  is done sucessfully");
								
			}
			
			
			
///////////////////////////////////////////////////EqualsTo/////////////////////////////////////////////////////////////////
			
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleSummaryScreen_EqualsToInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
				
				String PageValue ="20";
				Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit4());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
				
				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
				
				String SignatureData = "Basava";
				Assert.assertTrue(IneligibleCalculationScreen.approveTheBBC(SignatureData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Approval of BBC is done sucessfully");
								
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Clicking on the Select BBC Dropdown is done Successfully");
				
		        Assert.assertTrue(IneligibleCalculationScreen.navigationToIneligibleSummary());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Navigation to Ineligible Summary Screen is Done Successfully");
				
				String ReasonData = "Totals";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason1(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step10:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step11:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
				
				
				}
				
				
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInBBCAvailabilityScreen_EqualsToInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
		    	
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability_History());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Navigation to the BBC Availability Screen is done sucessfully");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability2(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
				
				
				}
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInBBCReports_EqualsToInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Reports for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Amount on the BBC Reports");
				
				
				}
				
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleReports_Reasons_EqualsToInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Equal To Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleReasonReportApproved(SelectBBCDate, SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of Report is done sucessfully");
				
				String ReasonData = "Overall Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports1(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
				
				
				}
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is less than Customer Insurance Limit ")
			public void uninsuredCalnInIneligibleReports_Debtor_EqualsToInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is less than Customer Insurance Limit ");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on theSelect BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleDebtorReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String GroupBy = "Debtor";		
				Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Clicking on GroupBy Dropdown is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on HTML button is done sucessfully");
				
				String ReasonData = "Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports2(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports2(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
				
				
				}

			
				///////////////////////////////////////////////////////////////////////////Negative//////////////////////////////////////////////////////////////
							
							
							
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInIneligibleSummaryScreen_NegativeInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Negative");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit5());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Setting of Insurance Limit Value is Done in Debtors screen.");
				
				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Recalculation of BBC is Done Successfully");
				
				String SignatureData = "Basava";
				Assert.assertTrue(IneligibleCalculationScreen.approveTheBBC(SignatureData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Approval of BBC is done sucessfully");
								
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Clicking on the Select BBC  Dropdown is done Successfully");
				
		        Assert.assertTrue(IneligibleCalculationScreen.navigationToIneligibleSummary());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Step8:Navigation to Ineligible Summary Screen is Done Successfully");
				
				String ReasonData = "Totals";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason1(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step10:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
				
				
				}
				
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInBBCAvailabilityScreen_NegativeInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Negative");
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
				
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
		    	
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability_History());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Navigation to the BBC Availability Screen is done sucessfully");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability2(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
				
				
				}
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Report for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInBBCReports_NegativeInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Report for Approved BBC, when Customer Balance is Negative");
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
				
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
								
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Amount on the BBC Reports");
				
				
				}
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInIneligibleReports_Reasons_NegativeInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Negative");
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
				
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleReasonReportApproved(SelectBBCDate, SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String ReasonData = "Overall Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports1(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
				
				
				}
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Negative")
			public void uninsuredCalnInIneligibleReports_Debtors_NegativeInsuranceLimit_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Negative");
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
				
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC  Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleDebtorReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String GroupBy = "Debtor";		
				Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on GroupBy Dropdown is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on HTML button is done sucessfully");
				
				String ReasonData = "Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports2(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports2(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
				
				
				}

			
//////////////////////////////////////////////////////////////////////////zero/////////////////////////////////////////////////////////////////
							
							
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInIneligibleSummaryScreen_DebtorBalance_Zero_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible Summary screen for Approved BBC, when Customer Balance is Zero");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				
				Assert.assertTrue(IneligibleCalculationScreen.selectUninsuiredReason());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Selecting of Uninsured as Ineligibility Reason is Done Successfully");
				
				String PageValue ="20";
				Assert.assertTrue(IneligibleCalculationScreen.ClickonRecordsPerPageDropdown(PageValue));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Records Per Page Dropdown is done Successfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.definingInsuranceLimit7());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Setting of Insurance Limit Value is Done in Debtors screen.");
				
				Assert.assertTrue(IneligibleCalculationScreen.recalculatingBBC());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Recalculation of BBC is Done Successfully");
				
				String SignatureData = "Basava";
				Assert.assertTrue(IneligibleCalculationScreen.approveTheBBC(SignatureData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Approval of BBC is done sucessfully");
								
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Clicking on the Select BBC Dropdown is done Successfully");
				
		        Assert.assertTrue(IneligibleCalculationScreen.navigationToIneligibleSummary());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step9:Navigation to Ineligible Summary Screen is Done Successfully");
				
				String ReasonData = "Totals";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReason1(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step10:Successfully Verified Ineligibility Reason on the Ineligible Summary Screen");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmount1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step11:Successfully Verified Ineligibility Amount on the Ineligible Summary Screen");
				
				
				}
				
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInBBCAvailabilityScreen_DebtorBalance_Zero_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Availability screen for Approved BBC, when Customer Balance is Zero");
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
				
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
								
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
		    	
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCAvailability_History());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Navigation to the BBC Availability Screen is done sucessfully");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCAvailability2(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Amount on the BBC Availability Screen");
				
				
				}
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in BBC Report for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInBBCReports_DebtorBalance_Zero_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in BBC Report for Approved BBC, when Customer Balance is Zero");
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
												
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingBBCReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountBBCReports1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Amount on the BBC Reports");
				
				
				}
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInIneligibleReports_Reasons_DebtorBalance_Zero_Approved() {
				
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Reason for Approved BBC, when Customer Balance is Zero");
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
									
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleReasonReportApproved(SelectBBCDate, SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String ReasonData = "Overall Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports1(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports1(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Reason Report");
				
				
				}
				
				
			@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Zero")
			public void uninsuredCalnInIneligibleReports_Debtors_DebtorBalance_Zero_Approved() {
			
				ExtentTestManager.getTest().getTest().setName("Check the Uninsured Calculation in Ineligible/Eligible Receivable Analysis Reports Group By Debtor for Approved BBC, when Customer Balance is Zero");
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
				
				String ClientData ="AUTO_INELIGIBLE_001";
				IneligibleUninsuiredReason IneligibleCalculationScreen = cyncHomePage.getCyncMenus().openIneligibleCalculation(ClientData);
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
								
				Assert.assertTrue(IneligibleCalculationScreen.navigationToBBCReviewData());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Navigation to the BBC Review Data is Done Successfully");
				
				String SelectBBC ="12/31/2017";
		        Assert.assertTrue(IneligibleCalculationScreen.ClickonSelectBBCDropdown(SelectBBC));
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Clicking on the Select BBC Dropdown is done Successfully");
				
		        String SelectBBCDate ="12/31/2017";
		        String SelectBBCStatus ="Approved";
				Assert.assertTrue(IneligibleCalculationScreen.generatingIneligibleDebtorReportApproved(SelectBBCDate,SelectBBCStatus));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Generation of  Report is done sucessfully");
				
				String GroupBy = "Debtor";		
				Assert.assertTrue(IneligibleCalculationScreen.ClickonGroupbyDropdown(GroupBy));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Clicking on GroupBy Dropdown is done sucessfully");
				
				Assert.assertTrue(IneligibleCalculationScreen.clickOnHTMlButton_EligileReport());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Clicking on HTML button is done sucessfully");
											
				String ReasonData = "Total";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityReasonInEligibleReports2(ReasonData));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully Verified Ineligibility Reason on the Ineligible/Eligible Receivable Analysis  GroupBy Debtor Report");
				
				String ReasonAmount = "0";
				Assert.assertTrue(IneligibleCalculationScreen.verifyIneligibilityAmountInEligibleReports2(ReasonAmount));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successfully Verified Ineligibility Amount on the Ineligible/Eligible Receivable Analysis GroupBy Debtor Report");
				
				
				}
				
				
						
							
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
