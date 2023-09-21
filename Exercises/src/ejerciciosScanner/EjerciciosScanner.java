package ejerciciosScanner;

import java.util.Scanner;

public class EjerciciosScanner {

	public static void main(String[] args) {
		
		//Pedimos un número al user
		System.out.println("Por favor, introduce el número del ejercicio que quieras hacer:");
		
		// Comprobamos con un try si el user introduce un byte, sino dará error
		try (Scanner sc = new Scanner(System.in)) {
			
			// Leemos el byte introducido y lo guardamos en la variable numeroEjercicio
			byte numeroEjercicio = sc.nextByte();
			
			//Según el número llamaremos a un metodo ejercicio u otro
			if (numeroEjercicio == 1) {
				
				ejercicio1();
				
			} else if (numeroEjercicio == 2) {
				
				ejercicio2();
				
			} else if (numeroEjercicio == 3) {
				
				ejercicio3();
				
			} else if (numeroEjercicio == 4) {
				
				ejercicio4();
				
			}
			
			
			
		}catch(Exception e) {		//Si ocurre un error al leer el byte, se producira el siguiente código
			
			System.out.println("Something unexpected happened");
	
		}
		
		
		
		
		

	}
	
	//Diseña un programa que pida un número al usuario y a continuación lo muestre.
	public static void ejercicio1() {
		
		//Pedimos un número al usuario
		System.out.println("Introduzca un número");
		
		//Iniciamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Guardamos lo leido en una variable
		long number = sc.nextLong();
		
		//Imprimimos el número por consola
		System.out.println("Tu número es:"+number);
		
		//Cerramos el scanner
		sc.close();
	}
	
	
	//Pedir al usuario su edad y mostrar la que tendrá el próximo año.
	public static void ejercicio2(){
		
		//Pedimos la edad al usuario
		System.out.println("Introduzca su edad:");
		
		//Iniciamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Guardamos la variable y sumamos uno
		long edad = sc.nextLong();
		
		long edadAfter = edad + 1;
		
		//Imprimimos edad que tendrá el proximo año
		System.out.println("El año terrícola que viene tendrás: " + edadAfter);
		
		//Cerramos el Scanner
		sc.close();
		
	}
	
	//Escribir una aplicación que pida el año actual y el año de nacimiento del usuario. Debe calcular su edad.
	public static void ejercicio3() {
		
		//Iniciamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos datos y abrimos el Scanner
		System.out.println("Introduzca el año actual");
		
		long añoActual = sc.nextLong();
		
		System.out.println("Introduce año de nacimiento");
		
		long añoNacimiento = sc.nextLong();
		
		//Calculamos diferencia
		
		long diferencia = añoActual - añoNacimiento;
		
		//Imprimimos y cerramos Scanner
		
		System.out.println("Prbablemente tengas " + diferencia + " años.");
		
		sc.close();
		
	}
	
	//Crear una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la nota media puede tener decimales.
	public static void ejercicio4(){
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		//Pedimos números y los guardamos
		System.out.println("Introduzca números. Max 100 números.");
		
		//Si no se escribe esc, va a ver un bucle de coger números
			//Se crea una array que guarde los números
		long[] myArray = new long[100];
		
		int counter = 0;
		
		byte continuacion = 1;	//Variable auxiliar para parar el programa
		
		long myNumber = sc.nextLong();
		
		for (int i = 0; continuacion != 0; ++i) {
			
			myArray[i] = myNumber;
			
			myNumber = sc.nextLong();
			
			System.out.println(myArray[i]);
			
			//Preguntamos si continuamos
			System.out.print("Continuación? (1-yes/0-no) ");
			continuacion = scString.nextByte();
			
			counter = i+1;
			System.out.println("Counter= "+counter);
			
		}
		
		long mySum = 0; //La suma de los numeros
		
		//Ahora necesitamos un bucle para hacer la media de tantos números
		for (int i = 0; i == counter; ++i) {
			
			mySum = mySum + myArray[i];
			
			///Test///
			System.out.println("mySum= "+mySum);
			///\Test///
		}
		
		long myMedia = mySum/counter;
		
		//Imprimimos y cerramos
		System.out.println("Su media aritmética es: "+ myMedia);
		
	}
	
}
