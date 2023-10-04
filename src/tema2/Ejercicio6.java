package tema2;

import java.util.Scanner;

public class Ejercicio6 {

	/*Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. 
	 * Si no existen, habrá que indicarlo. Hay que tener en cuenta que las soluciones de una 
	 * ecuación de segundo grado: ax2 + bx + c = 0
	 */
	
	public static void main(String[] args) {

		//Declaración de variables
			//Coeficientes
		double a;
		double b;
		double c;
			//La(s) incognita(s)
		double x1;
		double x2;
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("HELLO, this one is Elmo!! Elmo is gonna teach you how to do a second grade equation, haha!! ");
		
			//First variable
		System.out.print("First Elmo wants you to think about a number 'a' hmmmmm[thinking noises]");
		a = sc.nextDouble();
		
			//Second Variable
		System.out.print("Elmo's second step is to think of a number 'b' haha!!");
		b = sc.nextDouble();
		
			//Third Variable
		System.out.print("Elmo's book says that the last step is to think of a number 'c' hmmmm [more thinking noises]");
		c = sc.nextDouble();
		
		//Elmo's Math Book
			//Elmo's book says that the result inside the square root can't be negative, and also that number 'a' can't be 0
			//In case a = 0, an equation of first grade is done.
		
		if (Math.pow(b, 2)< 4*a*c) {		//If the result inside the square root is negative, meaning, b^2 is lesser than 4ac, the equation can't be doner
			
			//Answer if that's the case
			System.out.println("[Elmo gasps] Elmo is surprised!! The number inside the root square is negative!! That means the equation can't be done. [crazy eyes Elmo]");
			
		} else if (a == 0) {				//If a equals 0, then the equation converts into a first grade equation.
			
			System.out.println("Elmo is astonished!! With 'a' being 0, a*x^2 will be 0, so we have a first grade equation, that's definitely easier!!");
			
			//Math: bx + c = 0; bx = -c; x = -c/b 
			x1 = (-c)/b;
			
			//Answer
			System.out.print("Elmo has it!! Elmo has it!! The x is [drum rolls]... " + x1 + " !! Hahaha!! That was fun!");
		
		}else {
			
			//Math
			x1 = (-b + Math.sqrt( Math.pow(b, 2) - 4*a*c ))/2*a;	//The adding part
			
			x2 = (-b - Math.sqrt( Math.pow(b, 2) - 4*a*c ))/2*a;	//The reverse math part
			
			//Answer
			System.out.println("[Panting]Elmo... Ooof... Elmo has done it... Ooof... The 'x' would be " + x1 + " if we add, and " + x2 + " if we subtract it!! Aaaah... Elmo is tired.");
		
		}
		
		//Cerramos scanner
		sc.close();
		
	}

}
