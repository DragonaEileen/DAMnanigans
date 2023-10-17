package ejerciciosdowhile;

public class Ejercicio1 {
	
	/*Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).
	 */

	public static void main(String[] args) {
		
		//Variables
			//En aux se guardan los numeros naturales
		int aux = 1;


		//Do While. Printeara los 20 primeros numeros naturales
		do {
			
			//Respuesta
			System.out.println(aux);
			
			//Repetitividor
			aux=aux+1;
			
		}while (aux <= 20);
		
	}

}
