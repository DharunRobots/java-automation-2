package Test_NG;

import org.testng.annotations.Test;

public class First_Test_NG {

	@Test(description = "1 st")
	public void a() {
		System.out.print("hai");
	}

	@Test(description = "2 nd")
	public void b() {
		System.out.print(",how");
	}

	@Test(description = "3 rd")
	public void c() {
		System.out.print(" are");
	}

	@Test(description = "4 th")
	public void d() {
		System.out.println(" you");
	}

}
