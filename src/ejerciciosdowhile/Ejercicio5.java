package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta 
	 * adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo 
	 * (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado)*/

	public static void main(String[] args) {

		//Variable auxiliar
		int aux = (int) (Math.random()* 100 + 1);
			//Respuestas
		String resYesNo = "";
		String resMayorMenor = "";
		
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Question
		System.out.println("Is " + aux + " your number?");
		resYesNo = sc.next();
		
		//Do while
		do {
			
			if (resYesNo.equalsIgnoreCase("No")) {
				
				//Mayor o menor que?
				System.out.println("Es mayor (>) o menor (<) que mi numero?");
				resMayorMenor = sc.next();
				
				//If Mayor o menor que
				if (resMayorMenor.equals(">")) {
					
					//Si es mayor sumamos uno
					aux = aux + 1;
					
					//Question Repetitivity
					System.out.println("Is " + aux + " your number?");
					resYesNo = sc.next();					
					
				}else if (resMayorMenor.equals("<")) {
					
					//Si es menor restamos uno
					aux = aux - 1;
					
					//Question Repetitivity
					System.out.println("Is " + aux + " your number?");
					resYesNo = sc.next();
					
				}
				
				
			}else {
				
				//If not yes or no
				System.out.println("Sorry I didn't understand you.");
				
				//Question Repetitivity
				System.out.println("Is " + aux + " your number?");
				resYesNo = sc.next();
				
			}
			
			
		}while(!resYesNo.equalsIgnoreCase("Yes"));
		
		//Finish
		System.out.println("Yay!!");
		
		//Scanner
		sc.close();
		
	}

}
