package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEx3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
//		WebElement register = driver.findElement(By.id("registration2"));
//		register.click();
		WebElement register = driver.findElement(By.partialLinkText("Regist"));
		register.click();
		Thread.sleep(2000);
		WebElement textArea = driver.findElement(By.id("unameSignin"));
		textArea.sendKeys("hello");
		WebElement pass = driver.findElement(By.id("pwdSignin"));
		pass.sendKeys("hello");
		WebElement name = driver.findElement(By.name("fName"));
		name.sendKeys("mahendra");
		WebElement a = driver.findElement(By.className("form-control"));
		a.sendKeys("hello2");
//		textbox.sendKeys("hello");
		
	}
}
