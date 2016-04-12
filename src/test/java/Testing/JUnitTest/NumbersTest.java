package Testing.JUnitTest;

import org.junit.Test;

import junit.framework.TestCase;

public class NumbersTest extends TestCase {
	

	@Test
	public void testSum(){
		assertEquals(10, new Numbers().sum(6, 4));
	}
}
