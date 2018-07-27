package com.cync.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;



public class IneligibleUninsuiredReason extends BasePage {

	public IneligibleUninsuiredReason(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	private final By clientDropdown_xpath = By.xpath("//span[contains(text(),'Select Client')]");
	private final By SearchText_xpath = By.xpath("//span//input[@type='search']");
	private final By ClickBox_xpath = By.xpath("(//li[@class='select2-results__option'])[1]");
	private final By saveOnIneligibleReasons_xpath = By.id("apply_calculations");
	private final By unselectAllValues_xpath = By.xpath("//button[@class='removeall arrow-btnstyle']");
	private final By selectUninsuired_xpath = By.xpath("(//option[contains(text(),'Uninsured')])[1]");
	private final By finalSelection_xpath = By.xpath("//button[@class='move arrow-btnstyle']");
	
	private final By ReceivablesDoubleClick_xpath = By.xpath("(//td[@aria-describedby='customers_list_insurance_limit'])[2]");
	private final By ReceivablesDoubleClick1_xpath = By.xpath("(//td[@aria-describedby='customers_list_insurance_limit'])[1]");
	private final By ReceivablesDoubleClick2_xpath = By.xpath("(//td[@aria-describedby='customers_list_insurance_limit'])[9]");
	private final By ReceivablesDoubleClick3_xpath = By.xpath("(//td[@aria-describedby='customers_list_insurance_limit'])[7]");
	
	private final By ReceivablesDoubleClick4_xpath = By.xpath("(//td[@aria-describedby='customers_list_insurance_limit'])[18]");
	

	 
	private final By InsuiredLimitTextbox_xpath = By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[7] ");
	
	
	
	private final By SaveonDebtors_Xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	
	private final By CloseOnPopUp_Xpath = By.id("closedialog");
	private final By menuItem_xpath = By.id("top-menu");
	private final By debtors_xpath=By.xpath("//a[contains(text(),'Debtors')]");
		
	private final By BBCRecalculationProcess_xpath=By.xpath("//a[contains(text(),'BBC Recalculation Process')]");
	
	private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
	
	private final By IneligibleSummary_xpath=By.xpath("(//a[@href='https://staging.cyncsoftware.com/borrowers/5299/ineligible_summaries/?menu_id=145'])[1]");
	
	private final By IneligibilityReason_Xpath=By.xpath("//td[contains(text(),'Uninsured')]");
	
	private final By IneligibilityReasonTotals_Xpath=By.xpath("(//td[contains(text(),'Totals')])[1]");
	
	private final By IneligibilityAmount_Xpath=By.xpath("(//td[contains(text(),'48,000.00')])[1]");
	
	private final By IneligibilityTotalAmount_Xpath=By.xpath("(//td[contains(text(),'0')])[1]");
	
	
	
	private final By BBCAvailability_xpath=By.xpath("(//a[@href='https://staging.cyncsoftware.com/borrowers/5299/bbc_summary/?menu_id=150'])[1]");
	private final By clickOnPlusBBCAvailability_Xpath=By.xpath("(//i[@class='icon-plus'])[2]");
	private final By IneligibilityReasonBBCAvailability_Xpath=By.xpath("//td[contains(text(),'Uninsured')]");
	private final By IneligibilityAmountBBCAvailability_Xpath=By.xpath("(//td[contains(text(),' 48,000.00')])[3]");
	private final By IneligibilityAmountBBCReport_Xpath=By.xpath("(//td[contains(text(),' 0.00')])[13]");
	
	private final By IneligibilityAmountBBCAvailability1_Xpath=By.xpath("(//td[contains(text(),'0.00')])[31]");
	private final By IneligibilityAmountBBCAvailability2_Xpath=By.xpath("(//td[contains(text(),'0.00')])[17]");
	
	private final By clickOnHTMlButton_Xpath=By.xpath("//button[contains(text(),'HTML')]");
	private final By Reports_xpath=By.xpath("(//a[contains(text(),'Reports')])[1]");
	private final By clickOnBBCReport_Xpath=By.xpath("(//li[@class='open_menu'])[9]");
	
	
	private final By clickOnIneligibleEligibleAnalysisReport_Xpath=By.xpath("(//li[@class='open_menu'])[3]");
	private final By IneligibilityReasonIneligibleReport_Xpath=By.xpath("(//td[contains(text(),'Uninsured')])[1]");
	private final By IneligibilityReasonIneligibleReport1_Xpath=By.xpath("(//td[contains(text(),'Overall Total')])[1]");
	private final By IneligibilityAmountIneligibleReport_Xpath=By.xpath("(//td[contains(text(),' 48,000.00')])[1]");
	private final By IneligibilityAmountIneligibleReport1_Xpath=By.xpath("(//td[contains(text(),'0.00')])[1]");
	private final By IneligibilityReasonIneligibleReport2_Xpath=By.xpath("(//td[contains(text(),'Total')])[1]");
	private final By IneligibilityAmountIneligibleReport2_Xpath=By.xpath("(//td[contains(text(),'0.00')])[2]");
	
	
	
	
	private final By ClickonGroupbyDropdown_Xpath=By.xpath("//select[@id='ineligible_style']");
	private final By ClickonRecordsPerPageDropdown_Xpath=By.xpath("//select[@class='ui-pg-selbox ui-widget-content ui-corner-all']");
	
	private final By ClickonApproveBBC_Xpath=By.xpath("(//a[contains(text(),'Approve BBC')])[2]");
	private final By ClickonElectronicSignature_Xpath=By.xpath("(//a[contains(text(),'Electronic Signature')])");
	private final By SigNameTextBox_Xpath=By.id("signer_name");
	private final By AgreeCheckBox_Xpath=By.id("terms_condition");
	
	private final By ClickonApproveBBCButton_Xpath=By.xpath("(//button[contains(text(),'Authorize Signature and Approve BBC')])");
	private final By CloseButtonPopup_Xpath=By.xpath("(//button[@class='ui-dialog-titlebar-close'])");
	
	private final By BBCReviewData_Xpath=By.xpath("(//a[@href='https://staging.cyncsoftware.com/borrowers/5299/detail_bbcs/?menu_id=162'])[1]");
	private final By SelectBBC_Xpath=By.id("choose_bbc");
	
	private final By IneligibleSummaryHistory_Xpath=By.xpath("(//a[@href='https://staging.cyncsoftware.com/borrowers/5299/detail_ineligible_summaries/?menu_id=164'])[1]");
	
	private final By BBCAvailability_History_Xpath=By.xpath("(//a[@href='https://staging.cyncsoftware.com/borrowers/5299/detailed_bbc_summary/?menu_id=168'])[1]");
	
	private final By ApproveBBcDropdown_BBCReport_Xpath=By.id("bbc_status");
	private final By ApproveBBcDate_BBCReport_Xpath=By.id("bbc_id");
	
	private final By ApproveBBc_Xpath=By.xpath("//a[contains(text(),'Approve BBC/Funding')]");
	private final By SelectBorrowerList_Xpath=By.id("selected_borrower_list");
	private final By ClickonSearch_Xpath=By.xpath("//input[@value='Search']");
	private final By ClickonUnreleaseButton_Xpath=By.xpath("//a[contains(text(),'Unrelease BBC')]");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	
	
	
	
	
	  
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				

		public  boolean removeAllList() {
			try {
				WebElement removeAllListWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(unselectAllValues_xpath));
				removeAllListWebE.click();
				Thread.sleep(100);
				return true;
			}
			 catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		
		public  boolean selectUninsuired() {
			try {
				WebElement selectUninsuiredWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(selectUninsuired_xpath));
				selectUninsuiredWebE.click();
				Thread.sleep(100);
				return true;
			}
			 catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		
		public  boolean finalUninsuired() {
			try {
				WebElement finalUninsuiredWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(finalSelection_xpath));
				finalUninsuiredWebE.click();
				Thread.sleep(100);
				return true;
			}
			 catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}

		public  boolean saveOnIneligibleCalculation() {
			try {
			WebElement saveOnIneligibleReasonsWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(saveOnIneligibleReasons_xpath));
			saveOnIneligibleReasonsWebE.click();
			Thread.sleep(1000);
			
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
		
		public boolean selectUninsuiredReason() {
			 try {
				 this.removeAllList();
				 this.selectUninsuired();
				 this.finalUninsuired();
				 this.saveOnIneligibleCalculation();
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
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
			    
			    
			    
			    

		public boolean definingInsuranceLimit() {
				try {
					this.openDebtors();
					this.dubbleClickOnInsuiredLimit();
					this.setUninsuredValue("6000");
					this.saveOnDebtorsScreen();
					this.closeOnPopUp();
					return true;
					 }
					 
				catch (Exception ex) {
				    return false;
								}
									}
		public boolean definingInsuranceLimit2() {
			try {
				this.openDebtors();
				this.dubbleClickOnInsuiredLimit();
				this.setUninsuredValue("0000");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				Thread.sleep(2000);
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		public boolean definingInsuranceLimit1() {
			try {
				this.openDebtors();
				this.dubbleClickOnInsuiredLimit1();
				this.setUninsuredValue("7000");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
							}
		
		public boolean definingInsuranceLimit3() {
			try {
				this.openDebtors();
				this.dubbleClickOnInsuiredLimit1();
				this.setUninsuredValue("0000");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
							}
				
		public boolean definingInsuranceLimit6() {
			try {
				this.openDebtors();
				this.dubbleClickOnInsuiredLimit3();
				this.setUninsuredValue("0000");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				Thread.sleep(2000);
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		public boolean definingInsuranceLimit4() {
			try {
				this.dubbleClickOnInsuiredLimit2();
				this.setUninsuredValue("2000");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				return true;
			}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		public boolean definingInsuranceLimit8() {
			try {
				this.dubbleClickOnInsuiredLimit2();
				this.setUninsuredValue("0000");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				return true;
			}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		public boolean definingInsuranceLimit5() {
			try {
				this.openDebtors();
				this.dubbleClickOnInsuiredLimit3();
				this.setUninsuredValue("9000");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		public boolean definingInsuranceLimit10() {
			try {
				this.openDebtors();
				this.dubbleClickOnInsuiredLimit3();
				this.setUninsuredValue("0000");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		public boolean definingInsuranceLimit7() {
			try {
				//this.openDebtors();
				this.dubbleClickOnInsuiredLimit4();
				this.setUninsuredValue("500");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		public boolean definingInsuranceLimit14() {
			try {
				//this.openDebtors();
				this.dubbleClickOnInsuiredLimit4();
				this.setUninsuredValue("500");
				this.saveOnDebtorsScreen();
				this.closeOnPopUp();
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		
		
		public boolean openDebtors() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(debtors_xpath));
				 IneligibleCalculationPageWebElement.click();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
		
		
		public boolean dubbleClickOnInsuiredLimit(){
			try{
			
			WebElement element=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick_xpath));
			//Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(2000);
			return true;
		}
			 catch (Exception e) {
					// TODO: handle exception
					return false;
				}
		}
		
		public boolean dubbleClickOnInsuiredLimit1(){
			try{
			
			WebElement element=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick1_xpath));
			//Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(2000);
			return true;
		}
			 catch (Exception e) {
					// TODO: handle exception
					return false;
				}
		}
		
		public boolean dubbleClickOnInsuiredLimit2(){
			try{
			
			WebElement element=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick2_xpath));
			//Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(2000);
			return true;
		}
			 catch (Exception e) {
					// TODO: handle exception
					return false;
				}
		}
		
		public boolean dubbleClickOnInsuiredLimit3(){
			try{
			
			WebElement element=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick3_xpath));
			//Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(2000);
			return true;
		}
			 catch (Exception e) {
					// TODO: handle exception
					return false;
				}
		}
		
		public boolean dubbleClickOnInsuiredLimit4(){
			try{
			
			WebElement element=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick4_xpath));
			//Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(2000);
			return true;
		}
			 catch (Exception e) {
					// TODO: handle exception
					return false;
				}
		}
		
		
		public boolean setUninsuredValue(String Value){
			try{
			
			WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(InsuiredLimitTextbox_xpath));
			Thread.sleep(100);
			setUninsuredValueWebE.clear();
			setUninsuredValueWebE.sendKeys(Value);
			Thread.sleep(500);			
			return true;
		}
			 catch (Exception e) {
					// TODO: handle exception
					return false;
				}
		}
		

		public boolean saveOnDebtorsScreen(){
			try{
			
			WebElement saveOnDebtorsScreeneWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveonDebtors_Xpath));
			Thread.sleep(100);
			saveOnDebtorsScreeneWebE.click();
			Thread.sleep(500);			
			return true;
		}
			 catch (Exception e) {
					// TODO: handle exception
					return false;
				}
		}

 
		 

		public  boolean closeOnPopUp(){
			try{
			WebElement saveOnDebtorsScreeneWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(CloseOnPopUp_Xpath));
			Thread.sleep(100);
			saveOnDebtorsScreeneWebE.click();
			return true;
				}
			catch (Exception e) {
					return false;
				}
		}
		
		
		public boolean recalculatingBBC() {
			try {
				this.openBbcRecalculationProcess();
				this.clickOnProcessButton();
				return true;
				 }
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
		public boolean openBbcRecalculationProcess() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcess_xpath));
				 IneligibleCalculationPageWebElement.click();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}

		

		public  boolean clickOnProcessButton() {
			 try {
				  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
				 IneligibleCalculationPageWebElement.click();
				 Thread.sleep(2000);
				 Alert simpleAlert = driver.switchTo().alert();
				 simpleAlert.accept();
				 Thread.sleep(2000);
				 simpleAlert.accept();
				 Thread.sleep(2000);
				 return true;
				 }
			 
		catch (Exception ex) {
		    return false;
						}
	}

		public  boolean navigateToIneligibleSummary() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(IneligibleSummary_xpath));
				 navigateToIneligibleSummaryWebElement.click();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}

		public  boolean verifyIneligibilityReason(String ReasonData){
			try{
			WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReason_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if(ActualReason.equalsIgnoreCase(ReasonData));
			System.out.println(ActualReason);
			return true;

			}
			catch (Exception e) {
					return false;
				}
			
		}
		
		public  boolean verifyIneligibilityReason1(String ReasonData){
			try{
			WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonTotals_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if(ActualReason.equalsIgnoreCase(ReasonData));
			System.out.println(ActualReason);
			return true;

			}
			catch (Exception e) {
					return false;
				}
			
		}
		public  boolean verifyIneligibilityAmount(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmount_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount));
			System.out.println(ActualAmount);
			return true;	
				}

				catch (Exception e) {
						return false;
					}
			}
		
		public  boolean verifyIneligibilityAmount1(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityTotalAmount_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount));
			System.out.println(ActualAmount);
			return true;	
				}

				catch (Exception e) {
						return false;
					}
			}
		
		
		public  boolean navigationToBBCAvailability() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(BBCAvailability_xpath));
				 navigateToIneligibleSummaryWebElement.click();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		} 
		
		public  boolean navigationToBBCAvailability_History() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(BBCAvailability_History_Xpath));
				 navigateToIneligibleSummaryWebElement.click();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
		

		public  boolean verifyIneligibilityReasonInBBCAvailability(String ReasonData){
			try{
				 this.clickOnPlus_BBCAvailability();
			WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonBBCAvailability_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if(ActualReason.equalsIgnoreCase(ReasonData));
			System.out.println(ActualReason);
			return true;
				}
			catch (Exception e) {
					return false;
				}
			
		}
		
		public  boolean verifyIneligibilityAmountBBCAvailability(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountBBCAvailability_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount));
			System.out.println(ActualAmount);
			return true;	
				}

				catch (Exception e) {
						return false;
					}
			}
		
		public  boolean verifyIneligibilityAmountBBCAvailability1(String ReasonAmount){
			try{
				this.clickOnPlus_BBCAvailability();
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountBBCAvailability1_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount));
			System.out.println(ActualAmount);
			return true;	
				}

				catch (Exception e) {
						return false;
					}
			}
		
		public  boolean verifyIneligibilityAmountBBCAvailability2(String ReasonAmount){
			try{
				this.clickOnPlus_BBCAvailability();
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountBBCAvailability2_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount));
			System.out.println(ActualAmount);
			return true;	
				}

				catch (Exception e) {
						return false;
					}
			}
		
			public  boolean clickOnPlus_BBCAvailability() {
				 try {
					  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(clickOnPlusBBCAvailability_Xpath));
					 clickOnPlus_BBCAvailabilityWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			
			public  boolean generatingBBCReport() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.clickOnBBCReport();
					 this.clickOnHTMlButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			/*public  boolean generatingBBCReportApproved(SelectBBCDate,SelectBBCStatus) {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.clickOnBBCReport();
					 this.selectBBCStatus("Approved");
					 this.selectBBCDate("12/31/2017");
					 this.clickOnHTMlButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			*/
			public  boolean clickOnBBCReport() {
				 try {
					  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(clickOnBBCReport_Xpath));
					 clickOnPlus_BBCAvailabilityWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}  
			
			public  boolean clickOnHTMlButton() {
				 try {
					  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(clickOnHTMlButton_Xpath));
					 clickOnPlus_BBCAvailabilityWebElement.click();
					  Thread.sleep(1000);
					  
					  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					  driver.switchTo().window(tabs2.get(1));
					  return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}

			
			public  boolean verifyIneligibilityReasonInBBCReports(String ReasonData){
				try{
					 WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
					 .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonBBCAvailability_Xpath));
					 Thread.sleep(100);
					 String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
					 if(ActualReason.equalsIgnoreCase(ReasonData));
					 System.out.println(ActualReason);
					 return true;
					}
				catch (Exception e) {
						return false;
					}
				
			}
			
			public  boolean verifyIneligibilityAmountBBCReports(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountBBCAvailability_Xpath));
				Thread.sleep(100);
				String ActualAmount = verifyIneligibilityAmountWebE.getText().trim();
				if(ActualAmount.equalsIgnoreCase(ReasonAmount));
				System.out.println(ActualAmount);
				return true;	
					}

					catch (Exception e) {
							return false;
						}
				}
			
			
			public  boolean verifyIneligibilityAmountBBCReports1(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountBBCReport_Xpath));
				Thread.sleep(100);
				String ActualAmount = verifyIneligibilityAmountWebE.getText().trim();
				if(ActualAmount.equalsIgnoreCase(ReasonAmount));
				System.out.println(ActualAmount);
				return true;	
					}

					catch (Exception e) {
							return false;
						}
				}

			
			
			public  boolean generatingIneligibleEligibleRecivablesAnalysisReport() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.IneligibleEligibleRecivablesAnalysisReport();
					 
					 
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			

			public  boolean generatingIneligibleEligibleRecivablesAnalysisReport1() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.IneligibleEligibleRecivablesAnalysisReport();
					 this.clickOnHTMlButton();
					 
					 
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean IneligibleEligibleRecivablesAnalysisReport() {
				 try {
					  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(clickOnIneligibleEligibleAnalysisReport_Xpath));
					 clickOnPlus_BBCAvailabilityWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}  
			
			public  boolean clickOnHTMlButton_EligileReport() {
				 try {
					  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
					  .until(ExpectedConditions.elementToBeClickable(clickOnHTMlButton_Xpath));
					  clickOnPlus_BBCAvailabilityWebElement.click();
					  Thread.sleep(1000);
					  
					  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					  driver.switchTo().window(tabs2.get(1));
					  return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}

			
			public  boolean verifyIneligibilityReasonInEligibleReports(String ReasonData){
				try{
					 Thread.sleep(5000);
					 WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
					 .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonIneligibleReport_Xpath));
					 Thread.sleep(100);
					 String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
					 if(ActualReason.equalsIgnoreCase(ReasonData));
					 System.out.println(ActualReason);
					 return true;
					}
				catch (Exception e) {
						return false;
					}
				
			}
			
			public  boolean verifyIneligibilityReasonInEligibleReports1(String ReasonData){
				try{
					 Thread.sleep(5000);
					 WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
					 .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonIneligibleReport1_Xpath));
					 Thread.sleep(100);
					 String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
					 if(ActualReason.equalsIgnoreCase(ReasonData));
					 System.out.println(ActualReason);
					 return true;
					}
				catch (Exception e) {
						return false;
					}
				
			}
			
			public  boolean verifyIneligibilityReasonInEligibleReports2(String ReasonData){
				try{
					 Thread.sleep(5000);
					 WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
					 .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonIneligibleReport2_Xpath));
					 Thread.sleep(100);
					 String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
					 if(ActualReason.equalsIgnoreCase(ReasonData));
					 System.out.println(ActualReason);
					 return true;
					}
				catch (Exception e) {
						return false;
					}
				
			}
			
			public  boolean verifyIneligibilityAmountInEligibleReports(String ReasonAmount){
				try{
					Thread.sleep(5000);
					WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountIneligibleReport_Xpath));
					Thread.sleep(100);
					String ActualAmount = verifyIneligibilityAmountWebE.getText().trim();
					if(ActualAmount.equalsIgnoreCase(ReasonAmount));
					System.out.println(ActualAmount);
					return true;	
					}

					catch (Exception e) {
							return false;
						}
				}
			
			public  boolean verifyIneligibilityAmountInEligibleReports1(String ReasonAmount){
				try{
					Thread.sleep(5000);
					WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountIneligibleReport1_Xpath));
					Thread.sleep(100);
					String ActualAmount = verifyIneligibilityAmountWebE.getText().trim();
					if(ActualAmount.equalsIgnoreCase(ReasonAmount));
					System.out.println(ActualAmount);
					return true;	
					}

					catch (Exception e) {
							return false;
						}
				}
			
			public  boolean verifyIneligibilityAmountInEligibleReports2(String ReasonAmount){
				try{
					Thread.sleep(5000);
					WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountIneligibleReport2_Xpath));
					Thread.sleep(100);
					String ActualAmount = verifyIneligibilityAmountWebE.getText().trim();
					if(ActualAmount.equalsIgnoreCase(ReasonAmount));
					System.out.println(ActualAmount);
					return true;	
					}

					catch (Exception e) {
							return false;
						}
				}

			
			public  boolean ClickonGroupbyDropdown(String GropuBy) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(ClickonGroupbyDropdown_Xpath));
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(GropuBy)) 
						{
					 		ele.click();
							//Thread.sleep(10000);
							
							 return true;
						}
					}
				} 
				catch (Exception ex)
				{
					return false;
				}
				return false;
				
	
			}
			
			public  boolean ClickonRecordsPerPageDropdown(String PageValue) {
				try {
					this.openDebtors();
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(ClickonRecordsPerPageDropdown_Xpath));
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(PageValue)) 
						{
					 		ele.click();
							//Thread.sleep(10000);
							
							 return true;
						}
					}
				} 
				catch (Exception ex)
				{
					return false;
				}
				return false;
				
	
			}
			
			
			public  boolean approveTheBBC(String SignatureData) {
				 try {
					 this.navigationToBBCAvailability();
					 this.clickOnApproveBBC();
					 this.clickOnElectronicSignatureButton();
					 this.datatoTheSigntureTextBox("Basava");
					 this.clickOnAgreeCheckBox();
					 this.clickOnArroveBBCbutton();
					 this.clickOnCloseButton();
					  return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			public  boolean clickOnApproveBBC() {
				 try {
					  WebElement clickOnApproveBBCWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonApproveBBC_Xpath));
					  clickOnApproveBBCWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean clickOnElectronicSignatureButton() {
				 try {
					  WebElement clickOnElectronicSignatureButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonElectronicSignature_Xpath));
					  clickOnElectronicSignatureButtonWebElement.click();
					 Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean datatoTheSigntureTextBox(String SignatureData) {
				 try {
					  WebElement datatoTheSigntureTextBoxWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(SigNameTextBox_Xpath));
					  datatoTheSigntureTextBoxWebElement.clear();
					  datatoTheSigntureTextBoxWebElement.sendKeys(SignatureData);
					   Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean clickOnAgreeCheckBox() {
				 try {
					  WebElement clickOnAgreeCheckBoxWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(AgreeCheckBox_Xpath));
					  clickOnAgreeCheckBoxWebElement.click();
					 Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean clickOnArroveBBCbutton() {
				 try {
					  WebElement clickOnArroveBBCbuttonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonApproveBBCButton_Xpath));
					  clickOnArroveBBCbuttonWebElement.click();
					 Thread.sleep(2000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			public  boolean clickOnCloseButton() {
				 try {
					  WebElement clickOnCloseButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(CloseButtonPopup_Xpath));
					  clickOnCloseButtonWebElement.click();
					 Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			public  boolean ClickonSelectBBCDropdown(String SelectBBC) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(SelectBBC_Xpath));
					Thread.sleep(1500);
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(SelectBBC)) 
						{
					 		ele.click();
							Thread.sleep(2500);
							
							 return true;
						}
					}
				} 
				catch (Exception ex)
				{
					return false;
				}
				return false;
				
	
			}
			
			public  boolean navigationToBBCReviewData() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(BBCReviewData_Xpath));
					 navigateToIneligibleSummaryWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
		
			public  boolean navigationToIneligibleSummary() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(IneligibleSummaryHistory_Xpath));
					 navigateToIneligibleSummaryWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		
			public  boolean selectBBCStatus(String SelectBBCStatus) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBcDropdown_BBCReport_Xpath));
					Thread.sleep(1500);
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(SelectBBCStatus)) 
						{
					 		ele.click();
							Thread.sleep(2500);
							
							 return true;
						}
					}
				} 
				catch (Exception ex)
				{
					return false;
				}
				return false;
				
	
			}
		
			public  boolean selectBBCDate(String SelectBBCDate) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBcDate_BBCReport_Xpath));
					Thread.sleep(1500);
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(SelectBBCDate)) 
						{
					 		ele.click();
							Thread.sleep(2500);
							
							 return true;
						}
					}
				} 
				catch (Exception ex)
				{
					return false;
				}
				return false;
				
	
			}
			
			public  boolean generatingBBCReportApproved(String SelectBBCDate, String SelectBBCStatus) {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.clickOnBBCReport();
					 Thread.sleep(500);
					 this.selectBBCStatus("Approved");
					 Thread.sleep(500);
					 this.selectBBCDate("12/31/2017");
					 Thread.sleep(500);
					 this.clickOnHTMlButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean generatingIneligibleReasonReportApproved(String SelectBBCDate, String SelectBBCStatus) {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.IneligibleEligibleRecivablesAnalysisReport();
					 Thread.sleep(500);
					 this.selectBBCStatus("Approved");
					 Thread.sleep(500);
					 this.selectBBCDate("12/31/2017");
					 Thread.sleep(500);
					 this.clickOnHTMlButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean generatingIneligibleDebtorReportApproved(String SelectBBCDate, String SelectBBCStatus) {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.IneligibleEligibleRecivablesAnalysisReport();
					 Thread.sleep(500);
					 this.selectBBCStatus("Approved");
					 Thread.sleep(500);
					 this.selectBBCDate("12/31/2017");
					 Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}

			public boolean UnreleaseTheBBC(String SelectApprovedClient) {
				 try {
					 this.navigationToApproveBBC();
					 this.clickonAllClientDropdown("AUTO_INELIGIBLE_001");
					 this.clickonSearchButton();
					 this.clickonUnreleaseButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
					} 
			
			public  boolean navigationToApproveBBC() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ApproveBBc_Xpath));
					 navigateToIneligibleSummaryWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
							}
			
			public  boolean clickonAllClientDropdown(String SelectApprovedClient) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(SelectBorrowerList_Xpath));
					Thread.sleep(1500);
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(SelectApprovedClient)) 
						{
					 		ele.click();
							Thread.sleep(2500);
							
							 return true;
						}
					}
				} 
				catch (Exception ex)
				{
					return false;
				}
				return false;
				
	
			}
			
			
			
			public  boolean clickonSearchButton() {
				 try {
					 WebElement clickonSearchButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonSearch_Xpath));
					 clickonSearchButtonWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			public  boolean clickonUnreleaseButton() {
				 try {
					 WebElement clickonUnreleaseButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonUnreleaseButton_Xpath));
					 clickonUnreleaseButtonWebElement.click();
					 Thread.sleep(1000);
					 Alert simpleAlert = driver.switchTo().alert();
					 simpleAlert.accept();
					 Thread.sleep(2000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
					

			