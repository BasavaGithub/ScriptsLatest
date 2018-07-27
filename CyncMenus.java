package com.cync.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.BreakPages.ClientMaintenancePageBreak;
import com.cync.BreakPages.FileUploadPageBreak;
import com.cync.pages.AdjustmentReasonPage;
import com.cync.pages.AuditLogPage;
import com.cync.pages.AutomatedTaskLogsPage;
import com.cync.pages.BasicDetailsPage;
import com.cync.pages.BasicParameterPage;
import com.cync.pages.CollateralLoansPage;
import com.cync.pages.CommentTypesPage;
import com.cync.pages.ContentPage;
import com.cync.pages.DocumentManagement;
import com.cync.pages.FileClassification;
import com.cync.pages.IneligibilityReasonsPage;
import com.cync.pages.IneligibleCalculationContra;
import com.cync.pages.IneligibleUninsuiredReason;
import com.cync.pages.LoanSummary;
import com.cync.pages.NAICS_Codes_Page;
import com.cync.pages.NotificationCentrePage;
import com.cync.pages.NotificationLogsPage;
import com.cync.pages.ReportTemplatePage;
import com.cync.pages.SalesRegion;
import com.cync.pages.SystemParametersPage;
import com.cync.pages.TemplatesPage;

public class CyncMenus {

	
	
	
    WebDriver driver;


    // private final By menuItem_xpath=By.xpath("//span[text()='Menu']");
    // private final By
    // menuItem_xpath=By.xpath("//div[@id='b_c_area']//descendant::div[@id='hamburger_icon']");
    private final By menuItem_xpath = By.id("top-menu");
       private final By salesRegions_xpath = By
	    .xpath("//a[text()='Sales Regions']");
  
    private final By Content_xpath=By.xpath("//a[contains(text(),'Content')]");
	private final By commentsType_xpath=By.xpath("//a[contains(text(),'Comment Types')]");
	private final By masterSearch_xpath=By.xpath("//div[@class='search_bar input-group']//descendant::input[@id='searchInputId']");
	private final By systemparameters_xpath=By.xpath("//a[contains(text(),'System Parameters')]");
	private final By notificationSettings_xpath=By.xpath("//a[contains(text(),'Notification Settings')]");
	private final By templates_xpath=By.xpath("//a[text()='Templates']");
	private final By auditLogs_xpath=By.xpath("//a[text()='Audit Logs']");
	private final By automatedTaskLogs_xpath=By.xpath("//a[text()='Automated Task Logs']");

	private final By NAICSCode_xpath=By
		    .xpath("//a[text()='NAICS Codes']");
	private final By basicDetails_xpath=By.xpath("//a[text()='Basic Details']");

	private final By notificationLogs_xpath=By.xpath("//a[text()='Notification Logs']");


	private final By createClient_xpath=By.xpath("//a[text()='Create ABL Client ']");
	private final By adjustmentReason_xpath=By.xpath("//a[text()='Adjustment Reasons']");
	private final By ReportTemplate_xpath=By.xpath("//a[contains(text(),'Report Templates')]");
	private final By ineligibilityReasons_xpath=By.xpath("//a[contains(text(),'Ineligibility Reasons')]");
	private final By fileClassifications_xpath=By.xpath("//a[contains(text(),'File Classification')]");
	private final By clientDropdown_xpath = By.xpath("//span[@id='select2-choose_borrower-container']");
	private final By ineligibleCalculation_xpath=By.xpath("//a[contains(text(),'Ineligible Calculations')]");
	private final By debtors_xpath=By.xpath("//a[contains(text(),'Debtors')]");
	private final By DocumentManagement_Xpath=By.xpath("//a[contains(text(),'Document Management')]");
	
	
	private final By BBCRecalculationProcess_xpath=By.xpath("//a[contains(text(),'BBC Recalculation Process')]");
	
	
	
	private final By SearchText_xpath = By.xpath("//span//input[@type='search']");
	
	private final By ClickBox_xpath = By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
	
	
	
	
	
	  private final By ClientSummary_xpath=By.xpath("//a[contains(text(),'Client Summary')]");
	  private final By InactiveClients_xpath=By.xpath("//a[contains(text(),'Inactive Clients')]");
	  private final By BasicParameters_xpath=By.xpath("//a[contains(text(),'Basic Parameters')]");
	  private final By CollateralAdvanceRate_xpath=By.xpath("//a[contains(text(),'Collateral Advance Rate')]");
	  private final By IneligibleCalculations_xpath=By.xpath("//a[contains(text(),'Ineligible Calculations')]");
	  private final By SeasonalAdvanceRate_xpath=By.xpath("//a[contains(text(),'Seasonal Advance Rate')]");
	  private final By BucketAging_xpath=By.xpath("//a[contains(text(),'Bucket Aging')]");
	  private final By BBCFilesRequired_xpath=By.xpath("//a[contains(text(),'BBC Files Required')]");
	  private final By ClientBBCOptions_xpath=By.xpath("//a[contains(text(),'Client BBC Options')]");
	  private final By OtherFilesRequired_xpath=By.xpath("//a[contains(text(),'Other Files Required')]");
	  private final By ActivityTickler_xpath=By.xpath("//a[contains(text(),'Activity Tickler')]");
	  private final By Comments_xpath=By.xpath("//a[contains(text(),'Comments')]");
	  private final By ReportComments_xpath=By.xpath("//a[contains(text(),'Report Comments')]");
	  private final By Exceptions_xpath=By.xpath("//a[contains(text(),'Exceptions')]");
	  private final By FundingStyle_xpath=By.xpath("//a[contains(text(),'Funding Style')]");
	  private final By CollateralReserves_xpath=By.xpath("//a[contains(text(),'Collateral Reserves')]");
	  private final By AssetAmortization_xpath=By.xpath("//a[contains(text(),'Asset Amortization')]");
	  
	  private final By MappingListView_Xpath=By.xpath("//a[contains(text(),'Mapping List View')]");
	  private final By CreateABLClient_Xpath=By.xpath("//a[contains(text(),'Create ABL Client')]");
	  private final By CreateFactoringClient_Xpath=By.xpath("//a[contains(text(),'Create Factoring Client')]");
	  private final By BasicClientDetails_Xpath=By.xpath("//a[contains(text(),'Basic Client Detail')]");
	  private final By MailAddress_Xpath=By.xpath("//a[contains(text(),'Mail Address')]");
	  private final By Contacts_Xpath=By.xpath("//a[contains(text(),'Contacts')]");
	  private final By Miscellaneous_Xpath=By.xpath("//a[contains(text(),'Miscellaneous')]");
	  private final By LegalContent_Xpath=By.xpath("//a[contains(text(),'Legal Content')]");
	  private final By Guarantors_Xpath=By.xpath("//a[contains(text(),'Guarantors')]");	
	  private final By LoanFees_Xpath=By.xpath("//a[contains(text(),'Loan Fees')]");
	  private final By IneligibleAdvances_Xpath=By.xpath("//a[contains(text(),'Ineligible / Advances')]");
	  
	  
	  private final By CreateSkippedBBC_Xpath=By.xpath("//a[contains(text(),'Create Skipped BBC')]");
	  private final By BBCHistoricalDataUpload_Xpath=By.xpath("//a[contains(text(),'BBC Historical Data Upload')]");
	  private final By MapAndUpload_Xpath=By.xpath("//a[contains(text(),'Map & Upload')]");
	  private final By CollateralLoanAutoFileUploads_Xpath=By.xpath("//a[contains(text(),'Collateral Loan Auto File Uploads')]");
	  private final By CollateralLoanUndo_Xpath=By.xpath("//a[contains(text(),'Collateral Loan Undo')]");
	  private final By MappingListView1_Xpath=By.xpath("//a[contains(text(),'Mapping List View')]");
	  private final By AllClientsUploadDepositFiles_Xpath=By.xpath("//a[contains(text(),'All Clients Upload Deposit Files')]");
	  
	  private final By clientDropdown=By.xpath("//span[text()='Select Client']");
	  private final By clientDropdownTextbox=By.xpath("//input[@class='select2-search__field']");
	  private final By selectclientFromDropdown=By.xpath("//li[text()='AUTOMATIONCLIENT']");
	  
	  private final By basicParameters_xpath=By.xpath("//a[text()='Basic Parameters']");
		
	
	

    public CyncMenus(WebDriver driver) {
	this.driver = driver;
    }

    
    public boolean MouseOverOnMenu() {
	try {
	    WebElement menuItemWebE = new WebDriverWait(driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(menuItem_xpath));
	    new Actions(driver).moveToElement(menuItemWebE).perform();
	    return true;
	} catch (Exception ex) {
	    return false;
	}
    }

    public boolean moveToLeftNavigation(String navigation_Name) {
	try {
	    By menuContainerWebE_xpath = By.xpath("//ul[@id='menu']");
	    WebElement menuContainerWebE = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(menuContainerWebE_xpath));
	    List<WebElement> menuWebL = menuContainerWebE.findElements(By
		    .tagName("li"));
	    for (WebElement option : menuWebL) {
		String title = option.getText();
		if (title.equals(navigation_Name)) {
		    new Actions(driver).moveToElement(option).perform();
		    return true;
		}

	    }
	    return false;
	} catch (Exception ex) {
	    return false;
	}

    }
    
    public boolean NavigateSalesRegion() {
	try {
	    WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(salesRegions_xpath));
	    salesRegionWebEelement.click();
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
    public SalesRegion openSalesRegion() {
	try {
	    this.MouseOverOnMenu();
	    this.moveToLeftNavigation("Administration");
	    WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
		    .until(ExpectedConditions.elementToBeClickable(salesRegions_xpath));
	    salesRegionWebEelement.click();
	    Thread.sleep(10000);
	    return new SalesRegion(driver);
	} catch (Exception ex) {
	    return null;
	}
    }
    
    public SalesRegion MouseOverOnMenuSales() {
      	try {
      	    WebElement menuItemWebE = new WebDriverWait(driver, 10)
      		    .until(ExpectedConditions
      			    .visibilityOfElementLocated(menuItem_xpath));
      	    new Actions(driver).moveToElement(menuItemWebE).perform();
      	    return new SalesRegion(driver);
      	} catch (Exception ex) {
      	    return null;
      	}
          }

	
	public boolean navigateToContent(){
		try{
			WebElement ContentWebEelement=new WebDriverWait(driver,90)
				.until(ExpectedConditions.visibilityOfElementLocated(Content_xpath));
			ContentWebEelement.click();
			return true;
		}
	catch(Exception ex){
		return false;
	}
		
	}
	
	
	
	public ContentPage openContentPage() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(Content_xpath));
		     salesRegionWebEelement.click();
		     return new ContentPage(driver);
		 } catch (Exception ex) {
		     return null;
		 }

		    }
	 public CommentTypesPage openCommentsType() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Administration");     
		   WebElement commentsWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(commentsType_xpath));     
		   commentsWebEelement.click();     
		   Thread.sleep(10000);
		   return new CommentTypesPage(driver); } 
		   catch (Exception ex) {     
		   return null; }   
		   }   
	 // use above code to navigate to the page
	
	 public boolean masterSearchUI(){
			try {
				WebElement masterSearchUIWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
			//	masterSearchUIWebE.isDisplayed();
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
	
	 public SystemParametersPage openSystemParameters() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Administration");     
		   WebElement SystemParametersWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(systemparameters_xpath));     
		   SystemParametersWebEelement.click();     
		   Thread.sleep(10000);
		   return new SystemParametersPage(driver); } 
		   catch (Exception ex) {     
		   return null; }   
		   } 

	
	 public boolean NavigateCommentsType(){
		 try{
		 WebElement CommentsTypeWebEelement=new WebDriverWait(driver,1000)
		 .until(ExpectedConditions.visibilityOfElementLocated(commentsType_xpath));
		 CommentsTypeWebEelement.click();
		 Thread.sleep(10000);
		 return true;
		 }catch(Exception ex){
			 
		 }
		return false;
		 }
	 public boolean NavigateNotificationSettings(){
		 try{
		 WebElement NotificationSettingsWebEelement=new WebDriverWait(driver,10)
		 .until(ExpectedConditions.visibilityOfElementLocated(notificationSettings_xpath));
		 NotificationSettingsWebEelement.click();
		 return true;
		 }catch(Exception ex){
			 
		 }
		return false;
		 }


	public boolean NavigateTemplates(){
		 try{
		 WebElement TemplatesWebEelement=new WebDriverWait(driver,10)
		 .until(ExpectedConditions.visibilityOfElementLocated(templates_xpath));
		 TemplatesWebEelement.click();
		 return true;
		 }catch(Exception ex){
			 
		 }
		return false;
		 }



	public TemplatesPage openTemplate() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Administration");     
		   WebElement TemplatessWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(templates_xpath));     
		   TemplatessWebEelement.click();     
		   Thread.sleep(10000);
		   return new TemplatesPage(driver); } 
		   catch (Exception ex) {     
		   return null; }   
		   }
	
	 public AuditLogPage openAuditLogs() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(auditLogs_xpath));
		     auditLogsWebEelement.click();
		     
		     return new AuditLogPage(driver);
		 } catch (Exception ex) {
		     return null;
		 }

		    }
	 public AutomatedTaskLogsPage openAutomatedTaskLogs() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(automatedTaskLogs_xpath));
		     auditLogsWebEelement.click();
		     
		     return new AutomatedTaskLogsPage(driver);
		 } catch (Exception ex) {
		     return null;
		 }


		    }  
	 
	 public NAICS_Codes_Page openNAICSCode() {
	   	try {
	   	    this.MouseOverOnMenu();
	   	    this.moveToLeftNavigation("Administration");
	   	    
	   	    WebElement NAICSCodeWebEelement = new WebDriverWait(driver, 100)
	   		    .until(ExpectedConditions.elementToBeClickable(NAICSCode_xpath));
	   	 
	   	 NAICSCodeWebEelement.click();
	   	Thread.sleep(10000);
	   	    return new NAICS_Codes_Page(driver);
	   	} catch (Exception ex) {
	   	    return null;
	   	}

	       }


	 
	 public NotificationCentrePage openNotificationSettings() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement notificationSettingsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(notificationSettings_xpath));
		     notificationSettingsWebEelement.click();
		     
		     return new NotificationCentrePage(driver);


		    }  catch (Exception ex) {
			     return null;
			 }}
		
	 

 
	  
	 

	 public NotificationLogsPage openNotificationLogs() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(notificationLogs_xpath));
		     auditLogsWebEelement.click();
		     
		     return new NotificationLogsPage(driver);


		 } catch (Exception ex) {
		     return null;
		 }


		    }   


		

	 public NotificationLogsPage openClientCreation() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Client Maintenance");
		     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(createClient_xpath));
		     auditLogsWebEelement.click();
		     
		     return new NotificationLogsPage(driver);

		 } catch (Exception ex) {
		     return null;
		 }


		    }   
	 public BasicDetailsPage openBasicDetails() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement basicDetailsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(basicDetails_xpath));
		     basicDetailsWebEelement.click();
		     Thread.sleep(10000);
		     return new BasicDetailsPage(driver);
		 } catch (Exception ex) {
		     return null;
		 }

		    }  
	 
	 public AdjustmentReasonPage openAdjustmentReason() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Administration");     
         WebElement AdjustmentReasonWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(adjustmentReason_xpath));     
         AdjustmentReasonWebEelement.click();     
         Thread.sleep(10000);
         return new AdjustmentReasonPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	
	 

	 public ReportTemplatePage openReportTemplate() {
	   	try {
	   	    this.MouseOverOnMenu();
	   	    this.moveToLeftNavigation("Administration");
	   	    
	   	    WebElement ReportTemplateWebEelement = new WebDriverWait(driver, 100)
	   		    .until(ExpectedConditions.elementToBeClickable(ReportTemplate_xpath));
	   	 
	   	 ReportTemplateWebEelement.click();
	   	Thread.sleep(10000);
	   	    return new ReportTemplatePage(driver);
	   	} catch (Exception ex) {
	   	    return null;
	   	}

	       }

	 
	 
	 public IneligibilityReasonsPage openIneligibilityReasons() {
		 try {
		 this.MouseOverOnMenu();
		 this.moveToLeftNavigation("ABL");
		 WebElement IneligibilityReasonsWebElement = new WebDriverWait(driver, 1000)
		 .until(ExpectedConditions.elementToBeClickable(ineligibilityReasons_xpath));
		 IneligibilityReasonsWebElement.click();
		 Thread.sleep(10000);
		 return new IneligibilityReasonsPage(driver); }
		 catch (Exception ex) {     
		 return null; }   
		 }
	 
	 
	 public FileClassification openFileClassifications() {
		 try {
		 this.MouseOverOnMenu();
		 this.moveToLeftNavigation("ABL");
		 WebElement FileClassificationWebElement = new WebDriverWait(driver, 1000)
		 .until(ExpectedConditions.elementToBeClickable(fileClassifications_xpath));
		 FileClassificationWebElement.click();
		 Thread.sleep(10000);
		 return new FileClassification(driver); }
		 catch (Exception ex) {     
		 return null;
		 }   
		 
	 }

	 
	 
	 
	 
	 
	 
	 //////////////////////////////////

	public boolean selectClientFromDropdown()
			{
			try{			    
				Thread.sleep(1000);
			WebElement selectClientWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(clientDropdown_xpath));
			selectClientWebEelement.click();
			return true;
			}
			catch(Exception ex){
			return false;
			}
			
			}
			
		
	 public String addValueToSearch(String ClientData)
			{
			try{
			WebElement searchClientTextBoxWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(SearchText_xpath));
			searchClientTextBoxWebEelement.clear();
			searchClientTextBoxWebEelement.sendKeys(ClientData);
			Thread.sleep(2000);
			
			}
			catch(Exception ex){
			}
			return ClientData;
			}
			
			
	 public boolean SearchClientClick()
			{
			try{
			
			WebElement searchClientWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ClickBox_xpath));
			searchClientWebEelement.click();
			return true;
			}
			catch(Exception ex){
			return false;
			}
			
			}
		
		
	 public boolean selectClientFromDropDown(String ClientData)
			{
			try{
			this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
			Thread.sleep(1000);
			
			
			return true;
			}
			catch(Exception ex){
			return false;
			}
			
			}
			 
	 
	 

	public IneligibleUninsuiredReason openIneligibleCalculation(String ClientData) {
		 try {
			 this.selectClientFromDropdown();
			 this.addValueToSearch(ClientData);
			 this.SearchClientClick();
			Thread.sleep(1000);
			 this.MouseOverOnMenu();
			 this.moveToLeftNavigation("Client Maintenance");
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(ineligibleCalculation_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return new IneligibleUninsuiredReason(driver); }
			 catch (Exception ex) {     
			 return null;
			 }   
			 
		}
	
	
	public IneligibleUninsuiredReason openDebtors() {
		 try {
			 this.MouseOverOnMenu();
			 this.moveToLeftNavigation("ABL");
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(debtors_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return new IneligibleUninsuiredReason(driver); }
			 catch (Exception ex) {     
			 return null;
			 }   
			 
		}

	
	
	public ClientMaintenancePageBreak openClientSummary() {
		try {
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenanceWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(ClientSummary_xpath));
    	    ClientMaintenanceWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
	
	public ClientMaintenancePageBreak openInactiveClients() {
		try {
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(InactiveClients_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(2000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }

	public ClientMaintenancePageBreak openBasicParameters(String ClientData) {
		try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(BasicParameters_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        
		
	}





	
	/*public ClientMaintenancePageBreak openClientSummary() {
    	try {
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenanceWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(ClientSummary_xpath));
    	    ClientMaintenanceWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openInactiveClients() {
    	try {
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(InactiveClients_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(2000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openBasicParameters(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(BasicParameters_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    */
    public ClientMaintenancePageBreak openCollateralAdvanceRate(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(CollateralAdvanceRate_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openIneligibleCalculations(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(IneligibleCalculations_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
		
    
    public ClientMaintenancePageBreak openSeasonalAdvanceRate(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(SeasonalAdvanceRate_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openBucketAging(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(BucketAging_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openBBCFilesRequired(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(BBCFilesRequired_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(5000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openClientBBCOptions(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(ClientBBCOptions_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openOtherFilesRequired(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(OtherFilesRequired_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openActivityTickler(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(ActivityTickler_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openComments(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(Comments_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openReportComments(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(ReportComments_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openExceptions(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(Exceptions_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openFundingStyle(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(FundingStyle_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openCollateralReserves(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(CollateralReserves_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openAssetAmortization(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(AssetAmortization_xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openMappingListView(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(MappingListView_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openCreateABLClient(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(CreateABLClient_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openCreateFactoringClient(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(CreateFactoringClient_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openBasicClientDetails(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(BasicClientDetails_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openMailAddress(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(MailAddress_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openContacts(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(Contacts_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openMiscellaneous(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(Miscellaneous_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openLegalContent(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(LegalContent_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openGuarantors(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(Guarantors_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openLoanFees(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(LoanFees_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }
    
    public ClientMaintenancePageBreak openIneligibleAdvances(String ClientData) {
    	try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("Client Maintenance");
    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(IneligibleAdvances_Xpath));
    	    ClientMaintenancePageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new ClientMaintenancePageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
        }

    ////////////////////////////////////////////////////////////////////

	public FileUploadPageBreak openCreateSkippedBBC(String ClientData) {
		try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("File Uploads");
    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(CreateSkippedBBC_Xpath));
    	    FileUploadPageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new FileUploadPageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
	}
    
	public FileUploadPageBreak openBBCHistoricalDataUpload(String ClientData) {
		try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("File Uploads");
    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(BBCHistoricalDataUpload_Xpath));
    	    FileUploadPageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new FileUploadPageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
	}
	public FileUploadPageBreak openMapAndUpload(String ClientData) {
		try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("File Uploads");
    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(MapAndUpload_Xpath));
    	    FileUploadPageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new FileUploadPageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
	}
	public FileUploadPageBreak openCollateralLoanAutoFileUploads(String ClientData) {
		try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("File Uploads");
    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(CollateralLoanAutoFileUploads_Xpath));
    	    FileUploadPageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new FileUploadPageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
	}
	
	public FileUploadPageBreak openCollateralLoanUndo(String ClientData) {
		try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("File Uploads");
    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(CollateralLoanUndo_Xpath));
    	    FileUploadPageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new FileUploadPageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
	}
	public FileUploadPageBreak openMappingListView1(String ClientData) {
		try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("File Uploads");
    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(MappingListView1_Xpath));
    	    FileUploadPageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new FileUploadPageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
	}
	public FileUploadPageBreak openAllClientsUploadDepositFiles(String ClientData) {
		try {
    		this.selectClientFromDropdown();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();
    	    this.MouseOverOnMenu();
    	    this.moveToLeftNavigation("File Uploads");
    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
    		.until(ExpectedConditions.elementToBeClickable(AllClientsUploadDepositFiles_Xpath));
    	    FileUploadPageBreakWebEelement.click();
    	    Thread.sleep(10000);
    	    return new FileUploadPageBreak(driver);
    	} catch (Exception ex) {
    	    return null;
    	}
	}
	
	public IneligibleCalculationContra openIneligibleCalculationn(String ClientData) {
		 try {
			
			 this.selectClientFromDropdown();
			 this.addValueToSearch(ClientData);
			 this.SearchClientClick();
			Thread.sleep(1000);
			 this.MouseOverOnMenu();
			 this.moveToLeftNavigation("Client Maintenance");
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(ineligibleCalculation_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return new IneligibleCalculationContra(driver); }
			 catch (Exception ex) {     
			 return null;
			 }   
			 
		}


	public DocumentManagement openDocumentManagement() {
		 try {
				
			/* this.selectClientFromDropdown();
			 this.addValueToSearch(ClientData);
			 this.SearchClientClick();*/
			Thread.sleep(1000);
			 this.MouseOverOnMenu();
			 this.moveToLeftNavigation("Document Management");
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(DocumentManagement_Xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return new DocumentManagement(driver); }
			 catch (Exception ex) {     
			 return null;
			 }   
	}


	public boolean selectClientFromDropdown(String clientName)
{
try{
	Thread.sleep(5000);
	WebElement clientWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(clientDropdown));
	clientWebEelement.click();
	WebElement clientWebEelement1=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(clientDropdownTextbox));
	clientWebEelement1.sendKeys();
	WebElement clientWebEelement2=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(selectclientFromDropdown));
	clientWebEelement2.click();
	Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;	
}
}
	
	public BasicParameterPage openBasicParameters() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Client Maintenance");     
		   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(basicParameters_xpath));     
		   InterestcodesWebEelement.click();     
		   Thread.sleep(10000);
		   return new BasicParameterPage(driver); } 
		   catch (Exception ex) {     
		   return null; 
		   }   
		   }

	
	public LoanSummary openLoanSummary() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Loan Maintenance");     
		   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(loanSummary_xpath));     
		   InterestcodesWebEelement.click();    
		   Thread.sleep(10000);
		   return new LoanSummary(driver); } 
		   catch (Exception ex) {     
		   return null; 
		   }   
		   }

	private final By loanSummary_xpath=By.xpath("(//a[contains(text(),'Loan Summary')])[1]");



	public CollateralLoansPage openCollateralLoans() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Loan Maintenance");     
		   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(collateralLoans_xpath));     
		   InterestcodesWebEelement.click();    
		   Thread.sleep(10000);
		   return new CollateralLoansPage(driver); } 
		   catch (Exception ex) {     
		   return null; 
		   }   
		   }

		private final By collateralLoans_xpath=By.xpath("//a[text()='Collateral Loans']");
	

    

    
    
    
    
		
				
				
				
					


		



	 

	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
}
