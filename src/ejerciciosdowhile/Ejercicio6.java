package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*Repetir el juego de PIEDRA - PAPEL - TIJERA pero con las siguientes consideraciones:
	Al jugador 1 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL o TIJERA. Mientras 
	 * no introduzca un valor válido se le seguirá preguntando.
	Al jugador 2 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL o TIJERA. Mientras 
	 * no introduzca un valor válido se le seguirá preguntando.
	Al terminar una partida se preguntará si se quiere seguir jugando. Mientras se pulse “S” 
	 * se volverá a iniciar la partida.
*/

	public static void main(String[] args) {

		//Variables
			//Respuestas jugador 1 y 2
		String player1 = "";
		String player2 = "";
			//Respuesta final
		String resFinish = "S";
		
		//Scannercito
		Scanner sc = new Scanner(System.in);
		
		//El siguiente do  va a reproducir el juego una y otra vez mientras resFinish sea S
		do {
		
			//Syso y data collection with do-while until a correct term is introduced
				//First player
			do {
				
				System.out.println("READY PLAYER 1 (Piedra, Papel o Tijera)");
				player1 = sc.next();
				
			}while(!player1.equalsIgnoreCase("Piedra") && !player1.equalsIgnoreCase("Papel") && !player1.equalsIgnoreCase("Tijera"));
			
				//Second player
			do {
				
				System.out.println("READY PLAYER 2 (Piedra, Papel o Tijera)");
				player2 = sc.next();
				
			}while(!player2.equalsIgnoreCase("Piedra") && !player2.equalsIgnoreCase("Papel") && !player2.equalsIgnoreCase("Tijera"));
			
			//Respuesta con ifs
			if (player1.equalsIgnoreCase(player2)) {		// Si son iguales pues empate directamente
						
				//Answer
				System.out.println("(Empate)");
						
			} else {		//Si no es empate pues comparacion time
						
				if(player1.equalsIgnoreCase("Piedra") && player2.equalsIgnoreCase("Tijera") || player1.equalsIgnoreCase("Papel") && player2.equalsIgnoreCase("Piedra") || player1.equalsIgnoreCase("Tijera") && player2.equalsIgnoreCase("Papel")) {
							
					//Si el jugador unio gana:
					System.out.println("PLAYER 1 WINS");
							
				} else {
							
					//Si el jugador 2 gana
					System.out.println("PLAYER 2 WINS");
							
				}
			
			}
			
			//Seguir jugando. Si se pulsa
			System.out.println("CONTINUE PLAYING? (S to yes)");
			resFinish = sc.next();
	
		}while(resFinish.equals("S"));
		
		System.out.println("Thanks for playing!!");
		
		//Cerramos scanner
		sc.close();
		
	}

}
