package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Automation_report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//blank html
		ExtentSparkReporter report = new ExtentSparkReporter("./TestReport.html");
		
		//actual report
		ExtentReports extent= new ExtentReports();
		
		extent.attachReporter(report);
		
		ExtentTest test=extent.createTest("TC001 - search iteams");
		test.assignAuthor("Dharun");
		test.assignCategory("smoke");
		test.pass("Enter the desired product");
		test.pass("Check if the product is listed");
		test.pass("Add the product to the cart");
		test.fail("No value");
		//save report
		//extent.flush();
		
		ExtentTest test1=extent.createTest("TC002 - search iteams");
		
		test.pass("Enter the desired product");
		test.pass("Check if the product is listed");
		test.pass("Add the product to the cart");
		test.pass("No value");
		
		
		
		
		//save report
		//last
		extent.flush();

	}

}
