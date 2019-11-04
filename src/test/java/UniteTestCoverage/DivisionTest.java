package UniteTestCoverage;

import Cal.Division;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import Cal.Division.*;

public class DivisionTest {

	Division division=new Division();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void divid() {
		assertThat(division.divid(10,2), equalTo(5));
	}

	@Test
	public void dividByZero(){
		assertThat(division.divid(10,0), equalTo(null));
	}

	@Test
	public void didvidRunwithZero(){
		assertThat(division.divid(1,2), equalTo(0));
	}

	@Test
	public void dididByEqual(){
		assertThat(division.divid(2,2), equalTo(1));
	}

}