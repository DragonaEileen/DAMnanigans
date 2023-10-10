package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Escribe un algoritmo que le pida al usuario dos números. A continuación debe
	 * mostrar el siguiente menú por pantalla: SUMAR LOS NÚMEROS RESTAR LOS NÚMEROS
	 * MULTIPLICAR LOS NÚMEROS DIVIDIR LOS NÚMEROS Después, el algoritmo debe
	 * pedirle al usuario que seleccione una opción y que haga la operación que
	 * marca esa opción, mostrando por último el resultado de la operación elegida
	 * por el usuario. Si el usuario elige una opción incorrecta, el algoritmo se lo
	 * hace saber al usuario y no haría nada.
	 */

	public static void main(String[] args) {

		// Variable declaration
		// Los numeros a pedir, que pueden ser decimales
		double numie1;
		double numie2;
		// El numero resultado
		double res;
		// La opcón elegida (Sumar (1), etc.)
		int opcion;

		// Abrimos Scanner
		Scanner sc = new Scanner(System.in);

		// Data recollection
		System.out.println("Alexa play Despacito...\r\n" + "Sí, sabes que ya llevo un rato mirándote\r\n"
				+ "Tengo que bailar contigo hoy (DY)\r\n" + "Vi que tu mirada ya estaba llamándome\r\n"
				+ "Muéstrame los dos numeros que yo voy a hacer una operación");

		// First numie
		System.out.print("Oh, tú, tú eres el imán numero: ");
		numie1 = sc.nextDouble();

		// Second numie
		System.out.print("Y yo soy el metal numero: ");
		numie2 = sc.nextDouble();

		// Opcion
		System.out.println("Me voy acercando y voy armando el plan\r\n"
				+ "Solo con (1)SUMARLO se acelera el pulso (oh yeah)\r\n"
				+ "Ya, ya me estás (2)RESTANDO más de lo normal\r\n" + "Todos mis sentidos van (3)MULTIPLICANDO más\r\n"
				+ "Esto hay que (4)DIVIDIRLO sin ningún apuro");
		opcion = sc.nextInt();

		// Estribillo
		switch (opcion) { // Segun la opcion elegida sumara (caso 1), restará (caso 2), multiplicara(case
							// 3) o dividira (caso 4)
		case 1:

			res = numie1 + numie2;

			System.out.println("Pasito a pasito, suave suavecito (hey yeah, yeah)\r\n"
					+ "Nos vamos pegando, poquito a poquito (oh no)\r\n" + "Que le enseñes a mi boca (uh oh, uh oh)\r\n"
					+ "Tus numero favorito (favorito, favorito baby): " + res);
			break;

		case 2:

			res = numie1 - numie2;

			System.out.println("Pasito a pasito, suave suavecito (hey yeah, yeah)\r\n"
					+ "Nos vamos pegando, poquito a poquito (oh no)\r\n" + "Que le enseñes a mi boca (uh oh, uh oh)\r\n"
					+ "Tus numero favorito (favorito, favorito baby): " + res);
			break;

		case 3:

			res = numie1 * numie2;

			System.out.println("Pasito a pasito, suave suavecito (hey yeah, yeah)\r\n"
					+ "Nos vamos pegando, poquito a poquito (oh no)\r\n" + "Que le enseñes a mi boca (uh oh, uh oh)\r\n"
					+ "Tus numero favorito (favorito, favorito baby): " + res);
			break;

		case 4:

			res = numie1 / numie2;

			System.out.println("Pasito a pasito, suave suavecito (hey yeah, yeah)\r\n"
					+ "Nos vamos pegando, poquito a poquito (oh no)\r\n" + "Que le enseñes a mi boca (uh oh, uh oh)\r\n"
					+ "Tus numero favorito (favorito, favorito baby): " + res);
			break;

		default:
			System.out.println("Despacito");
		}

		// Cerramos scanner
		sc.close();

	}

}
