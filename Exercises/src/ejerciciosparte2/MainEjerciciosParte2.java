package ejerciciosparte2;

import java.util.Scanner;

public class MainEjerciciosParte2 {
	
	public static void main(String[] args) {
		
		//Variable, choice.
		byte choice;
		
		//New Scanner
		Scanner sc = new Scanner(System.in);
		
		//Asking
		System.out.print("Ejercicio: ");
		choice = sc.nextByte();
		
		if (choice == 1) {
			
			ejercicio1();
			
		} else if (choice == 2) {
			
			ejercicio2();
			
		} else if (choice == 3) {
			
			ejercicio3();
			
		} else if (choice == 4) {
			
			ejercicio4();
			
		} else if (choice == 5) {
			
			ejercicio5();
		}
		
	}
	
	/* Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
	 *  Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos). La aplicación 
	 *  mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de 
	 *  peras en 1,95€.
	 */
	public static void ejercicio1() {
		
		//Declaramos variables
		double ventaManzanas;	//Quantity of sold apples. Measured in kg.
		double ventaPeras;		//Quantity of sold pears. Measured in kg.
		double importeManzanas;	//Total of money from the sale of Apples
		double importePeras;	//Total of money from the sale of Pears
		double importeTotal;	//Total of money from the sale of both products
		
		final double precioManzanas = 2.35;	//Constant, price of Apples. €/kg
		final double precioPeras = 1.95;	//Constant, price of Pears. €/kg
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos data y la guardamos
		System.out.print("Introduzca las ventas en kilos de manzanas: "); //Requesting Data
		ventaManzanas = sc.nextDouble();	//Data reading
		
		System.out.print("Introduzca las ventas en kilos de peras: ");	//Requesting Data
		ventaPeras = sc.nextDouble();	//Data reading
		
		//Cálculos
		importeManzanas = ventaManzanas * precioManzanas;
		
		importePeras = ventaPeras * precioPeras;
		
		importeTotal = importeManzanas + importePeras;
		
		//Print y Close
		System.out.print("El importe total es igual a " + importeTotal);	//Answer
		sc.close();		//Closing Scanner

	}
	
	/* Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad 
	 * (mediante un literal booleano: true o false).
	 */
	public static void ejercicio2() {
		
		//Se declaran las variables
		byte edad;	// Variable asked
		String res;  //Answer to send
		
		//Se abre el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se piden y guardan los datos
		System.out.print("GIMME ur WINTERS: ");	//Data Request
		edad = sc.nextByte();	//Data Reading.
		
		//Magia 
		res = (edad >= 18)? "UR winters r VALID, thou shall pass" : "U R NOT VALID, thou SHAN'T pass, i flatulate on thou" ;
			//If edad is higher than 18, then the res is equal to the first value, if not, res is equal to the second.
		
		//Printing y closing
		System.out.println(res);	//Answer
		sc.close();	//Scanner Closing
		
	}
	
	/*Escribir un programa que pida un número al usuario e indique mediante un literal booleano (true o false) si 
	* el número es par.
	*/
	public static void ejercicio3() {
		
		//Declarar variables
		long num;	//Variable. Keeps the number.
		boolean res;	// Variable, true if num is even.
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Asking and saving variables
		System.out.print("For the fool's rotten tomatoes!!! Is thy number a thousand-times-cursed even number?");	//Request
		num = sc.nextLong();	//Data reading
		
		//Magic time baby
		res = (num % 2 == 0)? true : false; //Conditional operation. If num is even, then res equals true.
		
		//Printing and closing
		System.out.print("Thy number is even: " + res);	//Answer printing
		sc.close(); //Closing Scanner
		
	}
	
	/* Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta decisión:
	 * solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
	 * Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de tener que ir a 
	 * la biblioteca.
	 * Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
	 * El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso 
	 * para salir a la calle.
	 */
	public static void ejercicio4() {
		
		//Declaramos variables
		boolean llueve;	// True si llueve
		boolean tareasFinalizadas;	// True si se han hecho
		boolean necesitaIrALaBiblioteca; // True si se necesita
		
		boolean salida;	//True si se puede salir
		
		//Scanner Initializing
		Scanner sc = new Scanner(System.in);
		
		//Data collection
		System.out.print("¿Está lloviendo?");	//Console Print
		llueve = sc.nextBoolean();	//Data reading. Only admits Booleans
		
		System.out.print("¿Ha finalizado las tareas?");	// Console Print
		tareasFinalizadas = sc.nextBoolean();	//Data reading. Only admits Booleans
		
		System.out.print("¿Necesita ir a la biblioteca?");	//Console Print
		necesitaIrALaBiblioteca = sc.nextBoolean();	//Data reading. Only admits Booleans
		
		//Data comparison
		salida = (necesitaIrALaBiblioteca == true || (llueve == false && tareasFinalizadas == true))? true:false;
			// If you need to go to the library, it's always true. OR if it's not raining AND your homework is finished, 
			// it's also true.
		
		//Printing and Closing
		System.out.println("You can go outside: " + salida); //Answer
		sc.close(); //Scanner closing
		
	}
	
	/* Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán
	 *  al usuario). El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo 
	 *  la parte entera) y como se usa en el expediente académico (con decimales).*/
	public static void ejercicio5() {
		
		//Variables
		float firstTrim; 	//Score of the first trimester
		float secondTrim;	//Score of the second trimester
		float thirdTrim;	//Score of the third trimester
		
		float finalScore; //Total Score
		int boletinScore; //Int Score
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data Requests
		System.out.print("First Trimester Calification: ");		//Data Request for the firstTrim variable
		firstTrim = sc.nextFloat();		//Data Reading firstTrim variable
		
		System.out.print("Second Trimester Calification: ");	//Data Request for the secondTrim variable
		secondTrim = sc.nextFloat();	//Data Reading secondTrim variable
		
		System.out.print("Third Trimester Calification: ");		//Data Request for the thirdTrim variable
		thirdTrim = sc.nextFloat();		//Data Reading thirdTrim variable
		
		//Math
		finalScore = (firstTrim + secondTrim + thirdTrim) / 3;	//Media aritmetica
		
		boletinScore = (int) finalScore;		//Conversion to integer
		
		//Answers
		System.out.println("Nota de Boletín: " + boletinScore);	//Integer Answer
		System.out.println("Nota den Expediente: " + finalScore); //Float Answer
		sc.close(); //Scanner closing
		
	}
	
}
