package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio3 {

	/*Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando. 
	 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
	 * antes de acabar, mostrará la media de los números positivos introducidos por el usuario.*/
	
	public static void main(String[] args) {
		
		//Variable declaration
			//Numero a pedir
		int numero;
			//Suma de los numeros
		int suma = 0;
			//Counter
		int counter = 0;
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data Recollection
		System.out.println("Mean, Median, Mode, & Range!\r\n"
				+ "(sung to the tune of “Are You Sleeping?”)");
			//Getting numero
		System.out.print("I sing a ");
		numero = sc.nextInt();
		
		//AlgoRHYTHM
		while (numero >= 0) {		//Mientras que el numero sea positivo irá sumando y contando el numero de numeros
			//introducidos para hacer la media luego
			
			suma = suma + numero;
			
			counter = counter + 1;
			
			System.out.print("I sing a ");
			numero = sc.nextInt();
			
		}
		
		//Answer
		System.out.println("Mean means average,\r\n"
				+ "Mean means average.\r\n"
				+ "Mode means most,\r\n"
				+ "Mode means most.\r\n"
				+ "Median’s in the middle,\r\n"
				+ "Median’s in the middle.\r\n"
				+ "Now I know!\r\n"
				+ "Now I know!\r\n"
				+ "Range means difference,\r\n"
				+ "Range means difference.\r\n"
				+ "Big minus small,\r\n"
				+ "Big minus small.\r\n"
				+ "These are all statistics,\r\n"
				+ "These are all statistics.\r\n"
				+ "Now I know!\r\n"
				+ "Now I know!\r\n"
				+ "Median iiiiiiissssss " + suma/counter);

		//Cerramos Scanner
		sc.close();
		
	}

}
