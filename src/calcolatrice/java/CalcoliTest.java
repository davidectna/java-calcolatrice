package calcolatrice.java;

import java.util.Random;

/*BONUS 1: per ogni metodo scrivetene una versione che esegue le stesse operazioni ma su parametri double.
Il fatto di dover scrivere lo stesso metodo per tipi di parametro diversi applica nella pratica uno dei principi 
di programmazione ad oggetti…Quale? Scrivetelo in un commento all’interno del vostro codice! :faccia_nerd:

BONUS2: aggiungete il metodo per l’elevamento a potenza che prende come parametri due numeri interi (base ed esponente) 
e ritorna la base elevata all’esponente. Occhio che sia la base che l’esponente potrebbero essere uguali a zero oppure numeri negativi!
(caso esponente = 0 e base = 0 anche se in matematica sarebbe un numero indefinito usiamo l’approccio informatico che lo calcola come 1)*/

public class CalcoliTest {

	public static void main(String[] args) {
		
		System.out.println("Differenza tra numeri con risultato negativo :");
		System.out.println(CalcoliHelper.numbersDifference(5, 90));
		
		System.out.println("Differenza tra numeri con risultato obbligatoriamente positivo:");
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
