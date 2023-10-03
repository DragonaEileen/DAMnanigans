package tema2;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*Pedir dos números y mostrarlos ordenados de menor a mayor.*/

	public static void main(String[] args) {
		
		//Variable declaration
			//Two numies for sorting
		long numie1;
		long numie2;
		
		//Scanner opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("You may be asking if this is another one of those silly characters about a goblin. Well, IT IS YET AGAIN. LET'S GET CRACKING");

			//Asking for first numie
		System.out.print("You gib first numie for Magic Numie Goblin to sort numies: ");
		numie1 = sc.nextLong();
		
			//Asking for second numie
		System.out.print("Now you gib second numie, good bean: ");
		numie2 = sc.nextLong();
		
		//Magical algorithm of IF
		if (numie1 > numie2) {		//If numie 1 is greater than numie 2, then the true block will say that
			
			//Answer if true
			System.out.println("Abra kadabra alakazam!! Your first numie (" + numie1 + ") is greater than your second numie("+ numie2 + ")");
			
		} else if (numie1 < numie2) {	//If numie 2 is greater than numie 1, it will say so
			
			//Answer is the contrary case
			System.out.println("Abra kadabra alakazam!! Your second numie (" + numie2 + ") is greater than your first numie("+ numie1 + ")");
			
		} else if (numie1 == numie2) {		//This could be just an else to be honest, but it compares the numies in case they are equal
			
			//Answer if you try to trick MNG
			System.out.println("The... Fuck.. did you just... do...??? NUMIES ARE EQUAL YOU #!@&Y");
		}
		
		//Closing Scanner 
		sc.close();

	}

}
