package observerdesignpattern;
import java.util.ArrayList;
/**
 * The DEA is an Observer, using a ArrayList of locations,
 * and a separate String of notes to represent the actions the Cook took.
 * @author zacha
 */
public class DEA implements Observer{

	private Subject cook;
	private ArrayList<String> locations;
	private String notes;
	/**
	 * Constructor. Initializes the locations ArrayList,
	 * and adds this instance to the Cook's observers ArrayList.
	 * notes is also initialized.
	 * @param cook: The Subject, which will send out updates to the Observers.
	 */
	public DEA(Subject cook) {
		locations = new ArrayList<String>();
		this.cook = cook;	
		cook.registerObserver(this);
		this.notes = "";
	}
	/**
	 * Adds a new String to the locations ArrayList, and extends the notes String
	 * with the description and a new line indicator.
	 *  @param location:Given from Cook's notifyObservers method,
	 * represents the location the Cook was at during the Sighting.
	 * @param description:Given from Cook's notifyObservers method,
	 *  represents the actions the Cook took at the location.
	 */
	public void update(String location, String description) {
		locations.add(location);
		this.notes += description + "\n";
	}
	/**
	 * 
	 * 
	 * Returns every String in the locations ArrayList,
	 * consolidating them into a single String and adding newline indicators between
	 * each location String.
	 * This is then followed by the notes String.
	 */
	public String getLog() {
		String returnLocations = "";
		for(String location : locations) {
			returnLocations += location + "\n";
		}
		return "Locations: \n" + returnLocations + "\nNotes: \n" + this.notes;
		
	}
	
	
	
	
	
}
