package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathEx {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		WebElement register = driver.findElement(By.xpath("//a[@id='registration2']"));
		register.click();
		
	}
}
