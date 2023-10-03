package tema2;

import java.util.Scanner;

public class Ejercicio2 {

	/*Pedir dos números enteros y decir si son iguales o no.*/
	
	public static void main(String[] args) {

		//Variable declaration
			//Numeros que vamos a comprobar si son iguales o no
		int numie1;
		int numie2;
		
		//Opening Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("Thy humble servant, the masterful magic numie goblin, shall ask thou for two numies.");
		
		//First numie
		System.out.print("FIRST NUMIE: ");
		numie1 = sc.nextInt();
		
		//Second numie
		System.out.print("SECOND NUMIE: ");
		numie2 = sc.nextInt();
		
		//Magic numie algorithm
		
		if (numie1 == numie2) {		//Comparation of the two numies, if they are equal then the true block starts
			
			//Answer if true
			System.out.print("AHA!! Your numies are eeeeeee-qu-AL");
			
		}else {
			
			//Answer if false
			System.out.print("AHA!! Magic has been done. Numies are not the same. Sorry matey.");
			
		}
		
		//Scanner closing
		sc.close();
		
	}

}
