package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día de la semana.
	 * Se debe mostrar el nombre del día de la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes” y 
	 * el 6 a “Sábado”.*/

	public static void main(String[] args) {
		
		//Variable declaration
			//El día a elegir
		int dia;
		
		//Scanner opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("Well, a drop of Nelson's blood wouldn't do us any harm\r\n"
				+ "And a drop of Nelson's blood wouldn't do us any harm\r\n"
				+ "And a drop of Nelson's blood wouldn't do us any harm\r\n"
				+ "And we'll all hang on behind");
			//Día
		System.out.print("Now choose a number between 1 and 7!!");
		dia = sc.nextInt();
		
		//A drop of Nelson's blood generator
		switch (dia) {		//Dependiendo del dia de la semana comunicará el numbre de este
			case 1:
				System.out.println("Well, a fuckin' Monday would actually do us a lot of harm\r\n"
						+ "And a fuckin' Monday would actually do us a lot of harm\r\n"
						+ "And a fuckin' Monday would actually do us a lot of harm\r\n"
						+ "And we'll all hang on behind");
				break;
			case 2:
				System.out.println("Well, a Double Taco Tuesday  wouldn't do us any harm\r\n"
						+ "And a Double Taco Tuesday  wouldn't do us any harm\r\n"
						+ "And a Double Taco Tuesday  wouldn't do us any harm\r\n"
						+ "And we'll all hang on behind");
				break;
			case 3:
				System.out.println("Well, a couple episodes of Wednesday wouldn't do us any harm\r\n"
						+ "And a couple episodes of Wednesday wouldn't do us any harm\r\n"
						+ "And a couple episodes of Wednesday wouldn't do us any harm\r\n"
						+ "And we'll all hang on behind");
				break;
			case 4:
				System.out.println("Well, a Critical Role Thursday wouldn't do us any harm\r\n"
						+ "And a Critical Role Thursday wouldn't do us any harm\r\n"
						+ "And a Critical Role Thursday wouldn't do us any harm\r\n"
						+ "And we'll all hang on behind");
				break;
			case 5:
				System.out.println("Well, a Flat Fuck Friday wouldn't do us any harm\r\n"
						+ "And a Flat Fuck Friday wouldn't do us any harm\r\n"
						+ "And a Flat Fuck Friday wouldn't do us any harm\r\n"
						+ "And we'll all hang on behind");
				break;
			case 6:
				System.out.println("Well, a Saturday night, I feel the air is getting hot\r\n"
						+ "Like you baby\r\n"
						+ "And a Saturday night, dance, I like the way you move\r\n"
						+ "Pretty baby\r\n"
						+ "And a Saturday (it's party time, yeah) wouldn't do us any harm\r\n"
						+ "And we'll all hang on behind");
				break;
			case 7:
				System.out.println("Well, a Sunday Bloody Sunday wouldn't do us any harm\r\n"
						+ "And a Sunday Bloody Sunday wouldn't do us any harm\r\n"
						+ "And a Sunday Bloody Sunday wouldn't do us any harm\r\n"
						+ "And we'll all hang on behind");
				break;
			default:
					System.out.println("Come on and roll the old chariot along\r\n"
							+ "(Yes, we'll) roll the old chariot along\r\n"
							+ "(Come on and) roll the old chariot along\r\n"
							+ "And we'll all hang on behind");
				break;
		}
		
		//Scanner closing
		sc.close();

	}

}
