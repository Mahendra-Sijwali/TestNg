package driverCommands;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverEx1 {
	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromiumdriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
		option.addArguments("--incognito");
		option.addArguments("--start-maximized");
		option.addArguments("--disable-popup-blocking");
		WebDriver driver2 = new ChromeDriver(option);
		driver2.get("https://www.google.com");
		System.out.println("Title = "+driver2.getTitle());
		driver2.get("https://demoqa.com/");
		Thread.sleep(2000);
		System.out.println("Title = "+driver2.getTitle());
		driver2.navigate().back();
		System.out.println("Title = "+driver2.getTitle());
		driver2.navigate().forward();
		System.out.println("Title = "+driver2.getTitle());
		System.out.println("url = "+driver2.getCurrentUrl());
		driver2.quit();
		
	}
}
 