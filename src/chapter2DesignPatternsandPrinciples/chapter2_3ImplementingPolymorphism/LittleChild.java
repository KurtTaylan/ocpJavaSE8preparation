/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_3ImplementingPolymorphism;

/**
 * @author tkurt
 * Date: Apr 7, 2016 3:35:08 PM
 *  
 */
public class LittleChild implements FamilyMember {

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_3ImplementingPolymorphism.FamilyMember#printName()
	 */
	@Override
	public void printName() {
		System.out.println("Little child");
	}

}
