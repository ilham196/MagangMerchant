package com.juaracoding.magangmerchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magangmerchant.driver.DriverSingleton;



public class Distribusi {
	
	private WebDriver driver;
	
	 public Distribusi(){
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	} 
	 
	 @FindBy(css = "#sidebar > div > div:nth-child(1) > ul > li:nth-child(12) > a")
		private WebElement btnDistribusi;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[2]/p/span/a[1]")
		private WebElement btnNew;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[2]/p/span/a[2]")
		private WebElement btnNoStatus;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[2]/p/span/a[3]")
		private WebElement btnReschedule;
		
		@FindBy(xpath = "//*[@id=\"select2-sales-hj-container\"]")
		private WebElement btnPilihMS;
		
		@FindBy(id = "select2-sales-7z-container")
		private WebElement btnMS;
		
		@FindBy(xpath = "//span/input")
		private WebElement txtSearchingMS;
		
		@FindBy(css = "#data-distribusi > tbody > tr:nth-child(2) > td:nth-child(1) > input[type=checkbox]")
		private WebElement btnCheckbox;
		
		@FindBy(xpath = "//*[@id=\"btnSave\"]")
		private WebElement btnSaveDistribusi;
		
		public void tunda() {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void gotoDistribusi() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			btnDistribusi.click();
			tunda();
		}
		
		public void Distribusi(String search, String ms) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			btnNoStatus.click();
			tunda();
			btnReschedule.click();
			tunda();
			btnNew.click();
			tunda();
			btnPilihMS.click();
			tunda();
			btnMS.sendKeys(ms);
			btnMS.sendKeys(Keys.ENTER);
			tunda();
			js.executeScript("window.scrollBy(0,500)");
			btnCheckbox.click();
			tunda();
			js.executeScript("window.scrollBy(0,1000)");
//			btnSaveDistribusi.click();
			tunda();
			js.executeScript("window.scrollBy(0,-1000)");
			txtSearchingMS.sendKeys(search);
			txtSearchingMS.sendKeys(Keys.ENTER);
			
		}


}
