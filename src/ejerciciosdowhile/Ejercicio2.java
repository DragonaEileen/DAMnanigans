package ejerciciosdowhile;

public class Ejercicio2 {
	
	/*Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.*/

	public static void main(String[] args) {
		
		//Variables
		int aux = 1;
		
		//Do While. Usaremos el modulo de 2 (%2==0) para buscar los pares
		do {
			
			if (aux%2 == 0) {
				
				//Respuesta
				System.out.println(aux);
				
			}
			
			//Repetitividor
			aux = aux + 1;
			
		}while(aux <= 200);
		
	}

}
