/**
 * Pellet is a food , it passes 'is-a-relationship'
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.basic.foodfactory;

/**
 * @author tkurt
 * Date: Apr 12, 2016 10:04:57 PM
 *  
 */
public class FoodPellet extends Food{
	
	/**
	 * 
	 * Also it is good practice to make access modifier of constructor
	 * as 'default'. Then put factory classes in the same package with 
	 * its product, so only same package can access it then easy to manage from 
	 * factory class.
	 * 
	 * The only problem with marking them public is that any class could bypass our factory
	 * pattern and create instances of the Food classes directly. If we wanted to tighten our
	 * access control, we could have declared these constructors with default or package‐level
	 * access in which there is no modifier.
	 * 
	 */
	FoodPellet(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Hay eaten: "+getQuantity());		
	}

}
