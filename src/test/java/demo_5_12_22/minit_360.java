package demo_5_12_22;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class minit_360 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://app.mint360.in/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//login manager
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("alpha@mint360.in");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
