package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*Repetir el ejercicio de la calculadora del boletín de SWITCH de forma que se añada una opción más 
	 * al menú, quedando el menú así:
	A SUMAR LOS NÚMEROS
	B RESTAR LOS NÚMEROS
	C MULTIPLICAR LOS NÚMEROS
	D DIVIDIR LOS NÚMEROS
	E SALIR
	 */

	public static void main(String[] args) {

		//Variable declaration
			//Opcion a escoger
		String option = "";
			//Números
		double num1;
		double num2;
		
		//Scannercito
		Scanner sc = new Scanner(System.in);
		
		//Syso y data collection media do-while. Mientras option diferente de E seguir jugando.
		System.out.println("UwU");
		
		//Do calculator while option different than E
		do {
			
			//Nums request
			System.out.print("Num 1: ");
			num1 = sc.nextDouble();
			
			System.out.print("Num 2: ");
			num2 = sc.nextDouble();
			
			//Option request
			System.out.println("Choose an option:\r\n"
					+ "(A) Add\r\n"
					+ "(B) Subtract\r\n"
					+ "(C) Multiply\r\n"
					+ "(D) Divide\r\n"
					+ "(E) Exit");
			option = sc.next();
			
			switch (option) {
			case "A": //Addition
				
				System.out.println("The addition of the two numbers gives us a " + (num1 + num2));
				break;
				
			case "B":	//Subtraction
				
				System.out.println("The subtraction of the two numbers gives us a " + (num1 - num2));
				break;
				
			case "C":	//Multiplication
				
				System.out.println("The multiplication of the two numbers gives us a " + (num1 * num2));
				break;
				
			case "D":	//Division
				
				System.out.println("The division of the two numbers gives us a " + (num1 / num2));
				break;
				
			default:
				
				System.out.println("Have a good one.");
				break;
				
			}
			
		}while(!option.equals("E"));
		
		//Cerramos scanner
		sc.close();
		
	}

}
