/**
 *  In this example we are gonna see how to implement factory pattern in a basic way.
 *  
 *  We are going to defer instance creation to subclasses at runtime :) That is the logic.
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.basic;

import chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.basic.foodfactory.Food;
import chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.basic.foodfactory.FoodFactory;

/**
 * @author tkurt
 * Date: Apr 12, 2016 9:50:04 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		final Food foodForPolarBead = FoodFactory.getFood("polar bear");
		foodForPolarBead.consumed();
		
		final Food foodForZebra = FoodFactory.getFood("zebra");
		foodForZebra.consumed();
		
	}

}
