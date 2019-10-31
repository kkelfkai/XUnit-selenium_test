package BeforeAfter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// @RunWith 和@Suite.SuiteClasses可以指定test case的执行顺序。

@RunWith(Suite.class)
@Suite.SuiteClasses({
		TestJUnit4Demo3Child.class,
		TestJUnit4Demo1.class,
		TestJUnit4Demo2Child.class
})

public class TestSuites {
}
