package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando. 
	 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
	 * antes de acabar, mostrará la cantidad de números positivos introducidos por el usuario*/

	public static void main(String[] args) {

		//Declaramos variables
			//Numero a pedir
		int numero;
			//Contador
		int counter = 0;
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("One, two, five, four (five, four)\r\n"
				+ "Me count so poor (gonna count, gonna count, gonna count now)");
			//Getting numero
		System.out.print("I can only add a: ");
		numero = sc.nextInt();
		
		//AlgoRHYTHM,
		while (numero >= 0) {		//Mientras ue el numero sea positivo va a sumar uno al counter y preguntar por otro numero
			
			counter = counter + 1;
			
			System.out.print("I can only add a: ");
			numero = sc.nextInt();
		}
		
		//Answer
		System.out.println("One, I can count to one\r\n"
				+ "Two, I can count to two\r\n"
				+ "Three, I can count to three\r\n"
				+ counter + ", I can't count no more\r\n"
				+ "One, what comes after one?\r\n"
				+ "Two, what comes after two?\r\n"
				+ "Three, what comes after three?\r\n"
				+ counter);
		
		//Cerramos Scanner
		sc.close();
		
	}

}
