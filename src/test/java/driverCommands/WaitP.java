package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitP {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("registration2")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement userName = wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.id("unameSignin"))));
		userName.sendKeys("Mahendra");
	}
}
