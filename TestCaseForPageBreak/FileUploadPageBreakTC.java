package com.cync.PageBreak;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.cync.BreakPages.ClientMaintenancePageBreak;
import com.cync.BreakPages.FileUploadPageBreak;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class FileUploadPageBreakTC extends BaseTest {
	static final Logger logger = Logger.getLogger(LoginPage.class);
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Create Skipped BBC Screen Under File Upload Module")
	public void navigateToCreateSkippedBBCScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Create Skipped BBC Screen Under File Upload Module");
		ExtentTestManager.getTest().assignCategory("Module: File Upload");

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
		FileUploadPageBreak FileUpload = cyncHomePage.getCyncMenus().openCreateSkippedBBC(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Create Skipped BBC Screen is done sucessfully");
		
		String HeaderData ="Create Skipped BBC";
		Assert.assertTrue(FileUpload.verifyCreateSkippedBBC(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Create Skipped BBC Screen Header is verified sucessfully",HeaderData);
	
	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the BBC Historical Data Upload Screen Under File Upload Module")
	public void navigateToBBCHistoricalDataUploadScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the BBC Historical Data Upload Screen Under File Upload Module");
		ExtentTestManager.getTest().assignCategory("Module: File Upload");

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
		FileUploadPageBreak FileUpload = cyncHomePage.getCyncMenus().openBBCHistoricalDataUpload(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the BBC Historical Data Upload Screen is done sucessfully");
		
		String HeaderData ="BBC Historical Data Upload";
		Assert.assertTrue(FileUpload.verifyBBCHistoricalDataUpload(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:BBC Historical Data Upload Screen Header is verified sucessfully",HeaderData);
	
	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the MapAndUpload Screen Under File Upload Module")
	public void navigateToMapAndUploadScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the MapAndUpload Screen Under File Upload Module");
		ExtentTestManager.getTest().assignCategory("Module: File Upload");

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
		FileUploadPageBreak FileUpload = cyncHomePage.getCyncMenus().openMapAndUpload(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Map And Upload Screen is done sucessfully");
		
		String HeaderData ="Map & Upload";
		Assert.assertTrue(FileUpload.verifyMapAndUpload(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Map And Upload Screen Header is verified sucessfully",HeaderData);
	
	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Collateral Loan Auto File Uploads Screen Under File Upload Module")
	public void navigateToCollateralLoanAutoFileUploads() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Collateral Loan Auto File Uploads Screen Under File Upload Module");
		ExtentTestManager.getTest().assignCategory("Module: File Upload");

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
		FileUploadPageBreak FileUpload = cyncHomePage.getCyncMenus().openCollateralLoanAutoFileUploads(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Collateral Loan Auto File Uploads Screen is done sucessfully");
		
		String HeaderData ="Collateral Loan Auto File Uploads";
		Assert.assertTrue(FileUpload.verifyCollateralLoanAutoFileUploads(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Collateral Loan Auto File Uploads Screen Header is verified sucessfully",HeaderData);
	
	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Collateral Loan Undo Screen Under File Upload Module")
	public void navigateToCollateralLoanUndoScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Collateral Loan Undo Screen Under File Upload Module");
		ExtentTestManager.getTest().assignCategory("Module: File Upload");

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
		FileUploadPageBreak FileUpload = cyncHomePage.getCyncMenus().openCollateralLoanUndo(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Collateral Loan Undo Screen is done sucessfully");
		
		String HeaderData ="Collateral Loan Undo";
		Assert.assertTrue(FileUpload.verifyCollateralLoanUndo(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Collateral Loan Undo Screen Header is verified sucessfully",HeaderData);
	
	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Mapping List View Screen Under File Upload Module")
	public void navigateToMappingListViewScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Mapping List View Screen Under File Upload Module");
		ExtentTestManager.getTest().assignCategory("Module: File Upload");

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
		FileUploadPageBreak FileUpload = cyncHomePage.getCyncMenus().openMappingListView1(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Mapping List View Screen is done sucessfully");
		
		String HeaderData ="Mapping List View";
		Assert.assertTrue(FileUpload.verifyMappingListView(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Mapping List View Screen Header is verified sucessfully",HeaderData);
	
	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the All Clients Upload Deposit Files Screen Under File Upload Module")
	public void navigateToAllClientsUploadDepositFilesScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the All Clients Upload Deposit Files Screen Under File Upload Module");
		ExtentTestManager.getTest().assignCategory("Module: File Upload");

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
		FileUploadPageBreak FileUpload = cyncHomePage.getCyncMenus().openAllClientsUploadDepositFiles(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the All Clients Upload Deposit Files Screen is done sucessfully");
		
		String HeaderData ="All Clients Upload Deposit Files";
		Assert.assertTrue(FileUpload.verifyAllClientsUploadDeposit(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:All Clients Upload Deposit Files Screen Header is verified sucessfully",HeaderData);
	
	}

}
