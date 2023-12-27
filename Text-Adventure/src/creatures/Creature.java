package creatures;

public class Creature {

	/* Common Stats Between all the creatures */
	protected int hitPoints;
	protected int maxHP;
    protected int atk;
    protected int def;
	
	
    /* Getters and Setters */
    public int getHP() {
    	return hitPoints;
    }
    
    public void setHP(int hp) {
    	hitPoints = hp;
    }
    
    public boolean isAlive(){
    	return hitPoints > 0;
    }
    
    public void fullHeal() {
    	hitPoints = maxHP;
    }
    
    //... any others I need
    
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
