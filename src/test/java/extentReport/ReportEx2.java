package extentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportEx2 {
	@Test
	public void report() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report11.html");
		reporter.config().setReportName("Automation test report");
		reporter.config().setDocumentTitle("Test Execution Report");
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Atul Shrivastava");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Browser", "Chrome");
		
		ExtentTest test = report.createTest("LoginTest","Verify login functionality");
		 
		test.log(Status.PASS, "Registration Link clicked");
		
		test.log(Status.PASS,	"UserName entered");
		
		ExtentTest test1 = report.createTest("Registration test","Verify registration functionality");
		test1.log(Status.FAIL, "Failed Setup");
		
		ExtentTest test2 = report.createTest("PaymentTest","Verify payment functionality");
		ExtentTest loginTest = test2.createNode("Login");
		loginTest.log(Status.PASS, "Enter Username");
		loginTest.log(Status.PASS, "Enter Password");
		loginTest.log(Status.PASS, "click submit");
		
		ExtentTest cartTest = test2.createNode("select product and nevigate to cart");
		cartTest.log(Status.PASS, "Select product");
		cartTest.log(Status.PASS, "Click on add to cart button");
		
		ExtentTest paymentTest = test2.createNode("Make payment");
		paymentTest.log(Status.PASS, "Verify product in cart");
		paymentTest.log(Status.PASS, "Enter creditCard info and make payment");
	
		report.flush();
	}
}
