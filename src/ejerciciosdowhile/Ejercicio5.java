package ejerciciosdowhile;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ejercicio5 {
	
	/*Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta 
	 * adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo 
	 * (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado)*/

	public static void main(String[] args) {

		//Variable auxiliar
		int aux;
			//Respuestas
		String resYesNo = "";
		String resMayorMenor = "";
			//Máximo y mínimo
		int max = 101;
		int min = 1;
			
		//Random Declaration
		Random random = new Random();
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Do while
		do {
			
			//Aux creates a random between the max and min variable
			aux = random.nextInt(min, max);
			
			//Chedcking if input is correct
			do {
			//We read the answer
			System.out.println("Is " + aux + " your number?");
			resYesNo = sc.next();
			}while(!resYesNo.equalsIgnoreCase("Yes") && !resYesNo.equalsIgnoreCase("No"));
			
			//If it's a Yes it's gonna jump this and break the loop, but if not we gotta guess other number
			if(resYesNo.equalsIgnoreCase("No")) {
				
				//First let's see if the user is trolling us
				if(min == max) {
					
					System.out.println("Wait what?? That is the number!!");
					
				}else {
					
					//Checking if the thing is correct
					do {
						
						//Second let's see if it's greater or lesser than
						System.out.println("Is your number greater or lesser than my number? ");
						resMayorMenor = sc.next();
						
					}while(!resMayorMenor.equals("<") && !resMayorMenor.equals(">"));
						
					//If it's greater than the number we have a minimum, and the contrary on the other case
					if(resMayorMenor.equals(">")) {
							
						min = aux;
							
					}else if(resMayorMenor.equals("<")){
							
						max = aux;
					}	
				
				}//Fin If trolling
					
			}//Fin if Yes or No		
			
		}while(!resYesNo.equalsIgnoreCase("Yes") && !resYesNo.equals("ESCAPE"));
		
		//Finish
		if(resYesNo.equalsIgnoreCase("Yes")) {
			System.out.println("Yay!!");
		}else {
			System.out.println("Thanks for playing with me ^_^");
		}
		
		//Scanner
		sc.close();
		
	}

}
