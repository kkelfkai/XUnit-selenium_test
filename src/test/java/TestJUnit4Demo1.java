import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestJUnit4Demo1 {

	@Test
	public void demo1(){
		System.out.println("demo1");
		assertTrue(true);
	}

	@Test
	public void demo2(){
		System.out.println("demo2");
		assertTrue(false);
	}

	@Test
	public void demo3(){
		System.out.println("demo3");
		assertEquals(1,1);
	}

}
