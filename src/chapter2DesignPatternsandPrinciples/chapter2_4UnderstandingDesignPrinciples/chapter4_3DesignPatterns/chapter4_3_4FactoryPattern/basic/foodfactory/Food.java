/**
 * This is our parent class to be initialized by our factory class
 * 
 * This kind of parent classes in 'factory method' pattern generally be 'abstract' class type. 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.basic.foodfactory;

/**
 * @author tkurt
 * Date: Apr 12, 2016 9:54:35 PM
 *  
 */
public abstract class Food {
	
	private int quantity;
	
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
	Food(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public abstract void consumed();
	
}
