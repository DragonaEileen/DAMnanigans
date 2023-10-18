package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio8 {

	/*Repetir el ejercicio de los dados del boletín de SWITCH. Mientras en la primera tirada no 
	 * se introduzca un valor válido se le seguirá preguntando. Lo mismo con la segunda tirada.*/
	
	public static void main(String[] args) {

		//Variables
			//Dados
		String dado1 = "";
		String dado2 = "";
			//Dice numbers
		int dado1Int = 0;
		int dado2Int = 0;
		
		
		//Scannercito
		Scanner sc = new Scanner(System.in);
		
		//Do while to test if data introduced is correct on the first die
		
		do {
			
			System.out.print("Gimme die number 1 (Uno-Seis): ");
			dado1 = sc.next();
			
		}while(!dado1.equalsIgnoreCase("Uno") && !dado1.equalsIgnoreCase("Dos") && !dado1.equalsIgnoreCase("Tres") && !dado1.equalsIgnoreCase("Cuatro") && !dado1.equalsIgnoreCase("Cinco") && !dado1.equalsIgnoreCase("Seis"));
		
		//Do while to test if data introduced is correct on the second die
		
		do {
			
			System.out.print("Gimme die number 2 (Uno-Seis): ");
			dado2 = sc.next();
					
		}while(!dado2.equalsIgnoreCase("Uno") && !dado2.equalsIgnoreCase("Dos") && !dado2.equalsIgnoreCase("Tres") && !dado2.equalsIgnoreCase("Cuatro") && !dado2.equalsIgnoreCase("Cinco") && !dado2.equalsIgnoreCase("Seis"));
				
		//Switch time
		switch (dado1) {
		case "uno":
			
			dado1Int = 1;
			break;
			
		case "dos":
			
			dado1Int = 2;
			break;
			
		case "tres":
			
			dado1Int = 3;
			break;
			
		case "cuatro":
			
			dado1Int = 4;
			break;
			
		case "cinco":
			
			dado1Int = 5;
			break;
			
		case "seis":
			
			dado1Int = 6;
			break;
			
		default:
			
			System.out.println("!!!!");
			
		}
		
		switch (dado2) {
		case "uno":
			
			dado2Int = 1;
			break;
			
		case "dos":
			
			dado2Int = 2;
			break;
			
		case "tres":
			
			dado2Int = 3;
			break;
			
		case "cuatro":
			
			dado2Int = 4;
			break;
			
		case "cinco":
			
			dado2Int = 5;
			break;
			
		case "seis":
			
			dado2Int = 6;
			break;
			
		default:
			
			System.out.println("!!!!");
			
		}
		
		//Answer
		System.out.println(dado1Int + dado2Int + " Es la suma de los dados");
		
		//Scannercito 2
		sc.close();
		
	}

}
