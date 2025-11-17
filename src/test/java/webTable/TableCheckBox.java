package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCheckBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		int count =0;
		List<WebElement> a = driver.findElements(By.cssSelector("table[id='countries'] tr"));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		List<WebElement>cr = driver.findElements(By.xpath("//table[@id='countries']/tbody//tr/td[text()='Euro']//preceding-sibling::td/input"));
		
//		for(int i=0;i<a.size();i++) {
//			WebElement cell = driver.findElement(By.xpath("//table[@id='countries']/tbody//tr["+(i+1)+"]//td[4]"));
//				if(cell.getText().equals("Euro")) {
//					driver.findElement(By.xpath("//table[@id='countries']/tbody//tr["+(i+1)+"]//td[1]//input")).click();
//				}
//		}
		for(WebElement x:cr) {
			x.click();
		}
		System.out.println(count);
	}
}

