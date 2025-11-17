package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionEx1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Dimension dim = driver.manage().window().getSize();
		System.out.println("height - "+dim.height);
		System.out.println("width - "+dim.width);
		driver.manage().window().setSize(new Dimension(100,200));
		Thread.sleep(10000);
		driver.quit();
	}
}
