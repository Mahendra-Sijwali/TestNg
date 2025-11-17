package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("iframes")).click();
		WebElement fra = driver.findElement(By.cssSelector("iframe[name='site1']"));
	//	driver.switchTo().frame("site1");
		driver.switchTo().frame(fra);
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("iframes")).click();
	}
}
