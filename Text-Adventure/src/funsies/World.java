package funsies;

public class World {
	
	/* The map, or world, is (at least initially)*/

	/* Map Declaration */
	/* We declare an array of 2 dimensions (two pairs of []) for a map of 2 dimensions
	 * To upgrade it to three dimensions we only add a third [] to Object */
	private Object[][][] world2D;
	
	/* Map Size Declaration */
	private int X;
	private int Y;
	private int Z;

	/* Constructor */
	public World() {
		
		X = 10;
		Y = 10;
		Z = 2;
		
		world2D = new Object[Z][Y][X];
		
	}
	
	/* Getters and Setters */

	public void setPositionContent(int posX, int posY, Object content) {
		
		world2D[1][posY][posX] = content;
		
	}
	
	public Object getPositionContent(int posX, int posY) {
		
		return world2D[1][posY][posX];
		
	}
	
	
	
}
