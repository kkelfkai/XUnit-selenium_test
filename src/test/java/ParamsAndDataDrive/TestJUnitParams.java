package ParamsAndDataDrive;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class TestJUnitParams {

	@Test
	@Parameters({
			"17, false",
			"18, true"
	})
	public void testDemo(int age, boolean valid){
		assertThat(age>17, equalTo(valid));
	}
}
