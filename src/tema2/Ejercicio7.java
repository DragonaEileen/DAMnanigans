package tema2;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*Escribir una aplicación que indique cuántas cifras tiene un número introducido por teclado, 
	 *que está comprendido entre 0 y 99.999. */

	public static void main(String[] args) {

		//Variable declaration
			//Number to be read
		double num;
			//Integer and float for auxiliary reasons
		int auxInt;
		double auxDouble;
		
		//Scanner opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("Elmo is here again!! Elmo wants to know how many characters are in a number, let's get cracking!!");
		
			//Num
		System.out.print("Elmo can only count to 4, so you'll help Elmo with this!! But Elmo reads it has to be a number in between 0 and 99.999. You got this!!");
		num = sc.nextFloat();
		
		//Elmo's Coding Book
		if (num < 0 || num > 99.999) {	//The number has to be comprehended between 0 and 99.999
			
			System.out.println("Nice joke!! But Elmo has told you Elmo needs a number in between 0 an 99.999 :( --> >:(");
			
		}else {
			
			//With the following casting and subtraction we have exiled the decimals in auxFloat
			auxInt = (int) num;
			auxDouble = num - auxInt;
			
			//Test
			System.out.println("Print: "+num);
			//\Test
			
			//We are gonna see if the numbers are between 0 and 10 (one int character)or 10 and 100 (two int characters)
			if(auxInt < 10) {
				
				System.out.println("Elmo thinks that there's 1 integer character.");
				
			}else {
				
				System.out.println("Elmo thinks that there's 2 integers characters.");
				
			}
			
			//Now we do the same with the decimals. If it's between 0 and 0.099, then one character. If it's between 0.1 and 0.009, then 2 characters. Else is 3.
			if (auxDouble == 0) {
				
				System.out.println("And Elmo thinks that there's 0 decimal character.");
				
			} else if(auxDouble*10 >= ((int)auxDouble)*10) {
				
				System.out.println("And Elmo thinks that there's 1 decimal character.");
				
			}else if(auxDouble*100 >= ((int)auxDouble)*100){
				
				System.out.println("And Elmo thinks that there's 2 decimal character.");
				
			}else if (auxDouble*1000 >= ((int)auxDouble)*1000){
				
				System.out.println("And Elmo thinks that there's 3 decimal character.");
				
			}
			
		}
		
		//Scanner Closing
		sc.close();
		
	}

}
