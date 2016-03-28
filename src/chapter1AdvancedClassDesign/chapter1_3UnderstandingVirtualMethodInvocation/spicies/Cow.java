/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.spicies;

import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent.Animal;

/**
 * @author tkurt
 * Date: Mar 27, 2016 7:45:52 PM
 *  
 */
public class Cow extends Animal {

	/* (non-Javadoc)
	 * @see chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent.Animal#feed()
	 */
	@Override
	public void feed() {
		addHay();
	}

	private void addHay() {
		System.out.println("Cow is feeded");
	}

}
