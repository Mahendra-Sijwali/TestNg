package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimesOfIndia {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		driver.manage().window().fullscreen();
		
//		WebElement head = driver.findElement(By.xpath("(//div[@class='QW5wt LWsUK speculationContainer']//section[@class='I1dVQ']//child::div[@class='CRKrj style_change edCaE'])[1]"));
		WebElement a = driver.findElement(By.xpath("(//div[@class='UHNLR']//ul//child::li)[2]/a"));
		System.out.println(a.getText());
//		System.out.println(head.getText());
	}
}
