package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEx1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		js.executeScript("arguments[0].scrollIntoView();", drag);
		WebElement drop = driver.findElement(By.cssSelector("div[id='simpleDropContainer'] > div[id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
	}
}
