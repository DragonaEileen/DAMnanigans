package ejerciciosScanner;

import java.util.Locale;
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
				
			} else if (numeroEjercicio == 5) {
				
				ejercicio5();
				
			} else if (numeroEjercicio == 6) {
				
				ejercicio6();
				
			} else if (numeroEjercicio == 7) {
				
				ejercicio7();
				
			} else if (numeroEjercicio == 8) {
				
				ejercicio8();
				
			} else if (numeroEjercicio == 9) {
				
				ejercicio9();
				
			} else if (numeroEjercicio == 10) {
				
				ejercicio10();
				
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
		
		System.out.println("Probablemente tengas " + diferencia + " años.");
		
		sc.close();
		
	}
	
	//Crear una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la nota media puede tener decimales.
	public static void ejercicio4(){
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		sc.useLocale(Locale.US);
		
		//Pedimos números y los guardamos
		System.out.println("Introduzca números. Max 100 números.");
		
		double mySum = 0;
		long counter = 0;
		
		byte continuacion = 1;
		
		for (int i=0; continuacion == 1; ++i){
			
			System.out.print("Número "+i+ ": ");
			
			mySum += sc.nextDouble(); //"a += b" es igual a "a = a + b"
			counter = counter + 1;
			
			System.out.print("Continue?(1-yes)");
			
			continuacion = scString.nextByte();
			
		}
		
		
		double myMedia = mySum/counter;
		
		//Imprimimos y cerramos
		System.out.println("Su media aritmética es: "+ myMedia);
		sc.close();
		scString.close();
		
	}
	
	//Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el usuario debe introducir el radio, que puede contener decimales. Usa Math.PI para tomar el valor de PI. (longitud = 2πr, área=πr2)
	public static void ejercicio5() {
		
		//Declarar variables sin definicion.
		
		//Iniciar el escaner
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // Localizacion US
		
		//Introduccion de datos
		System.out.print("Introduzca usted el radio: ");
		
		double radio = sc.nextDouble();
		
		//Test
		System.out.println("Radio seleccionado igual a "+ radio);
		//\Test
		
		//Calculo de la longitud
		
		double longitud = 2 * Math.PI * radio;
		
		//Calculo del area
		
		double area = Math.PI * Math.pow(radio, 2);
		
		//Imprimir y cerrar scanner
		System.out.print("Su longitud es igual a " + longitud + " . Y su area es igual a " + area);
		sc.close();
	
	}
	
	//Escribir un programa que le pida dos números al usuario. A continuación, debe mostrar la suma, la resta, la multiplicación y la división de ambos números. Debe mostrarse el resultado de cada operación en una línea distinta.
	public static void ejercicio6() {
		
		// SCANNER DEPLOYMENT
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		//Pedir datos
		System.out.print("Gimme num 1: ");
		
		long num1 = sc.nextLong();
		
		System.out.print("Gimme num toooo: ");
		
		long num2 = sc.nextLong();
		
		//Magia matematica
		long sum = num1 + num2;
		
		long reverseMath = num1 - num2;
		
		long xMath = num1*num2;
		
		long hardMath = num1/num2;
		
		System.out.println("HAHA, naw SUM: "+ num1 + "+" + num2 + "="+ sum);
		System.out.println("THEN, reverse math: "+ num1 + "-" + num2 + "="+ reverseMath);
		System.out.println("AND, x power comes: "+ num1 + "*" + num2 + "="+ xMath);
		System.out.println("AT LAST, HARD MATH: "+ num1 + "/" + num2 + "="+ hardMath);
		
		//Cerramos
		sc.close();
		
	}
	
	//Escribir un programa que le pida al usuario su nombre, dirección y teléfono. Guarda cada dato en variables distintas. A continuación, muestra los datos de la siguiente forma (en rojo serían los datos introducidos por el usuario):
	//Nombre: Elena
	//Dirección: Calle Inventada
	//Teléfono: 987654321
	public static void ejercicio7() {
		
		//Iniciamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos y guardamos datos
		System.out.print("Nombre del sujeto: ");
		String name = sc.nextLine();
		
		System.out.print("Dirección del sujeto: ");
		String address = sc.nextLine();
		
		System.out.print("Celular del sujeto: ");
		String telephoneNumber = sc.nextLine();
		
		//Mostramos por pantalla
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + address);
		System.out.println("Teléfono: " + telephoneNumber);
		
		//Sc.close()
		sc.close();
		
	}
	
	//Escribe un programa que pida al usuario su nombre y su edad y muestre por pantalla el siguiente mensaje: “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. Los datos en rojo son los datos introducidos por el usuario.
	public static void ejercicio8(){
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Preguntamos y guardamos los datos
		System.out.print("Introduce tu nombre: ");
		String name = sc.nextLine();
		
		System.out.print("Introduce tu edad: ");
		byte edad = sc.nextByte();
		
		//Imprimimos y cerramos scanner
		System.out.print("Hola " + name + ", tienes " + edad + " años, con lo mayor que eres, ¡podrías ser una reliquia en un museo!");
		sc.close();
		
	}
	
	//Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado de la conversión.(1€ = 166 ptas)
	public static void ejercicio9(){
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		//Pedimos data y la guardamos
		System.out.print("Introduce las pesetas que quieres cambiar a euros: ");
		double dineroEnPesetas = sc.nextDouble();
		
		//Convertimos a peseta
		
		double dineroEnEuros = dineroEnPesetas/166;
		
		//Imprimimos y cerramos
		System.out.print("Su dinero en pesetas es igual a " + dineroEnEuros + " euros.");
		sc.close();
		
	}
	
	//Escribe un programa en el que declares una constante IVA de valor igual a 21. A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
	public static void ejercicio10(){
		
		//Iniciamos Scanner y definimos constantes
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		final double ivaMultiplier = 0.21; 
		
		//Pedimos precio
		System.out.print("Calculadora de IVA, ¿digamé? Introduzca su precio a IVAlizar: ");
		double precio = sc.nextDouble();
		
		//Calculos
		double precioConIVA = precio - (precio*ivaMultiplier);
		
		//Impresion y cierre
		System.out.print("El precio final será: " + precioConIVA);
		sc.close();
		
	}
	
}
