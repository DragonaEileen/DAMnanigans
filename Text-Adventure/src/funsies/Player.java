package funsies;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

	/* Variable Declaration */
	/* Let's declare all the statistics of the class Player */
	private int HP;
	private int maxHP;
	private int xp;
    private int atk;
    private int def;
    private int lvl;
    
    /* Inventory */
    /* We declare the maxSlots */
    static int maxSlots = 36;
    /* We create an ArrayList of Maps (itemName, numItem) 
     * We will fill it null with the createInventory() method */
    static ArrayList<Map<String, Integer>> inventory = new ArrayList<Map<String, Integer>>();
    
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
