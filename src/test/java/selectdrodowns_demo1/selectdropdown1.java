package selectdrodowns_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectdropdown1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061896%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAyracBhDoARIsACGFcS76CRsrf7Gu4VRJ-0kCuwQdet0rFmBX1F3fbiiuG4FRrpT_AiIWGP8aAhS1EALw_wcB");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//select[@id='month']")).click();

		WebElement month_dropdown = driver.findElement(By.id("month"));

		Select month_dd = new Select(month_dropdown);
		Thread.sleep(3000);
		month_dd.selectByIndex(3);
		Thread.sleep(5000);
		month_dd.selectByValue("11");
		Thread.sleep(7000);
		month_dd.selectByVisibleText("Feb");

		driver.findElement(By.xpath("//select[@id='year']")).click();

		WebElement year_dropdown = driver.findElement(By.id("year"));

		Select year_dd = new Select(year_dropdown);
		Thread.sleep(3000);
		year_dd.selectByIndex(3);
		Thread.sleep(5000);
		year_dd.selectByValue("2011");
		

	}

}
