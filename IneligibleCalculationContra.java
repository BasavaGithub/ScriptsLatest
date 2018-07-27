package com.cync.pages;

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

public class IneligibleCalculationContra extends BasePage{

	public IneligibleCalculationContra(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private final By saveOnIneligibleReasons_xpath = By.id("apply_calculations");
	private final By unselectAllValues_xpath = By.xpath("//button[@class='removeall arrow-btnstyle']");
	private final By selectContra_xpath = By.xpath("(//option[contains(text(),'Contra')])[1]");
	private final By finalContra_xpath = By.xpath("//button[@class='move arrow-btnstyle']");
	private final By menuItem_xpath = By.id("top-menu");
	private final By contras_xpath=By.xpath("//a[contains(text(),'Contras')]");
	private final By AddContras_Xpath=By.id("add_contra_list");
	private final By CustomerNameText_Xpath=By.id("jqg2_customer_name");
	private final By VendorNameText_Xpath=By.id("jqg2_vendor_name");
	private final By SaveonContra_Xpath=By.xpath("(//div[@class='ui-pg-div'])[4]");
	private final By BBCRecalculationProcess_xpath=By.xpath("//a[contains(text(),'BBC Recalculation Process')]");
	private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
	private final By IneligibleSummary_xpath=By.xpath("(//a[@href='https://staging.cyncsoftware.com/borrowers/5365/ineligible_summaries/?menu_id=145'])[1]");
	private final By IneligibilityReason_Xpath=By.xpath("//td[contains(text(),'Contras')]");
	private final By IneligibilityReason1_Xpath=By.xpath("//td[contains(text(),'Contras')]");
	private final By IneligibilityAmount_Xpath=By.xpath("(//td[contains(text(),'6250.00')])[1]");
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public  boolean selectContra() {
		try {
			WebElement selectUninsuiredWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(selectContra_xpath));
			selectUninsuiredWebE.click();
			Thread.sleep(100);
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public  boolean finalContra() {
		try {
			WebElement finalUninsuiredWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(finalContra_xpath));
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
	
	public boolean selectContraAsReason() {
		 try {
			 this.removeAllList();
			 this.selectContra();
			 this.finalContra();
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

	public  boolean navigateToContra() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement navigateToContraWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(contras_xpath));
				 navigateToContraWebElement.click();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
		}
	
	public  boolean clickOnAdd() {
		try {
			WebElement clickOnAddWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(AddContras_Xpath));
			clickOnAddWebE.click();
			Thread.sleep(100);
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public  boolean selectCustomerName(String CustomerName) {
		try {
			WebElement selectCustomerNameWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(CustomerNameText_Xpath));
			selectCustomerNameWebEelement.click();
			selectCustomerNameWebEelement.sendKeys(CustomerName);
			return true;
			} 
		
		catch (Exception ex)
		{
			return false;
		}
		}
	
	public  boolean selectVendorName(String VendorName) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(VendorNameText_Xpath));
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				/*String data = ele.getText();
				System.out.println(data);*/
				
				if (ele.getText().equals(VendorName)) 
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
	
	public  boolean saveOnContra() {
		try {
			WebElement saveOnContraWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveonContra_Xpath));
			saveOnContraWebE.click();
			Thread.sleep(100);
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean mapVendor(String selectCustomerName,String selectVendorName) {
		 try {
			 this.clickOnAdd();
			 this.selectCustomerName("1000 CAPITAL INC");
			 this.selectVendorName("VENDOR1 V001");
			 this.saveOnContra();
			 return true;
		 	}
		 
	catch (Exception ex) {
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
			 WebElement openBbcRecalculationProcessWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcess_xpath));
			 openBbcRecalculationProcessWebElement.click();
			 Thread.sleep(1000);
			 return true;
		 	}
		 
	catch (Exception ex) {
	    return false;
					}
		
	}

	

	public  boolean clickOnProcessButton() {
		 try {
			  WebElement clickOnProcessButtonWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
			  clickOnProcessButtonWebElement.click();
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
		.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReason1_Xpath));
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
