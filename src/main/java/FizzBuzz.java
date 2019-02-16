
public class FizzBuzz {
	


	public Object fizz(Integer inputNumber) {
		
		if((inputNumber %3 == 0 && inputNumber%5 == 0))
			return "fizzbuzz";
		if(inputNumber%3==0)
			return "fizz";
		else if(inputNumber %5 ==0)
			return "buzz";
		return inputNumber.toString();
	}
	
	public static void main(String args[]) {
		FizzBuzz fz = new FizzBuzz();
		fz.fizz(5);
	}

}
