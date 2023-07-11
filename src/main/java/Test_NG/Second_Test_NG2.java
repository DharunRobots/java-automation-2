package Test_NG;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class Second_Test_NG2 {

	@Test(description = "1 sts")
	public void s1() {
		System.out.print("I");
	}

	@Test(description = "2 nd")
	public void s2() {
		System.out.print(" am");
	}

	@Test(description = "3 rd")
	public void s3() {
		System.out.print(" Fine,");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "s3")
	public void s4() {
		System.out.print(" and you");
	}

}
