
public class FizzBuzz {
	


	public Object fizz(Integer inputNumber) {
		if(inputNumber%3==0)
			return "fizz";
		else if(inputNumber %5 ==0)
			return "buzz";
		return inputNumber.toString();
	}

}
