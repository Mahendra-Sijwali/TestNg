package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String name= "Mahendra";
		String LName = "";
		String CName = "Hello World";
 		driver.findElement(By.cssSelector("a[id='basicelements']")).click();
		driver.findElement(By.cssSelector("input[id='UserFirstName']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[id='UserLastName']")).sendKeys(LName);
		driver.findElement(By.cssSelector("input[id='UserCompanyName']")).sendKeys(CName);
		
		driver.findElement(By.cssSelector("button[onclick='myFunctionPopUp()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		if(alert.getText().equals((name+" and "+LName+" and "+CName)) ) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		alert.accept();
	}
}
