package com.juaracoding.magangmerchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	
	@FindBy(xpath = "//table[@id='data-customers-approve']/tbody/tr/td")
	private WebElement btnAction;
	
	@FindBy(xpath = "//table[@id='data-customers-approve']/tbody/tr[2]/td/ul/li/span[2]/a/span")
	private WebElement btnView;
	
	@FindBy(xpath = "//div[@id='modalFoto']/div/div/div/button")
	private WebElement btnCloseView;
	
	@FindBy(xpath = "//*[@id=\"data-customers-approve\"]/tbody/tr[2]/td/ul/li/span[2]/a[2]/span/i")
	private WebElement btnViewDetail;
	
	@FindBy(xpath = "//span[@onclick=\\\"view_foto('37021')\\")
	private WebElement btnViewQR;
	
	@FindBy(xpath = "//div[@id='modalFoto']/div/div/div/button")
	private WebElement btnCloseView2;
	
	public void gotoDeliveryMD() {
		btnDecision.click();
		btnDeliverytoMD.click();
	}
	
	public void DeliverytoMD(String searchmd) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnAction.click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		btnView.click();
		btnCloseView.click();
		btnViewDetail.click();
		js.executeScript("window.scrollBy(0,500)");
		btnViewQR.click();
		btnCloseView2.click();
		driver.navigate().back();
		txtSearching.sendKeys(searchmd);
		txtSearching.sendKeys(Keys.ENTER);
		
	}
}
