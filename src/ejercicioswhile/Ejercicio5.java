package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

	/*Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero). 
	 * Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, 
	 * la media de los números negativos y el número de ceros que ha introducido el usuario.*/
	
	public static void main(String[] args) {
		
		//Declaration Variables
			//Counter hasta 10
		int counterTen = 0;
			//Numero a introducir
		int numero;
			//Sumación positivos
		int suma = 0;
			//Counter y suma negativos
		int negativeSuma = 0;
		int counterNegative = 0;
			//Counter de 0s
		int counterZero = 0;
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("Estos son los números que vamos a aprender\r\n"
				+ "Tenemos que estudiarlos al derecho y al revés\r\n"
				+ "Estos son los números que vamos a aprender\r\n"
				+ "Tenemos que estudiarlos al derecho y al revés");
			//Getting numero
		System.out.print("¿Que número vamos a estudiar? El número ");
		numero = sc.nextInt();
		
		//AlgoRHYTHM
		while (counterTen <= 10) {	//Mientras que el contador sea menor de 10 pues se hace la cosa
			
			if(numero == 0) {		//Si el numero es 0
				
				counterZero = counterZero + 1;
				
			} else if (numero > 0) {	//Si el numero es positivo
				
				suma = suma + numero;
				
			}else {
				
				negativeSuma = negativeSuma + numero;
				
				counterNegative = counterNegative + 1;
				
			}
			
			//Request
			System.out.print("¿Que número vamos a estudiar? El número ");
			numero = sc.nextInt();
			
			//Sumamos counterTen
			counterTen = counterTen + 1;
			
		}	//Fin del while
		
		//Answer
		System.out.println("El uno es como un palito\r\n"
				+ "El dos es como un patito\r\n"
				+ "El tres, la E al revés\r\n"
				+ "El cuatro una silla es\r\n"
				+ "El cinco es la boca del sapo\r\n"
				+ "El seis, la cola del gato\r\n"
				+ "El siete, ¡qué raro es!\r\n"
				+ "El ocho, los lentes de Andrés\r\n"
				+ "Casi me olvido del nueve y del diez\r\n"
				+ "¡Oh, mamma mia!, qué difícil es");
		
		//IF PARA QUE NO ACABEMOS DIVIDIENDO ENTRE ZERO en la media de numeros negativos
		if (counterNegative != 0) { 
			System.out.println("El numero de ceros es " + counterZero + ". Y la suma de los positivos es " + suma + ". Y la media de los negativos es "
					+ negativeSuma/counterNegative);
		}else {
			System.out.println("El numero de ceros es " + counterZero + ". Y la suma de los positivos es " + suma + ". Y la media de los negativos es 0");
		}
		
		//Cerramos Scannerç
		sc.close();
		
	}

}
