import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fizzbuzz;
	
	@Before
	public void setUp() {
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
	
		assertEquals("1", fizzbuzz.fizz(1));
	}
	
	@Test
	public void whenFizzBuzzIsPassedATwoItReturnsATwo() {
		
		assertEquals("2",fizzbuzz.fizz(2));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz() {
		
		assertEquals("fizz", fizzbuzz.fizz(3));
		assertEquals("fizz", fizzbuzz.fizz(6));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfFiveItReturnsBuzz() {
		assertEquals("buzz", fizzbuzz.fizz(5));
		assertEquals("buzz", fizzbuzz.fizz(10));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeAndFiveItReturnsFizzBuzz() {
		assertEquals("fizzbuzz", fizzbuzz.fizz(15));
	}
}
