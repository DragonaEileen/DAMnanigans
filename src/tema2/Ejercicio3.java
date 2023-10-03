package tema2;

import java.util.Scanner;

public class Ejercicio3 {

	/*Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, 
	 * que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente 
	 * el 0 no se considera un número casi-cero. Es decir, un número casi-cero es el que se encuentra en el 
	 * intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.*/
	
	public static void main(String[] args) {
		
		//Variable declaration
			//Numero decimal para ver si es un casi-cero
		double numie;
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("MAGIC NUMIE GOBLIN HERE!! AGAIN!!! Here to provide you with math-y funnsies.");
		
			//Asking for Numie
		System.out.print("You giv MNG a numie, and they tell you if numie is quasi-zero: ");
		numie = sc.nextDouble();
		
		//Magic Algorithm
		if (numie > -1 && numie < 1 && numie != 0) {	//If numie is less than 1 and greater than -1 and 
														// different than 0, then it's true block time.

			//Answer if true
			System.out.println("Matey, MNG has good news for ya. Your numie is QUASI-zero. Congrats on sins().");
			
		} else {
			
			//Answer if false
			System.out.println("You cheeky bastard. You should quest for other numie. This numie is bad one.");
			
		}

		//Scanner closing
		sc.close();
		
	}

}
