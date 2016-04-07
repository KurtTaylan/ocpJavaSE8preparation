/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_2IntroducingFunctionalProgramming.chapter2_2_1DefiningAFunctionalInterface;

/**
 * @author tkurt
 * Date: Apr 7, 2016 1:27:55 PM
 *  
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ship ship = new Ship();
		
		// Now we gonna try to jump
		ship.jumpAround(10);
		ship.jumpAround(20);
	}

}
