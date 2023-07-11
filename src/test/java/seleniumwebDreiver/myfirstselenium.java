package seleniumwebDreiver;

import org.openqa.selenium.By;

//import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class myfirstselenium {

	public static void main(String[] args) {
		
	    //ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY
	    //System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	   // System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\cromedriver\\chromedriver_win32\\chromedriver107.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung flip");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("img[@alt='Samsung Galaxy Z Flip4 5G (Bora Purple, 8GB RAM, 256GB Storage) with No Cost EMI/Additional Exchange Offers']")).click();
		

	}

}
