package UniteTestCoverage;

import Cal.Multiplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import Cal.Multiplication.*;

public class MultiplicationTest {

	Multiplication multiplication = new Multiplication();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void mult() {
		assertThat(multiplication.mult(1,1), equalTo(1));
	}

	@Test
	public void multByZero() {
		assertThat(multiplication.mult(0,1), equalTo(0));
	}


}