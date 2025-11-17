package driverCommands;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowEx1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		String mainWindow = driver.getWindowHandle();
		WebElement newTab = driver.findElement(By.cssSelector("#tabButton"));
		ex.executeScript("arguments[0].scrollIntoView();",newTab);
		newTab.click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Windows-Url : "+driver.getCurrentUrl());
		for(String window:allWindows) {
			if(!(mainWindow.equals(window))) {
				driver.switchTo().window(window);
				System.out.println("Window-Url:"+driver.getCurrentUrl());
			}
		}
	}
}
