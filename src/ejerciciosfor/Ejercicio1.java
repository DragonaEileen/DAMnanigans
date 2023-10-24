package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio1 {

	/** Aplicación para aprender a contar, que pedirá un número n y mostrará todos los 
	 * números del 1 al n. **/
	
	public static void main(String[] args) {
		
		/* Declaración de variables */
		/* Se va a declarar la variable n, que se le va a pedir al usuario.*/
		int n;
		
		/* Abrimos Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso y recolección de datos */
		/*Pedimos la un numero por un syso y la guardamos con un nextInt en la variable n */
		System.out.println("Vamos a aprender a contar. Dame un número y contaremos hasta ese número :)");
		n = sc.nextInt();
		
		/* Algoritmo */
		/* Realizamos un bucle For que cuente de 1 hasta n de 1 en 1 y vaya mostrando 
		 * los numeros que cuente. */
		for(int i = 1; i <= n; i++) {
			
			System.out.println("¡" + i + "! ¡HA HA HA!");
			
		}//Fin For
		
		//Cerramos Scanner
		sc.close();
		
		
	}//Fin main

}
