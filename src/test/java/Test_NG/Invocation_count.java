package Test_NG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocation_count {

	@Test(invocationCount=4,threadPoolSize = 4)

	public void first1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("cricket", Keys.ENTER);
		// List<WebElement> ele=driver.findElements(By.xpath("//nobr[1]"));
		// System.out.println(ele.size());
		driver.quit();
	}

}
