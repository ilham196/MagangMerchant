package com.juaracoding.magangmerchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magangmerchant.driver.DriverSingleton;



public class ReceivedQR {
	
	
	private WebDriver driver;
	
	public ReceivedQR() {
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[10]/a/span")
	private WebElement btnDecision;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[10]/ul/li[4]/a")
	private WebElement btnReceivedQR;
	
	@FindBy(css = "#data-customers-approve_filter > label:nth-child(1) > input")
	private WebElement txtSearchReceived;
	
	@FindBy(xpath = "//*[@id=\"btnSearch\"]")
	private WebElement btnSearch;
	
	@FindBy(css = "#data-customers-approve > tbody > tr:nth-child(1) > td:nth-child(1)")
	private WebElement btnAction;
	
	@FindBy(xpath = "//*[@id=\"data-customers-approve\"]/tbody/tr[2]/td/ul/li/span[2]/a[2]/span")
	private WebElement btnView;
	
	@FindBy(css = "#modalFoto > div > div > div.modal-header > button")
	private WebElement btnCloseView;
	
	@FindBy(css = "#data-customers-approve > tbody > tr.child > td > ul > li > span.dtr-data > a:nth-child(3) > span > i")
	private WebElement btnViewDetail;

	@FindBy(css = "#content > div.row > div > div > div.panel-body > div > div:nth-child(12) > div > span")
	private WebElement btnViewFoto;
	
	@FindBy(css = "#modalFoto > div > div > div.modal-header > button")
	private WebElement btnCloseViewDetail;
	
	@FindBy(css = "#data-customers-approve_length > label > select")
	private WebElement btnShow;
	
	@FindBy(xpath = "//*[@id=\"data-customers-approve\"]/tbody/tr[3]/td/ul/li/span[2]/a[1]")
	private WebElement btnDelivMD;
	
	@FindBy(css = "#data-customers-approve_paginate > ul > li:nth-child(3) > a")
	private WebElement btngoPage;
	
	@FindBy(css = "#data-customers-approve_next > a")
	private WebElement btnNextPage;
	
	@FindBy(css = "#data-customers-approve_previous > a")
	private WebElement btnPrevPage;
	
	public void tunda() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void gotoReceivedQR() {
		btnDecision.click();
		tunda();
		btnReceivedQR.click();
		tunda();
	}
	
	public void ReceivedQR(String searchreceived) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		txtSearchReceived.click();
		txtSearchReceived.sendKeys(searchreceived);
		btnSearch.click();
		tunda();
		btnAction.click();
		tunda();
		btnView.click();
		tunda();
		btnCloseView.click();
		tunda();
		btnViewDetail.click();
		tunda();
		js.executeScript("window.scrollBy(0,500)");
		btnViewFoto.click();
		tunda();
		btnCloseViewDetail.click();
		tunda();
		driver.navigate().back();
		tunda();
		js.executeScript("window.scrollBy(0,1000)");
		btngoPage.click();
		tunda();
		btnNextPage.click();
		tunda();
		btnPrevPage.click();
		btnPrevPage.click();
		js.executeScript("window.scrollBy(0,-1000)");
		tunda();
		//btnShow.click();
		new Select(btnShow).selectByValue("25");
		tunda();
		btnAction.click();
		tunda();
//		btnDelivMD.click();
		
	}
}
