/**
 * The next creational pattern we will discuss is the immutable objects pattern.
 * 
 * Problem. How do we create read‐only objects that can be shared and used by multiple classes?
 * 
 * Motivation: Sometimes we want to create simple objects that can be shared across multiple
 * classes, but for security reasons we don’t want their value to be modified. We could copy the
 * object before sending it to another method, but this creates a large overhead that duplicates
 * the object every time it is passed. Furthermore, if we have multiple threads accessing the same
 * object, we could run into concurrency issues, as you will see in Chapter 7 .
 * 
 * Solution: The immutable object pattern is a creational pattern based on the idea of
 * creating objects whose state does not change after they are created and can be easily shared
 * across multiple classes. Immutable objects go hand and hand with encapsulation, except
 * that no setter methods exist that modify the object. Since the state of an immutable object
 * never changes, they are inherently thread‐safe.
 * 
 * Applying an Immutable Strategy
 * 
 * 1. Use a constructor to set all properties of the object.
 * 2. Mark all of the instance variables private and final .
 * 3. Don’t define any setter methods.
 * 4. Don’t allow referenced mutable objects to be modified or accessed directly.
 * 5. Prevent methods from being overridden. - IMPORTANT
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_2ImmutableObjectsPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tkurt
 * Date: Apr 9, 2016 11:58:06 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		// Look at Animal class as first :)

		
		/**
		 * “Modifying” an Immutable Object
		 */
		// Create a new Animal instance
		Animal lion = new Animal("lion", 5, Arrays.asList("meat", "more meat"));

		// Create a new Animal instance using data from the first instance
		List<String> favoriteFoods = new ArrayList<String>();
		for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
			favoriteFoods.add(lion.getFavoriteFood(i));
		}
		/**
		 * This is like a code with 'immutable' String object;
		 * - You cannot modify current object but you can create
		 * NEW identical object by adding changes you want to do.
		 */
		Animal updatedLion = new Animal(lion.getSpecies(), lion.getAge() + 1, favoriteFoods);
	}

}
