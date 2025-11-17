package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class RelativeLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("registration2")).click();
		WebElement ele = driver.findElement(By.id("fullName"));
		WebElement above = driver.findElement(with(By.tagName("div")).above(ele));
		WebElement below = driver.findElement(with(By.tagName("div")).below(ele));
		WebElement left = driver.findElement(with(By.tagName("input")).toLeftOf(ele));
		WebElement right = driver.findElement(with(By.tagName("input")).toRightOf(ele));
		System.out.println(above.getAttribute("class"));
		System.out.println(below.getAttribute("class"));
		
	}
}
