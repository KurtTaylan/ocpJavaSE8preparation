/**
 * Problem: How do we write code that creates objects in which the precise type of the object
 * may not be known until runtime?
 * 
 * Motivation: As you saw with the builder pattern, object creation can be quite complex.
 * We’d like some way of encapsulating object creation to deal with the complexity of
 * object creation, including selecting which subclass to use, as well as loosely coupling the
 * underlying creation implementation.
 * 
 * Solution: The factory pattern, sometimes referred to as the factory method pattern, is a
 * creational pattern based on the idea of using a factory class to produce instances of objects
 * based on a set of input parameters. It is similar to the builder pattern, although it is focused
 * on supporting class polymorphism.
 * 
 * Factory patterns are often, although not always, implemented using static methods
 * that return objects and do not require a pointer to an instance of the factory class. It is
 * also a good coding practice to postfix the class name with the word Factory, such as in
 * AnimalFactory, ZooFactory, and so forth.
 * 
 * Also Known as: Factory Method Pattern,Virtual Constructor
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern;

/**
 * @author tkurt
 * Date: Apr 10, 2016 1:21:20 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		/**
		 * There are many implementations of this pattern but I am gonna mention 2 of them
		 * First look at basic one then advanced :) 
		 */
	}

}
