package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*Realiza un programa que muestre la tabla de multiplicar de un número introducido por teclado.*/

	public static void main(String[] args) {
		
		//Variables
		int input;
			//Contador
		int counter = 0;
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data y syso
		System.out.println("Introduzca un numero");
		input = sc.nextInt();
		
		//Do-While. Hasta que el contador llegue a 10 se multiplica el input por el contador
		do {
			
			//Respuesta
			System.out.println(input + " * " + counter + " = " + input*counter);
			
			//Repetitividor
			counter = counter +1;
			
		}while(counter <= 10);
		
	}

}
