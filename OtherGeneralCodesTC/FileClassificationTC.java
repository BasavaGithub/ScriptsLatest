package com.cync.AdminTS;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cync.base.BaseTest;
import com.cync.base.CyncMenus;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.FileClassification;
import com.cync.pages.IneligibilityReasonsPage;
import com.cync.pages.LoginPage;
import com.cync.pages.SalesRegion;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class FileClassificationTC extends BaseTest {
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Verify Navigation to File Classification Page")
	public void navigateToFileClassification() {

		ExtentTestManager.getTest().getTest().setName("Verify Navigation to File Classification Page");
		ExtentTestManager.getTest().assignCategory("Module: ABL");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();

		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		// navigate menu
		FileClassification FileClassification = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to  File Classification page done succesfully");

	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification page Header")
	public void  verifyFile_ClassificationHeaderdUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification Page Header");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassification = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String HeaderData = "File Classification - Summary";
		//Step2:verify the UI of Code field on File Classification screen
		Assert.assertTrue(FileClassification.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Header UI On the File Classification screen",HeaderData);
			
	}	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification Classification Name Field UI")
	public void  verifyFile_ClassificationNameFieldUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification Classification Name Field UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassification = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:verify the UI of Code field on File Classification screen
		Assert.assertTrue(FileClassification.classificationNameFieldUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified Classification Name  Field UI On the File Classification screen");
			
	}	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification Description  Field UI")
	public void  verifyFile_DescriptionFieldUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification Description Field UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassification = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:verify the UI of Code field on File Classification screen
		Assert.assertTrue(FileClassification.descriptionFieldUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified Classification Name  Field UI On the File Classification screen");
			
	}
	

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification Breadcrumb")
	public void  pageBreadcrumbOnFileClassification(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification Breadcrumb");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String FileClassificationBreadcrumb="ABL  Other General Codes  File Classification";
		
		//Step2:verify the Ineligibility-Reasons page breadcrumb
		Assert.assertTrue(FileClassificationPage.breadcrumb(FileClassificationBreadcrumb));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified File Classification page breadcrumb",FileClassificationBreadcrumb);
		
	}
	
	//////////
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification CenatralizedSearchUI")
	public void  verifyCenatralizedSearchUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification CenatralizedSearchUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:verify the UI of Cenatralized Search field on File Classification screen
		Assert.assertTrue(FileClassificationPage.CenatralizedSearchUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Cenatralized Search UI On the File Classification screen");
			
	}		
	
	////////////////
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification Classification Field SearchUI")
	public void  verifyClassificationSearchUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification Classification Field SearchUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:verify the UI of Cenatralized Search field on File Classification screen
		Assert.assertTrue(FileClassificationPage.classificationNameSearchUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Classification Field SearchUI On the File Classification screen");
			
	}		
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification Description Field SearchUI")
	public void  verifyDescriptionSearchUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification Description Field SearchUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:verify the UI of Cenatralized Search field on File Classification screen
		Assert.assertTrue(FileClassificationPage.DescriptionFieldSearchUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified   Description Search UI On the File Classification screen");
			
	}		
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification Add Icon UI")
	public void  verifyAddIconUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification Add Icon UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:verify the UI of Cenatralized Search field on File Classification screen
		Assert.assertTrue(FileClassificationPage.AddIconUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Add Icon UI On the File Classification screen");
			
	}	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classification Export Icon UI")
	public void  verifyExportIconUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classification Export Icon UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:verify the UI of Cenatralized Search field on File Classification screen
		Assert.assertTrue(FileClassificationPage.ExportIconUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Export Icon UI On the File Classification screen");
			
	}	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_MasterCheckBoxUI")
	public void  verifyMasterCheckBoxUI(){
		ExtentTestManager.getTest().getTest().setName("Ineligibility_Reason_MasterCheckBoxUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:verify Master Checkbox  UI
		Assert.assertTrue(FileClassificationPage.MasterCheckBoxUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Master Checkbox  UI On the File Classification screen");
			
	}	
	
	//////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_ScrollUI")
	public void  verifyScrollUI(){
		ExtentTestManager.getTest().getTest().setName("File Classification_ScrollUI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:verify Scroll  UI
		Assert.assertTrue(FileClassificationPage.ScrollUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Scroll UI On the File Classification screen");
			
	}	

	/////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_EditIconVerificationBySelectingExistingRecord")
	public void  EditIconVerificationBySelectingExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("File Classification_EditIconVerificationBySelectingExistingRecord");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:Edit Icon Verification By Selecting Existing Record
		Assert.assertTrue(FileClassificationPage.EditIconVerificationBySelectingExistingRecord());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected one record On the File Classification_EditIconVerificationBySelectingExistingRecord screen");
			
		Assert.assertTrue(FileClassificationPage.editIconStatus());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Edit Icon By Selecting Existing Record On the File Classification screen");
		
	}
	
	
	//////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_EditIconVerificationBySelectingMultipleRecords")
	public void  EditIconVerificationBySelectingMultipleRecords(){
		ExtentTestManager.getTest().getTest().setName("File Classification_EditIconVerificationBySelectingMultipleRecords");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:Edit Icon Verification By Selecting Multiple Records
		Assert.assertTrue(FileClassificationPage.EditIconVerificationBySelectingMultipleRecords());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully  Selected  Multiple Record On the File Classification screen");
			
		Assert.assertTrue(FileClassificationPage.editIconStatus());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Edit Icon By Selecting  Multiple Records On the File Classification screen");
		
	}	
	
	//////////////////////////	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_DeleteIconVerificationBySelectingExistingRecord")
	public void  DeleteIconVerificationBySelectingExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("File Classification_DeleteIconVerificationBySelectingExistingRecord");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:Delete Icon Verification By Selecting Existing Record
		Assert.assertTrue(FileClassificationPage.DeleteIconVerificationBySelectingExistingRecord());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Delete Icon By Selecting Existing Record On the File Classification screen");
		
		Assert.assertTrue(FileClassificationPage.deleteIconStatus());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Edit Icon By Selecting  Multiple Records On the File Classification screen");
		
	}	
	
	//////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_DeleteIconVerificationBySelectingMultipleRecords")
	public void  DeleteIconVerificationBySelectingMultipleRecords(){
		ExtentTestManager.getTest().getTest().setName("File Classification_DeleteIconVerificationBySelectingMultipleRecords");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:Delete Icon Verification By Selecting Multiple Records
		Assert.assertTrue(FileClassificationPage.DeleteIconVerificationBySelectingMultipleRecords());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully selected  Multiple Records On the File Classification screen");
		
		Assert.assertTrue(FileClassificationPage.deleteIconStatus());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified  Delete Icon By Selecting Multiple Records On the File Classification screen");
		
	}	
	

	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_centrolizedSearch_ByGiving_ValidData")
	public void  centrolizedSearchByGivingValidData(){
		ExtentTestManager.getTest().getTest().setName("File Classification_centrolizedSearch_ByGiving_ValidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String validDataForCentrolizedSeacrh="auto";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(FileClassificationPage.centrolizedSearchByGivingValidData(validDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Centralized Search text box");
		
		
		//Step3:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.validCentrolizedSeacrh(validDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the File Classification screen");
	    
	}
	
	/////////////////////////

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_closeButton_VerifivationFor_CentrolizedSearch")
	public void  closeButtonVerifivationForCentrolizedSearch(){
		ExtentTestManager.getTest().getTest().setName("File Classification_closeButton_VerifivationFor_CentrolizedSearch");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String validDataForCentrolizedSeacrh="auto";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(FileClassificationPage.centrolizedSearchByGivingValidData(validDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Centralized Search text box");
		
		//Step3:Successfully verified Close button for Centrrolized search bar
		Assert.assertTrue(FileClassificationPage.closeButtonVerifivationForCentrolizedSearch());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Close button for Centrrolized search bar");
		
	
	}
	
	/////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_centrolizedSearch_ByGiving_InvalidData")
	public void  centrolizedSearchByGivingInvalidData(){
		ExtentTestManager.getTest().getTest().setName("File Classification_centrolizedSearch_ByGiving_InvalidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String invalidDataForCentrolizedSeacrh="sdgssg";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(FileClassificationPage.centrolizedSearchByGivingInalidData(invalidDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Centralized Search text box");
		
		String noRecordsFoundMessage = "No records found";
		//Step3:Succesfully verified No Record Found Notification Message
		Assert.assertTrue(FileClassificationPage.noRecordsFound(noRecordsFoundMessage));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Succesfully verified No Record Found Notification Message on the iFile Classification screen");
	    
	}
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_closeButton_VerifivationFor_CentrolizedSearch_InvalidData")
	public void  closeButtonVerifivationForCentrolizedSearchInvalidData(){
		ExtentTestManager.getTest().getTest().setName("File Classification_closeButton_VerifivationFor_CentrolizedSearch_InvalidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String invalidDataForCentrolizedSeacrh="hkdfjkgh";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(FileClassificationPage.centrolizedSearchByGivingValidData(invalidDataForCentrolizedSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Centralized Search text box");
		
		//Step3:Successfully verified Close button for Centrrolized search bar
		Assert.assertTrue(FileClassificationPage.closeButtonVerifivationForCentrolizedSearch());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Close button for Centrrolized search bar on File Classification page");
		
	
	}
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_ReasonSearch_ByGiving_ValidData")
	public void  nameSearchByGivingValidData(){
		ExtentTestManager.getTest().getTest().setName("File Classification_ReasonSearch_ByGiving_ValidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String validDataForReasonSeacrh="auto";
		
		//Step2:add the data to the Reason Search text box
		Assert.assertTrue(FileClassificationPage.nameSearchByGivingValidData(validDataForReasonSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Name search text box");
		
	
		//Step3:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.validNameSeacrh(validDataForReasonSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the File Classification screen");
	    
	}
	
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_ReasonSearch_ByGiving_InvalidData")
	public void  nameSearchByGivingInvalidData(){
		ExtentTestManager.getTest().getTest().setName("File Classification_ReasonSearch_ByGiving_InvalidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String invalidDataForReasonSeacrh="hkdfjkgh";
		//Step2:add the data to the Reason Search text box
		Assert.assertTrue(FileClassificationPage.reasonSearchByGivingInalidData(invalidDataForReasonSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Name Search  text box");
		
		String noRecordsFoundMessage = "No records found";
		//Step3:Succesfully verified No Record Found Notification Message
		Assert.assertTrue(FileClassificationPage.noRecordsFound(noRecordsFoundMessage));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the File Classification screen");
	    
	}
	
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_DescriptionSearch_ByGiving_validData")
	public void  descriptionSearchByGivingValidData(){
		ExtentTestManager.getTest().getTest().setName("File Classification_DescriptionSearch_ByGiving_validData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String validDataForDescriptionSeacrh="AutomationTest";
		
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(FileClassificationPage.descriptionSearchByGivingValidData(validDataForDescriptionSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Description Search text box");
		
		
		//Step3:Successfully verified serched data on the File Classifications screen
		Assert.assertTrue(FileClassificationPage.validDescriptionSeacrh(validDataForDescriptionSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the File Classification screen");
	    
	}
	
	////////////////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classification_DescriptionSearch_ByGiving_InvalidData")
	public void  descriptionSearchByGivingInvalidData(){
		ExtentTestManager.getTest().getTest().setName("File Classification_DescriptionSearch_ByGiving_InvalidData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		String invalidDataForDescriptionSeacrh="hkdfjkgh";
		//Step2:add the data to the Centralized Search text box
		Assert.assertTrue(FileClassificationPage.descriptionSearchByGivingInalidData(invalidDataForDescriptionSeacrh));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully passing  data to the Description Search text box");
		
		String noRecordsFoundMessage = "No records found";
		//Step3:add the data to the Centralized Search text box
		Assert.assertTrue(FileClassificationPage.noRecordsFound(noRecordsFoundMessage));
		ExtentTestManager.getTest().log(LogStatus.PASS, "step3:Successfully verified serched data on the File Classification screen");
	    
	}
	
	
	
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Add header")
	public void  verifyFileClassificationsAddHeader(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Add header");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		

		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classificationsto open page");
		
		//Step2:click on the add button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on  File Classifications add button");
		
		
		String FileClassificationsAddHeader="File Classification - Add";
		//Step3:verify the header of the File Classification add page
        Assert.assertTrue(FileClassificationPage.FileClassificationAddHeader(FileClassificationsAddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully  verified the  File Classifications add page header");
			
	}	
	//////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Add Reason Code Field_UI")
	public void  verifyFileClassifications_AddNameFieldUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Add Reason Code Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classificationsto open page");
		
		//Step2:click on the add button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications ADD button");
		
		//Step2:verify the UI of Code field on File Classification add screen
		Assert.assertTrue(FileClassificationPage.FileClassificationAdd_NameFieldUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  File Classifications Name Field  UI On the File Classifications-Add screen");
			
	}	
	
	///////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Add Description Field_UI")
	public void  verifyFileClassifications_AddDescriptionFieldUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Add Description Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classificationsto open page");
		
		//Step2:click on the add button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications ADD button");
		
		//Step2:verify the UI of Description field on File Classification addscreen
		Assert.assertTrue(FileClassificationPage.FileClassificationAdd_DescriptionFieldUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Description Field  UI On the File Classifications-Add screen");
			
	}	
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Add Name MandatorydUI")
	public void  FileClassification_AddNameFieldMandatorydUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Add Name MandatorydUI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		//Step3:Verify Code Mandatory  UI On the File Classification add screen
		Assert.assertTrue(FileClassificationPage.FileClassification_AddNameFieldMandatorydUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Name Mandatory  UI On the File Classifications-Add screen");
		
		
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Add Descroption MandatorydUI")
	public void  FileClassification_AddDescriptionFieldMandatorydUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Add Descroption MandatorydUI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		//Step3:Verify Code Mandatory  UI On the File Classificationsn add screen
		Assert.assertTrue(FileClassificationPage.FileClassification_AddDescriptionFieldMandatorydUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Descroption Mandatory  UI On the File Classifications-Add screen");
		
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify  File Classifications-Add Save Button UI")
	public void  verifySaveUI_Add(){
	ExtentTestManager.getTest().getTest().setName("Verify  File Classifications-Add Save Button UI");
	ExtentTestManager.getTest().assignCategory("Module: ABL");
	LoginPage loginPage=new LoginPage(driver);
	CyncHomePage cyncHomePage=loginPage.doLogin();
	Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
	
	

	//Step1:click on File Classifications to open page
	FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
	ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
	
	//Step2:click on the add button in File Classifications page
	Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
	ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
	
	//Step3:Verify Code Mandatory  UI On the File Classifications add screen
	Assert.assertTrue(FileClassificationPage.Add_SaveUI());
	ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Save Button UI On the File Classifications-Add screen");
	
	
	}
	///////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify  File Classifications-Add SaveAndNew Button UI")
	public void  verifySaveAndNewUI_Add(){
		ExtentTestManager.getTest().getTest().setName("Verify  File Classifications-Add SaveAndNew Button UI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		//Step3:Verify Code Mandatory  UI On the File Classifications add screen
		Assert.assertTrue(FileClassificationPage.Add_SaveAndNewUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified SaveAndNew Button  UI On the File Classifications-Add screen");
		
		
	}
	
	///////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify  File Classifications-Add Cancel Button UI")
	public void  verifyCancelUI_Add(){
		ExtentTestManager.getTest().getTest().setName("Verify  File Classifications-Add Cancel Button UI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		//Step3:Verify Code Mandatory  UI On the File Classifications screen
		Assert.assertTrue(FileClassificationPage.Add_CancelUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Cancel Button  UI On the File Classifications-Add screen");
		
		
	}
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWithout_Giving_Name_By_Save")
	public void  FileClassificationAddWithout_Giving_Name_Save(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWithout_Giving_Name_By_Save");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="basava";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(FileClassificationPage.ClickOnSave_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String NameWarningMsgData="Enter Classification Name";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyNameWarningMsg(NameWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Successs message is done successfully.");
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWithout_Giving_Name_By_SaveAndNew")
	public void  FileClassificationAddWithout_Giving_Name_SaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWithout_Giving_Name_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="basava";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnSaveAndNew_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String NameWarningMsgData="Enter Classification Name";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyNameWarningMsg(NameWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Successs message is done successfully.");
	
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWithout_Giving_Name_By_Cancel")
	public void  FileClassificationAddWithout_Giving_Name_Cancel(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWithout_Giving_Name_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="basava";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		String NameWarningMsgData="Enter Classification Name";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyNameWarningMsg(NameWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Verifying of Successs message is done successfully.");
			
		//step5:click on Cancel
		Assert.assertTrue(FileClassificationPage.ClickOnCancel_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String HeaderData="File Classification - Summary";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Verifying of Successs message is done successfully.");
	
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWithout_Giving_Description_By_Save")
	public void  FileClassificationAddWithout_Giving_Description_Save(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWithout_Giving_Description_By_Save");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="Basava";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(FileClassificationPage.ClickOnSave_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String DescriptionWarningMsgData="Enter Description";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyDescriptionWarningMsg(DescriptionWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Successs message is done successfully.");
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWithout_Giving_Description_By_SaveAndNew")
	public void  FileClassificationAddWithout_Giving_Description_SaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWithout_Giving_Description_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="Basava";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on SaveAndNew Button
		Assert.assertTrue(FileClassificationPage.ClickOnSaveAndNew_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String DescriptionWarningMsgData="Enter Description";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyDescriptionWarningMsg(DescriptionWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Successs message is done successfully.");
	
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWithout_Giving_Description_By_Cancel")
	public void  FileClassificationAddWithout_Giving_Description_Cancel(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWithout_Giving_Description_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="Basava";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on SaveAndNew Button
		Assert.assertTrue(FileClassificationPage.ClickOnSaveAndNew_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
				
				
		String DescriptionWarningMsgData="Enter Description";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyDescriptionWarningMsg(DescriptionWarningMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Verifying of Successs message is done successfully.");
	
		//step7:click on Cancel
		Assert.assertTrue(FileClassificationPage.ClickOnCancel_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:clicked on save button on  File Classifications-Add screen is done sucessfully");
				
		String HeaderData="File Classification - Summary";
		//Step8:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step7:Verifying of Successs message is done successfully.");
	
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_ValidData_Save")
	public void  FileClassificationAddWith_ValidData_Save(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_ValidData_Save");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoA";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttA";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(FileClassificationPage.ClickOnSave_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		/*String SuccessMsgData="Record Saved Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		*/
		String HeaderData="File Classification - Summary";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_ValidData_SaveAndNew")
	public void  FileClassificationAddWith_ValidData_SaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_ValidData_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoB";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttB";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnSaveAndNew_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		/*String SuccessMsgData="Record Saved Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		*/
		String FileClassificationsAddHeader="File Classification - Add";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.FileClassificationAddHeader(FileClassificationsAddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_ValidData_Cancel")
	public void  FileClassificationAddWith_ValidData_Cancel(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_ValidData_Cancel");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoB";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttB";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on Cancel
		Assert.assertTrue(FileClassificationPage.ClickOnCancel_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String HeaderData="File Classification - Summary";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_DuplicateData_Save")
	public void  FileClassificationAddWith_DuplicateData_Save(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_DuplicateData_Save");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoA";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttA";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(FileClassificationPage.ClickOnSave_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String SuccessMsgData="Classification Name has already been taken";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_DuplicateData_SaveAndNew")
	public void  FileClassificationAddWith_DuplicateData_SaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_DuplicateData_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoB";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttB";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnSaveAndNew_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String SuccessMsgData="Classification Name has already been taken";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
		String FileClassificationsAddHeader="File Classification - Add";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.FileClassificationAddHeader(FileClassificationsAddHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_DuplicateData_Cancel")
	public void  FileClassificationAddWith_DuplicateData_Cancel(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_DuplicateData_Cancel");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoB";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttB";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on Cancel
		Assert.assertTrue(FileClassificationPage.ClickOnCancel_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String HeaderData="File Classification - Summary";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	}

	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidName_Data_By_Save")
	public void  NameAddInvalidBySave(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidName_Data_By_Save");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttA";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(FileClassificationPage.ClickOnSave_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String SuccessMsgData="Classification Name is too long (maximum is 50 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidName_Data_By_SaveAndNew")
	public void  NameAddInvalidBySaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidName_Data_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttA";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnSaveAndNew_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String SuccessMsgData="Classification Name is too long (maximum is 50 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidName_Data_By_Cancel")
	public void  NameAddInvalidByCancel(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidName_Data_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="AutomationTesttA";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnCancel_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String HeaderData="File Classification - Summary";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidDescription_Data_By_Save")
	public void  DescriptionAddInvalidBySave(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidDescription_Data_By_Save");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoAaaaaaaaaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="tessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssst";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(FileClassificationPage.ClickOnSave_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String SuccessMsgData="Description is too long (maximum is 250 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidDescription_Data_By_SaveAndNew")
	public void  DescriptionAddInvalidBySaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidDescription_Data_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="Autoaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="tessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssst";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnSaveAndNew_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String SuccessMsgData="Description is too long (maximum is 250 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidDescription_Data_By_Cancel")
	public void  DescriptionAddInvalidByCancel(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidDescription_Data_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="Autoaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="tessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssst";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnCancel_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String HeaderData="File Classification - Summary";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
	
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidNameAndDescription_Data_By_Save")
	public void  NameAndDescriptionAddInvalidBySave(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidNameAndDescription_Data_By_Save");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="tessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssst";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on save
		Assert.assertTrue(FileClassificationPage.ClickOnSave_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String SuccessMsgData="Classification Name is too long (maximum is 50 characters), Description is too long (maximum is 250 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidNameAndDescription_Data_By_SaveAndNew")
	public void  NameAndDescriptionAddInvalidBySaveAndNew(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidNameAndDescription_Data_By_SaveAndNew");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="tessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssst";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnSaveAndNew_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String SuccessMsgData="Classification Name is too long (maximum is 50 characters), Description is too long (maximum is 250 characters)";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
	
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="FileClassification_AddWith_InvalidNameAndDescription_Data_By_Cancel")
	public void  NameAndDescriptionAddInvalidByCancel(){
		ExtentTestManager.getTest().getTest().setName("FileClassification_AddWith_InvalidNameAndDescription_Data_By_Cancel");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:click on the add button in File Classifications page
		Assert.assertTrue(FileClassificationPage.ClickOnAddButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on File Classifications Add button");
		
		String NameData="AutoAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//Step3:add the data to the Name text box
		Assert.assertTrue(FileClassificationPage.addValueToNameTextBox(NameData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully passing  data to the Name text box");
		
		String DescriptionData="tessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssst";
		//Step4:add  data to the Description text box
		Assert.assertTrue(FileClassificationPage.addValueToDescriptionTextBox(DescriptionData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully passing data to the Description text box");
		
		//step5:click on saveAndNew
		Assert.assertTrue(FileClassificationPage.ClickOnCancel_Add());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:clicked on save button on  File Classifications-Add screen is done sucessfully");
		
		String HeaderData="File Classification - Summary";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.fileClassificationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step6:Verifying of Success message is done successfully.");
		
	
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Edit header")
	public void  verifyFileClassificationsEdit_Header(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Edit header");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		

		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classificationsto open page");
		
		//Step2:First Check box selected on File Classification screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
				
		//Step3:click on the Edit button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on  File Classifications Edit button");
				
		String FileClassificationsEditHeader="File Classification - Edit";
		//Step4:verify the header of the File Classification Edit page
        Assert.assertTrue(FileClassificationPage.FileClassificationEditHeader(FileClassificationsEditHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully  verified the  File Classifications Edit page header");
			
	}	
	//////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Edit Reason Name Field_UI")
	public void  verifyFileClassifications_Edit_NameFieldUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Edit Reason Name Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classificationsto open page");
		
		//Step2:First Check box selected on File Classification screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
				
		//Step3:click on the Edit button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on  File Classifications Edit button");
		
		//Step4:verify the UI of Code field on File Classification Edit screen
		Assert.assertTrue(FileClassificationPage.FileClassificationEdit_NameFieldUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  File Classifications Name Field  UI On the File Classifications-Edit screen");
			
	}	
	
	///////////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Edit Description Field_UI")
	public void  verifyFileClassifications_Edit_DescriptionFieldUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Edit Description Field_UI");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classificationsto open page");
		
		//Step2:First Check box selected on File Classification screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
				
		//Step3:click on the Edit button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on  File Classifications Edit button");
		
		//Step4:verify the UI of Description field on File Classification Edit screen
		Assert.assertTrue(FileClassificationPage.FileClassificationEdit_DescriptionFieldUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified  Description Field  UI On the File Classifications-Edit screen");
			
	}	
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Edit Name MandatorydUI")
	public void  FileClassification_Edit_NameFieldMandatorydUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Edit Name MandatorydUI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:First Check box selected on File Classification screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
				
		//Step3:click on the Edit button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on  File Classifications Edit button");
		
		//Step4:Verify Code Mandatory  UI On the File Classification Edit screen
		Assert.assertTrue(FileClassificationPage.FileClassification_EditNameFieldMandatorydUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Name Mandatory  UI On the File Classifications-Edit screen");
		
		
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Classifications-Edit Descroption MandatorydUI")
	public void  FileClassification_Edit_DescriptionFieldMandatorydUI(){
		ExtentTestManager.getTest().getTest().setName("Verify File Classifications-Edit Descroption MandatorydUI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:First Check box selected on File Classification screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
				
		//Step3:click on the Edit button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on  File Classifications Edit button");
		
		//Step4:Verify Code Mandatory  UI On the File Classificationsn Edit screen
		Assert.assertTrue(FileClassificationPage.FileClassification_EditDescriptionFieldMandatorydUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Descroption Mandatory  UI On the File Classifications-Edit screen");
		
		
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify  File Classifications-Edit Save Button UI")
	public void  verifySaveUI_Edit(){
	ExtentTestManager.getTest().getTest().setName("Verify  File Classifications-Edit Save Button UI");
	ExtentTestManager.getTest().assignCategory("Module: ABL");
	LoginPage loginPage=new LoginPage(driver);
	CyncHomePage cyncHomePage=loginPage.doLogin();
	Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
	
	

	//Step1:click on File Classifications to open page
	FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
	ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
	
	//Step2:First Check box selected on File Classification screen
	Assert.assertTrue(FileClassificationPage.checkBoxSelection());
	ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
				
	//Step3:click on the Edit button in File Classification page
	Assert.assertTrue(FileClassificationPage.ClickOnEditButton());
	ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on  File Classifications Edit button");
		
	//Step4:Verify Code Mandatory  UI On the File Classifications Edit screen
	Assert.assertTrue(FileClassificationPage.Edit_SaveUI());
	ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Save Button UI On the File Classifications-Edit screen");
	
	
	}
	///////////////
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify  File Classifications-Edit Cancel Button UI")
	public void  verifyCancelUI_Edit(){
		ExtentTestManager.getTest().getTest().setName("Verify  File Classifications-Edit Cancel Button UI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");	
		
		

		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage=cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
		
		//Step2:First Check box selected on File Classification screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
				
		//Step3:click on the Edit button in File Classification page
		Assert.assertTrue(FileClassificationPage.ClickOnEditButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on  File Classifications Edit button");
		
		//Step4:Verify Code Mandatory  UI On the File Classifications screen
		Assert.assertTrue(FileClassificationPage.Edit_CancelUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified Cancel Button  UI On the File Classifications-Edit screen");
		
		
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classifications_Delete_By_Selecting_ExistingRecord")
	public void  verifyDeleteBySelectingExistingRecord(){
		ExtentTestManager.getTest().getTest().setName("File Classifications_Delete_By_Selecting_ExistingRecord");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classificationsto open page");
			
		//Step2:First Check box selected on File Classifications screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
		
		//Step2:Click on Delete button
		Assert.assertTrue(FileClassificationPage.clickOnDeleteButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the Delete button on the File Classifications screen");
				
		//Step2:Click on YES button In the pop up
		Assert.assertTrue(FileClassificationPage.clickOnYesButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully clicked on the Yes button on the File Classifications screen");
			
			
		String SuccessMsgData="Records Deleted Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Verifying of Success message is done successfully.");
			
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classifications_Delete_By_Selecting_MultipleRecords")
	public void  verifyDeleteBySelectingMultipleRecords(){
		ExtentTestManager.getTest().getTest().setName("File Classifications_Delete_By_Selecting_MultipleRecords");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
		//Step1:click on File Classifications to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classificationsto open page");
			
		//Step2:First Check box selected on File Classifications screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully Selected first record on the File Classifications screen");
		
		//Step2:First Check box selected on File Classifications screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection1());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully Selected Second record on the Ineligibility reasons screen");
	
		//Step2:First Check box selected on File Classifications screen
		Assert.assertTrue(FileClassificationPage.checkBoxSelection2());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully Selected Third record on the Ineligibility reasons screen");
			
		//Step2:Click on Delete button
		Assert.assertTrue(FileClassificationPage.clickOnDeleteButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on the Delete button on the File Classifications screen");
				
		//Step2:Click on YES button In the pop up
		Assert.assertTrue(FileClassificationPage.clickOnYesButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step4:Successfully clicked on the Yes button on the File Classifications screen");
			
			
		String SuccessMsgData="Records Deleted Successfully";
		//Step6:Verifying of message is done successfully.
		Assert.assertTrue(FileClassificationPage.verifyMessageOnAfterSave1(SuccessMsgData));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step5:Verifying of Success message is done successfully.");
		
	}
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File Classifications_ExportPopupUI_HeaderUI")
	public void  verifyExportPopUI_HeaderUI(){
			ExtentTestManager.getTest().getTest().setName("File Classifications_ExportPopupUI_HeaderUI");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on File Classifications to open page
			FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classifications to open page");
			
			//Step2:Click on Export button
			Assert.assertTrue(FileClassificationPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the File Classifications screen");
				
						
			String ExportPopUpHeader="File Classification";
			//Step2:verify the File Classifications Export PopUI  header
			Assert.assertTrue(FileClassificationPage.exportPopUpHeaderUI(ExportPopUpHeader));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified File Classifications Export PopUI header",ExportPopUpHeader);
			
		}
		
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File_Classifications_ExportPopupUI_CheckBox_ClassificationName")
	public void  verifyExportPopUI_CheckBox_ClassificationName(){
			ExtentTestManager.getTest().getTest().setName("File_Classifications_ExportPopupUI_CheckBox_ClassificationName");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on File_Classifications to open page
			FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File_Classifications to open page");
			
			//Step2:Click on Export button
			Assert.assertTrue(FileClassificationPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the File Classification Page screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(FileClassificationPage.exportPopUICheckBox_ClassificationName());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified File Classifications Export CheckBox button for ClassificationName");
						
		}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="File_Classifications_ExportPopupUI_CheckBox_Description")
	public void  verifyExportPopUI_CheckBox_Description(){
		ExtentTestManager.getTest().getTest().setName("File_Classifications_ExportPopupUI_CheckBox_Description");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File_Classifications to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File_Classifications to open page");
		
		//Step2:Click on Export button
		Assert.assertTrue(FileClassificationPage.clickOnExportButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the File Classification Page screen");
			
		//Step2:Verify Checkbox
		Assert.assertTrue(FileClassificationPage.exportPopUICheckBox_Description());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified File Classifications Export CheckBox button for ClassificationName");
					
	}
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__ClassifiactionName_Header")
	public void  verifyExportPopUI_Header_ClassifiactionName(){
		ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__ClassifiactionName_Header");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File_Classifications to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File_Classifications to open page");
		
		//Step2:Click on Export button
		Assert.assertTrue(FileClassificationPage.clickOnExportButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the File_Classifications screen");
			
					
		String ExportPopUpHeader="Classification Name";
		//Step2:verify the File_Classifications page header
		Assert.assertTrue(FileClassificationPage.exportPopUpNameHeaderUI(ExportPopUpHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified File_Classifications Export PopUp Reason header",ExportPopUpHeader);
		
	} 
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__Description_Header")
	public void  verifyExportPopUI_Header_Description(){
		ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__Description_Header");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:Click on Export button
		Assert.assertTrue(FileClassificationPage.clickOnExportButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the File Classification screen");
			
					
		String ExportPopUpHeader="Description";
		//Step3:verify the File Classification page header
		Assert.assertTrue(FileClassificationPage.exportPopUpDescriptionHeaderUI(ExportPopUpHeader));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified File Classification Export PopUp Description header",ExportPopUpHeader);
		
	}
	
	
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__CloseButtonUI")
	public void  verifyExportPopUI_CloseButtonUI(){
		ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__CloseButtonUI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File Classification to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File Classification to open page");
		
		//Step2:Click on Export button
		Assert.assertTrue(FileClassificationPage.clickOnExportButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the File Classification screen");
		
		Assert.assertTrue(FileClassificationPage.exportPopUpCloseButtonUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified File Classification Export PopUp Close Button UI");
			
					
	} 
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportPopUI__ExportButtonUI")
	public void  verifyExportPopUI_ExportButtonUI(){
		ExtentTestManager.getTest().getTest().setName("verifyExportPopUI__ExportButtonUI");
		ExtentTestManager.getTest().assignCategory("Module: ABL");
		LoginPage loginPage=new LoginPage(driver);
		CyncHomePage cyncHomePage=loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
		
		
		//Step1:click on File_Classifications to open page
		FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File_Classifications to open page");
		
		//Step2:Click on Export button
		Assert.assertTrue(FileClassificationPage.clickOnExportButton());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the File_Classifications screen");
		
		Assert.assertTrue(FileClassificationPage.exportPopUpExportButtonUI());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully verified File_Classifications Export PopUp Export Button UIr");
			
					
	} 
		
	
	 @Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="verifyExportByWithoutSelectingRecords")
	 public void  verifyExportByWithoutSelectingRecords(){
			ExtentTestManager.getTest().getTest().setName("verifyExportByWithoutSelectingRecords");
			ExtentTestManager.getTest().assignCategory("Module:ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on File_Classifications  to open page
			FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File_Classifications to open page");
						
			//Step2:Click on Export button
			Assert.assertTrue(FileClassificationPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully clicked on the Export button on the File_Classifications screen");
				
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(FileClassificationPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step3:Successfully clicked on File_Classifications Export PopUp Export Button");
	}
	 
	 
	 @Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="ExportOnFileClassification_ClassificationNameCheckBoxExport")
	 public void  ExportOnFileClassification_ClassificationNameCheckBoxExport(){
			ExtentTestManager.getTest().getTest().setName("ExportOnFileClassification_ClassificationNameCheckBoxExport");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on File_Classifications to open page
			FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File_Classifications to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(FileClassificationPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the File_Classifications screen");
			
			Assert.assertTrue(FileClassificationPage.selectCheckBoxForDescription());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the File_Classifications screen");
			
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(FileClassificationPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
		
			
					
	} 
	 

	 @Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="ExportOnFileClassification_ClassificationNameCheckBoxExport")
	 public void  ExportOnFileClassification_DescriptionCheckBoxExport(){
			ExtentTestManager.getTest().getTest().setName("ExportOnFileClassification_ClassificationNameCheckBoxExport");
			ExtentTestManager.getTest().assignCategory("Module: ABL");
			LoginPage loginPage=new LoginPage(driver);
			CyncHomePage cyncHomePage=loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(), "Signed in Successfully");
			
			
			//Step1:click on File_Classifications to open page
			FileClassification FileClassificationPage = cyncHomePage.getCyncMenus().openFileClassifications();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step1:click on File_Classifications to open page");
			
			//Step2:Click on edit button
			Assert.assertTrue(FileClassificationPage.clickOnExportButton());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the File_Classifications screen");
			
			Assert.assertTrue(FileClassificationPage.selectCheckBoxForName());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the File_Classifications screen");
			
			//Step2:Click on YES button In the pop up
			Assert.assertTrue(FileClassificationPage.clickOnExportPopup());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successful clicked on the edit button on the Ineligibility reasons screen");
		
			
					
	} 
	
		
		
		
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
