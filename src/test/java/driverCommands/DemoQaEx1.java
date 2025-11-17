package driverCommands;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaEx1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().fullscreen();
		
		WebElement Ele = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Ele);
		
		String name = "Mahendra";
		
		WebElement textBox = driver.findElement(By.xpath("//li[@id='item-0']"));
		textBox.click();
		
		WebElement nameArea = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		nameArea.sendKeys(name);
		
		WebElement emailArea = driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']"));
		emailArea.sendKeys("mahendra@gamil.com");
		
		WebElement cAddress = driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));
		cAddress.sendKeys("pune");
		
		WebElement perAdd = driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]"));
		perAdd.sendKeys("Uttarakhand");
		
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		js.executeScript("arguments[0].click();", submit);
		
		String vName = driver.findElement(By.id("name")).getText();
		System.out.println(vName);
		String[] a = vName.split(":");
		String b = Arrays.toString(a);
		System.out.println(b);
		if(a[1].equals(name)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
