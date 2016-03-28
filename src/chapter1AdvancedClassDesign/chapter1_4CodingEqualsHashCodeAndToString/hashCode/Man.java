/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_4CodingEqualsHashCodeAndToString.hashCode;

import chapter1AdvancedClassDesign.chapter1_4CodingEqualsHashCodeAndToString.toString.ManParent;

/**
 * @author tkurt
 * Date: Mar 28, 2016 1:15:58 PM
 *  
 */
public class Man extends chapter1AdvancedClassDesign.chapter1_4CodingEqualsHashCodeAndToString.equals.Man {

	public Man(int manId, String name, String sex, String martialStatus, double height, int weight) {
		super(manId, name, sex, martialStatus, height, weight);
	}
	
	
	/**
	 * A hash code is a number that puts instances of a class into a finite number of categories.
	 * 
	 * The hash code is just a number. On the exam, you can just use a primitive number as is or divide
     * to get a smaller int .
     * 
     * Remember that all of the instance variables don’t need to be used in a
     * hashCode() method. It is common not to include boolean and char variables in the hash code.
     * 
     * Three Conditions for Contract are exist;
     * 
     * -Within the same program, the result of hashCode() must not change. This means that
     *  you shouldn’t include variables that change in figuring out the hash code.
     *  
     * -If equals() returns true when called with two objects, calling hashCode() on each of
     *  those objects must return the same result. This means hashCode() can use a subset of
     *  the variables that equals() uses.
     *  
     * -If equals() returns false when called with two objects, calling hashCode() on each of
     *  those objects does not have to return a different result. This means hashCode() results
     *  do not need to be unique when called on unequal objects.
	 */
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
}
