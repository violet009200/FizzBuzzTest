import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("1", fizzbuzz.fizz(1));
	}

}
