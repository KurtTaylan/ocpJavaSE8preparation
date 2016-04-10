/**
 * 
 * Problem: How do we create an object that requires numerous values to be set at the time
 * the object is instantiated?
 * 
 * Motivation: As our data objects grow in size, the constructor may grow to contain many
 * attributes. For example, in our most recent immutable Animal class example, we had three
 * input parameters: species , age , and favoriteFoods . If we want to add five new attributes
 * to the object, we’d have to add five new values in the constructor. Every time we add a
 * parameter, the constructor grows! Users who reference our object would also be required
 * to update their constructor calls each time that the object was modified, resulting in a class
 * that would be difficult to use and maintain. Alternatively, we could add a new constructor
 * each time we add a parameter, but having too many constructors can be quite difficult to
 * manage in practice.
 * 
 * Solution: The builder pattern is a creational pattern in which parameters are passed to a
 * builder object, often through method chaining, and an object is generated with a final build
 * call. It is often used with immutable objects, since immutable objects do not have setter
 * methods and must be created with all of their parameters set, although it can be used with
 * mutable objects as well.
 * 
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_3BuilderPattern;

import java.util.Arrays;

/**
 * @author tkurt
 * Date: Apr 10, 2016 11:12:56 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		// Look at AnimalBuilder class as first :)
		
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder
			.setAge(4)
			.setFavoriteFoods(Arrays.asList("grass","fish"))
			.setSpecies("duck");
		
		Animal duck = duckBuilder.build();
			
		// You can use both implementation to create 'immutable'
		// via its builder class by builder pattern.
		Animal flamingo = new AnimalBuilder()
				.setAge(4)
				.setFavoriteFoods(Arrays.asList("grass","fish"))
				.setSpecies("duck").build();
		/**You might also notice that we never explicitly set the age in the second example. In this
         * scenario, age may not be required, although we could certainly write our build() method to
         * throw an exception if certain required fields are not set. Alternatively, the build() method
         * may also set default values for anything the user failed to specify on the builder object.
         * The primary advantage of the builder pattern is that, over time, this approach leads to
         * far more maintainable code. If a new optional field is added to the Animal class, then our
         * code that creates objects using the AnimalBuilder class will not need to be changed. In
         * practice, a builder object often supports dozens of parameters, only a handful of which
         * may be set by users of the builder at a given time.
         * */
		
	}
	// To see advanced implementation of this pattern pls look at advanced package :)

}
