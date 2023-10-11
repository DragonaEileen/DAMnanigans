package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro 
	 * educativo. Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas 
	 * las edades introducidas, la media, el número de alumnos y cuántos son mayores de edad.*/

	public static void main(String[] args) {
		
		//Variable declaration
			//Edad a introducir
		int edad;
			//sumacion
		int suma = 0;
			//Counter de numero de edades introducidas, y por tanto alumnos
		int counterMedian = 0;
			//Counter mayores de edad
		int counterMayores = 0;
		
		//Cerramos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("Prometo guardarte en el fondo de mi corazón\r\n"
				+ "Prometo acordarme siempre de aquel raro Diciembre\r\n"
				+ "Prometo encender en tu día especial una vela\r\n"
				+ "Y soplarla por ti\r\n"
				+ "Prometo no olvidarlo nunca\r\n"
				+ "Y prometo hacer un ejercicio de una manera normal algun dia [mentira]");
			//Request edad
		System.out.print("Tenía tanto que darte\r\n"
				+ "Tantas edades que contarte\r\n"
				+ "Tenía tanto amor guardado para ti\r\n"
				+ "Tenía tanto que darte\r\n"
				+ "Tantas edades que contarte\r\n"
				+ "Tenía tanto amor guardado para ti\r\n"
				+ "Oh, dame una edad: ");
		edad = sc.nextInt();
		
		//AlgoRHYTHM
		while (edad >= 0 ) {	//Mientras no se introduzca un numero negativo se hara el coso
			
			suma = suma + edad;	//Sumacion
			
			counterMedian = counterMedian + 1;	//Counter alumnos y media
			
			if (edad >= 18) {
				
				counterMayores = counterMayores + 1;	//Counter mayores solo si son mayores de 18
				
			} //Fin If
			
			//Request edad
			System.out.print("Tenía tanto que darte\r\n"
					+ "Tantas edades que contarte\r\n"
					+ "Tenía tanto amor guardado para ti\r\n"
					+ "Tenía tanto que darte\r\n"
					+ "Tantas edades que contarte\r\n"
					+ "Tenía tanto amor guardado para ti\r\n"
					+ "Oh, dame una edad: ");
			edad = sc.nextInt();
			
		} // Fin while
		
		//Answer
		System.out.println("Camino despacio pensando volver hacia atrás\r\n"
				+ "No puedo, en la vida las cosas suceden nomás\r\n"
				+ "Aún pregunto qué parte de tu destino se quedó conmigo\r\n"
				+ "Pregunto qué parte\r\n"
				+ "Se quedó por el camino\r\n"
				+ "Solo sé\r\n"
				+ "Que la suma de las edades introducidas es " + suma + ". Y la media de edad es " + suma/counterMedian + ". Y el numero de mayores de edad es " + counterMayores);

		//Cerramos Scanner
		sc.close();
		
	}

}
