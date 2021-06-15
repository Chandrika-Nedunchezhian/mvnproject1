

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParam {

	@Parameters({"username","password"})
	@Test
	private void tc0(String s,String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	
	@Test
	private void tc1() {
		System.out.println("Test1");

	}
	@Test
	private void tc2() {
		System.out.println("Test2");
		}
	
	@Test
	private void tc3() {
		System.out.println("Test3");

	}
	
	@Test
	private void tc4() {
		System.out.println("Test4");

	}
	@Test
	private void tc5() {
		System.out.println("Test5");

	}
	
	
	
	
}
