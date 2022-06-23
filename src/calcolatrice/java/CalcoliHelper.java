package calcolatrice.java;

/*BONUS 1: per ogni metodo scrivetene una versione che esegue le stesse operazioni ma su parametri double.
Il fatto di dover scrivere lo stesso metodo per tipi di parametro diversi applica nella pratica uno dei principi 
di programmazione ad oggetti…Quale? Scrivetelo in un commento all’interno del vostro codice! :faccia_nerd:

BONUS2: aggiungete il metodo per l’elevamento a potenza che prende come parametri due numeri interi (base ed esponente) 
e ritorna la base elevata all’esponente. Occhio che sia la base che l’esponente potrebbero essere uguali a zero oppure numeri negativi!
(caso esponente = 0 e base = 0 anche se in matematica sarebbe un numero indefinito usiamo l’approccio informatico che lo calcola come 1)*/

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
	
	//BONUS 1
	// OVERLOAD 
	
		// sum
		public static double numbersSum (double firstAddend,double secondAddend) {
			return firstAddend + secondAddend;
		}
		//difference
		public static double numbersDifference (double minuend, double subtrahend) {
			return minuend - subtrahend;
		}
		//difference n.2
		public static double numbersDifference2 (double minuend2, double subtrahend2) {
			if (minuend2 < subtrahend2) {
				return subtrahend2 - minuend2;
				}
			else {
				return minuend2 - subtrahend2;
			}
		}
		//multiplication
		public static double numbersMultiplication (double firstFactor, double secondFactor) {
			return firstFactor * secondFactor;
		}
		//absolute value
		public static double absoluteValue (double firstNumber) {
			
			if (firstNumber < 0) {
				firstNumber = -firstNumber;
			}
				return firstNumber;
			}

		
		public static double minNumber (double secondNumber , double thirdNumber) {
			
			double minimumValue;
			
			if (secondNumber < thirdNumber) {
				minimumValue = secondNumber;
			}
			else {
				minimumValue = thirdNumber;
			}
			return minimumValue;
		}
		
		
		public static double maxNumber (double secondNumber , double thirdNumber) {
			
			double minimumValue;
			
			if (secondNumber > thirdNumber) {
				minimumValue = secondNumber;
			}
			else {
				minimumValue = thirdNumber;
			}
			return minimumValue;
		}
		
	
}
