/**
 * This is primitive sample of application of singleton design pattern
 * 
 * We have here some constant hay during application not multiple.
 * We want manage it during our application from 'single' point.  
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_1SingletonDesignPattern;

/**
 * @author tkurt
 * Date: Apr 9, 2016 11:19:06 AM
 *  
 */
public class HayStorage {
	
	private int quantity = 0;
	
	/**
	 * All constructors in a singleton class are marked private, which
     * ensures that no other class is capable of instantiating another 
     * version of the class.
     * 
     * !! By marking the constructors private, we have implicitly marked the class final.
     * So now "Override" the methods.
     * 
     * If all of the constructors are declared private in the singleton class,
     * then it is impossible to create a subclass with a valid
     * constructor; therefore, the singleton class is 'effectively final' (Since Java 8).
	 */
	private HayStorage () {
		
	}
	
	/**
	 * This is our unique instance.
	 */
	private static final HayStorage instance = new HayStorage();
	
	/**
	 * @return unique instance 
	 * Also we used 'synchronized' because singleton instance's methods should be thread-safe.
	 */
	public static HayStorage getInstance() {
		
		return instance;
	}
	
	public synchronized void addHay(int quantity){
		
		if(quantity < 0) throw new IllegalAccessError("You should add positive quantity");
		this.quantity += quantity;
	}
	
	public synchronized boolean removeHay(int quantity) {

		if (quantity < 0)
			throw new IllegalAccessError("You should add positive quantity");

		if (this.quantity < quantity)
			return false;

		this.quantity -= quantity;

		return true;

	}
	
	public synchronized int getHayQuantity(){
		return quantity;
	}
	/**
	 * Look at LlamaTrainer.java after this for to see usage.
	 */

}
