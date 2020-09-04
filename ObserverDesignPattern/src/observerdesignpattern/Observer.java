package observerdesignpattern;
/**
 * 
 * 
 * A template for Observers, to ensure it is informed when the subject sends out a new
 * status or anything else that warrents sending out, and maintains a log of all statuses
 * previously sent out by the Subject.
 * @author zacha
 *
 */
public interface Observer {
	
	public void update(String location, String description);
	public String getLog();
}
