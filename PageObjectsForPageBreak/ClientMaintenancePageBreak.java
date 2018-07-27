package com.cync.BreakPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ClientMaintenancePageBreak extends BasePage {

	public ClientMaintenancePageBreak(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 
	  private final By ClientSummary_xpath=By.xpath("//span[contains(text(),'Client Summary')]");
	  private final By InactiveClients_xpath=By.xpath("//span[contains(text(),'Inactive Clients')]");
	  private final By BasicParametersHeader_xpath=By.xpath("//span[contains(text(),'Basic Parameters')]");
	  private final By CollateralAdvanceRate_xpath=By.xpath("//span[contains(text(),'Collateral Advance Rate: DIV')]");
	  private final By IneligibleCalculations_xpath=By.xpath("//span[contains(text(),'Ineligible Calculations')]");
	  private final By SeasonalAdvanceRate_xpath=By.xpath("//span[contains(text(),'Seasonal Advance Rates')]");
	  private final By BucketAging_xpath=By.xpath("//span[contains(text(),'Bucket Aging')]");
	  private final By BBCFilesRequired_xpath=By.xpath("//span[contains(text(),'BBC Files Required')]");
	  private final By ClientBBCOptions_xpath=By.xpath("//span[contains(text(),'Client BBC Options')]");
	  private final By OtherFilesRequired_xpath=By.xpath("//span[contains(text(),'Other Files Required')]");
	  private final By ActivityTickler_xpath=By.xpath("//span[contains(text(),'Activity Tickler')]");
	  private final By Comments_xpath=By.xpath("//span[contains(text(),'Comments')]");
	  private final By ReportComments_xpath=By.xpath("//span[contains(text(),'Report Comments')]");
	  private final By Exceptions_xpath=By.xpath("//span[contains(text(),'Exceptions')]");
	  private final By FundingStyle_xpath=By.xpath("//span[contains(text(),'Funding Style')]");
	  private final By CollateralReserves_xpath=By.xpath("//span[contains(text(),'Collateral Reserves')]");
	  private final By AssetAmortization_xpath=By.xpath("//span[contains(text(),'Asset Amortization')]");
	  
	  private final By MappingListView_Xpath=By.xpath("//span[contains(text(),'Mapping List View')]");
	  private final By CreateABLClient_Xpath=By.xpath("//span[contains(text(),'Client Information')]");
	  private final By CreateFactoringClient_Xpath=By.xpath("//span[contains(text(),'Client Information')]");
	  private final By BasicClientDetails_Xpath=By.xpath("//span[contains(text(),'Basic Client Detail')]");
	  private final By MailAddress_Xpath=By.xpath("//span[contains(text(),'Mail Address')]");
	  private final By Contacts_Xpath=By.xpath("//span[contains(text(),'Contacts')]");
	  private final By Miscellaneous_Xpath=By.xpath("//span[contains(text(),'Miscellaneous')]");
	  private final By LegalContent_Xpath=By.xpath("//span[contains(text(),'Legal Content')]");
	  private final By Guarantors_Xpath=By.xpath("//span[contains(text(),' Guarantors')]");	
	  private final By LoanFees_Xpath=By.xpath("(//span[contains(text(),'Loan Terms')])[2]");
	  private final By IneligibleAdvances_Xpath=By.xpath("//span[contains(text(),'Ineligible Customer Parameters')]");
	  
	  
	  
	  

	  
		public boolean verifyClientSummaryHeader(String HeaderData) {
			try {     
				WebElement ClientSummaryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ClientSummary_xpath));
			     String data = ClientSummaryHeaderWebEelement.getText().trim(); 
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
		
		public boolean verifyInactiveClientsHeader(String HeaderData) {
			try {     
				WebElement InactiveClientsHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(InactiveClients_xpath));
			     String data = InactiveClientsHeaderWebEelement.getText().trim(); 
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
		
		public boolean verifyBasicParametersHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(BasicParametersHeader_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		public boolean verifyIneligibleCalculationsHeader(String HeaderData) {
			try {     
				WebElement IneligibleCalculationsHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(IneligibleCalculations_xpath));
			     String data = IneligibleCalculationsHeaderWebEelement.getText().trim(); 
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
		
		public boolean verifyCollateralAdvanceRateHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(CollateralAdvanceRate_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifySeasonalAdvanceRateHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(SeasonalAdvanceRate_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifyBucketAgingHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(BucketAging_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		public boolean verifyBBCFilesRequiredHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(BBCFilesRequired_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifyClientBBCOptionsHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ClientBBCOptions_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifyOtherFilesRequiredHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(OtherFilesRequired_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifyActivityTicklerHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ActivityTickler_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifyCommentsHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(Comments_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		
		public boolean verifyReportCommentsHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ReportComments_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifyExceptionsHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(Exceptions_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
				
		public boolean verifyFundingStyleHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(FundingStyle_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifyCollateralReservesHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(CollateralReserves_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		
		public boolean verifyAssetAmortizationHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(AssetAmortization_xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
		public boolean verifyMappingListViewHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(MappingListView_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyCreateABLClientHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(CreateABLClient_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyCreateFactoringClientHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(CreateFactoringClient_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyBasicClientDetailsHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(BasicClientDetails_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyMailAddressHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(MailAddress_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyContactsHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(Contacts_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyMiscellaneousHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(Miscellaneous_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyLegalContentHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(LegalContent_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyGuarantorsHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(Guarantors_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyLoanFeesHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(LoanFees_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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

		
		public boolean verifyIneligibleAdvancesHeader(String HeaderData) {
			try {     
				WebElement BasicParametersHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(IneligibleAdvances_Xpath));
			     String data = BasicParametersHeaderWebEelement.getText().trim(); 
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
