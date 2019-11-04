package UniteTestCoverage;

import Cal.Addition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import Cal.Addition.*;

public class AdditionTest {

	Addition addition = new Addition();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addByXZero() {
		assertThat(addition.add(0,1), equalTo(0));
	}

	@Test
	public void addByYZero() {
		assertThat(addition.add(1,0), equalTo(0));
	}

	@Test
	public void addBynegative(){
		assertThat(addition.add(-1,2),equalTo(null));
	}
}