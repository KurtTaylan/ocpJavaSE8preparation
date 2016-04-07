/**
 * In Java, all objects are accessed by reference, so as a developer you never have direct access
 * to the memory of the object itself. Conceptually, though, you should consider the object
 * as the entity that exists in memory, allocated by the Java runtime environment. Regardless
 * of the type of the reference that you have for the object in memory, the object itself
 * doesn’t change.
 * 
 * 1. 	 The type of the object determines which properties exist within the object in memory.
 * 2. 	 The type of the reference to the object determines which methods and variables are
 *  	 accessible to the Java program.
 *  
 *  It therefore follows that successfully changing a reference of an object to a new reference
 *  type may give you access to new properties of the object, but those properties existed before
 *  the reference change occurred.
 *  
 */
package chapter2DesignPatternsandPrinciples.chapter2_3ImplementingPolymorphism.chapter2_3_1DistinguishingBetweenAnObjectAndAReference;

/**
 * @author tkurt
 * Date: Apr 7, 2016 3:51:16 PM
 *  
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
