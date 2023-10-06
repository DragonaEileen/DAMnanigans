package tema2;

import java.util.Scanner;

public class Ejercicio10 {
	
	/*Escribir un programa que pida al usuario tres números enteros, y que muestre por pantalla si la 
	 * suma de dos de esos números da como resultado el otro número.*/

	public static void main(String[] args) {

		//Declaracion de variables
			//Los numeros enteros
		int numie1;
		int numie2;
		int numie3;
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("If you wanna be my number, you gotta add up with my friends");
			//First numie
		System.out.print("Oh you are finally awake, what's your numie?");
		numie1 = sc.nextInt();
			//Second numie
		System.out.print("Llegaré a ser el mejor\r\n"
				+ "El mejor que habrá jamás\r\n"
				+ "Mi causa es ser su entrenador\r\n"
				+ "Tras poderlos capturar, dame un número!!!");
		numie2 = sc.nextInt();
			//Third numie
		System.out.print("Episode 3: La venganza de los Sith. Dame un número mi padawan: ");
		numie3 = sc.nextInt();
		
		//One Algorithm to rule them all
		if (numie1 + numie2 == numie3) {		//Comprobacion si la suma de los dos primeros numeros es igual al tercero
			
			//Answer
			System.out.println(numie3 + "... You are the chosen one.");
			
		}else {	//Si no es igual
			
			//Answer
			System.out.println("Your " + numie3 + " is not very gucci.");
			
		}
		
	}

}
