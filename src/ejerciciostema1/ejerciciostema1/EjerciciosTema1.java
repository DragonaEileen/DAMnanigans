package ejerciciostema1.ejerciciostema1;

import java.util.Scanner;

public class EjerciciosTema1 {

	public static void main(String[] args) {
		
		ejercicio10();
		
		//Test
		/*
		float a = (3660 / 3600)f; 
		System.out.println(a);
		*/
		
	}
	
	/* Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado al entero más 
	 * próximo. (SIN UTILIZAR Math.round()) 
	 */
	public static void ejercicio1() {
		
		//Declaración de variables
		
		double num;		// Variable que guardará el número de entrada decimal
		
		int numInt;	// Variable que guardará el número entero truncado
		
		double numDec; // Variable guardará un numero decimal
		
		int numIntFinal; // Variable que guardará el número entero final
		
		
		//Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos y guardamos datos
		
		System.out.print("Introduce un número con decimales: ");	//Request del número
		
		num = sc.nextDouble();		//Leemos el número introducido y lo guardamos en la variable num
		
		
		//Algoritmo
		
		numInt = (int) num;		// Esto resultará en el número truncado
		
		numDec = num - numInt;	//Esto resultará en solo la parte decimal
		
		numIntFinal = (numDec >= .5)? numInt + 1: numInt;	//Si la parte decimal es mayor que .5, el valor será igual al truncado +1,
			// y si no, será igual al truncado.
		
		
		//Respuesta por consola
		System.out.println("El número decimal redondeado sería igual a: " + numIntFinal);
		
		
		//Cerramos Scanner
		sc.close();		
		
	}
	
	/* Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que 
	 * sea múltiplo de 7. Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. En el caso de 13 
	 * habría que sumarle 1. Usa el operador módulo (%) para calcularlo.
	 */
	public static void ejercicio2() {
		
		//Declaramos variables
		
		final int MULTIPLO = 7; //	Variable que será el multiplo que busquemos. En este problema será 7 
		
		int num;	//	Variable que guardará el número de entrada
		
		int resto;	//	Variable que guardará el resto de dividir num entre 7
		
		int falta;	// 	Variable que guardará el entero que le falta a num para llegar a multiplo de 7
			
		
		//Abrimos el Scanner
		
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos el número y lo guardamos
		
		System.out.print("Num: ");	//Request del número por consola
		
		num = sc.nextInt();				//Leemos el entero y lo guardamos
		
		
		//Algoritmos
		/* Para calcular cuanto falta con una manera de hacerlo con el operador %, tenemos que buscar que el resto de una operación
		 * sea igual a 7, porque entonces se podría volver a dividir por siete y que el resto fuera 0, por tanto siendo múltiplo de 
		 * siete. Por ello buscamos cuanto falta para llegar a ese siete en el resto (una simple resta), y ese será el número que
		 * debemos añadir para que el número inicial sea múltiplo de 7. */
		
		resto = num % MULTIPLO;		// Calculamos el resto de dividir el número de entrada entre 7
		
		falta = MULTIPLO - resto;		// Para averiguar cuanto falta para que el resto llegue a siete hacemos esta operación 
		
		
		//Respuesta por consola
		System.out.print("Al número le faltan " + falta + " para ser múltiplo de " + MULTIPLO + ".");
		
		
		//Cerramos Scanner
		sc.close();
		
	}
	
	/* Modifica el ejercicio anterior para que, indicando dos números, por ejemplo, num1 y num2, diga qué cantidad 
	 * hay que sumarle a num1 para que sea múltiplo de num2. 
	 */
	public static void ejercicio3() {
		
		//Declaramos variables
		
		final int MULTIPLO; //	Variable que será el multiplo que busquemos. En este problema será 7 
		
		int num;	//	Variable que guardará el número de entrada
		
		int resto;	//	Variable que guardará el resto de dividir num entre 7
		
		int falta;	// 	Variable que guardará el entero que le falta a num para llegar a multiplo de 7
			
		
		//Abrimos el Scanner
		
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos los número y lo guardamos
		
		System.out.print("Num1: ");	//Request del número 1 por consola
		
		num = sc.nextInt();				//Leemos el entero y lo guardamos
		
		System.out.print("Num2: ");	//Request del numero 2 por consola
		
		MULTIPLO = sc.nextInt();		//Leemos el entero que vamos a buscar de múltiplo y lo guardamos
		
		
		//Algoritmos
		/* Para calcular cuanto falta con una manera de hacerlo con el operador %, tenemos que buscar que el resto de una operación
		 * sea igual al MULTIPLO, porque entonces se podría volver a dividir por siete y que el resto fuera 0, por tanto siendo múltiplo de 
		 * siete. Por ello buscamos cuanto falta para llegar a ese siete en el resto (una simple resta), y ese será el número que
		 * debemos añadir para que el número inicial sea múltiplo de MULTIPLO. */
		
		resto = num % MULTIPLO;		// Calculamos el resto de dividir el número de entrada entre 7
		
		falta = MULTIPLO - resto;		// Para averiguar cuanto falta para que el resto llegue a siete hacemos esta operación 
		
		
		//Respuesta por consola
		System.out.print("Al número le faltan " + falta + " para ser múltiplo de " + MULTIPLO + ".");
		
		
		//Cerramos Scanner
		sc.close();
		
	}
	
	/* Crea un programa que pida la base y la altura de un triángulo y muestre su área. (AT = base*altura/2)
	 */
	public static void ejercicio4(){
		
		//Declaramos Variables
		
		double base;	//Variable que guardará la base
		
		double altura;	//Variable que guardará la altura
		
		double area;	//Variable que guardará el area
		
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos y guardamos datos
		
		System.out.print("Gimme base: ");	//Pedimos la base
		
		base = sc.nextDouble();		//Leemos la base y la guardamos en "base"
		
		System.out.print("Gimme altura: ");	//Pedimos la altura
		
		altura = sc.nextDouble(); 	//Leemos la altura y la guardamos en "altura"
		
		
		//Algoritmo
		
		area = (base*altura)/2;		//Area Triángulo = base*altura/2
		
		
		//Respuesta por Consola
		System.out.println("La magia indica que el area es igual a " + area + " nosequemetros^2");
		
		
		//Cerramos Scanner
		sc.close();
		
	}
	
	/* Dado el siguiente polinomio de segundo grado: 
	 * y=ax2+bx+c
	 * Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
	 *  correspondiente de y.
	 */
	public static void ejercicio5(){
		
		//Declaramos variables
		
		double a; 	//La variable correspondiente al coeficiente a
		
		double b; 	//La variable correspondiente al coeficiente b
		
		double c; 	//La variable correspondiente al coeficiente c
		
		double x; 	//La variable correspondiente al valor x
		
		double y; 	//La variable correspondiente al valor y
		
		
		//Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos y guardamos data
		
		System.out.print("Dame a: ");	//Pedimos la variable a
		
		a = sc.nextDouble();	//Leemos y guardamos la variable correspondiente
		
		System.out.print("Dame b: ");	//Pedimos la variable b
		
		b = sc.nextDouble();	//Leemos y guardamos la variable correspondiente
		
		System.out.print("Dame c: ");	//Pedimos la variable c
		
		c = sc.nextDouble();	//Leemos y guardamos la variable correspondiente
		
		System.out.print("Dame x: ");	//Pedimos la variable x
		
		x = sc.nextDouble();	//Leemos y guardamos la variable correspondiente
		

		//Algoritmo
		
		y = (a*Math.pow(x, 2)) + (b*x) + c;		// Operación indicada en el título del problema. Parentesís para easy-reading
		
		
		//Respuesta
		
		System.out.println("Según el polinomio y=ax2+bx+c junto a los valores dados, y será igual a " + y);
		
		
		//Cerramos Scanner
		sc.close();
		
	}
	
	/* Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. La aplicación 
	 * debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario. 
	 */
	public static void ejercicio6() {
		
		//Declaramos variables
		
		long segundos;		// Variable que guardará los segundos a introducir
		
		double minutos;		// Variable que guardará los minutos traducidos de los segundos
		
		int minutosInt; 		// Variable que guardará el entero de los minutos 
		
		double horas;			// Variable que guardará las horas traducidas de los segundos
		
		int horasInt; 			// Variable que guardará el entero de las horas 
		
		int segundosFinal; 		// Variable que guardará los segundos que les sobren a las horas y minutos
		
		
		//Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos y guardamos data
		
		System.out.print("Gimme time seconds: ");		//Pedimos los segundos a introducir por consola
		
		segundos = sc.nextLong();		//Leemos y guardamos los segundos introducidos
		
		
		//Algoritmo: Eileen
		/* Para calcular las horas vamos a proceder a dividir los segundos entre 3600. Luego con el resto o los 
		 * decimales de las horas los multiplicamos por 60 y nos dan los minutos. Con los decimales de los minutos
		 * simplemente los volvemos a multiplicar y estamos donette 
		 */
		
		horas = (double) segundos / 3600;	//1 hora es igual a 3600 segundos
		
		//Test
		System.out.println(segundos + " - " + horas);
		//\Test
		
		horasInt = (int) horas;		//Lo pasamos a entero		
		
		minutos = (horas - horasInt) * 60;	//1 hora son 60 minutos
		
		minutosInt = (int) minutos;	//Lo pasamos a entero
		
		segundosFinal = (int) ((minutos - minutosInt) * 60); //1 minuto son 60 seggundos
		
		
		//Algoritmo 2: Resto
		/* Se trata de usar el resto e ir dividiendolo */
		/*
		
		horasInt = (int) segundos / 3600;		//Las horas
		
		horas = segundos % 3600;				//El resto
		
 		minutosInt = (int) horas / 60;			//Los minutos
 		
 		segundosFinal = (int) ((horas / 60) % 60);			//Los segundos
		*/
		
		//Respuesta
		System.out.print("En el número introducido de segundos hay " + horasInt + " horas, " + minutosInt + " minutos y " + segundosFinal + " segundos.");
		
		
		//Cerramos Scanner
		sc.close();
		
	}
	
	/* Solicita al usuario tres distancias:
	 * La primera, medida en milímetros.
	 * La segunda, medida en centímetros.
	 * La última, medida en metros.
	 * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
	 */
	public static void ejercicio7() {
		
		//Declaramos variables
		
		double mili;	//La variable que guardará los milimetros
		
		double centi;	//La variable que guardará los centimetros
		
		double meter;	//La variable que guardará los metros
		
		double miliToCenti;	//La variable que guardará los milimetros en centimetros
			
		double meterToCenti;	//La variable que guardará los metros en centimetros
		
		double total;	//La variable que guardará el total de centimetros
		
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos datos
		System.out.print("Dame milimetros: ");		//Pedimos los datos apropiados
		
		mili = sc.nextDouble();		//Leemos y guardamos los datos
		
		System.out.print("Dame centimetros: ");		//Pedimos los datos apropiados
		
		centi = sc.nextDouble();	//Leemos y guardamos los datos
		
		System.out.print("Dame metros: ");			//Pedimos los datos apropiados
		
		meter = sc.nextDouble();	//Leemos y guardamos los datos
		
		
		//Algoritmo
		/* Transformamos los metros y milimetros a centimetros. Luego sumamos*/
		
		miliToCenti = mili * 10;		//1 centimetro son 10 milimetros
		
		meterToCenti = meter / 100;		//1 metro son 100 centimetros
		
		total = miliToCenti + centi + meterToCenti;		//La suma de todo
		
		
		//Respuesta
		System.out.println("El total en centimetros es " + total);
		
		
		//Cerramos scanner
		sc.close();
		
	}
	
	/* Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular 
	 * el importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número 
	 * será introducido por el usuario). Existen dos tipos de entradas: infantiles, que cuestan 15,50€; 
	 * y de adultos, que cuestan 20€. En el caso de que el importe total sea igual o superior a 100€, 
	 * se aplicará automáticamente un bono descuento del 5%.
	 */
	public static void ejercicio8() {
		
		//Declaramos variables
		
		final float PRECIO_ADULTO = 20f;			//Constante correspondiente al precio de las entradas adultas
		
		final float PRECIO_INFANTIL = 15.50f;	//Constante correspondiente al precio de las entradas infantiles
		
		final float THRESHOLD_DESCUENTO = 100f;	//Constante que indicará a partir de que precio se da el descuento
		
		final float DESCUENTO = .05f;		//Constante que indica el descuento
		
		int numEntradasAdulto; 	//Entero que guardará el numero de entradas adultas compradas
		
		int numEntradasInfantil; 	//Entero que guardará el numero de entradas infantiles compradas
		
		float precioEntradasAdulto;		//Total correspondiente al dinero total de las entradas adultas
		
		float precioEntradasInfantil;	//Total correspondiente al dinero total de las entradas infantiles
		
		float precioPreDescuento;		//Precio total pre-descuento
		
		float precioPostDescuento;		//Precio total post-descuento (si no hay descuento será igual que pre-descuento)
		
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos datos
		System.out.print("Num Entradas Adulto: ");		//Pedimos el numero de entradas de adulto
		
		numEntradasAdulto = sc.nextInt();		//Leemos y guardamos en la variable correspondiente
		
		System.out.print("Num Entradas Infantil: ");		//Pedimos el numero de entradas infantiles	
		
		numEntradasInfantil = sc.nextInt();		//Leemos y guardamos en la variable correspondiente
		
		
		//Cálculos
		/*Calculamos el valor total de cada tipo de entrada por su lado, luego los sumamos y comprobamos 
		 * si es mayor del threshold de descuento y aplicamos el descuento*/
		
		precioEntradasAdulto = numEntradasAdulto * PRECIO_ADULTO;	//Numero de entradas por su precio
		
		precioEntradasInfantil = numEntradasInfantil * PRECIO_INFANTIL; //Numero de entradas por su precio
		
		precioPreDescuento = precioEntradasAdulto + precioEntradasInfantil; //Sumamos
		
		//Test//
		System.out.println(precioPreDescuento);
		//\Test//
		
		
		//Si el predescuento es mayor o igual que el threshold aplicamos el descuento.
		precioPostDescuento = (precioPreDescuento >= THRESHOLD_DESCUENTO)? precioPreDescuento - precioPreDescuento*DESCUENTO: precioPreDescuento;
		
		
		//Respuesta
		System.out.println("El precio total será " + precioPostDescuento);
		
		
		//Cerramos Scanner
		sc.close();
		
	}
	
	/* Pide dos números al usuario. Deberá mostrarse true si ambos números son iguales y false en caso contrario.*/
	public static void ejercicio9() {
		
		//Declaramos variables
		
		long num1;		//Primer numero
		
		long num2;		//Segundo numero
		
		boolean res;	//Respuesta
		
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos datos
		
		System.out.print("Num1: ");		//Pedimos el primer numero
		
		num1 = sc.nextLong();		//Leemos y guardamos el primer numero
		
		System.out.print("Num2: ");		//Pedimos el segundo numero
		
		num2 = sc.nextLong();		//Leemos y guardamos el segundo numero
		
		
		//Algoritmo (Un ternario)
		
		res = (num1 == num2)? true:false;	//Si son iguales es true, y sino es false
		
		
		//Respuesta
		System.out.println("Los numeros son iguales: " + res);
		
		
		//Cerramos Scanner
		sc.close();
		
	}
	
	/* La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada 
	 * participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. 
	 * La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros (con tantos 
	 * decimales como se desee), pero para el ranking solo se tiene en cuenta la longitud en centímetros 
	 * (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se 
	 * contabilizan 1234 cm.
	 * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte 
	 * entera correspondiente en centímetros. Utiliza la conversión de tipos.
	 */
	public static void ejercicio10() {
		
		//Declaramos variables
		
		double meter;		//Variable que guardará los metros
		
		int centimeter;		//Variable que guardará los centimetros
		
		
		//Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos datos
		System.out.print("Gimme meters: ");		//Pedimos los metros
		
		meter = sc.nextDouble();		//Leemos y guardamos los metros
		
		
		//Algoritmo
		/*Pasar a centimetros y casting, no tiene mas misterio*/
		
		centimeter = (int) (meter * 100);
		
		
		//Respuesta
		System.out.println("Son unos " + centimeter + " centímetros");
		
		
		//Cerramos Scanner y nos vamos
		sc.close();
		
	}
}
