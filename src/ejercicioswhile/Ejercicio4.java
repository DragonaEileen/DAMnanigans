package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio4 {

	/*Escribe un programa que vaya pidiendo al usuario números y muestre por pantalla si el número es par o 
	 * impar (indistintamente que sea positivo o negativo). El algoritmo terminará cuando el usuario 
	 * introduzca el número cero.*/
	
	public static void main(String[] args) {

		//Variable declaration
			//Numero a introducir
		int numero;
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("I was exploring an \"Enchanted Wood.\"\r\n"
				+ "A wise fox started talking; I somehow understood.\r\n"
				+ "She asked, “Please, will you join me beneath this pine?\"\r\n"
				+ "She whispered, \"For you, even numbers, I’ll define.”");
		System.out.println("They are zero, two, four, six, and eight.\r\n"
				+ "Even numbers all share one trait.\r\n"
				+ "You can split them down the middle;\r\n"
				+ "if they make pairs, you’ve solved the riddle!\r\n"
				+ "Because one plus one equals two,\r\n"
				+ "and two plus two makes four, it’s true.\r\n"
				+ "Then three plus three equals six,\r\n"
				+ "and four plus four makes eight big sticks!");
			//Getting numero
		System.out.print("''Now present me a number'' said the wise fox, and I said: ");
		numero = sc.nextInt();
		
		//AlgoRHYTHM
		while (numero != 0) {	//Mientras que el numero sea diferente de 0 ira buscando el modulo de 2 para ver si es 0 (par) o no (impar)

			//If para ver el modulo
			if (numero%2 ==0) {
				
				//Answer
				System.out.println("Numbers, big and small....\r\n"
						+ "today we’re gonna count them all!\r\n"
						+ "Some are even; some are odd... This one's EVEN!!!\r\n"
						+ "won’t you join our counting squad!?");
				
				//Request
				System.out.print("''Now present me a number'' said the wise fox, and I said: ");
				numero = sc.nextInt();
				
			} else {
				
				//Answer
				System.out.println("Numbers, big and small....\r\n"
						+ "today we’re gonna count them all!\r\n"
						+ "Some are even; some are odd... This one's ODD!!!\r\n"
						+ "won’t you join our counting squad!?");
				
				//Request
				System.out.print("''Now present me a number'' said the wise fox, and I said: ");
				numero = sc.nextInt();
				
			}
			
		}
		
		//Cerramos Scanner
		sc.close();
		
	}

}
