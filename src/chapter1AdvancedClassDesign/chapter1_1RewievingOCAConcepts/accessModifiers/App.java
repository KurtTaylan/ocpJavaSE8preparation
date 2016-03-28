/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.accessModifiers;

import chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.accessModifiers.hiearchy.species.Shark;

/**
 * @author tkurt Date: Mar 27, 2016 7:05:56 PM
 * 
 */
public class App {

	public static void main(String[] args) {

		Shark sharkFish = new Shark(12, "Sharky", true, 134.54f);
		/**
		 * Compiler cannot see last 3 field because of access modifier issue
		 */
		System.out.println(sharkFish.teethNumber);
		// System.out.println(sharkFish.fishName);
		// System.out.println(sharkFish.isDangerous);
		// System.out.println(sharkFish.measurements);
	}

}
