package tema2;

import java.util.Scanner;

public class Ejercicio1 {
	
	/* Diseñar una aplicación que solicite al usuario un número e indique si es par o impar */

	public static void main(String[] args) {
		
		//Variable declaration
			//Numero para ver si es par o impar
		long number;
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.print("Please would you giv this tini beanie a meager, humble numie? ");
		number = sc.nextLong();
		
		//Magic algorithm (it isn't science, its magic)
		
		if (number % 2 == 0) {		//If numie modulo by 2 is not 0, then it's not even
			
			//Printing answer
			System.out.println("OH!! GASP!! NUMIE IS EVEN!!!");
			
		} else {
			
			//Printing answer
			System.out.println("I do lament to communicate you this, tiz, but this numie is an odd one");
			
		}
		
		//Closing Scanner
		sc.close();
		
	}

}
