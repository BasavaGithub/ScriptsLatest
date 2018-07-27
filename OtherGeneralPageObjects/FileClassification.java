package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

import freemarker.core.ReturnInstruction.Return;

public class FileClassification  extends BasePage {
	
	
	
	
	public FileClassification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	private final By filesClassificationHeader_xpath=By.xpath("//h3[contains(text(),'File Classification - Summary')]");
	private final By classificationNameFieldUI_xpath=By.xpath("//span[contains(text(),'Classification Name')]");
	private final By DescriptionColoumnUI_xpath=By.xpath("//span[contains(text(),'Description')]");
	private final By AddIcon_xpath=By.xpath("(//i[@class='ng-star-inserted hand fa fa-plus fa-1x f_s_20 clr_grey'])");
	private final By ExportIcon_xpath=By.xpath("(//i[@class='hand fa fa-share-square-o fa-2x clr_grey f_s_20 ng-star-inserted'])");			
	private final By EditIcon_xpath=By.id("Edit");
	private final By DeleteIcon_xpath=By.id("Delete");
	private final By CentralizedSearch_xpath=By.xpath("(//input[@class='form-control search-input-text ng-untouched ng-pristine ng-valid'])");
	private final By Breadcrumb_xpath=By.xpath("//div[@class='breadcrumb_container']");
	private final By MasterCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]");
	private final By BottomRecords_xpath=By.xpath("//p[@class='recordcount ng-star-inserted']");
	private final By lastCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[26]");
	private final By classificationNameSearchUI_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]");
	private final By DescriptionFieldSearchUI_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[2]");
	private final By classificationNameSearch_Add_xpath=By.id("classificaionName");
	private final By DescriptionSearch_Add_xpath=By.id("classificationDescription");
	

	
	
	private final By validDataForNameSeacrh_xpath=By.xpath("(//td[@class='ng-star-inserted'])[1]");
	private final By validDataForDescriptionSeacrh_xpath=By.xpath("(//span[contains(text(),'Auto')])[2]");

	
	
	
	private final By oneCheckBoxselection_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]");
	
	private final By validDataForCentrolizedSeacrh_xpath=By.xpath("(//span[contains(text(),'Auto')])[1]");
	private final By closeIconForCentrolizedSearch_xpath=By.xpath("//i[@class='fa fa-close ng-star-inserted']");
	private final By noRecordsFoundMessage_xpath=By.xpath("//span[contains(text(),'No records found')]");
	
	
	
	private final By FileClassificationsAddHeader_xpath=By.xpath("//h3[contains(text(),'File Classification - Add')]");
	private final By FileClassificationsdd_NameFieldUI_xpath=By.id("classificaionName");
	private final By FileClassificationsAddDescriptionFieldUI_xpath=By.id("classificationDescription");
	private final By NameFieldMandatorydUI_xpath=By.xpath("(//span[@class='required'])[1]");
	private final By descriptionFieldMandatoryUI_xpath=By.xpath("(//span[@class='required'])[2]");
	
	private final By FileClassificationAdd_Save_xpath=By.xpath("(//span[contains(text(),'Save')])[2]");
	private final By FileClassificationAdd_SaveAndNew_xpath=By.xpath("(//span[contains(text(),'Save')])[1]");
	private final By FileClassificationAdd_Cancel_xpath=By.xpath("(//span[contains(text(),'Cancel')])[1]");
	
	private final By NameWarningMsgObj_xpath=By.xpath("//small[contains(text(),'Enter Classification Name')]");
	private final By DescriptionWarningMsgObj_xpath=By.xpath("//small[contains(text(),'Enter Description')]");
	
	private final By successMessage_id=By.id("every-api-message");
	
	private final By FileClassificationsEditHeader_xpath=By.xpath("//h3[contains(text(),'File Classification - Edit')]");
	private final By FileClassificationEdit_NameFieldUI_xpath=By.id("classificaionName");
	private final By FileClassificationsEditDescriptionFieldUI_xpath=By.id("classificationDescription");
	private final By Name_EditFieldMandatorydUI_xpath=By.xpath("(//span[@class='required'])[1]");
	private final By description_EditFieldMandatoryUI_xpath=By.xpath("(//span[@class='required'])[2]");
	private final By FileClassificationEdit_Save_xpath=By.xpath("//span[contains(text(),'Save')]");
	private final By FileClassificationEdit_Cancel_xpath=By.xpath("(//span[contains(text(),'Cancel')])[1]");
	
	private final By YesIcon_xpath=By.xpath("//button[text()='Yes']");
	
	private final By oneCheckBoxselection1_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[7]");
	private final By oneCheckBoxselection2_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[8]");
	
	private final By ExportPopUp_xpath=By.xpath("//span[text()='Export']");
	private final By ExportPopUpHeaderUI_xpath=By.xpath("//span[text()='File Classification']");
	
	private final By exportPopUICheckBox_ClassificationName_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[31]");
	private final By exportPopUICheckBox_Description_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[32]");
	
	private final By exportPopUpNameHeaderUI_xpath=By.xpath("//span[text()='Classification Name']");
	private final By exportPopUpDescriptionHeaderUI_xpath=By.xpath("//span[text()='Description']");
	private final By exportPopUpCloseButtonUI_xpath=By.xpath("(//span[@class='fa fa-fw fa-close'])[1]");
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	 

	
	
	
	/*public boolean fileClassificationHeader(String SuccessMsgData)
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
	
	
	}*/
	
	
	
	public boolean fileClassificationHeader(String HeaderData) 
	{
		try{
			 WebElement fileClassificationHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(filesClassificationHeader_xpath));
		     String data = fileClassificationHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;

	}
	}
	
	public boolean breadcrumb(String FileClassificationBreadcrumb )
	{
	try{
		WebElement FileClassificationBreadcrumbWebEelement=new WebDriverWait(driver,2000)
		.until(ExpectedConditions.visibilityOfElementLocated(Breadcrumb_xpath));
		String Original = FileClassificationBreadcrumbWebEelement.getText();
		if(Original.equalsIgnoreCase(FileClassificationBreadcrumb))
		{System.out.println(Original);
		return true;}
		else{
			return false;
			}
	   }
	
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;

	}
	}

	
	
	public boolean classificationNameFieldUI()
	{
	try{
		WebElement FileClassificationHeaderWebEelement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(classificationNameFieldUI_xpath));
		String actualExpected = FileClassificationHeaderWebEelement.getText();
		FileClassificationHeaderWebEelement.isDisplayed();

		
		System.out.println(actualExpected);
		return true;
		}
	catch(Exception ex)	{
	return false;
		}
		
	}
	
	public boolean descriptionFieldUI()
	{
	try{
		WebElement FileClassificationHeaderWebEelement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(DescriptionColoumnUI_xpath));
		String actualExpected = FileClassificationHeaderWebEelement.getText();
		FileClassificationHeaderWebEelement.isDisplayed();
		System.out.println(actualExpected);
		return true;
		}
	catch(Exception ex)	{
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
	
	public boolean classificationNameSearchUI(){
		try {
			WebElement IneligibilityReasonsFieldSearcUIhWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(classificationNameSearchUI_xpath));
			Thread.sleep(50);
			IneligibilityReasonsFieldSearcUIhWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	} 
	
	public boolean DescriptionFieldSearchUI(){
		try {
			WebElement DescriptionFieldSearchUIWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionFieldSearchUI_xpath));
			DescriptionFieldSearchUIWebE.isDisplayed();
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
		Thread.sleep(50);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean ClickOnEditButton()
	{
	try{
		WebElement editButtonWebEelement=new WebDriverWait(driver,10000)
		.until(ExpectedConditions.visibilityOfElementLocated(EditIcon_xpath));
		Thread.sleep(1000);
		editButtonWebEelement.click();
		Thread.sleep(2000);
		return true;
	}
	catch(Exception ex){
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
	
	
	
	/*public boolean EditIconVerificationByWithoutSelectingRecord(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection_xpath));
			EditIconVerificationBySelectingExistingRecord.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}*/
	
	
	
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
	
	
	/*public boolean DeleteIconVerificationByWithoutSelectingRecord(){
		try {
			WebElement EditIconVerificationBySelectingExistingRecord=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection_xpath));
			EditIconVerificationBySelectingExistingRecord.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}*/
	
	
	
	public boolean DeleteIconVerificationBySelectingExistingRecord(){
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
		return false;
	}
	
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
		return false;
	}
	

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
		return false;
	}


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

	 
	public boolean nameSearchByGivingValidData(String validDataForNameSeacrh)
	{
	try{
		WebElement reasonSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(classificationNameSearchUI_xpath));
		reasonSearchByGivingValidDataWebEelement.clear();
		reasonSearchByGivingValidDataWebEelement.sendKeys(validDataForNameSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){
		return false;
	}
	

	}
	
	public boolean validNameSeacrh(String validDataForReasonSeacrh)
	{
	try{
		WebElement validReasonSeacrhWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(validDataForNameSeacrh_xpath));
		String actualData = validReasonSeacrhWebEelement.getText().trim();
		if(actualData.equalsIgnoreCase(actualData)){
		System.out.println(actualData);
		 return true;
		}
		else{
			return false;
		}
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	
	public boolean reasonSearchByGivingInalidData(String invalidDataForReasonSeacrh)
	{
	try{
		WebElement centrolizedSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(classificationNameSearchUI_xpath));
		centrolizedSearchByGivingValidDataWebEelement.clear();
		centrolizedSearchByGivingValidDataWebEelement.sendKeys(invalidDataForReasonSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){
		return false;
	}
	

	}
	
	
	
	public boolean descriptionSearchByGivingValidData(String validDataForDescriptionSeacrh)
	{
	try{
		WebElement reasonSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionFieldSearchUI_xpath));
		reasonSearchByGivingValidDataWebEelement.clear();
		reasonSearchByGivingValidDataWebEelement.sendKeys(validDataForDescriptionSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){
		return false;
	}
	

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
		return false;
	}
	

	}
	
	public boolean descriptionSearchByGivingInalidData(String invalidDataForDescriptionSeacrh)
	{
	try{
		WebElement centrolizedSearchByGivingValidDataWebEelement=new WebDriverWait(driver,5000)
		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionFieldSearchUI_xpath));
		centrolizedSearchByGivingValidDataWebEelement.clear();
		centrolizedSearchByGivingValidDataWebEelement.sendKeys(invalidDataForDescriptionSeacrh);
		Thread.sleep(5000);
		
		return true;
				
	}
	catch(Exception ex){
		return false;
	}
	

	}
	
	public boolean FileClassificationAddHeader(String FileClassificationsAddHeader )
	{
	try{
		WebElement FileClassificationAddHeaderWebEelement=new WebDriverWait(driver,2000)
		.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationsAddHeader_xpath));
		String actualData = FileClassificationAddHeaderWebEelement.getText();
		if(actualData.equalsIgnoreCase(FileClassificationsAddHeader))
		{
			System.out.println(actualData);
			return true;
		}
		else 
		{
			System.out.println("Something went wrong");
					}
	  }
		catch(Exception ex)
		{
			return false;
		
		}
	return false;
	}	
	
	
	public boolean FileClassificationAdd_NameFieldUI(){
		try {
			WebElement IneligibilityReasonsCodeAddUIWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationsdd_NameFieldUI_xpath));
			IneligibilityReasonsCodeAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean FileClassificationAdd_DescriptionFieldUI(){
		try {
			WebElement DescriptionFieldAddUIWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationsAddDescriptionFieldUI_xpath));
			DescriptionFieldAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean FileClassification_AddNameFieldMandatorydUI()
	{
	try{
		WebElement regionAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(NameFieldMandatorydUI_xpath));
		regionAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean FileClassification_AddDescriptionFieldMandatorydUI()
	{
	try{
		WebElement regionAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionFieldMandatoryUI_xpath));
		regionAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean Add_SaveUI(){
		try {
			WebElement SaveAddUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationAdd_Save_xpath));
			SaveAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean Add_SaveAndNewUI(){
		try {
			WebElement SaveAndNewUIWebE=new WebDriverWait(driver,60)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationAdd_SaveAndNew_xpath));
			SaveAndNewUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean Add_CancelUI(){
		try {
			WebElement CancelAddUIWebE=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationAdd_Cancel_xpath));
			CancelAddUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	public boolean addValueToNameTextBox(String codeData)
	{
	try{
		WebElement regionTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(classificationNameSearch_Add_xpath));
		
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
		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionSearch_Add_xpath));
		nameTextBoxWebEelement.clear();
		Thread.sleep(100);
		nameTextBoxWebEelement.sendKeys(descriptionData);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	

	}

	public boolean ClickOnSave_Add()
	{
	try{
		WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationAdd_Save_xpath));
		SaveOnAddSalesWebEelement.click();
		Thread.sleep(100);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean ClickOnSaveAndNew_Add()
	{
	try{
		WebElement SaveAndNewOnAddSalesWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationAdd_SaveAndNew_xpath));
		SaveAndNewOnAddSalesWebEelement.click();

		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean ClickOnCancel_Add()
	{
	try{
		WebElement cancelIneligibilityReasonsWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationAdd_Cancel_xpath));
		cancelIneligibilityReasonsWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

		
	public boolean verifyNameWarningMsg(String NameWarningMsgData) 
	{
		try
		{
			WebElement verifyNameWarningMsgWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(NameWarningMsgObj_xpath));
			String expected = verifyNameWarningMsgWebElement.getText();
			if(expected.equalsIgnoreCase(NameWarningMsgData)){
				System.out.println(expected);
				return true;
			}
		else
		{
			System.out.println("Something went wrong");
			return false;
		}
					
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
			WebElement verifyNameWarningMsgWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionWarningMsgObj_xpath));
			String expected = verifyNameWarningMsgWebElement.getText();
			if(expected.equalsIgnoreCase(DescriptionWarningMsgData)){
				System.out.println(expected);
				return true;
			}
		else
		{
			System.out.println("Something went wrong");
			return false;
		}
					
	}
		
		catch(Exception ex)
		{
			return false;
		}
	}

	
	public boolean verifyMessageOnAfterSave1(String SuccessMsgData)
	{
	try{
			 WebElement verifyMessageOnAfterSave1WebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(successMessage_id));
		     String data = verifyMessageOnAfterSave1WebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(SuccessMsgData))
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

		public boolean checkBoxSelection(){
		try {
			WebElement firstCheckBoxSelectionWebE=new WebDriverWait(driver,500)
			.until(ExpectedConditions.visibilityOfElementLocated(oneCheckBoxselection_xpath));
			firstCheckBoxSelectionWebE.click();
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	 public boolean FileClassificationEditHeader(String FileClassificationsEditHeader )
	{
	try{
		WebElement FileClassificationEditHeaderWebEelement=new WebDriverWait(driver,2000)
		.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationsEditHeader_xpath));
		String actualData = FileClassificationEditHeaderWebEelement.getText();
		if(actualData.equalsIgnoreCase(FileClassificationsEditHeader))
		{
			System.out.println(actualData);
			return true;
		}
		else 
		{
			System.out.println("Something went wrong");
					}
	  }
		catch(Exception ex)
		{
			return false;
		
		}
	return false;
	}	
	
	
	public boolean FileClassificationEdit_NameFieldUI(){
		try {
			WebElement FileClassificationEdit_NameFieldUIUIWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationEdit_NameFieldUI_xpath));
			FileClassificationEdit_NameFieldUIUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean FileClassificationEdit_DescriptionFieldUI(){
		try {
			WebElement FileClassificationEdit_DescriptionFieldUIWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationsEditDescriptionFieldUI_xpath));
			FileClassificationEdit_DescriptionFieldUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean FileClassification_EditNameFieldMandatorydUI()
	{
	try{
		WebElement FileClassification_EditNameFieldMandatorydUIWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(Name_EditFieldMandatorydUI_xpath));
		FileClassification_EditNameFieldMandatorydUIWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean FileClassification_EditDescriptionFieldMandatorydUI()
	{
	try{
		WebElement FileClassification_EditDescriptionFieldMandatorydUIWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(description_EditFieldMandatoryUI_xpath));
		FileClassification_EditDescriptionFieldMandatorydUIWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean Edit_SaveUI(){
		try {
			WebElement SaveEditUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationEdit_Save_xpath));
			SaveEditUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean Edit_CancelUI(){
		try {
			WebElement CancelEditUIWebE=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(FileClassificationEdit_Cancel_xpath));
			CancelEditUIWebE.isDisplayed();
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
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpHeaderUI(String ExportPopUpHeader )
	{
	try{
		WebElement exportPopUpHeaderUIHeaderWebEelement=new WebDriverWait(driver,2000)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUpHeaderUI_xpath));
		String actualExpected = exportPopUpHeaderUIHeaderWebEelement.getText();
		if(actualExpected.equalsIgnoreCase(ExportPopUpHeader))
		{
			System.out.println(actualExpected);
			return true;
		}
		else{
			System.out.println("Something Went Wrong");
			}
	}
		catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	return false;
	}
		
	public boolean exportPopUICheckBox_ClassificationName()
	{
	try{
		WebElement exportPopUICheckBoxReasonCodeWebEelement=new WebDriverWait(driver,2000)
		.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBox_ClassificationName_xpath));
		exportPopUICheckBoxReasonCodeWebEelement.isDisplayed();
		return true;			
		}
		catch(Exception ex)
		{
			return false;
		}
		
	}
	
	public boolean exportPopUICheckBox_Description()
	{
	try{
		WebElement exportPopUICheckBoxReasonCodeWebEelement=new WebDriverWait(driver,2000)
		.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBox_Description_xpath));
		exportPopUICheckBoxReasonCodeWebEelement.isDisplayed();
		return true;			
		}
		catch(Exception ex)
		{
			return false;
		}
		
	}
	
	public boolean exportPopUpNameHeaderUI(String ExportPopUpHeader )
	{
	try{
		WebElement exportPopUpNameHeaderUIWebEelement=new WebDriverWait(driver,2000)
		.until(ExpectedConditions.visibilityOfElementLocated(exportPopUpNameHeaderUI_xpath));
		String actualExpected = exportPopUpNameHeaderUIWebEelement.getText();
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
	
	
	public boolean selectCheckBoxForName()
	{
	try{
			 WebElement selectCheckBoxForDescriptionWebEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBox_ClassificationName_xpath));
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
			.until(ExpectedConditions.visibilityOfElementLocated(exportPopUICheckBox_Description_xpath));
			 selectCheckBoxForDescriptionWebEelement.click();
			 Thread.sleep(2000);
			 return true;
					
	}
	catch(Exception ex){
		return false;
	}
	
	
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
