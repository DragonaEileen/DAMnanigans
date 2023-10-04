package tema2;

import java.util.Scanner;

public class Ejercicio7Version2 {


	/*Escribir una aplicación que indique cuántas cifras tiene un número introducido por teclado, 
	 *que está comprendido entre 0 y 99.999. */

	public static void main(String[] args) {

		//Variable declaration
			//Number to be read
		int num;
		
		//Scanner opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("Elmo is here again!! Elmo wants to know how many characters are in a number, let's get cracking!!");
		
			//Num
		System.out.print("Elmo can only count to 4, so you'll help Elmo with this!! But Elmo reads it has to be a number in between 0 and 99999. You got this!!");
		num = sc.nextInt();
		
		//Elmo's Coding Book
		if (num < 0 || num > 99999) {	//The number has to be comprehended between 0 and 99999
			
			System.out.println("Nice joke!! But Elmo has told you Elmo needs a number in between 0 an 99999 :( --> >:(");
			
		}else {
			
			//We are gonna see if the numbers are between 0 and 10 (one int character)or 10 and 100 (two int characters)
			if(num < 10) {
				
				System.out.println("Elmo thinks that there's 1 integer character.");
				
			}else if (num < 100){
				
				System.out.println("Elmo thinks that there's 2 integers characters.");
				
			}else if (num < 1000){
				
				System.out.println("Elmo thinks that there's 3 integers characters.");
				
			}else if (num < 10000){
				
				System.out.println("Elmo thinks that there's 4 integers characters.");
				
			}else if (num < 100000){
				
				System.out.println("Elmo thinks that there's 5 integers characters.");
				
			}
			
		}
		
		//Scanner Closing
		sc.close();
		
	}

}