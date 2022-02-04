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

public class UploadJO {
	
	private WebDriver driver;
	
	 public UploadJO(){
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	} 
	 
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[11]/a")
	private WebElement btnUploadJO;
	
	//Page button
	@FindBy(xpath = "//*[@id=\"data-jo_paginate\"]/ul/li[3]/a")
	private WebElement btngoPage;
	
	@FindBy(xpath = "//*[@id=\"data-jo_next\"]/a")
	private WebElement btnNextPage;
	
	@FindBy(xpath = "//*[@id=\"data-jo_previous\"]/a")
	private WebElement btnPrevPage;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/h1/a[1]")
	private WebElement btnDownload;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/h1/a[2]")
	private WebElement btnUpload;
	
	@FindBy(xpath = "//*[@id=\"file\"]")
	private WebElement chooseFile;
	
	@FindBy(xpath = "//*[@id=\"DataJo\"]/div/div/form/div[2]/button")
	private WebElement btnClose;
	
	@FindBy(xpath = "//*[@id=\"DataJo\"]/div/div/form/div[2]/input")
	private WebElement btnSaveUpload;
	
	@FindBy(css = "#data-jo_length > label > select")
	private WebElement btnShow;
	
	@FindBy(css = "#data-jo_filter > label:nth-child(1) > input")
	private WebElement txtSearch;
	
	@FindBy(css = "#data-jo > tbody > tr:nth-child(2) > td:nth-child(1)")
	private WebElement btnAction;
	
	public void tunda() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void gotoUploadJO() {
		btnUploadJO.click();
		tunda();
	}
	
	public void TabelUploadJO() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnDownload.click();
		tunda();
		js.executeScript("window.scrollBy(0,1000)");
		btngoPage.click();
		tunda();
		btnNextPage.click();
		tunda();
		btnPrevPage.click();
		tunda();
		btnPrevPage.click();
		tunda();
//		btnPrevPage.click();
//		tunda();
		js.executeScript("window.scrollBy(0,-2000)");	
	}
	
	public void UploadData(String searchjo) {
		btnUpload.click();
		tunda();
		btnClose.click();
		tunda();
		btnUpload.click();
		tunda();
/*		chooseFile.sendKeys("D:\\My Documents\\Downloads\\template_jo.xlsx");
		tunda();
		btnSaveUpload.click();
		tunda(); */
		btnClose.click();
		tunda();
		btnAction.click();
		tunda();
		txtSearch.sendKeys(searchjo);
		txtSearch.sendKeys(Keys.ENTER);
		new Select(btnShow).selectByValue("25");
	}
	
}
