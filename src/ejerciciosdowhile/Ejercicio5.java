package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta 
	 * adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo 
	 * (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado)*/

	public static void main(String[] args) {

		//Variable auxiliar
		int aux = (int) (Math.random()* 100);
			//Respuesta
		String res = "";
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Question
		System.out.println("Is " + aux + " your number?");
		res = sc.next();
		
		//Do while
		do {
			
			if (res.equals("No")) {
				
				System.out.println("Es mayor (>) o menor (<) que mi numero?");
				
			}
			
			
		}while(!res.equals("Yes"));
		
	}

}
