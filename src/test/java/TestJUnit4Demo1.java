import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)   //显示指定运行case的顺序按照AscenII排序。虽然默认也会按照反射的字节码排序。但是一般集成测试用例的需要按照一定的顺序执行的。
public class TestJUnit4Demo1 {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforeAllTestcase, @BeforeClass");
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("afterAllTestcase, @AfterClass");
	}

	@Before
	public void before(){
		System.out.println("i am @before");
	}

	@After
	public void after(){
		System.out.println("i am @after");
	}

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
