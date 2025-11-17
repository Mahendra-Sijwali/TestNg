package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptsEx1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		String name = "Mahendra";
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("a[id='basicelements']")).click();
		WebElement prompt = driver.findElement(By.id("javascriptPromp"));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView()",prompt);
		prompt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(name);
		alert.accept();
		
		String a = driver.findElement(By.cssSelector("p[id='pgraphdemo']")).getAttribute("innerText");
		String[] b = a.split(" ");
		b = b[1].split("!");
		if(name.equals(b[0])) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
		
	}
}
