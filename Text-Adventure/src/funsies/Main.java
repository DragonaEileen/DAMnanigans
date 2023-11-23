package funsies;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		/* Rellenamos un mapa con un itemName y un numItem */
		//Player.inventory1.put("Carrot", 3);
		
		/* Añadimos ese mapa al inventario principal */
		//Player.inventory.add(Player.inventory1);
		
		/* Comprobamos que el itemName existe en el inventario */
		//System.out.println(Player.inventory.get(0).containsKey("Carrot"));
		
		/* Let's replace the prior entry */
		//Player.inventory.get(0).remove("Carrot");
		
		/*Now we try to create the inventory */
		Player.createInventory();
		
		//Player.inventory.get(3).put("Apple", 5);
		
		/* And now we check if Apple exists */
		//System.out.println(Player.inventory.get(3));
		
		
	}

}
