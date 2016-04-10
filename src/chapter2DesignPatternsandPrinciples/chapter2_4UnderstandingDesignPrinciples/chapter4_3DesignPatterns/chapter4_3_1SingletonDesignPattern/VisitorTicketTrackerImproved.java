/**
 * This is final version of singleton object creation.
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
	 * 
	 */
	public static VisitorTicketTrackerImproved getInstance() {
		
		if (instance == null) {
			
			/**
			 * This is the heart of our performance check and concurrency
			 */
			synchronized (VisitorTicketTrackerImproved.class) {
				if (instance == null) {
					/**
					 * While we are using getInstance() ,
					 * at the same time we are fixing createSingleton() method in patterns Structure!
					 */
					instance = new VisitorTicketTrackerImproved();
				}
			}
		}
		
		return instance;
	}
	

	/* This is refactored way.
	
	private synchronized static void createInstance(){
		if(instance == null) instance = new VisitorTicketTrackerImproved();
	} 
	
	public static VisitorTicketTrackerImproved getInstance(){
		if(instance == null) createInstance();
		return instance;
	}
	*/
	
	
}
