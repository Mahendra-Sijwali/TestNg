package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;
public class DemoQa2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		
//		List<WebElement> li = driver.findElements(By.tagName("a"));
//		System.out.println(li.get(1).getAttribute("href"));
//		List<WebElement> li = driver.findElements(By.xpath("//div[@class='card-body']/h5"));
//		for(WebElement x:li) {
//			System.out.println(x.getText());
//		}
//		
//		WebElement a = driver.findElement(By.id("item-0"));
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement regLink = driver.findElement(By.id("registration2"));
//		regLink.click();
//		
//		
//		
//		WebElement userName = driver.findElement(By.id("unameSignin"));
//		if(userName.isDisplayed()&& userName.isEnabled()) {
//			userName.sendKeys("Mahendra");
//		}
//		userName.clear();
		
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		for(WebElement x : li) {
			System.out.print(x.getAttribute("href")+"  ");
			System.out.print(x.getAttribute("innerText"+" "));
			System.out.println(ex.executeScript("return arguments[0].innerText;", x));
		}
		driver.quit();
	
		
		
	}
}
