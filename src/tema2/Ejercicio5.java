package tema2;

import java.util.Scanner;

public class Ejercicio5 {

	/*Pedir tres números y mostrarlos ordenados de mayor a menor.*/
	
	public static void main(String[] args) {
		
		//Variable declaration
			//Three numies to compare and sort
		long numie1;
		long numie2;
		long numie3;
		
			//Three positions cuz we can't use arrays
		long top;
		long mid;
		long bottom;
		
		//Scanner Opening
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("I at least hope this is making you or smile or hate this character so much :D");
		
			//First numie recollection
		System.out.print("So you gimme first numie: ");
		numie1 = sc.nextLong();
		
			//Second numie recollection
		System.out.print("Then you gimme secondary numie: ");
		numie2 = sc.nextLong();
		
			//Third numie recollection
		System.out.print("And at the end of this silly ass quest, you gimme third-inand numie: ");
		numie3 = sc.nextLong();
		
		//Magical IF spaghetti algorithm
		if (numie1 > numie2) {			//If numie 1 is greater than numie 2 then
			
			if (numie1 > numie3) {		// we'll see if it's also greater than numie 3, then
				
				top = numie1;	// numie 1 will be the greatest number. Then
				
				if (numie2 > numie3) {	// we compare the last two numbers.
					
					mid = numie2;		// If numie 2 is greater than numie 3 it will be the mid one.
					bottom = numie3;	// and the other the lowest.
					
				}else {					//If that's not the case then numie 2 and numie 3 will switch places.
					
					mid = numie3;
					bottom = numie2;
					
				}
				
			} else {					// If numie 1 is not greater than numie 3
										// then, as numie 2 is lesser than numie 2 and the last is lesser than numie 3.
				top = numie3;
				mid = numie1;
				bottom = numie2;
				
			}
			
		} else {						//Now in the case numie 1 is lesser than numie 2 then
			
			if (numie2 > numie3) {		//if numie 2 is higher than numie 3
				
				top = numie2;			// numie 2 is the highest.
				
				if (numie1 > numie3) {	// But we gotta compare the other two.
					
					mid = numie1;		//If numie 1 is greater than numie 3 then it will be the middle one and numie 3 the bottom one
					bottom = numie3;
					
				} else {				// IF NOT then they switch places
					
					mid = numie3;
					bottom = numie1;
					
				}
				
			} else {					//Now if the numie 2 is lesser than numie 3, numie 3 will be the highest, numie 2 the mid, and numie 1, being lesser than numie 2, the mid
				
				top = numie3;
				mid = numie2;
				bottom = numie1;
				
			}					
			
		}		//I think that's all
		
		//Answer
		System.out.println("The numies are ordered in the following way: " + top + " > "+ mid +" > " + bottom );
		
		//Scanner closing
		sc.close();
		
	}

}
