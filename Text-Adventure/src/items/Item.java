package items;

public abstract class Item {

	protected String name;
	
	protected String description;
	
	
	
	/* Getters and Setters */
	
	public String getName() {
		
		return name;
		
	}
	
	public abstract void effect();
	
}
