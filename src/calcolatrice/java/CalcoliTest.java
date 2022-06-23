package calcolatrice.java;

import java.util.Random;

public class CalcoliTest {

	public static void main(String[] args) {
		
		System.out.println("Somma tra numeri :");
		System.out.println(CalcoliHelper.numbersDifference(5, 90));
		
		System.out.println("Differenza tra numeri :");
		System.out.println(CalcoliHelper.numbersDifference2(5, 94));
		
		System.out.println("Moltiplicazione tra numeri :");
		System.out.println(CalcoliHelper.absoluteValue(-12));
		
		Random random = new Random();
		int randomNumber1 = random.nextInt((1000)+1);
		int randomNumber2 = random.nextInt((1000)+1);
		
		System.out.println("\n" + "I due numeri sono: "+ randomNumber1+ " e " +randomNumber2);
		
		System.out.println("Il numero minore è: " + CalcoliHelper.minNumber(randomNumber1, randomNumber2));
		System.out.println("Il numero maggiore è: " + CalcoliHelper.maxNumber(randomNumber1, randomNumber2));
	}
}
