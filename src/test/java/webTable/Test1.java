package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement edit = wait.until(ExpectedConditions.refreshed(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Compliance']//following-sibling::div//span[@class='mr-2']//*[local-name()='path']"))));
		ex.executeScript("arguments[0].scrollIntoView();", edit);
		edit.click();
		WebElement salary = driver.findElement(By.xpath("//div[@id='salary-wrapper']// input[@id='salary']"));
		System.out.println(salary.getAttribute("value"));
		salary.clear();
		salary.sendKeys("25000");
		WebElement submit = driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']//button"));
		submit.click();
		
		WebElement add = driver.findElement(By.id("addNewRecordButton"));
		add.click();
		driver.findElement(By.xpath("//form[@id='userForm']//input[@id='firstName']")).sendKeys("mahendra");
		driver.findElement(By.xpath("//form[@id='userForm']//input[@id='lastName']")).sendKeys("sijwali");
		driver.findElement(By.xpath("//form[@id='userForm']//input[@id='userEmail']")).sendKeys("mahendra@gmail.com");
		driver.findElement(By.xpath("//form[@id='userForm']//input[@id='age']")).sendKeys("18");
		driver.findElement(By.xpath("//form[@id='userForm']//input[@id='salary']")).sendKeys("2000000");
		driver.findElement(By.xpath("//form[@id='userForm']//input[@id='department']")).sendKeys("IT");
		driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']//button")).click();
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div/div[1]"));
		int count=0;
		for(WebElement x: names) {
			if(x.getText().equals(" ")) {
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}
