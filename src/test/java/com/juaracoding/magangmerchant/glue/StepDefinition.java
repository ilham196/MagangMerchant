package com.juaracoding.magangmerchant.glue;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.magangmerchant.config.AutomationFrameworkConfiguration;
import com.juaracoding.magangmerchant.driver.DriverSingleton;
import com.juaracoding.magangmerchant.page.CompletedData;
import com.juaracoding.magangmerchant.page.DeliverytoMD;
import com.juaracoding.magangmerchant.page.Distribusi;
import com.juaracoding.magangmerchant.page.LoginPage;
import com.juaracoding.magangmerchant.page.MonitoringMD;
import com.juaracoding.magangmerchant.page.ReceivedQR;
import com.juaracoding.magangmerchant.page.SendQR;
import com.juaracoding.magangmerchant.page.UploadJO;
import com.juaracoding.magangmerchant.page.Validasi;
import com.juaracoding.magangmerchant.page.Worklist;
import com.juaracoding.magangmerchant.utils.ConfigurationProperties;
import com.juaracoding.magangmerchant.utils.Constants;
import com.juaracoding.magangmerchant.utils.TestCases;
import com.juaracoding.magangmerchant.utils.Utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private LoginPage loginPage;
	private UploadJO uploadJOPage;
	private SendQR sendQR;
	private ReceivedQR receivedQR;
	private DeliverytoMD deliverytoMD;
	private Distribusi distribusiPage;
	private Worklist worklistPage;
	private Validasi validasiPage;
	private CompletedData completedData;
	private MonitoringMD monitoringMD;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");

	@Autowired
	ConfigurationProperties configProperties;
	
	@Before
	public void initializeObject() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		loginPage = new LoginPage();
		uploadJOPage = new UploadJO();
//		sendQR = new SendQR();
//		receivedQR = new ReceivedQR();
//		deliverytoMD = new DeliverytoMD();
//		distribusiPage = new Distribusi();
//		worklistPage = new Worklist();
//		validasiPage = new Validasi();
//		completedData = new CompletedData();
//		monitoringMD = new MonitoringMD();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	//LOGIN MODUL
		@Given("^User go to the Website")
		public void user_go_to_the_website() {
			driver = DriverSingleton.getDriver();
			driver.get(Constants.URL);
			extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
		}
		
		@When("^User input username password and click Login")
		public void user_input_username_password_and_click_login() {
			loginPage.gotoLogin(configProperties.getUserName(), configProperties.getPassword());
			extentTest.log(LogStatus.PASS, "User input username password and click Login");
		}
		
		@Then("^User can login to the Website")
		public void user_can_login_to_the_website() {
			loginPage.clikClose();
			extentTest.log(LogStatus.PASS, "User can login to the Website");
		}
		
		//MODUL UPLOAD JO
		
		@Given("^User go to Upload Jo page")
		public void user_go_to_upload_JO_page() {
			uploadJOPage.gotoUploadJO();
			extentTest.log(LogStatus.PASS, "User go to Upload Jo page");
		}
		
		@When("^User can go Tabel Data Upload JO")
		public void user_can_go_tabel_data_upload_JO() {
			uploadJOPage.TabelUploadJO();
			extentTest.log(LogStatus.PASS, "User can go Tabel Data Upload JO");
		}
		
		@When("^User can Upload Data excel")
		public void user_can_upload_data_excel() {
			uploadJOPage.UploadData(configProperties.getSearchJO());
			extentTest.log(LogStatus.PASS, "User can Upload Data excel");
		}
		
		@Then("^User update data success")
		public void user_update_data_success() {
			extentTest.log(LogStatus.PASS, "User update data success");
		}
		
		//MODUL SEND QR
		@Given("^User go to Send QR page")
		public void user_go_to_send_QR_page() {
			sendQR.gotoSendQR();
			extentTest.log(LogStatus.PASS, "User go to Send QR page");
		}
		
		@When("^User can action data")
		public void user_can_action_data() {
			sendQR.SendQR(configProperties.getSearchQR());
			extentTest.log(LogStatus.PASS, "User can action data");
		}
		
		@Then("^User can Received QR data")
		public void user_can_received_QR_data() {
			extentTest.log(LogStatus.PASS, "User can Received QR data");
		}
	
		//Received QR
		@Given("^User go to Received QR page")
		public void user_go_to_received_QR_page() {
			receivedQR.gotoReceivedQR();
			extentTest.log(LogStatus.PASS, "User go to Received QR page");
		}
		
		@When("^User can action data Received")
		public void user_can_action_data_received() {
			receivedQR.ReceivedQR(configProperties.getSearchReceived());
			extentTest.log(LogStatus.PASS, "User can action data Received");
		}
		
		@Then("^User can Delivery to MD")
		public void user_can_delivery_to_MD() {
			extentTest.log(LogStatus.PASS, "User can Delivery to MD");
		}
		
		//MODUL Delivery to MD
		@Given("^User go to Delivery to MD page")
		public void user_go_to_delivery_to_MD_page() {
			deliverytoMD.gotoDeliveryMD();
			extentTest.log(LogStatus.PASS, "User go to Delivery to MD page");
		}
		
		@When("^User can action data Delivery to MD")
		public void user_can_action_data_delivery_to_MD() {
			deliverytoMD.DeliverytoMD(configProperties.getSearchMD());
			extentTest.log(LogStatus.PASS, "User can action data Delivery to MD");
		}
		
		@Then("^User can Delivery to MD data")
		public void user_can_delivery_to_MD_data() {
			extentTest.log(LogStatus.PASS, "User can Delivery to MD data");
		}
			
		//MODUL Distribusi
		@Given("^User go to Distribusi page")
		public void user_go_to_distribusi_page() {
			distribusiPage.gotoDistribusi();
			extentTest.log(LogStatus.PASS, "User go to Distribusi page");
		}
		
		@When("^User can checkbox the merchant")
		public void user_can_checkbox_the_merchant() {
			distribusiPage.Distribusi(configProperties.getSearchMS(), configProperties.getPilihMS());
			extentTest.log(LogStatus.PASS, "User can checkbox the merchant");
		}
		
		@Then("^User can Distribusi the merchant")
		public void user_can_distribusi_the_merchant() {
			extentTest.log(LogStatus.PASS, "User can Distribusi the merchant");
		}
		
		//MODUL Validasi
		@When("^User go to Validasi page and Action button")
		public void user_go_to_validasi_page_and_action_button() {
			validasiPage.gotoValidasi();
			extentTest.log(LogStatus.PASS, "User go to Validasi page and Action button");
		}
		
		@Then("^User can approve data")
		public void user_can_approve_data() {
			extentTest.log(LogStatus.PASS, "User can approve data");
		}
		
		//MODUL Completed Data
		@When("^User can go Completed Data page and Action button")
		public void user_can_go_completed_data_page_and_action_button() {
			completedData.gotoCompletedData();
			extentTest.log(LogStatus.PASS, "User can go Completed Data page and Action button");
		}
		
		@Then("^User can print and edit status")
		public void user_can_print_and_edit_status() {
			extentTest.log(LogStatus.PASS, "User can print and edit status");
		}
		
		//MODUL Monitoring MD
		@When("^User can go Monitoring MD page and Action button")
		public void user_can_go_monitoring_MD_page_and_action_button() {
			monitoringMD.MonitoringMD(configProperties.getTanggalawal(), configProperties.getTanggalakhir());
			extentTest.log(LogStatus.PASS, "User can go Monitoring MD page and Action button");
		}
		
		@Then("^User can see Action button data")
		public void user_can_see_action_button_data() {
			extentTest.log(LogStatus.PASS, "User can see Action button data");
		}
		
		//MODUL Worklist New Data
		@Given("^User go to Worklist New Data page")
		public void user_go_to_worklist_new_data_page() {
			worklistPage.gotoWorklistNewData();
			extentTest.log(LogStatus.PASS, "User go to Worklist New Data page");
		}
		
		@When("^User can action button")
		public void user_can_action_button() {
			worklistPage.WorklistNewData();
			extentTest.log(LogStatus.PASS, "User can action button");
		}
		
		@When("^User can input Form Delivery page")
		public void user_can_input_form_delivery_page() {
			worklistPage.gotoFormDelivery(configProperties.getSearchWl());
			extentTest.log(LogStatus.PASS, "User can input Form Delivery page");
		}
		
		@Then("^User can Submit Data Form")
		public void user_can_submit_data_form() {
			extentTest.log(LogStatus.PASS, "User can Submit Data Form");
		}
		
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
