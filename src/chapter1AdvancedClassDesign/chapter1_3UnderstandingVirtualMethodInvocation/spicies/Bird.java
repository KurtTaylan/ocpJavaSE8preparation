/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.spicies;

import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent.Animal;

/**
 * @author tkurt
 * Date: Mar 27, 2016 7:46:41 PM
 *  
 */
public class Bird extends Animal {

	/* (non-Javadoc)
	 * @see chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent.Animal#feed()
	 */
	@Override
	public void feed() {
		addSeed();
	}

	private void addSeed() {
		System.out.println("Birst is feeded");
	}

}
