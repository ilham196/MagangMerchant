package com.juaracoding.magangmerchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magangmerchant.driver.DriverSingleton;



public class DeliverytoMD {

private WebDriver driver;
	
	public DeliverytoMD() {
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//div[@id='sidebar']/div/div/ul/li[10]/a/span")
	private WebElement btnDecision;
	
	@FindBy(xpath = "//div[@id='sidebar']/div/div/ul/li[10]/ul/li[5]/a")
	private WebElement btnDeliverytoMD;
	
	@FindBy(css = "#data-customers-approve_filter > label:nth-child(1) > input")
	private WebElement txtSearching;
	
	@FindBy(id = "btnSearch")
	private WebElement btnSearch;
	
//	@FindBy(css = "#data-customers-approve > tbody > tr:nth-child(1) > td:nth-child(1)")
	@FindBy(xpath = "//table[@id='data-customers-approve']/tbody/tr/td")
	private WebElement btnAction;
	
	@FindBy(xpath = "//table[@id='data-customers-approve']/tbody/tr[2]/td/ul/li/span[2]/a/span")
	private WebElement btnView;
	//#modalFoto > div > div > div.modal-header > button
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnCloseView;
	
	@FindBy(xpath = "//*[@id=\"data-customers-approve\"]/tbody/tr[2]/td/ul/li/span[2]/a[2]/span/i")
	private WebElement btnViewDetail;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[2]/div/div[12]/div/span")
	private WebElement btnViewQR;
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnCloseView2;
	
	public void tunda() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void gotoDeliveryMD() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		btnDecision.click();
		btnDeliverytoMD.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnAction));
	}
	
	public void DeliverytoMD(String searchmd) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(btnAction));		
		btnAction.click();
		btnView.click();
		tunda();
		btnCloseView.click();
		btnViewDetail.click();
		js.executeScript("window.scrollBy(0,500)");
		tunda();
		btnViewQR.click();
		tunda();
		btnCloseView2.click();
		tunda();
		driver.navigate().back();
		tunda();
		txtSearching.sendKeys(searchmd);
		txtSearching.sendKeys(Keys.ENTER);
		
	}
}
