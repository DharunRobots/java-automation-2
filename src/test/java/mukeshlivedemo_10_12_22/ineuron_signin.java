package mukeshlivedemo_10_12_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ineuron_signin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"email1\"]")).sendKeys("sujithrobots@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"password1\"]")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"submit-btn\"]")).submit();		

	}

}
