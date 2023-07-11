package mint_360;

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
		Thread.sleep(500);
		
		//login manager
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("alpha@mint360.in");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		//New lead
		driver.findElement(By.xpath("//ion-item[@title='New Leads']")).click();
		//Opportunities
		driver.findElement(By.xpath("//ion-item[@title='Opportunities']")).click();
		//Dropped
		driver.findElement(By.xpath("//ion-item[@title='Dropped']")).click();
		//SV Opportunities
		driver.findElement(By.xpath("//ion-item[@title='SV Opportunities']")).click();
		//RNR lead
		driver.findElement(By.xpath("//ion-item[@title='RNR Leads']")).click();
		//Upload Leads
		driver.findElement(By.xpath("//ion-item[@title='Upload Leads']")).click();
		//Create Lead
		driver.findElement(By.xpath("//ion-item[@title='Create Lead']")).click();
		//Projects
		driver.findElement(By.xpath("//ion-item[@title='Projects']")).click();
		//Consolidated Data
		driver.findElement(By.xpath("//ion-item[@title='Consolidated Data']")).click();
		//My Performance
		driver.findElement(By.xpath("//ion-item[@title='My Performance']']")).click();
		
		//Overview 
		driver.findElement(By.xpath("//span[@class='overview']")).click();
		 
	}

}
