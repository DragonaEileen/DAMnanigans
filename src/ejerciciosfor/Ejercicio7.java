package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio7 {
	
	/** Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 
	 * 5! y es igual a 5x4x3x2x1 = 120. **/

	public static void main(String[] args) {
		
		/* Declaración de variables */
		/* Vamos a declarar una variable que será el input que pedimos; luego una que ira siendo la parte
		 * de la multiplicación del factorial. */
		int input;
		int multiplo = 1;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información y recolección de data */
		System.out.println("Introduce un numero para realizar el factorial: ");
		input = sc.nextInt();
		
		/* Algoritmo */
		/* Mediante un bucle For vamos a ir desde el número multiplicando por el numero directamente 
		 * inferior. */
		for(int i = input; i > 0; i--) {
			
			multiplo = multiplo * i; 
			
		}//Fin for
		
		/* Syso respuesta */
		System.out.println("El factorial sería " + multiplo);
		
		/* Cierre de Scanner */
		sc.close();

	}//Fin main

}
