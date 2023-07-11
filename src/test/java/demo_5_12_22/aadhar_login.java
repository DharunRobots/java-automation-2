package demo_5_12_22;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aadhar_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://myaadhaar.uidai.gov.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uid")).sendKeys("662224215943");
		
		driver.findElement(By.xpath("//button[@class='fa fa-refresh icon-style']")).click();
		File src=driver.findElement(By.xpath("//div[@id='captcha_block']//img")).getScreenshotAs(OutputType.FILE);
		
		
		
	}

}
