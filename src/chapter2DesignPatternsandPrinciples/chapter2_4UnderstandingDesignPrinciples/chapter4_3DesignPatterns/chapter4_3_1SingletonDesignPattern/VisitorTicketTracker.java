/**
 * Another technique is to delay creation of the singleton until
 * the first time the 'getInstance()' method is called
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_1SingletonDesignPattern;

/**
 * @author tkurt
 * Date: Apr 9, 2016 11:48:13 AM
 *  
 */
public class VisitorTicketTracker {
	
	private static VisitorTicketTracker instance;

	private VisitorTicketTracker() {
	}

	/**
	 * The VisitorTicketTracker class, though, does not create the singleton object
     * when the class is loaded but rather the first time it is requested by a client. Creating
     * a reusable object the first time it is requested is a software design pattern known as
     * lazy instantiation. It used often in conjunction with the singleton pattern.
     * 
	 * @return
	 */
	public static VisitorTicketTracker getInstance() {
		if (instance == null) {
			instance = new VisitorTicketTracker(); // NOT THREAD-SAFE!
		}
		return instance;
	}
	
	/**
	 * Look at VisitorTicketTrackerImproved class to see improved version for thread-safety.
	 */
}
