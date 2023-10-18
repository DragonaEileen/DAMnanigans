package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	/*Realiza un programa que sume los números desde el 1 hasta un número N que se introducirá 
	 * por teclado. Si el usuario introduce un 5, el programa debe devolver la suma de 1+2+3+4+5. */
	
	public static void main(String[] args) {

		//Variable
			//Variable del Input
		int n;
			//Variable que guardará el total
		int total = 0;
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data y sysos
		System.out.println("Introduzca un númnero N: ");
		n = sc.nextInt();
		
		//Do-while. Vamos a ir sumando N al total mientras convertimos N en cada bucle a uno menos, hasta que N sea 0
		do {
			
			total = total + n;
			
			//Repetitividor
			n = n - 1;
			
		}while(n != 0);
		
		//Respuesta
		System.out.println("El total es " + total);
		
		//Scanner
		sc.close();
		
	}

}
