package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio8 {

	/*Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol 
	 * más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando 
	 * la introducción de datos cuando se utilice -1 como altura). La aplicación debe devolver la altura del 
	 * árbol más alto.*/
	
	public static void main(String[] args) {
		
		//Variables
		int treeHeight;
			//Variable en la que se guarda el valor mas alto
		int highest = 0;
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data y sysos
		System.out.println("Introduzca altura del arból (-1 para terminar)");
		treeHeight = sc.nextInt();
		
		//While para repetir la entrada de arboles
		while (treeHeight != -1) {
			
			if (treeHeight > highest) {	//Si es mayor el numero introducideo, se sustituye el valor más alto por el nuevo
				
				highest = treeHeight;
				
			}//Fin if
			
			//Repetitividor
			System.out.println("Introduzca altura del arból (-1 para terminar)");
			treeHeight = sc.nextInt();
			
		}//Fin while
		
		//Respuesta
		System.out.println("El más alto mide " + highest);

	}

}
