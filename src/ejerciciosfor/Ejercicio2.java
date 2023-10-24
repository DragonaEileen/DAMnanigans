package ejerciciosfor;

public class Ejercicio2 {
	
	/** Programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello 
	 * suma de 2 en 2. **/

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* No necesitamos declarar ninguna variable en este programa */
		
		/* Syso */
		System.out.println("Vamos a contar del 1 al 200 de 2 en 2.");
		
		/* Algoritmo */
		/* Vamos a hacer un bucle For en el que contaremos del 0 al 200 incrementando 2 
		 * y va a ir imprimiendo los numeros que cuente*/
		for(int i = 2; i <= 200; i = i+2) {
			
			System.out.println(i);
			
		}//Fin For
		
	}//Fin main

}
