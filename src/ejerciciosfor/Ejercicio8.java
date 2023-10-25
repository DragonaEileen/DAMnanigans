package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio8 {
	
	/** Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso. **/

	public static void main(String[] args) {

		/* Declaración de variables */
		/* Vamos a declarar una variable que se ira actualizando conforme se introduzcan notas;
		 * y otra que cuente los suspensos;
		 * además una constante que por si quieres cambiar el numero que pides.*/
		final int GET_IT_GIRL = 5;
		float input;
		int counter = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información, recolección de datos*/
		/* Pedimos los números en un bucle For y vamos sumando si es menor que 5*/
		System.out.println("Vamos a ver cuantos suspensos hay, dame " + GET_IT_GIRL + " calificaciones.");
		
		for(int i = 1; i <= GET_IT_GIRL; i++) {
			
			System.out.print("La " + i + "º pls: ");
			input = sc.nextFloat();
			
			if (input < 5) {
				
				counter = counter + 1;
				
			}//Fin If
			
		}//Fin For
		
		/* Syso Respuesta */
		System.out.println("Hay " + counter + " suspensos.");
		
		/* Cierre de Scanner */
		sc.close();
		
	}//Fin Main

}
