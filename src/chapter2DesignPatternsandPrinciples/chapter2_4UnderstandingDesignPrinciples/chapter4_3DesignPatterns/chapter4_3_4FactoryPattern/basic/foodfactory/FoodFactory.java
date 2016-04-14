/**
 * tatatataaaam. This is where factory 'method' kicks in. It compose the runtime decision. 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.basic.foodfactory;

/**
 * @author tkurt
 * Date: Apr 12, 2016 10:09:15 PM
 *  
 */
public class FoodFactory {
	
	public static Food getFood(String animalName){
		switch (animalName) {
		case "zebra": return new FoodHay(100);
		case "rabbit": return new FoodPellet(5);
		case "goat": return new FoodPellet(30);
		case "polar bear": return new FoodFish(10);
		}
		// Good practice to throw an exception if no matching subclass could be found
		throw new UnsupportedOperationException("Unsupported animal: "+animalName);
	}
}
