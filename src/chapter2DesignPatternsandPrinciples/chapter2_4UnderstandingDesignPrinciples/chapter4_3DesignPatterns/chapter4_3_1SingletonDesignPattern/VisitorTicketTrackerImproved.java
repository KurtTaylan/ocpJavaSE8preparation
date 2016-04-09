/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_1SingletonDesignPattern;

/**
 * @author tkurt
 * Date: Apr 9, 2016 11:51:50 AM
 *  
 */
public class VisitorTicketTrackerImproved {

	/**
	 * volatile is 'unstable' almost opposite of 'final' method modifier
	 */
	private static volatile VisitorTicketTrackerImproved instance;
	
	private VisitorTicketTrackerImproved() {}
	
	/**
	 * Singletons with Double‐Checked Locking
	 * 
	 * With this we improved our performance because not every time 
	 * check the 'synchronized' case .
	 * @return
	 */
	public static VisitorTicketTrackerImproved getInstance() {
		
		if (instance == null) {
			
			/**
			 * This is the heart of our performance check and concurrency
			 */
			synchronized (VisitorTicketTrackerImproved.class) {
				if (instance == null) {
					instance = new VisitorTicketTrackerImproved();
				}
			}
		}
		
		return instance;
	}
}
