package mukeshlivedemo_10_12_22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class inuron_signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("sujith");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("sujithrobots@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("12345678");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name=\"state\"]")).click();

		WebElement state_dropdown = driver.findElement(By.id("state"));

		Select state_dd = new Select(state_dropdown);
		Thread.sleep(1000);
		state_dd.selectByVisibleText("Tamil Nadu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"6393ff23ec2ded7360ff7be0\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		
		//driver.findElement(By.xpath("//button[@class=\"submit-btn\"]")).submit();		
		
		
	}

}
