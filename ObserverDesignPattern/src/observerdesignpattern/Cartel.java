package observerdesignpattern;
import java.util.ArrayList;
/**
 * 
 * Cartel is one of the observers. Utilizes an ArrayList of Sightings to record every Sighting
 * reported from the Cook. Has a special format for returning its logged sightings.
 * @author zacha
 *
 */
public class Cartel implements Observer{

	
	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	/**
	 * 
	 * Constructor. Initializes the ArrayList, and adds this instance to the list
	 * of observers.
	 * @param cook: The instance of Cook, the subject which this instance observes. Sends out updates to Observers.
	 */
	public Cartel(Subject cook) {
		sightings = new ArrayList<Sighting>();
		this.cook = cook;
		cook.registerObserver(this);
	}
	/**
	 * Adds a new Sighting to the Sighting ArrayList.
	 * @param location:Given from Cook's notifyObservers method,
	 * represents the location the Cook was at during the Sighting.
	 * @param description:Given from Cook's notifyObservers method,
	 *  represents the actions the Cook took at the location.
	 */
	public void update(String location, String description) {
		sightings.add(new Sighting(location, description));
	}
	
	/**
	 * Returns every Sighting in the sightings ArrayList,
	 * consolidating them into a single String, with a
	 * specific format of the Sighting's location, followed by the 
	 * Sighting's details in parenthesis.
	 * Each sighting is given its own line with a new line indicator.
	 */
	public String getLog() {
		String returnSightings = ""; 
		for(Sighting sighting : sightings)
		{returnSightings += sighting.getLocation() + "("+sighting.getDetails()+")\n";}
			return returnSightings;
	}
	
	
	
	
	
}
