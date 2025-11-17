package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsEx {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		
		WebElement heading = driver.findElement(By.cssSelector("a[class='border_color VeCXM INx9f'] div[class='CRKrj style_change edCaE']"));
		System.out.println(heading.getAttribute("innerText"));
	}
}
