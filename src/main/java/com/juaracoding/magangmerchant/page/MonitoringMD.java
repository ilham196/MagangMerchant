package com.juaracoding.magangmerchant.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magangmerchant.driver.DriverSingleton;



public class MonitoringMD {

	private WebDriver driver;
	
	public MonitoringMD() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[14]/a")
	private WebElement btnMonitoringMD;
	
	@FindBy(xpath = "//*[@id=\"data-monitoring\"]/tbody/tr[2]/td[10]/a")
	private WebElement btnView;
	
//	@FindBy(id = "datepicker-autoClose")
	@FindBy(xpath = "//input[@name='start_date']")
	private WebElement tanggalAwal;
	
//	@FindBy(id = "datepicker-autoClose2")
	@FindBy(xpath = "//input[@name='end_date']")
	private WebElement tanggalAkhir;
	
	@FindBy(id = "btn-filter")
	private WebElement btnFilter;
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(3)")
	private WebElement tgl31;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(1)")
	private WebElement tgl1;
	
	public void tunda() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void MonitoringMD(String awal, String akhir) {
		btnMonitoringMD.click();
		tunda();
		tanggalAwal.click();
		tgl1.click();
		tanggalAkhir.click();
		tgl31.click();
		btnFilter.click();
		tunda();
		btnView.click();
		tunda();
	}
}
