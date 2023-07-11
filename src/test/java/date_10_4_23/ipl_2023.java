package date_10_4_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ipl_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jiocinema.com/");

		Thread.sleep(1000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath(
				"//a[@class='MuiTypography-root MuiTypography-heading5SemiBold mui-style-da42h-aWeb-aWebText'][normalize-space()='TATA IPL']"))
				.click();

		driver.findElement(By.xpath(
				"//div[@class='slick-slide slick-active slick-current']//div//div[@class='mui-style-tm6sms-cntr']//div//div[@class='mui-style-815i2y-root']//button[@type='button']"))
				.click();
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath(
				"//h5[contains(text(),'தமிழ்')]"))
				.click();
	}

}
