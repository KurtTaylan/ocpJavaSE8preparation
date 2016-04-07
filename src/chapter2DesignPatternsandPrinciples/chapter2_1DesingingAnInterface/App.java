/**
 * Here we are going to see how interact with interfaces in advanced level.
 */
package chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface;

import chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.*;
import chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.impl.*;

/**
 * @author tkurt
 * Date: Apr 7, 2016 12:06:49 PM
 *  
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HumanBeing normalHuman = new DummyHuman();
		Power powerfulHuman = new DummyPowerfulHuman();
		SuperPower superHuman = new DummySuperPowerfulHuman();
		
		
		/**
		 * As you can see from here because powerful human 
		 * does not override 'default method' it is just
		 * takes in HumanBeing one.
		 */
		normalHuman.talk(); // Dummy Human is talking :)
		powerfulHuman.talk(); // Hi I am Human Being :)
		superHuman.talk(); // Dummy super powerful human is talking :)
		
	}

}
