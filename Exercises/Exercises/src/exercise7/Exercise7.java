package exercise7;

import java.util.Scanner;

public class Exercise7 {
	
	private static Scanner sc = null;
	
	/* static byte myScannerMethod() {	// Llama al escaner para cojer una opción
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("1: Cuadrado; 2: Diamante");
			
			byte response = sc.nextByte();
			
			sc.close();
			
			return response;
			
			} catch (Exception e) {
			
			System.out.println("Something went wrong.");
			
			myScannerMethod();
		}
	}
	*/
	static void myChoiceMethod() { 	//Elije una de las dos funciones de creacion según la opción elegida
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write 1 or 2");
		
		byte option = sc.nextByte();	
		
		if (option == 1) {
			mySquareMethod();
		} else if (option == 2) {
			myDiamondMethod();
		}
	}
	
	// El siguiente método cojerá la matriz y pondrá un cuadrado en ella
	static void mySquareMethod() {
		//Necesitamos un patrón. Esta vez no estamos trabajando con objetos, así que un simple print nos valdrá.
		//double ejes = Math.random()*10;
		double ejes = 10;
		
		//El siguiente bucle recorrera el eje Y y el eje X
		for(double y = 0; y < ejes; ++y) {
			for(double x = 0; x < ejes; ++x) {
				
				//Ahora hacemos la forma del cuadrado, si es la primera o última linea, entonces será una linea completa de "|", sino, tendrá brodes al principio y al final de la linea.
				if (y == 0 || y == ejes-1) {
					
					System.out.print("| ");
					
				} else {
					
					//Ahora si es la primera o ultima columna, pondremos un borde, y sino, el otro carácter.
					if (x == 0 || x == ejes-1) {
						
						System.out.print("| ");
						
					} else {
						
						System.out.print("# ");
						
					}
					
				}
			}
			
			// Aquí ponemos el salto de linea
			System.out.println("");
			
		}
	}
	
	// La siguiente función cojerá la matriz y pondrá un diamante en ella
	static void myDiamondMethod() {
		
		double ejes = 10;
		
	}
	
	public static void main(String[] args) {
		
		myChoiceMethod();
		/*
		boolean[] fullLine = {true, true, true, true, true, true, true, true, true};		
		
		boolean[] oneCharacter = {true, false, false, false, false, false, false, false, false};
		
		boolean[][] myMatrix = {fullLine, oneCharacter, fullLine, oneCharacter, fullLine}; 					//Array que contendra la patrona
		
		for (int y = 0; y < myMatrix.length; ++y ) {		// De 0 al final del eje Y de la matriz, va a ir linea por linea
			for (int x = 0; x < myMatrix[y].length; ++x) {	// De 0 al final del eje X de la matriz, va a ir index a index
				if (myMatrix[y][x] == true) {				// En el siguiente if e if else, comprueba el patron contenido en la matriz e imprime * si el index contiene True, y espacio si contiene False 
					System.out.print("*");
				} else if (myMatrix[y][x] == false){
					System.out.print(" ");
				}
			}
			System.out.println("");
		} 
	}*/
	}
}
