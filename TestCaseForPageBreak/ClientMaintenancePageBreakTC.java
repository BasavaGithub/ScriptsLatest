package com.cync.PageBreak;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.cync.BreakPages.ClientMaintenancePageBreak;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.IneligibleUninsuiredReason;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;


public class ClientMaintenancePageBreakTC extends BaseTest {
	static final Logger logger = Logger.getLogger(LoginPage.class);
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Client Summary Screen Under Client Maintenance Module")
	public void navigateToClientSummaryScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Client Summary Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openClientSummary();
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Client Summary Screen is done sucessfully");
		
		String HeaderData ="Client Summary";
		Assert.assertTrue(ClientMaintenance.verifyClientSummaryHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Client Summary Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Inactive Clients Screen Under Client Maintenance Module")
	public void navigateToInactiveClientsScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Inactive Clients Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openInactiveClients();
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Inactive Clients Screen is done sucessfully");
		
		String HeaderData ="Inactive Clients";
		Assert.assertTrue(ClientMaintenance.verifyInactiveClientsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Inactive Clients Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Basic Parameters Screen Under Client Maintenance Module")
	public void navigateToBasicParametersScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Basic Parameters Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openBasicParameters(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Basic Parameters Screen is done sucessfully");
		
		String HeaderData ="Basic Parameters";
		Assert.assertTrue(ClientMaintenance.verifyBasicParametersHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Basic Parameters Screen Header is verified sucessfully",HeaderData);
		
	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Ineligible Calculation Screen Under Client Maintenance Module")
	public void navigateToIneligibleCalculationScreen1() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Ineligible Calculation Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openIneligibleCalculations(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
		
		String HeaderData ="Ineligible Calculations";
		Assert.assertTrue(ClientMaintenance.verifyIneligibleCalculationsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Ineligible Calculation Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Collateral Advance Rate Screen Under Client Maintenance Module")
	public void navigateToCollateralAdvanceRateScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Collateral Advance Rate Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openCollateralAdvanceRate(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Collateral Advance Rate Screen is done sucessfully");
		
		String HeaderData ="Collateral Advance Rate: DIV";
		Assert.assertTrue(ClientMaintenance.verifyCollateralAdvanceRateHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Ineligible Collateral Advance Rate Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Seasonal Advance Rate Screen Under Client Maintenance Module")
	public void navigateToSeasonalAdvanceRateScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Seasonal Advance Rate Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openSeasonalAdvanceRate(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Seasonal Advance Rate Screen is done sucessfully");
		
		String HeaderData ="Seasonal Advance Rates";
		Assert.assertTrue(ClientMaintenance.verifySeasonalAdvanceRateHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Seasonal Advance Rate Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Bucket Aging Screen Under Client Maintenance Module")
	public void navigateToBucketAgingScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Bucket Aging Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openBucketAging(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Bucket Aging Screen is done sucessfully");
		
		String HeaderData ="AR Bucket Aging";
		Assert.assertTrue(ClientMaintenance.verifyBucketAgingHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Bucket Aging Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the BBC Files Required Screen Under Client Maintenance Module")
	public void navigateToBBCFilesRequiredScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the BBC Files Required Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openBBCFilesRequired(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the BBC Files Required Screen is done sucessfully");
		
		String HeaderData ="BBC Files Required";
		Assert.assertTrue(ClientMaintenance.verifyBBCFilesRequiredHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:BBC Files Required Screen Header is verified sucessfully",HeaderData);

	}
	//////////////////////////////////////////
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Client BBC Options Screen Under Client Maintenance Module")
	public void navigateToClientBBCOptionsScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Client BBC Options Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openClientBBCOptions(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Client BBC Options Screen is done sucessfully");
		
		String HeaderData ="Client BBC Options";
		Assert.assertTrue(ClientMaintenance.verifyClientBBCOptionsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Client BBC Options Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Other Files Required Screen Under Client Maintenance Module")
	public void navigateToOtherFilesRequiredScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Other Files Required Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openOtherFilesRequired(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Other Files Required Screen is done sucessfully");
		
		String HeaderData ="Other Files Required";
		Assert.assertTrue(ClientMaintenance.verifyOtherFilesRequiredHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Other Files Required Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Activity Tickler Screen Under Client Maintenance Module")
	public void navigateToActivityTicklerScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Activity Tickler Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openActivityTickler(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Activity Tickler Screen is done sucessfully");
		
		String HeaderData ="Activity Tickler";
		Assert.assertTrue(ClientMaintenance.verifyActivityTicklerHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Activity Tickler Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Comments Screen Under Client Maintenance Module")
	public void navigateToCommentsScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Comments Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openComments(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Comments Screen is done sucessfully");
		
		String HeaderData ="Comments";
		Assert.assertTrue(ClientMaintenance.verifyCommentsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Comments Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Report Comments Screen Under Client Maintenance Module")
	public void navigateToReportCommentsScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Report Comments Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openReportComments(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Report Comments Screen is done sucessfully");
		
		String HeaderData ="Report Comments";
		Assert.assertTrue(ClientMaintenance.verifyReportCommentsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Report Comments Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Exceptions Screen Under Client Maintenance Module")
	public void navigateToExceptionsScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Exceptions Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openExceptions(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Calculation Screen is done sucessfully");
		
		String HeaderData ="Exceptions";
		Assert.assertTrue(ClientMaintenance.verifyExceptionsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Exceptions Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Funding Style Screen Under Client Maintenance Module")
	public void navigateToFundingStyleScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Funding Style Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openFundingStyle(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Funding Style Screen is done sucessfully");
		
		String HeaderData ="Funding Style";
		Assert.assertTrue(ClientMaintenance.verifyFundingStyleHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Funding Style Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Collateral Reserves Screen Under Client Maintenance Module")
	public void navigateToCollateralReservesScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Collateral Reserves Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openCollateralReserves(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Collateral Reserves Screen is done sucessfully");
		
		String HeaderData ="Collateral Reserves";
		Assert.assertTrue(ClientMaintenance.verifyCollateralReservesHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Collateral Reserves Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Asset Amortization Screen Under Client Maintenance Module")
	public void navigateToAssetAmortizationScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Asset Amortization Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openAssetAmortization(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Asset Amortization Screen is done sucessfully");
		
		String HeaderData ="Asset Amortization";
		Assert.assertTrue(ClientMaintenance.verifyAssetAmortizationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Asset Amortization Screen Header is verified sucessfully",HeaderData);

	}
	/////////////////////////////////////////////////////////////
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Mapping List View Screen Under Client Maintenance Module")
	public void navigateToMappingListViewScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Mapping List View Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openMappingListView(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Mapping List View Screen is done sucessfully");
		
		String HeaderData ="Mapping List View";
		Assert.assertTrue(ClientMaintenance.verifyMappingListViewHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Mapping List View Screen Header is verified sucessfully",HeaderData);

	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Create ABL Client Screen Under Client Maintenance Module")
	public void navigateToCreateABLClientScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Create ABL Client Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openCreateABLClient(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Create ABL Client Screen is done sucessfully");
		
		String HeaderData ="Client Information";
		Assert.assertTrue(ClientMaintenance.verifyCreateABLClientHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Create ABL Client Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Create Factoring Client Screen Under Client Maintenance Module")
	public void navigateToCreateFactoringClientScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Create Factoring Client Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openCreateFactoringClient(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to theCreate Factoring Client Screen is done sucessfully");
		
		String HeaderData ="Client Information";
		Assert.assertTrue(ClientMaintenance.verifyCreateFactoringClientHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Create Factoring Client Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Basic Client Details Screen Under Client Maintenance Module")
	public void navigateToBasicClientDetailsScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Basic Client Details Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openBasicClientDetails(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Basic Client Details Screen is done sucessfully");
		
		String HeaderData ="Basic Client Detail";
		Assert.assertTrue(ClientMaintenance.verifyBasicClientDetailsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Basic Client Details Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Mail Address Screen Under Client Maintenance Module")
	public void navigateToMailAddressScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Mail Address Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openMailAddress(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Mail Address Screen is done sucessfully");
		
		String HeaderData ="Mail Address";
		Assert.assertTrue(ClientMaintenance.verifyMailAddressHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Mail Address Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Contacts Screen Under Client Maintenance Module")
	public void navigateToContactsScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Contacts Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openContacts(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Contacts Screen is done sucessfully");
		
		String HeaderData ="Contacts";
		Assert.assertTrue(ClientMaintenance.verifyContactsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Contacts Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Miscellaneous Screen Under Client Maintenance Module")
	public void navigateToMiscellaneousScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Miscellaneous Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openMiscellaneous(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Miscellaneous Screen is done sucessfully");
		
		String HeaderData ="Miscellaneous";
		Assert.assertTrue(ClientMaintenance.verifyMiscellaneousHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Miscellaneous Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Legal Content Screen Under Client Maintenance Module")
	public void navigateToLegalContentScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Legal Content Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openLegalContent(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Legal Content Screen is done sucessfully");
		
		String HeaderData ="Legal Content";
		Assert.assertTrue(ClientMaintenance.verifyLegalContentHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Legal Content Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Guarantors Screen Under Client Maintenance Module")
	public void navigateToGuarantorsScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Guarantors Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openGuarantors(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Guarantors Screen is done sucessfully");
		
		String HeaderData ="Guarantors";
		Assert.assertTrue(ClientMaintenance.verifyGuarantorsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Guarantors Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Loan Fees Screen Under Client Maintenance Module")
	public void navigateToLoanFeesScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Loan Fees Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openLoanFees(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Loan Fees Screen is done sucessfully");
		
		String HeaderData ="Loan Terms";
		Assert.assertTrue(ClientMaintenance.verifyLoanFeesHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Loan Fees Screen Header is verified sucessfully",HeaderData);

	}
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Ineligible Advances Screen Under Client Maintenance Module")
	public void navigateToIneligibleAdvancesScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Ineligible Advances Screen Under Client Maintenance Module");
		ExtentTestManager.getTest().assignCategory("Module: Client Maintenance");

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
		ClientMaintenancePageBreak ClientMaintenance = cyncHomePage.getCyncMenus().openIneligibleAdvances(ClientData);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Ineligible Advances Screen is done sucessfully");
		
		String HeaderData ="Ineligible Customer Parameters";
		Assert.assertTrue(ClientMaintenance.verifyIneligibleAdvancesHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Ineligible Advances Screen Header is verified sucessfully",HeaderData);

	}
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	

