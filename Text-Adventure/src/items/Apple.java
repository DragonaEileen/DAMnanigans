package items;

public class Apple extends Consumable{

	protected static String nombre = "Applebee";
	
	
	public Apple(){
		
		name = "Apple";
		
		description = "The round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh.";
		
	}
	
	public static void callApple() {
		System.out.println(nombre);
	}
	
}
