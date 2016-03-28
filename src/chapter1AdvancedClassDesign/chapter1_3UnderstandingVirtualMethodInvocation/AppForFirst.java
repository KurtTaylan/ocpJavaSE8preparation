/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation;

import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent.Animal;
import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.spicies.Bird;
import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.spicies.Cow;
import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.spicies.Lion;

/**
 * @author tkurt
 * Date: Mar 27, 2016 7:40:18 PM
 *  
 */
public class AppForFirst {

	
	public static void main(String[] args) {
		Animal lion = new Lion();
		Animal bird = new Bird();
		Animal cow = new Cow();
	}
	
	/**
	 * 
	 * @param animal: Any subclass of Animal abstract class.
	 * By this, we bury specific feed into subclass method itself,
	 * so that we just call overrided superclass method. 
	 * 
	 *  We have just relied on virtual method invocation.
	 */
	public void feedAnimal(Animal animal){
		animal.feed();
	}

}
