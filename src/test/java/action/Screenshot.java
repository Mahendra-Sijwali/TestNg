package action;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		TakesScreenshot sc = (TakesScreenshot)driver;
		WebElement image = driver.findElement(By.xpath("//div[@class='navbar-header']/a/img"));
		
		
		File file = image.getScreenshotAs(OutputType.FILE);
		Path dest = Paths.get("./Screenshots/sc1.png");
		Files.move(file.toPath(), dest);
		driver.close();
	}
}
