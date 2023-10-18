package ejercicioswhile;

import java.lang.Math;
import java.util.Scanner;

public class Ejercicio7 {

	/*Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 
	 * (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para los 
	 * que se indica: “mayor” o “menor”, según sea mayor o menor con respecto al número secreto. El 
	 * proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).*/
	
	public static void main(String[] args) {

		//Declaracion de variables
			//Numero aleatorio secreto
		int numeroAleatorio = (int) (Math.random()*100);
			//Numero auxiliar de input
		int input;
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Syso y data recollection
		System.out.print("El número secreto, introduce un número: ");
		input = sc.nextInt();
		
		//Algorythm
		//Leer sysos
		
		while (input != numeroAleatorio || input != -1) {		//Mientras no se acierte el numero le dará las siguientes pistas
			
			if (input > numeroAleatorio) {
				
				System.out.println("Tu número es mayor que el número secreto");
				
			}else{
				
				System.out.println("Tu número es menor que el número secreto");
				
			}//Fin if
			
			System.out.print("Introduce un número: ");
			input = sc.nextInt();
			
		}//Fin while
		
		if (input == -1) {
			
			System.out.println("La proxima vez será!!");
			
		}else{
			
			System.out.println("Bien hecho!! El número secreto es " + numeroAleatorio);
			
		}//Fin if
		
		//Scanner
		sc.close();
		
	}

}
