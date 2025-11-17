package extentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportEx3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report.html");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setDocumentTitle("Test Execution report");
		
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Atul Shrivastava");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Browser", "Chrome");
		
		ExtentTest test = report.createTest("LoginTest","Verify login functionality");
		 
		WebElement registration = driver.findElement(By.id("registration2"));
		registration.click();
		test.pass("Registration clicked",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\msinghsi\\eclipse-workspace\\sel\\Screenshots\\sc.png").build());
		
		driver.findElement(By.id("unameSignin")).sendKeys("mahendra");
		test.log(Status.PASS,	"UserName entered");
		
		test.pass("Registration clicked",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\msinghsi\\eclipse-workspace\\sel\\Screenshots\\sc.png").build());
		
		test.pass("Registration clicked").addScreenCaptureFromPath("C:\\Users\\msinghsi\\eclipse-workspace\\sel\\Screenshots\\sc1.png");
		driver.quit();
		report.flush();
	}
}	
