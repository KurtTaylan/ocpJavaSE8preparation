/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_3ImplementingPolymorphism;

/**
 * @author tkurt
 * Date: Apr 7, 2016 3:33:08 PM
 *  
 */
public class Father implements FamilyMember {

	@Override
	public void printName() {
		System.out.println("Father");
	}

}
