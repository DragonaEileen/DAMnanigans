package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio4 {
	
	/** Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que 
	 * introducimos por teclado. **/

	public static void main(String[] args) {

		/* Declaración de variables */
		/* Declaramos la variable que vamos a pedir por teclado: input. Luego declaramos una variable 
		 * que se va a ir actualizando con los multiplos de 3*/
		int input;
		int multiplo = 0;
		
		/* Abrimos Scanner */
		Scanner sc = new Scanner(System.in);
		
		/*Syso y recolección de data*/
		System.out.println("¿Quieres los números múltiplos de 3 del 1 hasta cualquier número? "
				+ "Dame ese número:");
		input = sc.nextInt();
		
		/* Algoritmo */
		/* Con un bucle For vamos a ir multiplicando por 3 el contador que va a ir de 1 a 1 hasta que 
		 * esa multiplicación sea mayor que el numero introducido */
		for(int i = 1; multiplo <= input; i++) {
			
			System.out.println(multiplo);
			
			multiplo = 3*i;
			
		}//Fin For
		
		//Cerramos scanner
		sc.close();
		
	}//Fin main

}
