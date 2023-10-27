package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio10 {
	
	/** Realiza un programa que pida dos números enteros A y B, siendo B mayor que A. Luego 
	 * visualiza los números desde A hasta B. **/

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Pues declaramos las variables de input por teclado A y B */
		int inputA;
		int inputB;
		
		/* Apertura del Scanner */
		Scanner sc = new Scanner(System.in);
		
		/*Syso de Información y Recogida de Datos*/
		System.out.println("Dame dos números, A y B, siendo B mayor que A.");
		System.out.print("A: ");
		inputA = sc.nextInt();
		
		System.out.print("B: ");
		inputB = sc.nextInt();
		
		/* Algoritmo */
		/* Mediante un bucle for, siendo A el inicializador, vamos a ir sumandole 1 a A e imprimiendo 
		 * los números dados mientras que sean menores que B, en cuyo caso contrario parará */
		for (int i = inputA; i <= inputB; i++) {
			
			System.out.println(i);
			
		}//Fin For
		
		/* Cierre del Scanner */
		sc.close();
		
	}//Fin main

}
