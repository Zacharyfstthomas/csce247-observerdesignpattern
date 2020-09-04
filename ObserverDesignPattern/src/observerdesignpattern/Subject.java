package observerdesignpattern;
/**
 * Acts as a template for Subject classes to include, to ensure they can be observed,
 * and maintain an ArrayList or some other form of listing method to track and store
 * the Observers.
 * @author zachary st.thomas
 */
public interface Subject {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(String location, String description);
	
	
}
