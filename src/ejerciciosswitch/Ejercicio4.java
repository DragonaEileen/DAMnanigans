package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que haría el usuario. El algoritmo pregunta al 
	 * usuario cuánto ha sacado en la primera tirada y el usuario le dará esa información pero en formato cadena 
	 * (“UNO”, “DOS” … “SEIS”).
	Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y el usuario también dará esa 
	información en formato cadena.
	Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.
	 */

	public static void main(String[] args) {

		//Declaración de variables
			//Resultado de los dados en cadena
		String dado1;
		String dado2;
			//Resultado de los dados en número
		int dado1Int;
		int dado2Int;
			//Resultado de la suma de los dos dados en numerico
		int res;
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("[GM]The maelstrom filling the central apse of the temple suddenly splits open with a crack of thunder. "
				+ "The gargantuan heads of five dragons begin to tear and gnash their way out of the rune-lined pit of fire that "
				+ "forms there. Tiamat the Dragon Queen is about to burst bodily from her confinement in the Nine Hells and enter "
				+ "the world.");
		System.out.println("[Baeloth]I cast Arms of Hadar!!");
		System.out.println("[GM] Okay, roll 2d6");
			//First roll
		System.out.print("[Baeloth] My first roll is a ");
		dado1 = sc.next();
			//Second roll
		System.out.println("[Baeloth] And my second roll is a ");
		dado2 = sc.next();
		
		//Tiamat rolls a save and fails. Let's add up how much HP Tiamat loses
		
		switch (dado1) {		//Switch to translate the string to numeric from the first die
		
			case "UNO":
				
				dado1Int = 1;
				break;
				
			case "DOS":
				
				dado1Int = 2;
				break;
				
			case "TRES":
				
				dado1Int = 3;
				break;
				
			case "CUATRO":
				
				dado1Int = 4;
				break;
				
			case "CINCO":
				
				dado1Int = 5;
				break;
				
			case "SEIS":
				
				dado1Int = 6;
				break;
				
			default:
				
				System.out.println("[GM] What do you mean 6969 damage?!?!");
				break;

		}
		
		switch (dado2) {
		
		case "UNO":
			
			dado2Int = 1;
			break;
			
		case "DOS":
			
			dado2Int = 2;
			break;
			
		case "TRES":
			
			dado2Int = 3;
			break;
			
		case "CUATRO":
			
			dado2Int = 4;
			break;
			
		case "CINCO":
			
			dado2Int = 5;
			break;
			
		case "SEIS":
			
			dado2Int = 6;
			break;
			
		default:
			
			System.out.println("[GM] What do you mean 6969 damage?!?!");
			break;

		}
		
		//Answer
		res = dado1Int + dado2Int;
		
		System.out.println("[Baeloth] Okay so I do " + res + " necrotic damage tpo Tiamat. And beacause I have the staff of Orcus\r\n"
				+ "when I inflict necrotic damage on a creature I roll a d100 and... that's a 100!!! That means the creature instanly dies :)");
		System.out.println("[GM]Why the fuck did I let you keep that staff D:");
		
		//Cerramos Scanner
		sc.close();
	}

}
