package docker_test.Odd_even;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMain {

	@Test
	public void testChechInputIsEvenNumber() {
		assertTrue(Main.chechInputIsEvenNumber(123));
	}
}
