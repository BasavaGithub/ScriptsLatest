package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

import freemarker.core.ReturnInstruction.Return;

public class IneligibilityReasonsPage extends BasePage {
	
	
	
	private final By IneligibilityReasonsHeader=By.xpath("//a[contains(text(),' Ineligibility Reasons')]");
	private final By IneligibilityReasonsPageHeader=By.xpath("//h3[contains(text(),'Ineligibility Reasons')]");
	private final By IneligibilityReasonCodeColoumn_xpath=By.xpath("//span[contains(text(),'Ineligibility Reason Code')]");
	private final By DescriptionColoumn_xpath=By.xpath("//span[contains(text(),'Description')]");
	private final By SystemDefinedColoumn_xpath=By.xpath("//span[contains(text(),'System Defined')]");
	private final By CalculateonNegativeEligibleBalanceColoumn_xpath=By.xpath("//span[contains(text(),'Calculate on Negative Eligible Balance')]");
	private final By CalculateonNegativeDebtorBalanceColoumn_xpath=By.xpath("//span[contains(text(),'Calculate on Negative Debtor Balance')]");
	private final By Breadcrumb_xpath=By.xpath("//div[@class='breadcrumb_container']");
	private final By CentralizedSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
	private final By AddIcon_xpath=By.xpath("//i[@title='Add New']");
	private final By ExportIcon_xpath=By.id("Export");
	private final By EditIcon_xpath=By.id("Edit");
	private final By DeleteIcon_xpath=By.id("Delete");
	
	
	private final By IneligibilityReasonsFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[1]");
	private final By DescriptionFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[2]");
	private final By MasterCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]");
	private final By BottomRecords_xpath=By.xpath("//p[@class='recordcount ng-star-inserted']");
	private final By IneligibilityReasonsAddHeader_xpath=By.xpath("//h3[contains(text(),'Ineligibility Reasons - Add')]");
	private final By IneligibilityReasonsAdd_ReasonFieldUI_xpath=By.xpath("//input[@id='irCode']");
	private final By IneligibilityReasonsAdd_DescriptionFieldUI_xpath=By.xpath("//input[@id='irDescription']");
	private final By IneligibilityReasonsAdd_CalculateOnNegativeEligibleBalance_xpath=By.xpath("(//label[contains(text(),'Calculate on Negative Eligible Balance')])");
	private final By IneligibilityReasonsAdd_CalculateOnNegativeDebtorBalance_xpath=By.xpath("(//label[contains(text(),'Calculate on Negative Debtor Balance')])");
	private final By IneligibilityReasonsAdd_Save_xpath=By.xpath("(//span[contains(text(),'Save')])[2]");
	
	
	
	
	
	private final By IneligibilityReasonsEdit_ReasonFieldUI_xpath=By.xpath("//input[@id='irCode']");
	private final By IneligibilityReasonsEdit_DescriptionFieldUI_xpath=By.xpath("//input[@id='irDescription']");
	private final By IneligibilityReasonsEdit_CalculateOnNegativeEligibleBalance_xpath=By.xpath("(//label[contains(text(),'Calculate on Negative Eligible Balance')])");
	private final By IneligibilityReasonsEdit_CalculateOnNegativeDebtorBalance_xpath=By.xpath("(//label[contains(text(),'Calculate on Negative Debtor Balance')])");
	private final By IneligibilityReasonsEdit_CalculateOnNegativeEligibleBalance_checkbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By IneligibilityReasonsEdit_CalculateOnNegativeDebtorBalance_checkbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	
	private final By ineligibilityCodeAddMandatoryforEdit_xpath=By.xpath("(//label[@class='mandatory'])[1]");
	private final By descriptionAddMandatoryforEdit_xpath=By.xpath("(//label[@class='mandatory'])[2]");
	
	private final By IneligibilityReasonsEdit_Save_xpath=By.xpath("//span[contains(text(),'Save')]");
	private final By IneligibilityReasonsEdit_Cancel_xpath=By.xpath("(//span[contains(text(),'Cancel')])[1]");
	
	
	
	
	
	private final By IneligibilityReasonsAdd_SaveAndNew_xpath=By.xpath("//span[contains(text(),'Save & New')]");
	private final By IneligibilityReasonsAdd_Cancel_xpath=By.xpath("(//span[contains(text(),'Cancel')])[1]");
	private final By ineligibilityCodeAddMandatory_xpath=By.xpath("(//label[@class='mandatory'])[1]");
	private final By descriptionAddMandatory_xpath=By.xpath("(//label[@class='mandatory'])[2]");
	private final By IneligibilityReasonsAdd_CalculateOnNegativeEligibleBalance_checkbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By IneligibilityReasonsAdd_CalculateOnNegativeDebtorBalance_checkbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By IneligibilityReasonMsgObj_xpath=By.xpath("//div[@id='api-messages']");
	private final By codeFieldSearch_xpath=By.xpath("(//input[@type='text'])[6]");	
	private final By descriptionFieldSearch_xpath=By.xpath("(//input[@type='text'])[7]");
	private final By lastCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[26]");
	
	private final By oneCheckBoxselection_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]");
	private final By oneCheckBoxselection1_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[7]");
	private final By oneCheckBoxselection2_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[8]");
	private final By closeIconForCentrolizedSearch_xpath=By.xpath("//i[@class='fa fa-close ng-star-inserted']");
	

	private final By noRecordsFoundMessage_xpath=By.xpath("//span[contains(text(),'No records found')]");
	
	private final By validDataForCentrolizedSeacrh_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
	
	private final By validDataForReasonsSeacrh_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
	
	private final By validDataForDescriptionSeacrh_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[2]");
	
	private final By ReasonWarningMsgObj_xpath=By.xpath("//small[contains(text(),'Enter Ineligibility Reason Code')]");
	
	private final By DescriptionWarningMsgObj_xpath=By.xpath("//small[contains(text(),'Enter Description')]");
	
	private final By recordMessage_xpath=By.id("cync_notifications_msg");
	
	private final By successMessage_id=By.id("every-api-message");
	
	private final By ReasonsEditHeade_xpath=By.xpath("//h3[contains(text(),'Ineligibility Reasons - Edit')]");
	
	private final By SaveOnEditScreen_xpath=By.id("action_save");
	
	private final By CancelOnEditScreen_xpath=By.id("action_back");
	
	private final By ExistingRecordclick_xpath=By.xpath("(//td[@class='ng-star-inserted'])[42]");
	
	private final By YesIcon_xpath=By.xpath("//button[text()='Yes']");
	
	private final By ExportPopUp_xpath=By.xpath("//span[text()='Export']");
	
	private final By exportPopUICheckBoxReasonCode_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[31]");
			
	private final By exportPopUICheckBoxDescription_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[32]");
	
	private final By exportPopUICheckBoxSystemDefined_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[33]");
	
	private final By exportPopUICheckBoxEligibleBalance_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[34]");
	
	private final By exportPopUICheckBoxDebtorBalance_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[35]");
	
	private final By ExportPopUpHeaderUI_xpath=By.xpath("//span[text()='Ineligibility Reasons']");
	
	private final By exportPopUpReasonHeaderUI_xpath=By.xpath("//label[text()='Ineligibility Reason Code']");
	
	private final By exportPopUpDescriptionHeaderUI_xpath=By.xpath("//label[text()='Description']");
	
	private final By exportPopUpSysDefinedHeaderUI_xpath=By.xpath("//label[text()='System Defined']");
	
	private final By exportPopUpEligibleBalanceHeaderUI_xpath=By.xpath("//label[text()='Calculate on Negative Eligible Balance']");
	
	private final By exportPopUpDebtorBalanceHeaderUI_xpath=By.xpath("//label[text()='Calculate on Negative Debtor Balance']");
	
	private final By exportPopUpCloseButtonUI_xpath=By.xpath("(//span[@class='fa fa-fw fa-close'])[1]");
	
	 
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
			
	
	
	
	
	 
	
	
	
	
	

	
	
	 
	
	
	
	
	
	
		
	
	
	
			
	
	
	
	/*public boolean verifyMessageOnAfterSave1(String SuccessMsgData)
	{
	try{
			 WebElement verifyMessageOnAfterSave1WebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(successMessage_id));
			 String actualData = verifyMessageOnAfterSave1WebEelement.getText(); 
			 System.out.println(actualData);
			 if(actualData.equalsIgnoreCase(SuccessMsgData));{
				System.out.println("Test case Passed");
				return true;
			 }
		}
	catch(Exception ex)	{
	}
		return false;
	}
	*/
								
											
	
	
	
	
	public boolean verifyMessageOnAfterSave1(String SuccessMsgData)
	{
	try{
			 WebElement verifyMessageOnAfterSave1WebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(successMessage_id));
		     String data = verifyMessageOnAfterSave1WebEelement.getText().trim(); 
			if(data.equals(SuccessMsgData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}
			
				
			
	}
	catch(Exception ex){
		System.out.println("Test case Failed");
		return false;

	}
	
	
	}
	
	
	
	/*String actualMsgFromAPP= verifyMessageOnAfterSave1WebEelement.getText();
	System.out.println(actualMsgFromAPP);*/
	/*
	if(actualMsgFromAPP.equalsIgnoreCase(SuccessMsgData)){
		return true;
	}
	 
}*/
		
	
	
	
	
	
			

	public IneligibilityReasonsPage(WebDriver driver)
	{
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(IneligibilityReasonsHeader).getText().trim().equals("Ineligibility Reasons")){
			throw new SkipException("Ineligibility Reasons couldn't open.");
		}
		}// TODO Auto-generated constructor stub
		
	
	
	
	public boolean IneligibilityReasonsHeader(String ineligibilityreasonsHeader )
	{
	try{
		WebElement IneligibilityReasonsHeaderWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsPageHeader));
		String actualExpected = IneligibilityReasonsHeaderWebEelement.getText();
		if(actualExpected.equalsIgnoreCase(ineligibilityreasonsHeader))
		{
			System.out.println(actualExpected);
			return true;
		}
		
		
	}
	catch(Exception ex){
		
	}
	return false;
	
	}

		
	
	
	public boolean IneligibilityReasonsColoumnUI(){
		try {
			WebElement IneligibilityReasonsColoumnWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonCodeColoumn_xpath));
			IneligibilityReasonsColoumnWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean DescriptionColoumnUI(){
		try {
			WebElement DescriptionColoumnWebE=new WebDriverWait(driver,10000)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionColoumn_xpath));
			Thread.sleep(10000);
			DescriptionColoumnWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean SystemDefinedColoumnUI(){
		try {
			WebElement SystemDefinedColoumnWebE=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(SystemDefinedColoumn_xpath));
			SystemDefinedColoumnWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean CalculateonNegativeEligibleBalanceColoumnUI(){
		try {
			WebElement CalculateonNegativeEligibleBalanceColoumnWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(CalculateonNegativeEligibleBalanceColoumn_xpath));
			CalculateonNegativeEligibleBalanceColoumnWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean CalculateonNegativeDebtorBalanceColoumnUI(){
		try {
			WebElement CalculateonNegativeDebtorBalanceColoumnWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(CalculateonNegativeDebtorBalanceColoumn_xpath));
			CalculateonNegativeDebtorBalanceColoumnWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public String breadcrumb(String ineligibilityreasonsBreadcrumb )
	{
	try{
		WebElement IneligibilityReasonsBreadcrumbWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(Breadcrumb_xpath));
		IneligibilityReasonsBreadcrumbWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return ineligibilityreasonsBreadcrumb;
	
	}
	
	public boolean CenatralizedSearchUI(){
		try {
			WebElement CenatralizedSearchUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(CentralizedSearch_xpath));
			CenatralizedSearchUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean AddIconUI(){
		try {
			WebElement AddIconUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(AddIcon_xpath));
			AddIconUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean ExportIconUI(){
		try {
			WebElement ExportIconUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(ExportIcon_xpath));
			ExportIconUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean IneligibilityReasonsFieldSearchUI(){
		try {
			WebElement IneligibilityReasonsFieldSearcUIhWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsFieldSearch_xpath));
			Thread.sleep(50);
			IneligibilityReasonsFieldSearcUIhWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	} 
	
	


public boolean ClickOnAddButton()
	{
	try{
		WebElement addButtonWebEelement=new WebDriverWait(driver,10000)
		.until(ExpectedConditions.visibilityOfElementLocated(AddIcon_xpath));
		Thread.sleep(1000);
		addButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean DescriptionFieldSearchUI(){
		try {
			WebElement DescriptionFieldSearchUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionFieldSearch_xpath));
			DescriptionFieldSearchUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean MasterCheckBoxUI(){
		try {
			WebElement MasterCheckBoxUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(MasterCheckBox_xpath));
			MasterCheckBoxUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean ScrollUI(){
		try {
			WebElement ScrollUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(lastCheckBox_xpath));
			ScrollUIWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean BottomRecordsUI(){
		try {
			WebElement BottomRecordsUI=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(BottomRecords_xpath));
			Thread.sleep(50);
			BottomRecordsUI.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean EditIconVerificationByWithoutSelectingRecord(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection_xpath));
			EditIconVerificationBySelectingExistingRecord.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	public boolean EditIconVerificationBySelectingExistingRecord(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection_xpath));
			EditIconVerificationBySelectingExistingRecord.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean editIconStatus(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(EditIcon_xpath));
			EditIconVerificationBySelectingExistingRecord.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean deleteIconStatus(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(DeleteIcon_xpath));
			EditIconVerificationBySelectingExistingRecord.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean EditIconVerificationBySelectingMultipleRecords(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(MasterCheckBox_xpath));
			EditIconVerificationBySelectingExistingRecord.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean DeleteIconVerificationByWithoutSelectingRecord(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection_xpath));
			EditIconVerificationBySelectingExistingRecord.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	public boolean DeleteIconVerificationBySelectingExistingRecord(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection_xpath));
			EditIconVerificationBySelectingExistingRecord.click();
			EditIconVerificationBySelectingExistingRecord.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean DeleteIconVerificationBySelectingMultipleRecords(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(MasterCheckBox_xpath));
			EditIconVerificationBySelectingExistingRecord.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	//////////////////////////5/25/2018////////////////////
	
	public boolean centrolizedSearchByGivingValidData(String validDataForCentrolizedSeacrh)
	{
	try{
		WebElement centrolizedSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(CentralizedSearch_xpath));
		centrolizedSearchByGivingValidDataWebEelement.clear();
		centrolizedSearchByGivingValidDataWebEelement.sendKeys(validDataForCentrolizedSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){
		
	}
	return false;
	}
	
	public boolean validCentrolizedSeacrh(String validDataForCentrolizedSeacrh)
	{
	try{
		WebElement centrolizedSearchByGivingValidDataWebEelement=new WebDriverWait(driver,1000)
		.until(ExpectedConditions.visibilityOfElementLocated(validDataForCentrolizedSeacrh_xpath));
		String actualData = centrolizedSearchByGivingValidDataWebEelement.getText();
		if(actualData.equalsIgnoreCase(validDataForCentrolizedSeacrh));
		
     return true;
	}
	catch(Exception ex){

	}
	return false;

	}
	
	
	
	
	
	
	public boolean closeButtonVerifivationForCentrolizedSearch()
	{
	try{
		WebElement closeButtonVerifivationForCentrolizedSearchWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeIconForCentrolizedSearch_xpath));
		closeButtonVerifivationForCentrolizedSearchWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean centrolizedSearchByGivingInalidData(String invalidDataForCentrolizedSeacrh)
	{
	try{
		WebElement centrolizedSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(CentralizedSearch_xpath));
		centrolizedSearchByGivingValidDataWebEelement.clear();
		centrolizedSearchByGivingValidDataWebEelement.sendKeys(invalidDataForCentrolizedSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){

	}
	return false;

	}
		
	public boolean noRecordsFound(String noRecordsFoundMessage)
	{
	try{
		WebElement centrolizedSearchByGivingInvalidDataWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(noRecordsFoundMessage_xpath));
		String actualData = centrolizedSearchByGivingInvalidDataWebEelement.getText();
		if(actualData.equalsIgnoreCase(noRecordsFoundMessage))
		   {
			System.out.println(actualData);
			System.out.println("Test Case Passed");
			return true;
		  }
       }
	catch(Exception ex)
	{
		return false;
	}
	return false;
	
	}

	 
	public boolean reasonSearchByGivingValidData(String validDataForReasonSeacrh)
	{
	try{
		WebElement reasonSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsFieldSearch_xpath));
		reasonSearchByGivingValidDataWebEelement.clear();
		reasonSearchByGivingValidDataWebEelement.sendKeys(validDataForReasonSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){

	}
	return false;

	}
	
	public boolean validReasonSeacrh(String validDataForReasonSeacrh)
	{
	try{
		WebElement validReasonSeacrhWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(validDataForReasonsSeacrh_xpath));
		String actualData = validReasonSeacrhWebEelement.getText();
		if(actualData.equalsIgnoreCase(validDataForReasonSeacrh));
		
     return true;
	}
	catch(Exception ex){

	}
	return false;

	}
	
	public boolean reasonSearchByGivingInalidData(String invalidDataForReasonSeacrh)
	{
	try{
		WebElement centrolizedSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsFieldSearch_xpath));
		centrolizedSearchByGivingValidDataWebEelement.clear();
		centrolizedSearchByGivingValidDataWebEelement.sendKeys(invalidDataForReasonSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){

	}
	return false;

	}
	
	
	
	public boolean descriptionSearchByGivingValidData(String validDataForDescriptionSeacrh)
	{
	try{
		WebElement reasonSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionFieldSearch_xpath));
		reasonSearchByGivingValidDataWebEelement.clear();
		reasonSearchByGivingValidDataWebEelement.sendKeys(validDataForDescriptionSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){

	}
	return false;

	}
	
	public boolean validDescriptionSeacrh(String validDataForDescriptionSeacrh)
	{
	try{
		WebElement validReasonSeacrhWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(validDataForDescriptionSeacrh_xpath));
		String actualData = validReasonSeacrhWebEelement.getText();
		if(actualData.equalsIgnoreCase(validDataForDescriptionSeacrh));
		
     return true;
	}
	catch(Exception ex){

	}
	return false;

	}
	
	public boolean descriptionSearchByGivingInalidData(String invalidDataForDescriptionSeacrh)
	{
	try{
		WebElement centrolizedSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionFieldSearch_xpath));
		centrolizedSearchByGivingValidDataWebEelement.clear();
		centrolizedSearchByGivingValidDataWebEelement.sendKeys(invalidDataForDescriptionSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){

	}
	return false;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////ADD SCREEN////////////////////////////////////////////
	
	
	public boolean IneligibilityReasonsAddHeader(String ineligibilityreasonsaddHeader )
	{
	try{
		WebElement IneligibilityReasonsAddHeaderWebEelement=new WebDriverWait(driver,2000)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAddHeader_xpath));
		String actualData = IneligibilityReasonsAddHeaderWebEelement.getText();
		if(actualData.equalsIgnoreCase(ineligibilityreasonsaddHeader))
		{
		System.out.println(actualData);
		System.out.println("Test Case Passed");
		return true;
		}
		else 
		{System.out.println("Something went wrong");
					}
	  }
		catch(Exception ex)
		{
			return false;
		
		}
	return false;
	}	
	
	
	public boolean IneligibilityReasonsCodeFieldAddUI(){
		try {
			WebElement IneligibilityReasonsCodeAddUIWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_ReasonFieldUI_xpath));
			IneligibilityReasonsCodeAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean DescriptionFieldAddUI(){
		try {
			WebElement DescriptionFieldAddUIWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_DescriptionFieldUI_xpath));
			DescriptionFieldAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean CalculateOnNegativeEligibleBalanceAddUI(){
		try {
			WebElement CalculateOnNegativeEligibleBalanceAddUIWebE=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_CalculateOnNegativeEligibleBalance_xpath));
			CalculateOnNegativeEligibleBalanceAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean CalculateOnNegativeDebtorBalanceAddUI(){
		try {
			WebElement CalculateOnNegativeDebtorBalanceAddUIWebE=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_CalculateOnNegativeDebtorBalance_xpath));
			CalculateOnNegativeDebtorBalanceAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean ineligibilityCodeAddMandatoryUIValidation()
	{
	try{
		WebElement regionAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(ineligibilityCodeAddMandatory_xpath));
		regionAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean descriptionAddMandatoryUIValidation()
	{
	try{
		WebElement regionAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddMandatory_xpath));
		regionAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SaveAddUI(){
		try {
			WebElement SaveAddUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_Save_xpath));
			SaveAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean SaveAndNewUI(){
		try {
			WebElement SaveAndNewUIWebE=new WebDriverWait(driver,60)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_SaveAndNew_xpath));
			SaveAndNewUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean CancelAddUI(){
		try {
			WebElement CancelAddUIWebE=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_Cancel_xpath));
			CancelAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
		
	
	
	public boolean checkBoxForCalculateOnNegativeEligibleBalance()
	{
	try{
		WebElement checkBoxForCalculateOnNegativeEligibleBalanceWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_CalculateOnNegativeEligibleBalance_checkbox_xpath));
		checkBoxForCalculateOnNegativeEligibleBalanceWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	

	}
	
	public boolean checkBoxForCalculateOnNegativeDebtorBalance()
	{
	try{
		WebElement checkBoxForCalculateOnNegativeDebtorBalanceWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_CalculateOnNegativeDebtorBalance_checkbox_xpath));
		checkBoxForCalculateOnNegativeDebtorBalanceWebEelement.isDisplayed();
		return true;
		}
	catch(Exception ex)
	{
		return false;
	}
	

	}
	
	/////////////////////////////////////////////////////////////Edit//////////////////////////////////////////////////////
	public boolean IneligibilityReasonsCodeFieldEditUI(){
		try {
			WebElement IneligibilityReasonsCodeAddUIWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsEdit_ReasonFieldUI_xpath));
			IneligibilityReasonsCodeAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean DescriptionFieldEditUI(){
		try {
			WebElement DescriptionFieldAddUIWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsEdit_DescriptionFieldUI_xpath));
			DescriptionFieldAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean CalculateOnNegativeEligibleBalanceEditUI(){
		try {
			WebElement CalculateOnNegativeEligibleBalanceAddUIWebE=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsEdit_CalculateOnNegativeEligibleBalance_xpath));
			CalculateOnNegativeEligibleBalanceAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean CalculateOnNegativeDebtorBalanceEditUI(){
		try {
			WebElement CalculateOnNegativeDebtorBalanceAddUIWebE=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsEdit_CalculateOnNegativeDebtorBalance_xpath));
			CalculateOnNegativeDebtorBalanceAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean ineligibilityCodeAddMandatoryUIValidation_Edit()
	{
	try{
		WebElement regionAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(ineligibilityCodeAddMandatoryforEdit_xpath));
		regionAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean descriptionAddMandatoryUIValidation_Edit()
	{
	try{
		WebElement regionAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddMandatoryforEdit_xpath));
		regionAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean editSaveUI(){
		try {
			WebElement SaveAddUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsEdit_Save_xpath));
			SaveAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
		
	public boolean CancelEditUI(){
		try {
			WebElement CancelAddUIWebE=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsEdit_Cancel_xpath));
			CancelAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
		
	
	
	public boolean checkBoxForCalculateOnNegativeEligibleBalanceEdit()
	{
	try{
		WebElement checkBoxForCalculateOnNegativeEligibleBalanceWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsEdit_CalculateOnNegativeEligibleBalance_checkbox_xpath));
		checkBoxForCalculateOnNegativeEligibleBalanceWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	

	}
	
	public boolean checkBoxForCalculateOnNegativeDebtorBalanceEdit()
	{
	try{
		WebElement checkBoxForCalculateOnNegativeDebtorBalanceWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsEdit_CalculateOnNegativeDebtorBalance_checkbox_xpath));
		checkBoxForCalculateOnNegativeDebtorBalanceWebEelement.isDisplayed();
		return true;
		}
	catch(Exception ex)
	{
		
	}
	return false;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean addValueToCodeTextBox(String codeData)
	{
	try{
		WebElement regionTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_ReasonFieldUI_xpath));
		
		Thread.sleep(5000);
		regionTextBoxWebEelement.clear();
	
		regionTextBoxWebEelement.sendKeys(codeData);
		return true;
		}
	catch(Exception ex)
	{
		return false;
	}


	}
	
	
	public boolean addValueToDescriptionTextBox(String descriptionData)
	{
	try{
		WebElement nameTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_DescriptionFieldUI_xpath));
		nameTextBoxWebEelement.clear();
		Thread.sleep(100);
		nameTextBoxWebEelement.sendKeys(descriptionData);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	

	}

	public boolean saveIneligibilityReasons()
	{
	try{
		WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_Save_xpath));
		SaveOnAddSalesWebEelement.click();
		Thread.sleep(100);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean saveAndNewIneligibilityReasons()
	{
	try{
		WebElement SaveAndNewOnAddSalesWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_SaveAndNew_xpath));
		SaveAndNewOnAddSalesWebEelement.click();

		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean cancelIneligibilityReasons()
	{
	try{
		WebElement cancelIneligibilityReasonsWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_Cancel_xpath));
		cancelIneligibilityReasonsWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String verifyMessageOnAfterSave(String successMsgData)
    {
    try{
       WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
       .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonMsgObj_xpath));
       
      String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
      System.out.println("!!!!!!!!!!!!!!"+actualMsgFromAPP);
      if(actualMsgFromAPP.equalsIgnoreCase(successMsgData))
      {
       return actualMsgFromAPP;
      }else{
    	  System.out.println("failedddddddddddddddddddddddddd");
    	  return null;
      }
       
    }
    catch(Exception ex){
    
    }
    
 return successMsgData;
    }


 
	
/*	public String verifyMessageOnAfterSave(String SuccessMsgData)
	   {
	   try{
	      WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
	      .until(ExpectedConditions.visibilityOfElementLocated(recordMessage_xpath));
	     String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
	     if(actualMsgFromAPP.equalsIgnoreCase(SuccessMsgData))
	     {
	      return actualMsgFromAPP;
	     }
	      
	   }
	   catch(Exception ex){
	    
	   }
	return SuccessMsgData;
	   
}
	   */
	
	
	public boolean verifyReasonWarningMsg(String ReasonWarningMsgData) 
	{
		try
		{
			WebElement verifyReasonWarningMsgWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReasonWarningMsgObj_xpath));
			String expected = verifyReasonWarningMsgWebElement.getText();
			if(expected.equalsIgnoreCase(ReasonWarningMsgData));
			return true;
		}
		
		catch(Exception ex)
		{
			return false;
		}
		}
	
	
	public boolean verifyDescriptionWarningMsg(String DescriptionWarningMsgData) 
	{
		try
		{
			WebElement verifyDescriptionWarningMsgWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionWarningMsgObj_xpath));
			String expected = verifyDescriptionWarningMsgWebElement.getText();
			if(expected.equalsIgnoreCase(DescriptionWarningMsgData));
			return true;
		}
		
		catch(Exception ex){
			return false;
		}
	}
	
	//
	
	public boolean checkBoxSelection(){
		try {
			WebElement firstCheckBoxSelectionWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection_xpath));
			firstCheckBoxSelectionWebE.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean checkBoxSelection1(){
		try {
			WebElement firstCheckBoxSelectionWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection1_xpath));
			firstCheckBoxSelectionWebE.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean checkBoxSelection2(){
		try {
			WebElement firstCheckBoxSelectionWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection2_xpath));
			firstCheckBoxSelectionWebE.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	public boolean clickOnEditButton(){
		try {
			WebElement clickOnEditButtonWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(EditIcon_xpath));
			clickOnEditButtonWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean clickOnDeleteButton(){
		try {
			WebElement clickOnEditButtonWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(DeleteIcon_xpath));
			clickOnEditButtonWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean clickOnYesButton(){
		try {
			WebElement clickOnEditButtonWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(YesIcon_xpath));
			clickOnEditButtonWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
		
	public boolean IneligibilityReasonsEditHeader(String IneligibilityReasonEdit){
		try {
			WebElement IneligibilityReasonsEditHeaderWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(ReasonsEditHeade_xpath));
			String ActualData = IneligibilityReasonsEditHeaderWebE.getText();
			Thread.sleep(100);
			if(ActualData.equalsIgnoreCase(IneligibilityReasonEdit))
			{
			System.out.println(ActualData);
			return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return false;
	}
	
	public boolean saveonEditScreen(){
		try {
			WebElement saveonEditScreenWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveOnEditScreen_xpath));
			saveonEditScreenWebE.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean cancelonEditScreen(){
		try {
			WebElement saveonEditScreenWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(CancelOnEditScreen_xpath));
			saveonEditScreenWebE.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}



	public boolean clickOnEditPageCancelButton(){
		try {
			WebElement clickOnEditPageCancelButtonWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAdd_Cancel_xpath));
			clickOnEditPageCancelButtonWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	public boolean clickOnExistingRecord(){
		try {
			WebElement clickOnExistingRecordWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(ExistingRecordclick_xpath));
			clickOnExistingRecordWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean clickOnExportButton(){
		try {
			WebElement ExportIconUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(ExportIcon_xpath));
			ExportIconUIWebE.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean clickOnExportPopup(){
		try {
			WebElement ExportIconUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUp_xpath));
			ExportIconUIWebE.click();
			Thread.sleep(100);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
			
	
	
	public boolean exportPopUpHeaderUI(String ExportPopUpHeader )
	{
	try{
		WebElement IneligibilityReasonsHeaderWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUpHeaderUI_xpath));
		String actualExpected = IneligibilityReasonsHeaderWebEelement.getText();
		if(actualExpected.equalsIgnoreCase(ExportPopUpHeader))
		{
			System.out.println(actualExpected);
			return true;
		}
		
		
	}
	catch(Exception ex){
		return false;
	}
	return false;
	
	}
	
	
	public boolean exportPopUICheckBoxReasonCode()
	{
	try{
			 WebElement exportPopUICheckBoxReasonCodeWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxReasonCode_xpath));
			 exportPopUICheckBoxReasonCodeWebEelement.isDisplayed();
			 return true;
				
		
	}
	catch(Exception ex)
	{
		return false;
	}
	
	
	}
	
	public boolean exportPopUICheckBoxDescription()
	{
	try{
			 WebElement exportPopUICheckBoxDescriptionWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxDescription_xpath));
			 exportPopUICheckBoxDescriptionWebEelement.isDisplayed();
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	
	}
	
	public boolean exportPopUICheckBoxSystemDefined()
	{
	try{
			 WebElement exportPopUICheckBoxSystemDefinedWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxSystemDefined_xpath));
			 exportPopUICheckBoxSystemDefinedWebEelement.isDisplayed();
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	
	}
	
	public boolean exportPopUICheckBoxEligibleBalance()
	{
	try{
			 WebElement exportPopUICheckBoxEligibleBalanceWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxEligibleBalance_xpath));
			 exportPopUICheckBoxEligibleBalanceWebEelement.isDisplayed();
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	
	}
	
	public boolean exportPopUICheckBoxDebtorBalance()
	{
	try{
			 WebElement exportPopUICheckBoxDebtorBalanceWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxDebtorBalance_xpath));
			 exportPopUICheckBoxDebtorBalanceWebEelement.isDisplayed();
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	}
	
	public boolean exportPopUpReasonHeaderUI(String ExportPopUpHeader )
	{
	try{
		WebElement exportPopUpReasonHeaderUIWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUpReasonHeaderUI_xpath));
		String actualExpected = exportPopUpReasonHeaderUIWebEelement.getText();
		if(actualExpected.equalsIgnoreCase(ExportPopUpHeader))
		{
			System.out.println(actualExpected);
			return true;
		}
	}
	catch(Exception ex){
		return false;
	}
	return false;
	}
	
	public boolean exportPopUpDescriptionHeaderUI(String ExportPopUpHeader )
	{
	try{
		WebElement exportPopUpDescriptionHeaderUIWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUpDescriptionHeaderUI_xpath));
		String actualExpected = exportPopUpDescriptionHeaderUIWebEelement.getText();
		if(actualExpected.equalsIgnoreCase(ExportPopUpHeader))
		{
			System.out.println(actualExpected);
			return true;
		}
	}
	catch(Exception ex){
		return false;
	}
	return false;
	}
	
	public boolean exportPopUpSysDefinedHeaderUI(String ExportPopUpHeader )
	{
	try{
		WebElement exportPopUpSysDefinedHeaderUIWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUpSysDefinedHeaderUI_xpath));
		String actualExpected = exportPopUpSysDefinedHeaderUIWebEelement.getText();
		if(actualExpected.equalsIgnoreCase(ExportPopUpHeader))
		{
			System.out.println(actualExpected);
			return true;
		}
	}
	catch(Exception ex){
		return false;
	}
	return false;
	}

	public boolean exportPopUpEligibleBalanceHeaderUI(String ExportPopUpHeader )
	{
	try{
		WebElement exportPopUpEligibleBalanceHeaderUIWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUpEligibleBalanceHeaderUI_xpath));
		String actualExpected = exportPopUpEligibleBalanceHeaderUIWebEelement.getText();
		if(actualExpected.equalsIgnoreCase(ExportPopUpHeader))
		{
			System.out.println(actualExpected);
			return true;
		}
	}
	catch(Exception ex){
		return false;
	}
	return false;
	}
	
	public boolean exportPopUpDebtorBalanceHeaderUI(String ExportPopUpHeader )
	{
	try{
		WebElement exportPopUpDebtorBalanceHeaderUIWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUpDebtorBalanceHeaderUI_xpath));
		String actualExpected = exportPopUpDebtorBalanceHeaderUIWebEelement.getText();
		if(actualExpected.equalsIgnoreCase(ExportPopUpHeader))
		{
			System.out.println(actualExpected);
			return true;
		}
	}
	catch(Exception ex){
		return false;
	}
	return false;
	}
				
	public boolean exportPopUpCloseButtonUI()
	{
	try{
			 WebElement exportPopUICheckBoxDebtorBalanceWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUpCloseButtonUI_xpath));
			 exportPopUICheckBoxDebtorBalanceWebEelement.isDisplayed();
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	}
	
	public boolean exportPopUpExportButtonUI()
	{
	try{
			 WebElement exportPopUICheckBoxDebtorBalanceWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUp_xpath));
			 exportPopUICheckBoxDebtorBalanceWebEelement.isDisplayed();
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	}
	
	
	public boolean selectCheckBoxForReasonCode()
	{
	try{
			 WebElement selectCheckBoxForReasonCodeWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxReasonCode_xpath));
			 selectCheckBoxForReasonCodeWebEelement.click();
			 return true;
				
		
	}
	catch(Exception ex)
	{
		return false;
	}
	
	
	}
	
	
	public boolean selectCheckBoxForReason()
	{
	try{
			 WebElement selectCheckBoxForDescriptionWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxReasonCode_xpath));
			 selectCheckBoxForDescriptionWebEelement.click();
			 Thread.sleep(2000);
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean selectCheckBoxForDescription()
	{
	try{
			 WebElement selectCheckBoxForDescriptionWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxDescription_xpath));
			 selectCheckBoxForDescriptionWebEelement.click();
			 Thread.sleep(2000);
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	
	}
	
	public boolean selectCheckBoxForSystemDefined()
	{
	try{
			 WebElement selectCheckBoxForSystemDefinedWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxSystemDefined_xpath));
			 selectCheckBoxForSystemDefinedWebEelement.click();
			 Thread.sleep(2000);
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	
	}
	
	public boolean selectCheckBoxForEligibleBalance()
	{
	try{
			 WebElement selectCheckBoxForEligibleBalanceWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxEligibleBalance_xpath));
			 selectCheckBoxForEligibleBalanceWebEelement.click();
			 Thread.sleep(2000);
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	
	}
	
	public boolean selectCheckBoxForDebtorBalance()
	{
	try{
			 WebElement selectCheckBoxForDebtorBalanceWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBoxDebtorBalance_xpath));
			 selectCheckBoxForDebtorBalanceWebEelement.click();
			 Thread.sleep(2000);
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	
		
		
		
		
		
		
		
		
		
		
		
}	
		


