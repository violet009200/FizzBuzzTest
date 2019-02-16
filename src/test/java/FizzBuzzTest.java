import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("1", fizzbuzz.fizz(1));
	}
	
	@Test
	public void whenFizzBuzzIsPassedATwoItReturnsATwo() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("2",fizzbuzz.fizz(2));
	}

}
