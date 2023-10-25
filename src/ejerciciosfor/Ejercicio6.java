package ejerciciosfor;

public class Ejercicio6 {
	
	/** Diseñar un programa que muestre la suma de los 10 primeros números impares. **/

	public static void main(String[] args) {

		/* Declaración de variables */
		/* Vamos a crear una variable suma donde se irá almacenando la suma de los numeros, y
		 * luego otra que cuente los números impares hasta llegar hasta 10,
		 * y al principio una constante que podremos cambiar si por ejemplo queremos los 20 primeros 
		 * numeros impares */
		final int CONTADOR = 10;
		int suma = 0;
		int counter = 0;
		
		/* Syso de Información */
		System.out.println("Vamos a proceder a sumar los primeros 10 numeros impares.");
		
		/* Algoritmo */
		/* Mediante un bucle For vamos a proceder a ir sumando los primeros 10 números impares, 
		 * con un if iremos viendo si son impares */
		for (int i = 0; counter < CONTADOR; i++) {
			
			if(i % 2 != 0) {	//Modulo de dividir entre 2 no es 0
				
				suma = suma + i;
				
				counter = counter + 1;
				
			}//Fin If
			
		}//Fin For
		
		/* Syso Respuesta */
		System.out.println("La suma de los 10 primeros números impares es de " + suma);
		
	}//Fin main

}
