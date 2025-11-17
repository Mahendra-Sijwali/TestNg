package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("basicelements")).click();
		WebElement dropDown=driver.findElement(By.xpath("//selsct[@class='form-control m-bot15']"));
		Select sel=new Select(dropDown);
		sel.selectByIndex(2);
		sel.selectByVisibleText("5");
	}
}
