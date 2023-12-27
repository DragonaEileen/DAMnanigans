package items;

/**
 * La clase Apple es un Item-Consumable, es decir, se puede consumir, al consumir 
 * nos dará el efecto de curar X HP
 * 
 * @author Eileen
 * 
 */

public class Apple extends Consumable{
	
	/* Atributos */
	
	/**
	 * Numero de HP que cura la Apple
	 */
	final private int HEALING_STAT = 1;
	
	/* Constructor */
		/* SIN Parametros */
	public Apple(){
		
		name = "Apple";
		
		description = "The round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh.";
		
	}
	
	/* Methods */
	
	/** 
	 * La Función efecto de Apple sumará a la vida de la Creature que lo consuma un +X
	 * 
	 * @param creature Criatura introducida por parámetro
	 * @return void
	 */
	void effect(creatures.Creature creature ) {
		
		creature.heal(HEALING_STAT);
		
	}//Fin effect()

}
