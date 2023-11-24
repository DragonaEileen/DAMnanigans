package creatures;

public class Creature {

	/* Common Stats Between all the creatures */
	protected int HP;
	protected int maxHP;
    protected int atk;
    protected int def;
	
	
    /* Getters and Setters */
    public int getHP() {
    	return HP;
    }
    
    public void setHP(int hp) {
    	HP = hp;
    }
    
    public boolean isAlive(){
    	return HP > 0;
    }
    
    public void fullHeal() {
    	HP = maxHP;
    }
    
    //... any others I need
    
}
