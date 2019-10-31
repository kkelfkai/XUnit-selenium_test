package Groups;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;



public class TestGroups {

	@Test
	@Category({FastGroup.class,SlowGroup.class})
	public void testDemo1(){
		assertTrue(true);
		//assertEquals(100,10);
		assertThat("aaaa",10, equalTo(10));
		assertThat(10.0, closeTo(10.1,0.1));
		assertThat(9.88, anyOf(closeTo(10.0, 0.1), equalTo(9.88)));
	}

	@Test
	@Category(SlowGroup.class)
	public void testDemo2(){
		assertTrue(true);
	}

	@Test
	@Category(FastGroup.class)
	public void testDemo3(){
		assertTrue(true);
	}

	@Test
	@Category({SlowGroup.class,FastGroup.class})
	public void testDemo4(){
		assertTrue(true);
	}


}
