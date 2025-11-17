package testNg;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionEx {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele = driver.findElement(By.id("basicelements"));
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertEquals(driver.getTitle(), "Login");
		Assert.assertTrue(true);
	
	}
}
