/**
 * example creates a singleton using a static initialization block when
 * the class is loaded. For simplicity, we skip defining the data methods
 * on these classes and present only the creation and instance retrieval logic
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_1SingletonDesignPattern;

/**
 * @author tkurt
 * Date: Apr 9, 2016 11:46:18 AM
 *  
 */
public class StaffRegister {
	
	private static final StaffRegister instance;
	
	/**
	 * This is other way to start..
	 */
	static {
		instance = new StaffRegister();
		// Perform additional steps
	}

	private StaffRegister() {
	}

	public static StaffRegister getInstance() {
		return instance;
	}
	
	/**
	 * Look at VisitorTicketTracker for to see another and popular way.
	 */

}
