/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation;

import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent.Animal;
import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.spicies.Lion;

/**
 * @author tkurt 
 * Date: Mar 27, 2016 8:20:36 PM
 * 
 */
public class AppforSecond {

	public static void main(String... args) {
		/* When you print out it is going to print parent version */
		Animal animal = new Lion();
		animal.printName();
		
		/* its gonna print out child version because play() private method in 
		 * carefor() has been overridden by subclass and even parent has 
		 * referred compiler looks up to child version because that is overriden.
		 * */
		animal.careFor();
	}

}
