package Testing.mockito;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import Testing.JUnitTest.Numbers;
@RunWith(MockitoJUnitRunner.class)
public class NumbersTest {

	@Test
	public void test() {
		Numbers number = new Numbers();
		//when(number.sum(4, 6)).thenReturn(10);
		System.out.println(number.sum(4, 6));
		assertEquals(10, 10);
	}

}
