package mint_360;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class telecaller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://app.mint360.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(500);
		
		//login manager
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("sithesh@alpha.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Sithesh@123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(10000);
		
		//New lead
		driver.findElement(By.xpath("//ion-item[@title='New Leads']")).click();
		//Opportunities
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ion-item[@title='Opportunities']")).click();
		Thread.sleep(5000);
		//Dropped
		driver.findElement(By.xpath("//ion-item[@title='Dropped']")).click();
		Thread.sleep(5000);
		//SV Opportunities
		driver.findElement(By.xpath("//ion-item[@title='SV Opportunities']")).click();
		Thread.sleep(5000);
		//RNR lead
		driver.findElement(By.xpath("//ion-item[@title='RNR Leads']")).click();
		Thread.sleep(5000);
		//Upload Leads
		driver.findElement(By.xpath("//ion-item[@title='Upload Leads']")).click();
		Thread.sleep(5000);
		//Create Lead
		driver.findElement(By.xpath("//ion-item[@title='Create Lead']")).click();
		Thread.sleep(5000);
		//Projects
		driver.findElement(By.xpath("//ion-item[@title='Projects']")).click();
		Thread.sleep(5000);
		//Consolidated Data
		driver.findElement(By.xpath("//ion-item[@title='Consolidated Data']")).click();
		Thread.sleep(5000);
		//My Performance
		driver.findElement(By.xpath("//ion-item[@title='My Performance']']")).click();
		Thread.sleep(5000);
		
		//Overview 
		driver.findElement(By.xpath("//span[@class='overview']")).click();

	}

}
