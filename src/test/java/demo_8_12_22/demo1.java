package demo_8_12_22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> radio = driver
				.findElements(By.cssSelector("input[type='radio'][name=\"vehicle\"]"));

		// for(WebElement ele:radio){}
		for (int i = 0; i < radio.size(); i++) {
			WebElement local_check = radio.get(i);
			String value = local_check.getAttribute("value");
			System.out.println("values from radio buttons are==========>>>>>>" + value);

			if (value.equalsIgnoreCase("Bike")) {
				local_check.click();
				break;
			}
		}

		List<WebElement> checkbox= driver
				.findElements(By.xpath("//input[@type='checkbox'and @name='accessories']"));

		// for(WebElement ele:radio){}
		for (int i = 0; i < checkbox.size(); i++) {
			WebElement local_radio = checkbox.get(i);
			String value = local_radio.getAttribute("value");
			System.out.println("values from radio buttons are==========>>>>>>" + value);

			if (value.equalsIgnoreCase("Book")) {
				local_radio.click();
				break;
			}
		}

	}

}
