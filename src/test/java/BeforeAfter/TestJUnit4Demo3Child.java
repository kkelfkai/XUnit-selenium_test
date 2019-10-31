package BeforeAfter;

import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)   //显示指定运行case的顺序按照AscenII排序。虽然默认也会按照反射的字节码排序。但是一般集成测试用例的需要按照一定的顺序执行的。
public class TestJUnit4Demo3Child extends TestJUnit4Demo1{

	@BeforeClass
	public static void beforeClassChild2(){
		System.out.println("beforeAllTestcase Child2, @BeforeClass");
	}

	@AfterClass
	public static void afterClassChild2(){
		System.out.println("afterAllTestcase Child2, @AfterClass");
	}

	@Before
	public void beforeChild2(){
		System.out.println("i am @before Child2");
	}

	@After
	public void afterChild2(){
		System.out.println("i am @after Child2");
	}

	@Test
	public void demo1Child2(){
		System.out.println("demo1 Child2");
		assertTrue(true);
	}

	@Test
	public void demo2Child2(){
		System.out.println("demo2 Child2");
		assertTrue(false);
	}

	@Test
	public void demo3Child2(){
		System.out.println("demo3 Child2");
		assertEquals(1,1);
	}

}
