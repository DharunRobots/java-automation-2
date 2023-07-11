package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report1 {
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeSuite
	protected void startReport(){
ExtentSparkReporter report = new ExtentSparkReporter("./TestReport.html");
		
		//actual report
		ExtentReports extent= new ExtentReports();
		
		extent.attachReporter(report);
		
	}
	@AfterTest
	protected void stopReport() {
		extent.flush();
	}
	
	void createtest(String desc,String author,String category) {
		ExtentTest test=extent.createTest(desc);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	
	void stepReport(String status,String description) {
		switch(status.toLowerCase()) {
		case "pass":
			test.pass(description);
			break;
		case "fail":
			test.fail(description);
			break;
		case "info":
			test.info(description);
			break;
		case "warning":
			test.warning(description);
			break;
			
		default:
			System.err.println("Status is not defined");
			break;
		}
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//blank html
		
		 * ExtentSparkReporter report = new ExtentSparkReporter("./TestReport.html");
		 * 
		 * //actual report ExtentReports extent= new ExtentReports();
		 * 
		 * extent.attachReporter(report);
		 
		
		 * ExtentTest test=extent.createTest("TC001 - search iteams");
		 * test.assignAuthor("Dharun"); test.assignCategory("smoke");
		 
		test.pass("Enter the desired product");
		test.pass("Check if the product is listed");
		test.pass("Add the product to the cart");
		test.fail("No value");
		//save report
		//extent.flush();
		
		
		 * ExtentTest test1=extent.createTest("TC002 - search iteams");
		 * 
		 * test.pass("Enter the desired product");
		 * test.pass("Check if the product is listed");
		 * test.pass("Add the product to the cart"); test.pass("No value");
		 
		
		
		
		
		//save report
		//last
		extent.flush();
*/
	}

}
