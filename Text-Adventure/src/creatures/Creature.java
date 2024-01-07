package creatures;

/**
 * En la clase Creature guardaremos toda la información común a todas las criaturas: Vida, Ataque, Defensa...
 * Una Criatura se define como una entidad capaz de interactuar con el mundo y sus objetos o entre ellas
 * 
 * @author Eileen
 * 
 */
public class Creature {

	/* Common Stats Between all the creatures */
	/**
	 * Valor actual de puntos de vida o Hit Points
	 */
	protected int hitPoints;
	
	/**
	 * Valor máximo que puede llegar a tomar el atributo hitPoints
	 */
	protected int maxHP;
	
	/**
	 * Valor que afectará a la ofensiva de los objetos tipo criatura
	 */
    protected int atk;
    
    /**
     * Valor que afectará a la defensiva de los objetos tipo criatura
     */
    protected int def;
    
    /* Constructors */
    /**
     * Constructor SIN Parámetros
     * Usará valores default
     * 
     * @param void
     * @return void
     */
    public Creature() {
    	maxHP = 10;
    	hitPoints = maxHP;
    	atk = 1;
    	def = 1;
    }
    
    /**
     * Constructor CON Parámetros
     * Usará los valores de los parámetros dados
     * 
     * @param maxHP, atk, def Valores que asumiran los atributos básicos
     * @return void
     */
    public Creature(int maxHP, int atk, int def) {
    	this.maxHP = maxHP;
    	hitPoints = this.maxHP;
    	this.atk = atk;
    	this.def = def;
    }
	
	
    /* Getters and Setters */
    /**
     * Método que devolverá el valor del atributo hitPoints
     * 
     * @param void
     * @return El valor actual de hitPoints
     */
    public int getHP() {
    	return hitPoints;
    }
    
    
    /**
     * Método que dará al atributo hitPoints un valor específico pasado por parámetro
     * 
     * @param hp Valor que asumirá el atributo hitPoints
     * @return vo9id
     */
    public void setHP(int hp) {
    	hitPoints = hp;
    }
    
    
    /**
     * Método que devolverá true si los hitPoints actuales son mayores a 0
     * 
     * @param void
     * @return Booleano true si el atributo hitPoints es mayor a 0, o false si es menor
     */
    public boolean isAlive(){
    	return hitPoints > 0;
    }
    
    
    /**
     * Método que aumentará el atributo hitPoints hasta el total del atributo maxHP
     * 
     * @param void
     * @return void
     */
    public void fullHeal() {
    	hitPoints = maxHP;
    }
    
    /**
     * Método que aumentará el atributo hitPoints según el parémetro hitPoints dado
     * 
     * @param hitPoints Cantidad que se aumentará el atributo hp de la criatura 
     * @return void
     */
    public void heal(int hitPoints) {
    	
    	this.hitPoints = this.hitPoints + hitPoints;
    	
    }//Fin heal()
    
}
