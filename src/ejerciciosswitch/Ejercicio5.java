package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*Queremos saber, una vez introducido un carnet de conducir, a qué corresponde. Sabiendo:
      a) E: remolques.
      b) D: autobuses.
      c) C1-C5: camiones.
      d) A: motocicletas.
      e) B1-B2: automóviles.
      f) En caso de introducir uno distinto: “Categoría no contemplada”.
*/

	public static void main(String[] args) {

		//Variable Declaration
		String carnet;
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Data recollection
		System.out.println("Que me dices, que necesito un carnet para llevar a 10 spooky scary skeletons??");
			//Carnet
		System.out.print("Si yo tengo un carnet de: ");
		carnet = sc.next();
		
		//Algorithm switch
		
		switch (carnet) {
			case "E":
				System.out.println("Con este carnet puedo llevar remolques.");
		}
		
	}

}
