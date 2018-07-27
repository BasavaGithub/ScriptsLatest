package com.cync.BreakPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class FileUploadPageBreak extends BasePage {

	public FileUploadPageBreak(WebDriver driver) {
		super(driver);
		
	}
	
	private final By CreateSkippedBBC_Xpath=By.xpath("//span[contains(text(),'Create Skipped BBC')]");
	private final By BBCHistoricalDataUpload_Xpath=By.xpath("//span[contains(text(),'BBC Historical Data Upload')]");
	private final By MapAndUpload_Xpath=By.xpath("//span[contains(text(),'Map & Upload')]");
	private final By CollateralLoanAutoFileUploads_Xpath=By.xpath("//span[contains(text(),'Collateral Loan Auto File Uploads')]");
	private final By CollateralLoanUndo_Xpath=By.xpath("//span[contains(text(),'Collateral Loan Undo')]");
	private final By MappingListView_Xpath=By.xpath("//span[contains(text(),'Mapping List View')]");
	private final By AllClientsUploadDepositFiles_Xpath=By.xpath("//span[contains(text(),'All Clients Upload Deposit Files')]");
	
	public boolean verifyCreateSkippedBBC(String HeaderData) {
		try {     
			WebElement CreateSkippedBBCWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(CreateSkippedBBC_Xpath));
		     String data = CreateSkippedBBCWebEelement.getText().trim(); 
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
		public boolean verifyBBCHistoricalDataUpload(String HeaderData) {
			try {     
				WebElement BBCHistoricalDataUploadWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(BBCHistoricalDataUpload_Xpath));
			     String data = BBCHistoricalDataUploadWebEelement.getText().trim(); 
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
		public boolean verifyMapAndUpload(String HeaderData) {
			try {     
				WebElement MapAndUploadWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(MapAndUpload_Xpath));
			     String data = MapAndUploadWebEelement.getText().trim(); 
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
		public boolean verifyCollateralLoanAutoFileUploads(String HeaderData) {
			try {     
				WebElement CollateralLoanAutoFileUploadsWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(CollateralLoanAutoFileUploads_Xpath));
			     String data = CollateralLoanAutoFileUploadsWebEelement.getText().trim(); 
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
		public boolean verifyCollateralLoanUndo(String HeaderData) {
			try {     
				WebElement CollateralLoanUndoWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(CollateralLoanUndo_Xpath));
			     String data = CollateralLoanUndoWebEelement.getText().trim(); 
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
		
		public boolean verifyMappingListView(String HeaderData) {
			try {     
				WebElement MappingListViewWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(MappingListView_Xpath));
			     String data = MappingListViewWebEelement.getText().trim(); 
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
		public boolean verifyAllClientsUploadDeposit(String HeaderData) {
			try {     
				WebElement AllClientsUploadDepositWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(AllClientsUploadDepositFiles_Xpath));
			     String data = AllClientsUploadDepositWebEelement.getText().trim(); 
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
	
	
	
	
	
	
	

}
