package calcolatrice.java;

public class CalcoliHelper {
	
	
	private CalcoliHelper() {
	//private constructor 
	}
	// sum
	public static int numbersSum (int firstAddend,int secondAddend) {
		return firstAddend + secondAddend;
	}
	//difference
	public static int numbersDifference (int minuend, int subtrahend) {
		return minuend - subtrahend;
	}
	//difference n.2
	public static int numbersDifference2 (int minuend2, int subtrahend2) {
		if (minuend2 < subtrahend2) {
			return subtrahend2 - minuend2;
			}
		else {
			return minuend2 - subtrahend2;
		}
	}
	//multiplication
	public static int numbersMultiplication (int firstFactor, int secondFactor) {
		return firstFactor * secondFactor;
	}
	//absolute value
	public static int absoluteValue (int firstNumber) {
		
		if (firstNumber < 0) {
			firstNumber = -firstNumber;
		}
			return firstNumber;
		}

	
	public static int minNumber (int secondNumber , int thirdNumber) {
		
		int minimumValue;
		
		if (secondNumber < thirdNumber) {
			minimumValue = secondNumber;
		}
		else {
			minimumValue = thirdNumber;
		}
		return minimumValue;
	}
	
	
	public static int maxNumber (int secondNumber , int thirdNumber) {
		
		int minimumValue;
		
		if (secondNumber > thirdNumber) {
			minimumValue = secondNumber;
		}
		else {
			minimumValue = thirdNumber;
		}
		return minimumValue;
	}
	
	
}
