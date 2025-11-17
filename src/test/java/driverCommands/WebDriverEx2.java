package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverEx2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
		option.addArguments("--incognito");
		option.addArguments("--start-maximize");
		option.addArguments("--disable-popup-blocking");
		WebDriver driver2 = new ChromeDriver(option);
		driver2.get("https://demoqa.com/browser-windows");
		driver2.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver2;
		js.executeScript("arguments[0].click();",driver2.findElement(By.id("windowButton")));
		
		Thread.sleep(2000);

}
}
