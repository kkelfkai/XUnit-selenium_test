package selenium.testcase.weworkTestcase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMy {

	private int count = 0;

	@Test
	public void test1(){
		count++;
		System.out.println(count);
		assertEquals(1, count);
	}

	@Test
	public void test2(){
		count++;
		System.out.println(count);
		assertEquals(1, count);
	}
}
