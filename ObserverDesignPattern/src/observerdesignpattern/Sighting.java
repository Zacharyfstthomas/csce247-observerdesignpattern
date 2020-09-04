package observerdesignpattern;
/**
 * This class is used by the Cartel to hold each Sighting, or update, sent out by the Cook.
 * Consists of a location String and details String.
 * @author zacha
 *
 */
public class Sighting{

	private String location;
	private String details;
	/**
	 * Constructor. Initializes this instance's Strings with the given parameters.
	 * @param location: Given by the Cartel's update method, represents the location where the Cook was spotted.
	 * @param details: Given by the Cartel's update method, represents the actions the Cook undertook at the location.
	 */
	public Sighting(String location, String details) {
			this.location = location;
			this.details = details;
		
	}
	/**
	 * Used by the Cartel Observer.
	 * @return Returns the stored location String.
	 */
	public String getLocation() {
		
		return this.location;
	}
	/**
	 * Used by the Cartel Observer.
	 * @return Returns the stored details String.
	 */
	public String getDetails() {
		
		
		return this.details;
	}
	
	
	
	
	
	
}
