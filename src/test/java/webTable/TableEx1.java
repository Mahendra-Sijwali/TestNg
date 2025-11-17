package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		List<WebElement> a = driver.findElements(By.cssSelector("table[id='countries'] tr"));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
//		for(WebElement x:a) {
//			System.out.println(x.getText());
//		}
		for(int i=0;i<a.size();i++) {
			for(int j=1;j<=5;j++) {
				WebElement cell = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+(i+1)+"]/td["+j+"]  "));
				Object ans = ex.executeScript("return arguments[0].innerText;", cell);
				System.out.print(ans+"  ");
			}
			System.out.println();
			
		}
	}
}
