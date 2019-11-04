package MockTest;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;

public class MockTest {

	@Test
	public void mockDemo(){

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);

		assertThat(list.size(), equalTo(5));

	}

	@Test
	public void mockDemo2(){

		ArrayList<Integer> list=mock(ArrayList.class);
		list.add(1);
		list.add(2);

		//定制方法的返回结果
		when(list.size()).thenReturn(50);
		assertThat(list.size(), equalTo(50));

	}

	@Test
	public void testSpy(){

		ArrayList<Integer> list=mock(ArrayList.class);
		list.add(1);
		list.add(2);

		//mock里的spy功能，用来查看某个方法是否被调用过。
		verify(list).add(2); // add（2）被调用过
		verify(list).add(3); // add（3）没有被调用过

	}
}
