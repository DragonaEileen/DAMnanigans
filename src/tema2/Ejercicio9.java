package tema2;

import java.util.Scanner;

public class Ejercicio9 {
	
	/* Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a cada jugador que 
	 * escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por pantalla quién ha ganado el juego 
	 * tras jugar una partida. Hay que contemplar el caso de que empaten*/

	public static void main(String[] args) {
		
		//Variable declaration 
			//Variables where the choices of then players are gonna be kept
		String choice1;
		String choice2;
		
		//Scanner opening
		Scanner sc = new Scanner(System.in);
		
		//Data Recollection
		System.out.println(":¨·.·¨:\r\n"
				+ " `·. Gimme your money ★°*ﾟ");
			//First choice
		System.out.print("First things first imma say all the words inside my head. (Piedra, paper o tihera)");
		choice1 = sc.next();
			
			//Second choice
		System.out.print("Second thing second\r\n"
				+ "Don't you tell me what you think that I could be. (Ladrillo, panfleto o tixora)");
		choice2 = sc.next();
		
		//There's magic in my algorithmic bones
			//Primero el dato introducido tiene que ser Piedra, Papel o Tijera
		if(choice1.equals("Piedra") || choice1.equals("Papel") || choice1.equals("Tijera")) {	
			
			if(choice2.equals("Piedra") || choice2.equals("Papel") || choice2.equals("Tijera")) {	//	Comprobamos si el segundo numero es valido
			
				if (choice1.equals(choice2)) {		// Si son iguales pues empate directamente
					
					//Answer
					System.out.println("Pain!\r\n"
							+ "You made me a, you made me a believer, believer (Empate)");
					
				} else {		//Si no es empate pues comparacion time
					
					if(choice1.equals("Piedra") && choice2.equals("Tijera") || choice1.equals("Papel") && choice2.equals("Piedra") || choice1.equals("Tijera") && choice2.equals("Papel")) {
						
						//Si el jugador unio gana:
						System.out.println("Visca el Jugador 1:Betis");
						
					} else {
						
						//Si el jugador 2 gana
						System.out.println("Visca la jugadora 2: Rafaela Nadal");
						
					}
		
				}
				
			}else { 	//Si no pues es muy poco cafe con leche
				
				//Answer
				System.out.println("Your opción 2 is not muy cafe con leche");
				
			}
			
		}else {			//Si el primer dato no es una de las opciones
			
			//Answer
			System.out.println("Your opción is not muy cafe con leche");
			
		}
		
		//Cerramos scanner
		sc.close();
		
	}

}
