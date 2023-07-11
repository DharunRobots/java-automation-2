package Test_NG;

import org.testng.annotations.Test;

public class Second_Test_NG {

	@Test(groups ={"sanity","smoke","regression"} )
	public void a() {
		System.out.print("A");
	}

	@Test(groups ={"sanity","regression"} )
	public void b() {
		System.out.print("B");
	}

	@Test(groups ={"regression"} )
	public void c() {
		System.out.print("C");
	}

	@Test(groups ={"smoke","regression"} )
	public void d() {
		System.out.println("D");
	}

	@Test(groups ={"sanity","smoke"} )
	public void e() {
		System.out.println("E");
	}

	@Test(groups ={"smoke"} )
	public void f() {
		System.out.println("F");
	}

	@Test(groups ={"sanity"} )
	public void g() {
		System.out.println("G");
	}

	@Test(groups ={"smoke","regression"} )
	public void h() {
		System.out.println("H");
	}

	@Test(groups ={"sanity","smoke"} )
	public void i() {
		System.out.println("I");
	}
}
