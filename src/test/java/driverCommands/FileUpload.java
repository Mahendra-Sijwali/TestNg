package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("basicelements")).click();

		WebElement fileUpload  = driver.findElement(By.id("exampleInputFile"));
		fileUpload.sendKeys("C:\\Users\\msinghsi\\Desktop\\test.txt");//send keys only work with input type tags only
	}
}
