package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement  fullName = driver.findElement(By.id("userName"));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView();", fullName);
		action.sendKeys(fullName,"Mahendra").keyDown(fullName,Keys.CONTROL)
		.sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(fullName,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		WebElement  email = driver.findElement(By.id("userEmail"));
		
		action.keyDown(email,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}
}
