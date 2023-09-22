package ejerciciosparte2;

import java.util.Scanner;

public class MainEjerciciosParte2 {
	
	public static void main(String[] args) {
		
		ejercicio1();
		
	}
	/* Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
	 *  Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos). La aplicación 
	 *  mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de 
	 *  peras en 1,95€.
	 */
	public static void ejercicio1() {
		
		//Declaramos variables
		double ventaManzanas;
		double ventaPeras;
		double importeManzanas;
		double importePeras;
		double importeTotal;
		
		final double precioManzanas = 2.35;
		final double precioPeras = 1.95;
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos data y la guardamos
		System.out.print("Introduzca las ventas en kilos de manzanas: ");
		ventaManzanas = sc.nextDouble();
		
		System.out.print("Introduzca las ventas en kilos de peras: ");
		ventaPeras = sc.nextDouble();
		
		//Cálculos
		importeManzanas = ventaManzanas * precioManzanas;
		
		importePeras = ventaPeras * precioPeras;
		
		importeTotal = importeManzanas + importePeras;
		
		//Print y Close
		System.out.print("El importe total es igual a " + importeTotal);
		sc.close();

	}
	
	/* Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad 
	 * (mediante un literal booleano: true o false).
	 */
	public static void ejercicio2() {
		
	}

}
