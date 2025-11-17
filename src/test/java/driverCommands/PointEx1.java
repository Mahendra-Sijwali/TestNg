package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointEx1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Point point = driver.manage().window().getPosition();
		System.out.println("X: "+point.getX());
		System.out.println("Y: "+point.getY());
		driver.manage().window().setPosition(new Point(100,100));
		Thread.sleep(10000);
		driver.quit();
	}
}
