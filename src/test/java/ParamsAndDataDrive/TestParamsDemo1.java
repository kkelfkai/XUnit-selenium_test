package ParamsAndDataDrive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(Parameterized.class)
public class TestParamsDemo1 {

	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
						{1,1},
						{1,2},
						{100,99},
						{3,3}

		});
	}

	@Parameterized.Parameter(0)
	public int act;
	@Parameterized.Parameter(1)
	public int exp;


	@Test
	public void testDemo(){
		assertThat("demo",act,equalTo(exp));
	}
}
