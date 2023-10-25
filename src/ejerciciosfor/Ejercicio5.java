package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio5 {
	
	/** Pedir diez números por teclado y mostrar la media. **/

	public static void main(String[] args) {
		
		/* Declaración de variables */
		/* Vamos a declarar una constante que será el número de numeros que vamos a pedir, CONTADOR; 
		 * otra que será donde vayamos actualizando el número introducido;
		 * y una última donde iremos actualizando la suma */
		final int CONTADOR = 10;
		int input;
		int suma = 0;
		
		/* Abrimos Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso, recolección de datos y Algoritmo*/
		/* Pedimos que se vayan introduciendo números en un bucle For, y los datos añadidos se irán 
		 * sumando y tras el bucle se dividirán por el número de números que se hayan introducido 
		 * es decir CONTADOR veces */
		System.out.println("Introduzca " + CONTADOR + " números. Nosotres procederemos a realizar la media.");
		
		for(int i = 0; i < CONTADOR; i++) {
			
			System.out.print("Introduce un número: ");
			input = sc.nextInt();
			
			suma = suma + input;
			
		}//Fin For
		
		/* Salida de la respuesta*/
		/* En este syso realizamos la media, es decir, dividir la suma por el contador, */
		System.out.println("La media de tus números es " + suma/CONTADOR);
		
		/*Cierre de Scanner*/
		sc.close();
		
	}//Fin main

}
