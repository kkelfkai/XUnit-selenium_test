import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)   //显示指定运行case的顺序按照AscenII排序。虽然默认也会按照反射的字节码排序。但是一般集成测试用例的需要按照一定的顺序执行的。
public class TestJUnit4Demo2Child extends TestJUnit4Demo1{

	@BeforeClass
	public static void beforeClassChild(){
		System.out.println("beforeAllTestcase Child, @BeforeClass");
	}

	@AfterClass
	public static void afterClassChild(){
		System.out.println("afterAllTestcase Child, @AfterClass");
	}

	@Before
	public void beforeChild(){
		System.out.println("i am @before Child");
	}

	@After
	public void afterChild(){
		System.out.println("i am @after Child");
	}

	@Test
	public void demo1Child(){
		System.out.println("demo1 Child");
		assertTrue(true);
	}

	@Test
	public void demo2Child(){
		System.out.println("demo2 Child");
		assertTrue(false);
	}

	@Test
	public void demo3Child(){
		System.out.println("demo3 Child");
		assertEquals(1,1);
	}

}
