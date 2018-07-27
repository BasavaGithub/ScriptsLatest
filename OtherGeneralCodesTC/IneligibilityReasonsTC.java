package com.cync.AdminTS;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.IneligibilityReasonsPage;
import com.cync.pages.LoginPage;
import com.cync.pages.SalesRegion;
import com.cync.pages.SystemParametersPage;
import com.cync.pages.TemplatesPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class IneligibilityReasonsTC extends BaseTest {
	static final Logger logger = Logger.getLogger(LoginPage.class);
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Verify Navigation to Ineligibility Reasons")
	public void navigateIneligibilityReasons() {

		ExtentTestManager.getTest().getTest().setName("Verify Navigation to Ineligibility Reasons");
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

		// navigate menu
		IneligibilityReasonsPage IneligiblityReasons = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to  Ineligibility Reasons page done succesfully");

	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify page Header On Ineligibility Reasons")
	public void  pageHeaderOnIneligibilityReasons(){
		ExtentTestManager.getTest().getTest().setName("Verify page Header On Ineligibility Reasons");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		//Step2:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified Ineligibility-Reasons page header",ineligibilityreasonsHeader);
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons CodeField_UI")
	public void  verifyIneligibilityReasonsCodeField(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons CodeField_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify the UI of Code field on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsColoumnUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified Ineligibility Reasons Code Field UI On the Ineligibility Reasons screen");
			
	}	
	
	///////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons Description Field_UI")
	public void  verifyDescriptionField(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons Description Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify the UI of Description field on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.DescriptionColoumnUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified Description Field UI On the Ineligibility Reasons screen");
			
	}	
	
	//////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons System Defined Field_UI")
	public void  verifySystemDefinedField(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons System Defined Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify the UI of System Defined field on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.SystemDefinedColoumnUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified System Defined Field UI On the Ineligibility Reasons screen");
			
	}	
	
	/////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons Calculate On Negative Eligible Balance Field")
	public void  verifyCalculateOnNegativeEligibleBalanceField(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons Calculate On Negative Eligible Balance Field");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify the UI of Calculate On Negative Eligible Balance field on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.CalculateonNegativeEligibleBalanceColoumnUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Calculate On Negative Eligible Balance Field UI On the Ineligibility Reasons screen");
			
	}	
	
	////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons Calculate On Negative Debtor Balance Field")
	public void  verifyCalculateOnNegativeDebtorBalanceField(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons Calculate On Negative Debtor Balance Field");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify the UI of Calculate On Negative Debtor Balance field on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.CalculateonNegativeDebtorBalanceColoumnUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Calculate On Negative Debtor Balance Field UI On the Ineligibility Reasons screen");
			
	}	
	
	////////////
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons Breadcrumb")
	public void  pageBreadcrumbOnIneligibilityReasons(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons Breadcrumb");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String ineligibilityreasonsBreadcrumb="ABL  Other General Codes  Ineligibility Reasons";
		
		//Step2:verify the Ineligibility-Reasons page breadcrumb
		Assert.assertEquals(IneligibilityReasonsPage.breadcrumb(ineligibilityreasonsBreadcrumb),"ABL  Other General Codes ; Ineligibility Reasons");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified Ineligibility-Reasons page breadcrumb",ineligibilityreasonsBreadcrumb);
		
	}
	
	//////////
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons CenatralizedSearchUI")
	public void  verifyCenatralizedSearchUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons CenatralizedSearchUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify the UI of Cenatralized Search field on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.CenatralizedSearchUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Cenatralized Search UI On the Ineligibility Reasons screen");
			
	}		
	
	////////////////
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons AddIconUI")
	public void  verifyAddIconUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons AddIconUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify the UI of Add Icon  on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.AddIconUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Add Icon UI On the Ineligibility Reasons screen");
			
	}	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons ExportIconUI")
	public void  verifyExportIconUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons ExportIconUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify the UI of Add Icon  on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.ExportIconUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Export Icon UI On the Ineligibility Reasons screen");
			
	}	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add header")
	public void  ineligibilityReasonsAdd(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add header");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
		
		
		String ineligibilityreasonsaddHeader="Ineligibility Reasons - Add";
		//Step3:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsAddHeader(ineligibilityreasonsaddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully  verified the Ineligibility Reason add page header");
			
	}	
	//////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Reason Code Field_UI")
	public void  verifyIneligibilityReasonsCodeFieldAddUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Reason Code Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on ADD button");
		
		//Step2:verify the UI of Code field on Ineligibility Reason add screen
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsCodeFieldAddUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Ineligibility Reasons Code Field Add UI On the Ineligibility Reasons Add screen");
			
	}	
	
	///////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Description Field_UI")
	public void  verifyDescriptionFieldAddUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Description Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on ADD button");
		
		//Step2:verify the UI of Description field on Ineligibility Reason addscreen
		Assert.assertTrue(IneligibilityReasonsPage.DescriptionFieldAddUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Description Field Add UI On the Ineligibility Reasons Add screen");
			
	}	
	
	/////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Description Field_UI")
	public void  verifyCalculateOnNegativeEligibleBalanceAddUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Description Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on ADD button");
		
		//Step2:verify the UI of Calculate On Negative Eligible Balance field on Ineligibility Reason Add screen
		Assert.assertTrue(IneligibilityReasonsPage.CalculateOnNegativeEligibleBalanceAddUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Calculate On Negative Eligible Balance Add UI On the Ineligibility Reasons Add screen");
			
	}
	
	////////////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add CalculateOnNegativeDebtorBalance Field_UI")
	public void  verifyCalculateOnNegativeDebtorBalanceAddUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add CalculateOnNegativeDebtorBalance Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on ADD button");
		
		//Step2:verify the UI of Calculate On Negative Debtor Balance field on Ineligibility Reason Add screen
		Assert.assertTrue(IneligibilityReasonsPage.CalculateOnNegativeDebtorBalanceAddUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Calculate On Negative Debtor Balance Add UI On the Ineligibility Reasons Add screen");
			
	}
	
	//////////////
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add CodeMandatorydUI")
	public void  IneligibilityCodeMandatorydUIIneligibilityReason(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add CodeMandatorydUI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage=cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reason to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
		
		//Step3:Verify Code Mandatory  UI On the Ineligibility Reason add screen
		Assert.assertTrue(IneligibilityReasonsPage.ineligibilityCodeAddMandatoryUIValidation());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified code Mandatory  UI On the Ineligibility Reason add screen");
		
		
		
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add DescriptionMandatoryUI")
	public void  DescriptionMandatoryUIIneligibilityReasonAdd(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add DescriptionMandatoryUI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage=cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reason to open page");
				
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
		
		//Step3:Verify Description Mandatory  UI On the Ineligibility Reason add screen
		Assert.assertTrue(IneligibilityReasonsPage.descriptionAddMandatoryUIValidation());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Description Mandatoryd  UI On the Ineligibility Reason add screen");
		
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add CheckboxUI For CalculateOnNegativeEligibleBalance")
	public void  CheckboxUIForCalculateOnNegativeEligibleBalance(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add CheckboxUI For CalculateOnNegativeEligibleBalance");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage=cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reason to open page");
				
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
		
		//Step3:Verify Checkbox UI validation For Calculate On Negative Eligible Balance On the Ineligibility Reason add screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxForCalculateOnNegativeEligibleBalance());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Checkbox UI validation For Calculate On Negative Eligible Balance On the Ineligibility Reason add screen");
		
		
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons CheckboxUI For CalculateOnNegativeDebtorBalance")
	public void  CheckboxUICalculateOnNegativeDebtorBalance(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons CheckboxUI For CalculateOnNegativeDebtorBalance");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage=cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reason to open page");
				
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
		
		//Step3:Verify Checkbox UI validation For Calculate On Negative Debtor Balance On the Ineligibility Reason add screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxForCalculateOnNegativeDebtorBalance());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successful verified Checkbox UI validation For Calculate On Negative Debtor Balance On the Ineligibility Reason add screen");
		
		
		
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Save Button UI")
	public void  verifySaveAddUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Save Button UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
		
		//Step2:verify Save button UI on Ineligibility Reason Add screen
		Assert.assertTrue(IneligibilityReasonsPage.SaveAddUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Save button UI on the Ineligibility Reasons Add screen");
			
	}	
	
	///////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add SaveAndNew Button UI")
	public void  SaveAndNewUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add SaveAndNew Button UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
		
		//Step2:verify Save And New button UI on Ineligibility Reason Add screen
		Assert.assertTrue(IneligibilityReasonsPage.SaveAndNewUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Save And New button UI On the Ineligibility Reasons Add screen");
			
	}	
	
	///////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Cancel Button UI")
	public void  verifyCancelAddUI(){
		ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Cancel Button UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
		
		
		//Step2:verify Cancel button UI on Ineligibility Reason Add screen
		Assert.assertTrue(IneligibilityReasonsPage.CancelAddUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Cancel button UI On the Ineligibility Reasons Add screen");
			
	}	
	////////////////////////////
	

	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Valid_Data_By_Save")
	public void  addIneligibilityReasonWithValidDataBySave(){
		
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Valid_Data_By_Save");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="BTest";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="Atest";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String SuccessMsgData="Record Created Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
		/*String SuccessMsgData="Rec Crea Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData),"Rec Crea Successfully");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
	    */
	}
	/////////////////////

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Valid_Data_By_SaveAndNew")
	public void  addIneligibilityReasonWithValidDataBySaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Valid_Data_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="AutD";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTest";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveAndNewIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on SaveAndNew button on Ineligibility Reason add screen sucessfully");
		
		
		/*String SuccessMsgData="Record Created Successfullyttt";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave(SuccessMsgData),"Record Created Successfullyttt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
		*/
		String SuccessMsgData="Record Created Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
		String ineligibilityreasonsaddHeader="Ineligibility Reasons - Add";
		//Step7:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsAddHeader(ineligibilityreasonsaddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully  verified the Ineligibility Reason add page header");
		
		
	    
	}
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Valid_Data_By_Cancel")
	public void  addIneligibilityReasonWithValidDataByCancel(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Valid_Data_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="AutD";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTest";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditPageCancelButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on Cancel button on Ineligibility Reason add screen sucessfully");
		
		
		/*String SuccessMsgData="Record Created Successfullyttt";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave(SuccessMsgData),"Record Created Successfullyttt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
		*/
	/*	String SuccessMsgData="Record Created Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");*/
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		//Step7:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully  verified the Ineligibility Reason page header");
		
		
	    
	}
	
	//6/1/2018
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Duplicate_Data_By_Save")
	public void  addIneligibilityReasonWithDuplicateDataBySave(){
		
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Duplicate_Data_By_Save");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="BTest";
		
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="Atest";
		
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String SuccessMsgData="Ineligibility Reason Code has already been taken";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of success message is done successfully.");
		
		/*String SuccessMsgData="Rec Crea Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData),"Rec Crea Successfully");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
	    */
	}
	/////////////////////

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Duplicate_Data_By_SaveAndNew")
	public void  addIneligibilityReasonWithDuplicateDataBySaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Duplicate_Data_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="AutD";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTest";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the  text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveAndNewIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on SaveAndNew button on Ineligibility Reason add screen sucessfully");
		
		
		/*String SuccessMsgData="Record Created Successfullyttt";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave(SuccessMsgData),"Record Created Successfullyttt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
		*/
		String SuccessMsgData="Ineligibility Reason Code has already been taken";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
		String ineligibilityreasonsaddHeader="Ineligibility Reasons - Add";
		//Step7:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsAddHeader(ineligibilityreasonsaddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully  verified the Ineligibility Reason add page header");
		
		
	    
	}
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Duplicate_Data_By_Cancel")
	public void  addIneligibilityReasonWithDuplicateDataByCancel(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Duplicate_Data_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="AutD";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTest";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditPageCancelButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on Cancel button on Ineligibility Reason add screen sucessfully");
		
		
		/*String SuccessMsgData="Record Created Successfullyttt";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave(SuccessMsgData),"Record Created Successfullyttt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
		*/
	/*	String SuccessMsgData="Record Created Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");*/
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		//Step7:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully  verified the Ineligibility Reason page header");
		
		
	    
	}
	////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_reason_data_by_Save")
	public void  reasonAddInvalidBySave(){
		
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_reason_data_by_Save");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="AutomationTest";
		
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="Atest";
		
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String SuccessMsgData="Ineligibility Reason Code is too long (maximum is 5 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of success message is done successfully.");
		
		/*String SuccessMsgData="Rec Crea Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData),"Rec Crea Successfully");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
	    */
	}
	/////////////////////

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_reason_data_by_SaveAndNew")
	public void  reasonAddInvalidBySaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_reason_data_by_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="AutomationTest";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTesst";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveAndNewIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on SaveAndNew button on Ineligibility Reason add screen sucessfully");
		
		
		/*String SuccessMsgData="Record Created Successfullyttt";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave(SuccessMsgData),"Record Created Successfullyttt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
		*/
		String SuccessMsgData="Ineligibility Reason Code is too long (maximum is 5 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of success message is done successfully.");
		
		String ineligibilityreasonsaddHeader="Ineligibility Reasons - Add";
		//Step7:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsAddHeader(ineligibilityreasonsaddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully  verified the Ineligibility Reason add page header");
		
		
	    
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_reason_data_by_Cancel")
	public void  reasonAddInvalidByCancel(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_reason_data_by_Cancel");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="AutomationTest";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTesst";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		/*//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveAndNewIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "clicked on save button on Ineligibility Reason add screen sucessfully");
		*/
		
		/*String SuccessMsgData="Record Created Successfullyttt";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave(SuccessMsgData),"Record Created Successfullyttt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
		*/
		/*String SuccessMsgData="Ineligibility Reason Code is too long (maximum is 5 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");*/
		
		//step5:clickOnEditPageCancelButton
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditPageCancelButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on Cancel button on Ineligibility Reason add screen sucessfully");
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		//Step7:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully  verified the Ineligibility Reason page header");
				
	}
////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_Description_data_by_Save")
	public void  descriptionAddInvalidBySave(){
		
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_Description_data_by_Save");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="Auto";
		
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTestggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
		
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String SuccessMsgData="Description is too long (maximum is 50 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of success message is done successfully.");
		
		/*String SuccessMsgData="Rec Crea Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData),"Rec Crea Successfully");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
	    */
	}
	/////////////////////

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_Description_data_by_SaveAndNew")
	public void  descriptionAddInvalidBySaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_Description_data_by_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="Auto";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTestggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveAndNewIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on SaveAndNew button on Ineligibility Reason add screen sucessfully");
		
		
		/*String SuccessMsgData="Record Created Successfullyttt";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave(SuccessMsgData),"Record Created Successfullyttt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
		*/
		String SuccessMsgData="Description is too long (maximum is 50 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
		String ineligibilityreasonsaddHeader="Ineligibility Reasons - Add";
		//Step7:verify the header of the Ineligibility Reason add page
      Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsAddHeader(ineligibilityreasonsaddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully  verified the Ineligibility Reason add page header");
		
		
	    
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_Description_data_by_Cancel")
	public void  descriptionAddInvalidByCancel(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_Description_data_by_Cancel");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="Auto";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData),"Auto");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTestggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditPageCancelButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on Cancel button on Ineligibility Reason add screen sucessfully");
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		//Step7:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully  verified the Ineligibility Reason page header");
				
	}	
////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_ReasonAndDescription_data_by_Save")
	public void  reasonAndDescriptionAddInvalidBySave(){
		
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_ReasonAndDescription_data_by_Save");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="Autoffffffffffffffff";
		
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTestggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
		
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String SuccessMsgData="Ineligibility Reason Code is too long (maximum is 5 characters), Description is too long (maximum is 50 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
		/*String SuccessMsgData="Rec Crea Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData),"Rec Crea Successfully");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
	    */
	}
	/////////////////////

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_ReasonAndDescription_data_by_SaveAndNew")
	public void  reasonAndDescriptionAddInvalidBySaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_ReasonAndDescription_data_by_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="Autoffffffffff";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTestggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveAndNewIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on SaveAndNew button on Ineligibility Reason add screen sucessfully");
		
		
		/*String SuccessMsgData="Record Created Successfullyttt";
		//Step6:Verifying of message is done successfully.
		Assert.assertEquals(IneligibilityReasonsPage.verifyMessageOnAfterSave(SuccessMsgData),"Record Created Successfullyttt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
		*/
		String SuccessMsgData="Ineligibility Reason Code is too long (maximum is 5 characters), Description is too long (maximum is 50 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
		String ineligibilityreasonsaddHeader="Ineligibility Reasons - Add";
		//Step7:verify the header of the Ineligibility Reason add page
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsAddHeader(ineligibilityreasonsaddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully  verified the Ineligibility Reason add page header");
		
		
	    
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Add_Invalid_ReasonAndDescription_data_by_Cancel")
	public void  reasonAndDescriptionAddInvalidByCancel(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Add_Invalid_ReasonAndDescription_data_by_Cancel");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on Ineligibility Reason add button");
	
		String codeData="Autoffffffffff";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="AutomatinTestggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditPageCancelButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on Edit button on Ineligibility Reason add screen sucessfully");
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		//Step7:verify the header of the Ineligibility Reason add page
        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully  verified the Ineligibility Reason page header");
						
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ReasonFieldSearch_UI")
	public void  verifyIneligibilityReasonsFieldSearchUI(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ReasonFieldSearch_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify Ineligibility Reasons Field Search UI
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsFieldSearchUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Ineligibility Reasons Field Search UI On the Ineligibility Reasons screen");
			
	}	
	
	//////////////////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_DescriptionFieldSearch_UI")
	public void  verifyDescriptionFieldSearchUI(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_DescriptionFieldSearch_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify Description Field Search UI
		Assert.assertTrue(IneligibilityReasonsPage.DescriptionFieldSearchUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Description Field Search UI On the Ineligibility Reasons screen");
			
	}	
	
	///////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_MasterCheckBoxUI")
	public void  verifyMasterCheckBoxUI(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_MasterCheckBoxUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify Master Checkbox  UI
		Assert.assertTrue(IneligibilityReasonsPage.MasterCheckBoxUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Master Checkbox  UI On the Ineligibility Reasons screen");
			
	}	
	
	//////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ScrollUI")
	public void  verifyScrollUI(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ScrollUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify Scroll  UI
		Assert.assertTrue(IneligibilityReasonsPage.ScrollUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Scroll UI On the Ineligibility Reasons screen");
			
	}	
	
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_BottomRecordsUI")
	public void  verifyBottomRecordsUI(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_BottomRecordsUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:verify Bottom Records UI
		Assert.assertTrue(IneligibilityReasonsPage.BottomRecordsUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Bottom Records UI On the Ineligibility Reasons screen");
			
	}	
	
	/////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_EditIconVerificationByWithoutSelectingExistingRecord")
	public void  EditIconVerificationByWithoutSelectingExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_EditIconVerificationByWithoutSelectingExistingRecord");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:Edit Icon Verification By without Selecting Existing Record
		Assert.assertTrue(IneligibilityReasonsPage.EditIconVerificationByWithoutSelectingRecord());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Edit Icon By without Selecting Existing Record On the Ineligibility Reasons screen");
			
	}	
	/////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_EditIconVerificationBySelectingExistingRecord")
	public void  EditIconVerificationBySelectingExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_30");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:Edit Icon Verification By Selecting Existing Record
		Assert.assertTrue(IneligibilityReasonsPage.EditIconVerificationBySelectingExistingRecord());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected one record On the Ineligibility Reasons screen");
			
		Assert.assertTrue(IneligibilityReasonsPage.editIconStatus());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Edit Icon By Selecting Existing Record On the Ineligibility Reasons screen");
		
	}
	
	
	//////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_EditIconVerificationBySelectingMultipleRecords")
	public void  EditIconVerificationBySelectingMultipleRecords(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_31");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:Edit Icon Verification By Selecting Multiple Records
		Assert.assertTrue(IneligibilityReasonsPage.EditIconVerificationBySelectingMultipleRecords());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully  Selected  Multiple Record On the Ineligibility Reasons screen");
			
		Assert.assertTrue(IneligibilityReasonsPage.editIconStatus());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Edit Icon By Selecting  Multiple Records On the Ineligibility Reasons screen");
		
	}	
	
	///////////////////////////
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_DeleteIconVerificationByWithoutSelectingExistingRecord")
	public void  DeleteIconVerificationByWithoutSelectingExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_32");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:Delete Icon Verification By without Selecting Existing Record
		Assert.assertTrue(IneligibilityReasonsPage.DeleteIconVerificationByWithoutSelectingRecord());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Delete Icon By without Selecting Existing Record On the Ineligibility Reasons screen");
			
	}	
	/////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_DeleteIconVerificationBySelectingExistingRecord")
	public void  DeleteIconVerificationBySelectingExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_DeleteIconVerificationBySelectingExistingRecord");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:Delete Icon Verification By Selecting Existing Record
		Assert.assertTrue(IneligibilityReasonsPage.DeleteIconVerificationBySelectingExistingRecord());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Delete Icon By Selecting Existing Record On the Ineligibility Reasons screen");
			
	}	
	
	//////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_DeleteIconVerificationBySelectingMultipleRecords")
	public void  DeleteIconVerificationBySelectingMultipleRecords(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_DeleteIconVerificationBySelectingMultipleRecords");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:Delete Icon Verification By Selecting Multiple Records
		Assert.assertTrue(IneligibilityReasonsPage.DeleteIconVerificationBySelectingMultipleRecords());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected  Multiple Records On the Ineligibility Reasons screen");
		
		Assert.assertTrue(IneligibilityReasonsPage.deleteIconStatus());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Delete Icon By Selecting Multiple Records On the Ineligibility Reasons screen");
		
	}	
	
	//////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_centrolizedSearch_ByGiving_ValidData")
	public void  centrolizedSearchByGivingValidData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_centrolizedSearch_ByGiving_ValidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String validDataForCentrolizedSeacrh="ntest";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(IneligibilityReasonsPage.centrolizedSearchByGivingValidData(validDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Centralized Search text box");
		
		
		//Step3:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.validCentrolizedSeacrh(validDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the ineligibility reasons screen");
	    
	}
	
	/////////////////////////

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_closeButton_VerifivationFor_CentrolizedSearch")
	public void  closeButtonVerifivationForCentrolizedSearch(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_closeButton_VerifivationFor_CentrolizedSearch");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String validDataForCentrolizedSeacrh="ntest";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(IneligibilityReasonsPage.centrolizedSearchByGivingValidData(validDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Centralized Search text box");
		
		//Step3:Successfully verified Close button for Centrrolized search bar
		Assert.assertTrue(IneligibilityReasonsPage.closeButtonVerifivationForCentrolizedSearch());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Close button for Centrrolized search bar");
		
	
	}
	
	/////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_centrolizedSearch_ByGiving_InvalidData")
	public void  centrolizedSearchByGivingInvalidData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_centrolizedSearch_ByGiving_InvalidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String invalidDataForCentrolizedSeacrh="hkdfjkgh";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(IneligibilityReasonsPage.centrolizedSearchByGivingInalidData(invalidDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Centralized Search text box");
		
		String noRecordsFoundMessage = "No records found";
		//Step3:Succesfully verified No Record Found Notification Message
		Assert.assertTrue(IneligibilityReasonsPage.noRecordsFound(noRecordsFoundMessage));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Succesfully verified No Record Found Notification Message on the ineligibility reasons screen");
	    
	}
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_closeButton_VerifivationFor_CentrolizedSearch_InvalidData")
	public void  closeButtonVerifivationForCentrolizedSearchInvalidData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_closeButton_VerifivationFor_CentrolizedSearch_InvalidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String invalidDataForCentrolizedSeacrh="hkdfjkgh";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(IneligibilityReasonsPage.centrolizedSearchByGivingValidData(invalidDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Centralized Search text box");
		
		//Step3:Successfully verified Close button for Centrrolized search bar
		Assert.assertTrue(IneligibilityReasonsPage.closeButtonVerifivationForCentrolizedSearch());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Close button for Centrrolized search bar");
		
	
	}
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ReasonSearch_ByGiving_ValidData")
	public void  reasonSearchByGivingValidData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ReasonSearch_ByGiving_ValidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String validDataForReasonSeacrh="ntest";
		
		//Step2:add the data to the Reason Search text box
		Assert.assertTrue(IneligibilityReasonsPage.reasonSearchByGivingValidData(validDataForReasonSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Reason Search text box");
		
	
		//Step3:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.validReasonSeacrh(validDataForReasonSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the ineligibility reasons screen");
	    
	}
	
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ReasonSearch_ByGiving_InvalidData")
	public void  reasonSearchByGivingInvalidData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ReasonSearch_ByGiving_InvalidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String invalidDataForReasonSeacrh="hkdfjkgh";
		//Step2:add the data to the Reason Search text box
		Assert.assertTrue(IneligibilityReasonsPage.reasonSearchByGivingInalidData(invalidDataForReasonSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Reason Search  text box");
		
		String noRecordsFoundMessage = "No records found";
		//Step3:Succesfully verified No Record Found Notification Message
		Assert.assertTrue(IneligibilityReasonsPage.noRecordsFound(noRecordsFoundMessage));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the ineligibility reasons screen");
	    
	}
	
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_DescriptionSearch_ByGiving_validData")
	public void  descriptionSearchByGivingValidData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_DescriptionSearch_ByGiving_validData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String validDataForDescriptionSeacrh="bgsdt";
		
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(IneligibilityReasonsPage.descriptionSearchByGivingValidData(validDataForDescriptionSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the DescriptionS earch text box");
		
		
		//Step3:Successfully verified serched data on the ineligibility reasons screen
		Assert.assertTrue(IneligibilityReasonsPage.validDescriptionSeacrh(validDataForDescriptionSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the ineligibility reasons screen");
	    
	}
	
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_DescriptionSearch_ByGiving_InvalidData")
	public void  descriptionSearchByGivingInvalidData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_DescriptionSearch_ByGiving_InvalidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		String invalidDataForDescriptionSeacrh="hkdfjkgh";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(IneligibilityReasonsPage.descriptionSearchByGivingInalidData(invalidDataForDescriptionSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Description Search text box");
		
		String noRecordsFoundMessage = "No records found";
		//Step3:add the data to the Centralized Search text box
		Assert.assertTrue(IneligibilityReasonsPage.noRecordsFound(noRecordsFoundMessage));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the ineligibility reasons screen");
	    
	}
	
	
	//////////////////////////////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Without_Adding_Reason_By_Save")
	public void  addIneligibilityReasonWithoutAddingReasonWithSave(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Without_Adding_Reason_By_Save");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="";
		
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="basava";
		
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String ReasonWarningMsgData="Enter Ineligibility Reason Code";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyReasonWarningMsg(ReasonWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Successs message is done successfully.");
	    
	}
	
	/////////////////////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Without_Adding_Description_By_Save")
	public void  addIneligibilityReasonWithoutAddingDescriptionWithSave(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Without_Adding_Description_By_Save");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="Basavaa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String DescriptionWarningMsgData="Enter Description";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyDescriptionWarningMsg(DescriptionWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	    
	}
	/////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Without_Adding_Reason_By_SaveAndNew")
	public void  addIneligibilityReasonWithoutAddingReasonWithSaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Without_Adding_Reason_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="";
		
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="basava";
		
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveAndNewIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on SaveAndNew button on Ineligibility Reason add screen sucessfully");
		
		
		String ReasonWarningMsgData="Enter Ineligibility Reason Code";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyReasonWarningMsg(ReasonWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	    
	}
	
	/////////////////////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Without_Adding_Description_By_SaveAndNew")
	public void  addIneligibilityReasonWithoutAddingDescriptionWithSaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Without_Adding_Description_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="Basavaa";
		
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="";
		
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveAndNewIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on SaveAndNew button on Ineligibility Reason add screen sucessfully");
		
		
		String DescriptionWarningMsgData="Enter Description";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyDescriptionWarningMsg(DescriptionWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	    
	}
	
	
	///////////////////////////////////////////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Without_Adding_Description_By_Cancel")
	public void  addIneligibilityReasonWithoutAddingDescriptionWithCancel(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Without_Adding_Description_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="Basavaa";
		
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="";
		
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.cancelIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on Cancel button on Ineligibility Reason add screen sucessfully");
		
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		//Step2:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully verified Ineligibility-Reasons page header",ineligibilityreasonsHeader);
		
	}
	
	/////////////////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Without_Adding_Reason_By_Cancel")
	public void  addIneligibilityReasonWithoutAddingReasonWithCancel(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Without_Adding_Reason_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:click on the add button in Ineligibility Reason page
		Assert.assertTrue(IneligibilityReasonsPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on Ineligibility Reason add button");
	
		String codeData="";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the code text box");
		
		String descriptionData="basava";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.cancelIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on Cancel button on Ineligibility Reason add screen sucessfully");
		
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		
		//Step2:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully verified Ineligibility-Reasons page header",ineligibilityreasonsHeader);
		
	}
	
	///////////////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_Header")
	public void  verifyIneligibilityEditHeader(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_Header");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
		
		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");
		
		//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the edit button on the Ineligibility reasons screen");
			
		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified Ineligibility-Reasons Edit page header");
		
		
	}	
		
		/*String codeData="AU";
		//Step3:add the data to the Code text box
		Assert.assertEquals(IneligibilityReasonsPage.addValueToCodeTextBox(codeData),"AU");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing  data to the code text box");
		
		String descriptionData="AutoTEst";
		//Step4:add  data to the Description text box
		Assert.assertEquals(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData),"AutoTEst");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to the name text box");
		
		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveIneligibilityReasons());
		ExtentTestManager.getTest().log(LogStatus.PASS, "clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String SuccessMsgData="Record Updated Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");*/
		
	
		///////////////////
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_By_Adding_ValidData")
		public void  verifyEditByAddingValidData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_By_Adding_ValidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");

		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");

		//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the edit button on the Ineligibility reasons screen");

		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified Ineligibility-Reasons Edit page header");
			
		String codeData="aaaa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully passing  data to the code text box");

		String descriptionData="bbbb";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully passing data to the Description text box");

		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveonEditScreen());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:clicked on save button on Ineligibility Reason add screen sucessfully");


		String SuccessMsgData="Record Updated Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Verifying of Success message is done successfully.");

	}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_By_Adding_Duplicate_Data")
		public void  verifyEditByAddingDuplicateData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_By_Adding_Duplicate_Data");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");

		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");

		//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the edit button on the Ineligibility reasons screen");

		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified Ineligibility-Reasons Edit page header");
			
		String codeData="aa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully passing  data to the code text box");

		String descriptionData="bb";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully passing data to the Description text box");

		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveonEditScreen());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:clicked on save button on Ineligibility Reason add screen sucessfully");


		String SuccessMsgData="Ineligibility Reason Code has already been taken";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Verifying of Success message is done successfully.");

	}
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_By_Adding_Invalid_Reason_Data")
		public void  verifyEditByAddingInvalidReasonData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_By_Adding_Invalid_Reason_Data");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");

		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");

		//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the edit button on the Ineligibility reasons screen");

		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified Ineligibility-Reasons Edit page header");
			
		String codeData="aaaaaaaaaa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfullyly passing  data to the code text box");

		String descriptionData="bb";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully passing data to the Description text box");

		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveonEditScreen());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:clicked on save button on Ineligibility Reason add screen sucessfully");


		String SuccessMsgData="Ineligibility Reason Code is too long (maximum is 5 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Verifying of Success message is done successfully.");

	}
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_By_Adding_Invalid_Description_Data")
		public void  verifyEditByAddingInvalidDescriptionData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_By_Adding_Invalid_Description_Data");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");

		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");

		//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the edit button on the Ineligibility reasons screen");

		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified Ineligibility-Reasons Edit page header");
			
		String codeData="aaa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully passing  data to the code text box");

		String descriptionData="bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully passing data to the Description text box");

		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveonEditScreen());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:clicked on save button on Ineligibility Reason add screen sucessfully");


		String SuccessMsgData="Description is too long (maximum is 50 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Verifying of Success message is done successfully.");

	}
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_By_Adding_Invalid_ReasonAndDescription_Data")
		public void  verifyEditByAddingInvalidReasonAndDescriptionData(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_By_Adding_Invalid_ReasonAndDescription_Data");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");

		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");

		//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the edit button on the Ineligibility reasons screen");

		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified Ineligibility-Reasons Edit page header");
			
		String codeData="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully passing  data to the code text box");

		String descriptionData="bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully passing data to the Description text box");

		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveonEditScreen());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:clicked on save button on Ineligibility Reason add screen sucessfully");


		String SuccessMsgData="Ineligibility Reason Code is too long (maximum is 5 characters), Description is too long (maximum is 50 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Verifying of Success message is done successfully.");

	}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_CancelOnReason")
		public void  verifyCancelOnReasonEdit(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_CancelOnReason");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");

		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");

		//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the edit button on the Ineligibility reasons screen");

		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified Ineligibility-Reasons Edit page header");
			
		String codeData="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully passing  data to the code text box");

		String descriptionData="bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully passing data to the Description text box");

		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.cancelonEditScreen());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:clicked on save button on Ineligibility Reason add screen sucessfully");

		String ineligibilityreasonsHeader="Ineligibility Reasons";
		
		//Step2:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step8:Successful verified Ineligibility-Reasons page header",ineligibilityreasonsHeader);
		

	}
		
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_ClickingExistingRecord_Save")
		public void  verifyIneligibilityEditSaveByClickExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_ClickingExistingRecord_Save");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");

		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.clickOnExistingRecord());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");

		/*//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");*/

		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Edit page header");
			
		String codeData="aaa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing  data to the code text box");

		String descriptionData="bbb";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully passing data to the Description text box");

		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.saveonEditScreen());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:clicked on save button on Ineligibility Reason add screen sucessfully");


		String SuccessMsgData="Record Updated Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Verifying of Success message is done successfully.");

	}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Edit_ClickingExistingRecord_Cancel")
		public void  verifyIneligibilityEditCancelByClickExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Edit_ClickingExistingRecord_Cancel");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");

		//Step1:click on Ineligibility Reason to open page
		IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");

		//Step2:First Check box selected on Ineligibility Reason screen
		Assert.assertTrue(IneligibilityReasonsPage.clickOnExistingRecord());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");

		/*//Step2:Click on edit button
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");*/

		String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
		//Step3:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Edit page header");
			
		String codeData="aaaa";
		//Step3:add the data to the Code text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToCodeTextBox(codeData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing  data to the code text box");

		String descriptionData="bbbb";
		//Step4:add  data to the Description text box
		Assert.assertTrue(IneligibilityReasonsPage.addValueToDescriptionTextBox(descriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully passing data to the Description text box");

		//step5:click on save
		Assert.assertTrue(IneligibilityReasonsPage.clickOnEditPageCancelButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:clicked on save button on Ineligibility Reason add screen sucessfully");
		
		
		String ineligibilityreasonsHeader="Ineligibility Reasons";
		
		//Step2:verify the Ineligibility Reason page header
		Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsHeader(ineligibilityreasonsHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Successfully verified Ineligibility-Reasons page header",ineligibilityreasonsHeader);
		

	}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Delete_By_Selecting_ExistingRecord")
		public void  verifyDeleteBySelectingExistingRecord(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Delete_By_Selecting_ExistingRecord");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:First Check box selected on Ineligibility Reason screen
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnDeleteButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the Delete button on the Ineligibility reasons screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.clickOnYesButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully clicked on the Yes button on the Ineligibility reasons screen");
			
			
			String SuccessMsgData="Records Deleted Successfully";
			//Step6:Verifying of message is done successfully.
			Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Verifying of Success message is done successfully.");
			
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_Delete_By_Selecting_MultipleRecords")
		public void  verifyDeleteBySelectingMultipleRecords(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_Delete_By_Selecting_MultipleRecords");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:First Check box selected on Ineligibility Reason screen
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the Ineligibility reasons screen");
			
			//Step2:First Check box selected on Ineligibility Reason screen
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection1());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully Selected Second record on the Ineligibility reasons screen");
		
			//Step2:First Check box selected on Ineligibility Reason screen
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection2());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully Selected Third record on the Ineligibility reasons screen");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnDeleteButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Successfully clicked on the Delete button on the Ineligibility reasons screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.clickOnYesButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Successfully clicked on the Yes button on the Ineligibility reasons screen");
			
			
			String SuccessMsgData="Records Deleted Successfully";
			//Step6:Verifying of message is done successfully.
			Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Verifying of Success message is done successfully.");
			
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ExportPopupUI_HeaderUI")
		public void  verifyExportPopUI_HeaderUI(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ExportPopupUI_HeaderUI");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
						
			String ExportPopUpHeader="Ineligibility Reasons";
			//Step2:verify the Ineligibility Reason page header
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUpHeaderUI(ExportPopUpHeader));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons page header",ExportPopUpHeader);
			
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ExportPopupUI_CheckBox_ReasonCode")
		public void  verifyExportPopUI_CheckBox_ReasonCode(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ExportPopupUI_CheckBox_ReasonCode");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUICheckBoxReasonCode());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the Export PopUp CheckBox button Reason Code");
						
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ExportPopupUI_CheckBox_Description")
		public void  verifyExportPopUI_CheckBox_Description(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ExportPopupUI_CheckBox_Description");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUICheckBoxDescription());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the Export PopUp CheckBox button Description");
						
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ExportPopupUI_CheckBox_SystemDefined")
		public void  verifyExportPopUI_CheckBox_SystemDefined(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ExportPopupUI_CheckBox_SystemDefined");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUICheckBoxSystemDefined());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the Export PopUp CheckBox button System Defined");
						
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ExportPopupUI_CheckBox_EligibleBalance")
		public void  verifyExportPopUI_CheckBox_EligibleBalance(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ExportPopupUI_CheckBox_EligibleBalance");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUICheckBoxEligibleBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the Export PopUp CheckBox button EligibleBalance");
						
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_ExportPopupUI_CheckBox_DebtorBalance")
		public void  verifyExportPopUI_CheckBox_DebtorBalance(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_ExportPopupUI_CheckBox_DebtorBalance");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUICheckBoxDebtorBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the Export PopUp CheckBox button DebtorBalance");
						
		}
		
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__ReasonCode_Header")
		public void  verifyExportPopUI_Header_ReasonCode(){
			ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__ReasonCode_Header");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
						
			String ExportPopUpHeader="Ineligibility Reason Code";
			//Step2:verify the Ineligibility Reason page header
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUpReasonHeaderUI(ExportPopUpHeader));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Export PopUp Reason header",ExportPopUpHeader);
			
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__Description_Header")
		public void  verifyExportPopUI_Header_Description(){
			ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__Description_Header");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
						
			String ExportPopUpHeader="Description";
			//Step2:verify the Ineligibility Reason page header
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUpDescriptionHeaderUI(ExportPopUpHeader));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Export PopUp Description header",ExportPopUpHeader);
			
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__SystemDefined_Header")
		public void  verifyExportPopUI_Header_SystemDefined(){
			ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__SystemDefined_Header");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
						
			String ExportPopUpHeader="System Defined";
			//Step2:verify the Ineligibility Reason page header
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUpSysDefinedHeaderUI(ExportPopUpHeader));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Export PopUp System Defined header",ExportPopUpHeader);
			
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__EligibleBalance_Header")
		public void  verifyExportPopUI_Header_EligibleBalance(){
			ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__EligibleBalance_Header");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
						
			String ExportPopUpHeader="Calculate on Negative Eligible Balance";
			//Step2:verify the Ineligibility Reason page header
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUpEligibleBalanceHeaderUI(ExportPopUpHeader));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Export PopUp Eligible Balance header",ExportPopUpHeader);
			
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__DebtorBalance_Header")
		public void  verifyExportPopUI_Header_DebtorBalance(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_02");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the Export button on the Ineligibility reasons screen");
				
						
			String ExportPopUpHeader="Calculate on Negative Debtor Balance";
			//Step2:verify the Ineligibility Reason page header
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUpDebtorBalanceHeaderUI(ExportPopUpHeader));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Export PopUp Debtor Balance header",ExportPopUpHeader);
			
		} 
		
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__CloseButtonUI")
		public void  verifyExportPopUI_CloseButtonUI(){
			ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__CloseButtonUI");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUpCloseButtonUI());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Export PopUp Close Button UI");
				
						
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__ExportButtonUI")
		public void  verifyExportPopUI_ExportButtonUI(){
			ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__ExportButtonUI");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.exportPopUpExportButtonUI());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Ineligibility-Reasons Export PopUp Export Button UIr");
				
						
		} 
		
		
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_02")
		public void  ExportOnIneligibilityReasons_ReasonCheckBoxExport(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_02");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDescription());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForSystemDefined());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForEligibleBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDebtorBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
				
						
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_02")
		public void  ExportOnIneligibilityReasons_DescriptionCheckBoxExport(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_02");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForReason());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForSystemDefined());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForEligibleBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDebtorBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
				
						
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_02")
		public void  ExportOnIneligibilityReasons_SystemDefinedCheckBoxExport(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_02");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForReason());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDescription());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			/*Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForSystemDefined());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			*/
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForEligibleBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDebtorBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
				
						
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_02")
		public void  ExportOnIneligibilityReasons_EligibleBalanceCheckBoxExport(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_02");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForReason());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDescription());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForSystemDefined());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			/*Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForEligibleBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			*/
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDebtorBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
				
						
		} 
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Ineligibility_Reason_02")
		public void  ExportOnIneligibilityReasons_DebtorBalanceCheckBoxExport(){
			ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_02");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForReason());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDescription());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForSystemDefined());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForEligibleBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
			/*Assert.assertTrue(IneligibilityReasonsPage.selectCheckBoxForDebtorBalance());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			*/
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
			
				
						
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportByWithoutSelectingRecords")
		public void  verifyExportByWithoutSelectingRecords(){
			ExtentTestManager.getTest().getTest().setName("verifyExportByWithoutSelectingRecords");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			/*//Step2:First Check box selected on Ineligibility Reason screen
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful Selected first record on the Ineligibility reasons screen");
			*/
			//Step2:Click on edit button
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the Ineligibility reasons screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(IneligibilityReasonsPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility-Reasons Export PopUp Export Button");
			
			
		/*	String SuccessMsgData="Records Deleted Successfully";
			//Step6:Verifying of message is done successfully.
			Assert.assertTrue(IneligibilityReasonsPage.verifyMessageOnAfterSave1(SuccessMsgData));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verifying of message is done successfully.");
			*/
		}
		
		
	
		///////////////////////////////////////////////////////////////EDIT///////////////////////////////////////////////////////////////
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add header")
		public void  ineligibilityReasonsEditHeader(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add header");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
			

			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:click on the add button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step2:click on the add button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			
			String IneligibilityReasonEdit="Ineligibility Reasons - Edit";
			//Step3:verify the header of the Ineligibility Reason add page
	        Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsEditHeader(IneligibilityReasonEdit));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully  verified the Ineligibility Reason Edit page header");
				
		}	
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Reason Code Field_UI")
		public void  verifyIneligibilityReasonsCodeFieldEditUI(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Reason Code Field_UI");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:click on the add button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step2:click on the add button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			//Step2:verify the UI of reason field on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.IneligibilityReasonsCodeFieldEditUI());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  reason field  UI On the Ineligibility Reasons edit screen");
				
		}
		
		///////////////////
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Description Field_UI")
		public void  verifyDescriptionFieldEditUI(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Description Field_UI");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:click on the add button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step2:click on the add button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			//Step2:verify the UI of description field on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.DescriptionFieldEditUI());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  description field  UI On the Ineligibility Reasons edit screen");
				
		}
		
		/////////////////
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Description Field_UI")
		public void  verifyCalculateOnNegativeEligibleBalanceEditUI(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Description Field_UI");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:click on the add button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step2:click on the add button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			//Step2:verify the UI of Calculate On Negative Eligible Balance field on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.CalculateOnNegativeEligibleBalanceEditUI());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  Calculate On Negative Eligible Balance  UI On the Ineligibility Reasons Edit screen");
				
		}
		
		////////////////
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add CalculateOnNegativeDebtorBalance Field_UI")
		public void  verifyCalculateOnNegativeDebtorBalanceEditUI(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add CalculateOnNegativeDebtorBalance Field_UI");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Select any one checkbox
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step3:click on the edit button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			
			//Step4:verify CalculateOnNegativeDebtorBalance field ui Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.CalculateOnNegativeDebtorBalanceEditUI());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  CalculateOnNegativeDebtorBalance field UI  On the Ineligibility Reasons Edit screen");
				
		}
		
		//////////////
		
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add CodeMandatorydUI")
		public void  IneligibilityCodeMandatorydUIIneligibilityReasonEdit(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add CodeMandatorydUI");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
			
			

			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Select any one checkbox
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step3:click on the edit button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			
			//Step4:verify mandatory UI for reason field on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.ineligibilityCodeAddMandatoryUIValidation_Edit());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  mandatory UI for reason field On the Ineligibility Reasons Edit screen");
				
		}
		
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add DescriptionMandatoryUI")
		public void  DescriptionMandatoryUIIneligibilityReasonEdit(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add DescriptionMandatoryUI");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
			

			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Select any one checkbox
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step3:click on the edit button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			
			//Step4:verify mandatory UI for descriptionfield on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.descriptionAddMandatoryUIValidation_Edit());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  mandatory UI for descriptionfield On the Ineligibility Reasons Edit screen");
				
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add CheckboxUI For CalculateOnNegativeEligibleBalance")
		public void  CheckboxUIForCalculateOnNegativeEligibleBalanceEdit(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add CheckboxUI For CalculateOnNegativeEligibleBalance");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
			

			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Select any one checkbox
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step3:click on the edit button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			
			//Step4:verify Checkbox UI for CalculateOnNegativeEligibleBalance on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxForCalculateOnNegativeEligibleBalanceEdit());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  CalculateOnNegativeEligibleBalance checkbox UI On the Ineligibility Reasons Edit screen");
				
		}
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons CheckboxUI For CalculateOnNegativeDebtorBalance")
		public void  CheckboxUICalculateOnNegativeDebtorBalanceEdit(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons CheckboxUI For CalculateOnNegativeDebtorBalance");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
			

			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Select any one checkbox
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step3:click on the edit button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			
			//Step4:verify Checkbox UI for CalculateOnNegativeDebtorBalance on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxForCalculateOnNegativeDebtorBalanceEdit());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  CalculateOnNegativeDebtorBalance checkbox UI On the Ineligibility Reasons Edit screen");
				
		}	
		
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Save Button UI")
		public void  verifyIneligibilityReasonEditSaveUI(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Save Button UI");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Select any one checkbox
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step3:click on the edit button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			
			//Step4:verify Save button UI on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.editSaveUI());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  Cancel button UI On the Ineligibility Reasons Edit screen");
				
		}	
	
		///////////////
		
		@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Ineligibility Reasons-Add Cancel Button UI")
		public void  verifyIneligibilityReasonEditCancelUI(){
			ExtentTestManager.getTest().getTest().setName("Verify Ineligibility Reasons-Add Cancel Button UI");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on Ineligibility Reason to open page
			IneligibilityReasonsPage IneligibilityReasonsPage = cyncHomePage.getCyncMenus().openIneligibilityReasons();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on Ineligibility Reasons to open page");
			
			//Step2:Select any one checkbox
			Assert.assertTrue(IneligibilityReasonsPage.checkBoxSelection());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected on checkbox on Ineligibility Reason screen");
			
			//Step3:click on the edit button in Ineligibility Reason page
			Assert.assertTrue(IneligibilityReasonsPage.clickOnEditButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on Ineligibility Reason Edit button");
			
			
			//Step4:verify Cancel button UI on Ineligibility Reason Edit screen
			Assert.assertTrue(IneligibilityReasonsPage.CancelEditUI());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully verified  Cancel button UI On the Ineligibility Reasons Edit screen");
				
		}	
	
	
	
	
	
	
	
	

}
