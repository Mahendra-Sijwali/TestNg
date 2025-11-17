package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement fullName=driver.findElement(By.id("userName"));
		js.executeScript("arguments[0].scrollIntoView();", fullName);
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(fullName).perform();
		Thread.sleep(1000);
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);	
//		action.keyDown(Keys.ARROW_DOWN)
//		.keyUp(Keys.ARROW_DOWN)
//		.keyDown(Keys.ARROW_DOWN)
//		.keyUp(Keys.ARROW_DOWN)
//		.keyDown(Keys.ARROW_DOWN)
//		.keyUp(Keys.ARROW_DOWN)
//		.keyDown(Keys.ARROW_DOWN)
//		.keyUp(Keys.ARROW_DOWN)
//		.keyDown(Keys.ENTER)
//		.keyUp(Keys.ENTER).build().perform();

	}
}	
