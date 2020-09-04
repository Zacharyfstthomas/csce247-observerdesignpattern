

package observerdesignpattern;
import java.util.ArrayList;
/**
 * The Cook is the only Subject of this program, representing Heinzenberg.
 * Each time Heinzenberg goes out is represented as a Sighting, which is entered
 * into this class, which then updates the Observers. This class also contains the ArrayList of
 * Observers. This class can also return the name of the Cook, Heinzenberg.
 *  
 * @author zachary st. thomas
 * 
 */
public class Cook implements Subject{

	
	
	private ArrayList<Observer> observers;
	private String name;
		
	/**
	 * Constructor. Sets the class instance name to the given name, and 
	 * initializes the ArrayList to allow Observers to be added to it.
	 * @param name: The given name for the Cook.
	 */
	
	public Cook(String name) {
		observers = new ArrayList<Observer>();
		this.name = name;
	}
	
	/**
	 * Adds an observer to the observers ArrayList. 
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	/**
	 * Removes an observer to the observers ArrayList.	
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	/**
	 * Calls the update method in each observer in the observers ArrayList,	
	 * passing the given location and description as parameters.
	 * @param location: given from enterSighting, details the location of the Cook from the sighting.
	 * @param description: given from enterSighting, details the Cook's actions at the location.
	 */
	public void notifyObservers(String location, String description) {	
		for(Observer observer : observers) {
			observer.update(location, description);
		}	
	}
	
	/**
	 * Calls the notifyObservers method, passing the given location and description as parameters.
	 * @param location: Details the location of the Cook from the sighting.
	 * @param description: Details the Cook's actions at the location. 
	 */
	
	public void enterSighting(String location, String description) {
			notifyObservers(location, description);	
			
	
	}
	/**
	 * 
	 * @return Returns the Cook's name to the user.
	 */
	public String getName() {
		return this.name;
	}
	
	
	
}
