package com.juaracoding.magangmerchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magangmerchant.driver.DriverSingleton;



public class Worklist {

	private WebDriver driver;
	
	 public Worklist() {
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(linkText = "Worklist")
	private WebElement btnWorklist;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul > li.has-sub.expand > ul > li:nth-child(1) > a")
	private WebElement btnNewData;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul > li.has-sub.active > ul > li:nth-child(2) > a")
	private WebElement btnReschedule;
	
	@FindBy(css = "#sidebar > div > div:nth-child(1) > ul > li.has-sub.active > ul > li:nth-child(3) > a")
	private WebElement btnReturned;
	
	@FindBy(css = "#data-worklist > tbody > tr:nth-child(1) > td:nth-child(2) > a")
	private WebElement btnActionNewData;
	
	@FindBy(css = "#data-worklist > tbody > tr:nth-child(1) > td:nth-child(2) > a")
	private WebElement btnActionReschedule;
	
	@FindBy(css = "#data-worklist > tbody > tr:nth-child(1) > td:nth-child(2) > a")
	private WebElement btnActionReturned;
	
//	WORKLIST NEW DATA
	@FindBy(xpath = "//*[@id=\"data-worklist_filter\"]/label/input")
	private WebElement txtSearch;
	
	@FindBy(name = "data-worklist_length")
	private WebElement showEntries;
	
	@FindBy(linkText = "Next")
	private WebElement btnNext;
	
	@FindBy(linkText = "Previous")
	private WebElement btnPrevious;
	
	@FindBy(linkText = "2")
	private WebElement btngotoPage;
	
	
	//DATA KEDAI PITIX
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[2]/table/tbody/tr[4]/td[3]/a/div/i")
	private WebElement btnWA;
	
	@FindBy(css ="//*[@id=\"Status\"]")
	private WebElement drpdownStatus;
	
	@FindBy(xpath = "//div[@id='div_document']/table/tbody/tr/td[2]/a/span")
	private WebElement fotoQRTampakDekat;
	
	@FindBy(id = "file")
	private WebElement uploadFile1;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave1;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[3]/td[2]/a[1]/span")
	private WebElement fotoQRTampakJauh;
	
	@FindBy(id = "file")
	private WebElement uploadFile2;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave2;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[5]/td[2]/a[1]/span")
	private WebElement fotoQRTransSakuku;
	
	@FindBy(id = "file")
	private WebElement uploadFile3;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave3;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[7]/td[2]/a[1]/span")
	private WebElement fotoQRTransNonSakuku;
	
	@FindBy(id = "file")
	private WebElement uploadFile4;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave4;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[9]/td[2]/a[1]/span")
	private WebElement fotoQRTampakDepan;
	
	@FindBy(id = "file")
	private WebElement uploadFile5;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave5;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[11]/td[2]/a[1]/span")
	private WebElement fotoQRTampakDalam;
	
	@FindBy(id = "file")
	private WebElement uploadFile6;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave6;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[13]/td[2]/a[1]/span")
	private WebElement fotoQRTampakSamping;
	
	@FindBy(id = "file")
	private WebElement uploadFile7;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave7;
	
	@FindBy(css = "#Reason")
	private WebElement drpdownReason;
	
	@FindBy(css = "#form_survey > div:nth-child(2) > input")
	private WebElement btnJam;
	
	@FindBy(css = "#div_pic > input")
	private WebElement txtPenerima;
	
	@FindBy(css = "#form_survey > div:nth-child(5) > textarea")
	private WebElement txtKeterangan;
	
	
	//SEARCH DATA PITIX
	@FindBy(xpath = "//*[@id=\"content\"]/h1/button") 
	private WebElement btnSearch1;
	
	@FindBy(css = "#searchinput")
	private WebElement txtSearch1;
	
	@FindBy(xpath = "//*[@id=\"modalSearch\"]/div/div/div[3]/button[1]")
	private WebElement btnSubmitSearch;
	
	@FindBy(xpath = "//*[@id=\"data-search_paginate\"]/ul/li[3]/a")
	private WebElement btnPage2Search;
	
	@FindBy(xpath = "//*[@id=\"data-search_next\"]/a")
	private WebElement btnNextSearch;
	
	@FindBy(xpath = "//*[@id=\"data-search_previous\"]/a")
	private WebElement btnPrevSearch;
	
	@FindBy(css = "#data-search_length > label > select")
	private WebElement btnShowSearch;
	
	@FindBy(css = "#modalSearch > div > div > div.modal-footer > button.btn.btn-secondary")
	private WebElement btnCloseSearch;
	
	@FindBy(xpath = "//*[@id=\"form_survey\"]/footer/button")
	private WebElement btnSubmitNewData;
	
	@FindBy(xpath = "//*[@id=\"form_survey\"]/footer/a")
	private WebElement btnCloseNewData;
	
	public void tunda() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void gotoWorklistNewData() {
		btnWorklist.click();
		btnNewData.click();
		tunda();
	}
	
	public void WorklistNewData() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		btngotoPage.click();
		tunda();
		btnNext.click();
		tunda();
		btnPrevious.click();
		btnPrevious.click();
		tunda();
		js.executeScript("window.scrollBy(0,1000)");
		tunda();
		new Select(showEntries).selectByValue("25");
		tunda();
		txtSearch.click();
		txtSearch.sendKeys("Tangerang");
		txtSearch.sendKeys(Keys.ENTER);
		tunda();

	}
	
	public void gotoFormDelivery(String search1) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnActionNewData.click();
		
		//Search Form Delivery
		btnSearch1.click();
		txtSearch1.sendKeys(search1);
		tunda();
		btnSubmitSearch.click();
		js.executeScript("window.scrollBy(0,500)");
		btnNextSearch.click();
		tunda();
		btnPrevSearch.click();
		tunda();
		btnPage2Search.click();
		tunda();
		btnPrevSearch.click();
		tunda();
//		js.executeScript("window.scrollBy(0,-500)");
		btnCloseSearch.click();
		tunda();
		
		//Form Delivery Data Upload Foto
		btnWA.click();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,500)");
		tunda();
		drpdownStatus.click();
		new Select(drpdownStatus).selectByValue("118-Sukses");
		js.executeScript("window.scrollBy(0,500)");
		tunda();
		fotoQRTampakDekat.click();
		uploadFile1.sendKeys("E:\\Java\\1.PNG");
		btnSave1.click();
		tunda();
		fotoQRTampakJauh.click();
		uploadFile2.sendKeys("E:\\Java\\1.PNG");
		btnSave2.click();
		tunda();
		fotoQRTransSakuku.click();
		uploadFile3.sendKeys("E:\\Java\\1.PNG");
		btnSave3.click();
		tunda();
		fotoQRTransNonSakuku.click();
		uploadFile4.sendKeys("E:\\Java\\1.PNG");
		btnSave4.click();
		tunda();
		fotoQRTampakDepan.click();
		uploadFile5.sendKeys("E:\\Java\\1.PNG");
		btnSave5.click();
		tunda();
		js.executeScript("window.scrollBy(0,500)");
		fotoQRTampakDalam.click();
		uploadFile6.sendKeys("E:\\Java\\1.PNG");
		btnSave6.click();
		tunda();
		fotoQRTampakSamping.click();
		uploadFile6.sendKeys("E:\\Java\\1.PNG");
		btnSave6.click();
		tunda();
//		btnSubmitNewData.click();	
	}
}
