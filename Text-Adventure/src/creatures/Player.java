package creatures;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player extends Creature{

	/* Variable Declaration */
	/* Let's declare all the statistics of the class Player */
	private int xp;
    private int lvl;
    
    //* Inventory *//
    /* We declare the maxSlots */
    static int maxSlots = 36;
    /* We create an ArrayList of Maps (itemName, numItem) 
     * We will fill it null with the createInventory() method */
    private static ArrayList<Map<String, Integer>> inventory; // new ArrayList<Map<String, Integer>>();
    
    public Player() {
    	HP = maxHP;
    	lvl = 1;
   
    	inventory = new ArrayList<Map<String, Integer>>();
    	createInventory();

    	//... any other initial values I want	
    }
    
    /* Getters and Setters */
    
    /* Set inventory */
    public void setInventorySlot(int slot, String itemName, int numItem ) {
    	
    	inventory.get(slot).put(itemName, numItem);
    	
    }
    
    /* Get Inventory Slot Content */
    public Map<String, Integer> getInventorySlot(int slot){
    	
    	return inventory.get(slot);
    	
    }
        
    /* @method
     * With this method we are gonna set the size of the inventory ArrayList, filling
     * it with null maps */
    public static void createInventory() {
    	
    	Map<String, Integer> inventory1 = new HashMap<String, Integer>();
    	
    	for(int i = 1; i <= maxSlots; i++ ) {
    		
    		inventory.add(inventory1);
    		
    	}//Fin For --> Filling Nulls 
    	
    }//Fin createInventory()
	
}
