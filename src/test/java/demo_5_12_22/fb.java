package demo_5_12_22;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class fb {

	public static void main(String[] args) throws InterruptedException,IOException {
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\cromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		
		Thread.sleep(500);
		driver.manage().window().maximize();  
		//driver.findElement(By.xpath("//a[@title=\"Tamil\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("test",Keys.BACK_SPACE);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("selenium");
		Thread.sleep(500);
		driver.findElement(By.name("reg_email__")).sendKeys("1234567");
		Thread.sleep(500);
		driver.findElement(By.id("password_step_input")).sendKeys("1234");
		Thread.sleep(500);
		//driver.findElement(By.xpath("//select[@aria-label=\"Day\"]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@class=\"_8esa\"][@value=\"2\"]")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		driver.findElement(By.xpath("//select[@title=\"Day\"]//option[@value=\"10\"]")).click();
		//driver.findElement(By.cssSelector("inputtext _58mg _5dba _2ph-"));
		
		TakesScreenshot s1=((TakesScreenshot)driver);
		File scrrenshot =s1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrrenshot,new File("./sc2/d1.png"));
		
		driver.findElement(By.linkText("Already have an account?")).click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		TakesScreenshot s2=((TakesScreenshot)driver);
		File scrrenshot1 =s2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrrenshot1,new File("./sc2/d2.png"));
		
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy\"]")).click();
		
		TakesScreenshot s3=((TakesScreenshot)driver);
		File scrrenshot3 =s3.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrrenshot3,new File("./sc2/d3.png"));
		
		//driver.close();
		
		//TakesScreenshot ts=((TakesScreenshot)driver);
		//File screenshot=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File("./S/demo3.png"));
		//driver.navigate().back();
		//driver.findElement(By.c)

	}

	

}
