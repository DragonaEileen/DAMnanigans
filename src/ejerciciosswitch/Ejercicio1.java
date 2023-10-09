package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio1 {
	
	/*Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4), suficiente (5), 
	 * bien (6), notable (7 y 8) y sobresaliente (9 y 10).
	 */

	public static void main(String[] args) {
		
		//Variable declaration
			//La nota a mostrar
		int nota;
		
		//Scanner opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("Hoi!!!, tEMMIE here, wut's up?\r\n"
				+ "tEMMIE haz exam and tEMMIE got a number\r\n"
				+ "tEMMIE does not know WUT score she get \r\n"
				+ "can u tell tEMMIE teh score????");
			//Preguntamos la Nota
		System.out.print("what number did temmie get?");
		nota  = sc.nextInt();
		
		//tEMMIE Algorithm
		switch (nota) {		//Dependiendo de la nota te dirá si has aprobado o no y con que valoración
			case 0:
				System.out.println("tEMMIE got an f ????");
				break;
			case 1:
				System.out.println("tEMMIE got an f ????");
				break;
			case 2:
				System.out.println("tEMMIE got an f ????");
				break;
			case 3:
				System.out.println("tEMMIE got an f ????");
				break;
			case 4:
				System.out.println("tEMMIE got an f ????");
				break;
			case 5:
				System.out.println("tEMMIE got a SUFFICIENTE owo");
				break;
			case 6:
				System.out.println("tEMMIE got a gud uwu");
				break;
			case 7:
				System.out.println("tEMMIE got an notorious git gud");
				break;
			case 8:
				System.out.println("tEMMIE got an notorious git gud");
				break;
			case 9:
				System.out.println("tEMMIE haz a joke: y did teh scarecrow get a promotion?\r\n"
						+ "cuz it was OUTSTANDING on it field");
				break;
			case 10:
				System.out.println("tEMMIE haz a joke: y did teh scarecrow get a promotion?\r\n"
						+ "cuz it was OUTSTANDING on it field");
				break;
			default:
				System.out.println("tEMMIE doesn't know bout dis number");
				break;
	
		}
		
		//Scanner closing
		sc.close();
		
	}

}
