package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio9 {
	
	/** Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no. **/

	public static void main(String[] args) {
		
		/* Declaración de variables */
		/* Declaramos una variable en la que guardamos el numero introducido por teclado, y una
		 * booleana que te diga si es primo o no */
		int input;
		boolean primo = true;
		
		/* Apertura del Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y recolección de datos */
		/* Pedimos que se introduzca un número y lo guardamos en input */
		System.out.println("Si quieres ver que sea primo dame un número: ");
		input = sc.nextInt();
		
		/* Algoritmo */
		/* Mediante un bucle For vamos a ir comprobando que sea divisible entre 2 y ese numero menos uno
		 * y si es divisible no es primo y no necesitamos seguir por el bucle asi que rompemos*/
		for(int i = 2; i < input -1 ; i++) {
			
			if(input % i == 0) {
				
				primo = false;
				
				break;
				
			}//Fin If
			
		}//Fin For
		
		/* Syso Respuesta */
		System.out.println("El numero es primo: " + primo);
		
		/* Cierre Scanner */
		sc.close();

	}//Fin main

}
