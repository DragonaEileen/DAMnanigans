package tema2;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*Escribir una aplicación que pida al usuario un número real y muestre por pantalla 
	 * la nota del alumno, teniendo en cuenta:
	[0-5) es INSUFICIENTE (0 inclusive)
	[5-6) es SUFICIENTE (5 inclusive)
	[6-7) es BIEN (6 inclusive)
	[7-9) es NOTABLE (7 inclusive)
	[9-10] es SOBRESALIENTE (9 y 10 inclusives)
	 */

	public static void main(String[] args) {

		//Variable declaration
			//La nota obviously
		float nota;
	
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("──────▄▀▄─────▄▀▄\r\n"
				+ "─────▄█░░▀▀▀▀▀░░█▄\r\n"
				+ "─▄▄──█░░░░░░░░░░░█──▄▄\r\n"
				+ "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
			//Variable Nota
		System.out.println("Cual es tu nota-meow?");
		nota = sc.nextFloat();
		
		//Algorithm
		if/*you wanna be my coder, you gotta get with my friends*/(nota < 5 && nota >= 0) {		//Si la nota es menor que 5 sería insuficiente
			
			//Answer
			System.out.println("And I SAY heyyeyaaeyaaaeyaeyaa, you got F!! What's going on???");
			
		} else if(nota < 6) {		//Si esta entre 5 y 6 será suficiente
			
			//Answer
			System.out.println("And hallelujah\r\n"
					+ "Hallelujah\r\n"
					+ "Hallelujah\r\n"
					+ "They're SUFFICIENT for today");
			
		}else if(nota < 7) {			// Si es menor de 7 será un BIEN
			
			//Answer
			System.out.println("'Tamos BIEN, yeh\r\n"
					+ "Sobran los billetes de cien, yeah\r\n"
					+ "No hay nada mal, estamos BIEN, está todo BIEN, hey\r\n"
					+ "To's los míos están BIEN, 'tamos BIEN, hey");
			
		}else if(nota < 9) {		//Notable si es menor de 9
			
			//Answer
			System.out.println("Do you know why six is afraid of 7? Because 7-ate-9. Notorious");
			
		}else if (nota <= 10) {		//Si esta entre 9 y 10 es sobresaliente
			
			//Answer
			System.out.println("Sobresa-daca-liente");
			
		}else {		//Si es menor de 0 oo mayor a 10
			
			//Answer
			System.out.println("UNINSTALL UNINSTALL\r\n"
					+ "kono hoshi no musuu no chiri no hitotsu dato\r\n"
					+ "ima no boku niwa rikai dekinai\r\n"
					+ "UNINSTALL UNINSTALL\r\n"
					+ "osore wo shiranai senshi no youni\r\n"
					+ "furumau shikanai UNINSTALL\r\n"
					+ "");
			
		}
		
		//Cerramos scanner
		sc.close();
		
	}

}
