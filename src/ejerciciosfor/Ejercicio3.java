package ejerciciosfor;

public class Ejercicio3 {
	
	/** Escribir todos los múltiplos de 7 menores que 100. **/

	public static void main(String[] args) {
		
		/* Declaración de Variables */
		/* Creamos una variable multiplo que ira guardando los multiplos de 7 en el bucle posterior */
		int multiplo = 0;
		
		/* Decimos que vamos a hacer */
		System.out.println("Vamos a ver todos los multiplos de 7 menores que 100");
		
		/* Algoritmo */
		/* Realizamos un bucle For que vaya multiplicando por 7 el inicializador hasta que 
		 * sea mayor que 100 */
		for(int i = 1; multiplo < 100; i++) {
			
			System.out.println(multiplo);
			
			multiplo = 7 * i;
			
		}//Fin For

	}//Fin main

}
