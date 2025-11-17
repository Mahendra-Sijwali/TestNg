package action;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPage {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--force-device-scale-factor=1");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://automationbykrishna.com");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@Id='basicelements']")).click();
		TakesScreenshot sc = (TakesScreenshot)driver;
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		ru.yandex.qatools.ashot.Screenshot screenshot = new AShot().
				shootingStrategy(ShootingStrategies.viewportPasting(1000)).
				takeScreenshot(driver);
		
		ImageIO.write(screenshot.getImage(), "JPEG", new File("./Screenshots/fullpage.jpeg"));
		driver.quit();
//		File file = sc.getScreenshotAs(OutputType.FILE);
//		Path dest = Paths.get("./Screenshots/scw.png");
//		Files.move(file.toPath(), dest);
		
		
	}
}
