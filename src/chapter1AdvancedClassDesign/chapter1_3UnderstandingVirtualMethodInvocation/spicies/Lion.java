/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.spicies;

import chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent.Animal;

/**
 * @author tkurt
 * Date: Mar 27, 2016 7:47:11 PM
 *  
 */
public class Lion extends Animal {
	public String name="Lion"; 

	/* (non-Javadoc)
	 * @see chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent.Animal#feed()
	 */
	@Override
	public void feed() {
		addMeat();
	}

	private void addMeat() {
		System.out.println("Lion is feeded");
	}
	
	@Override 
	// you call it for overriden methods from superclass.An annotation is extra information about the program, and it
	//is a type of metadata. It can be used by the compiler or even at runtime.
	/**
	 * when you see @ Override show up on the exam, you must check carefully that
	 * the method is doing one of three things:
	 * -Implementing a method from an interface
	 * -Overriding a superclass method of a class shown in the example
	 * -Overriding a method declared in Object , such as hashCode , equals , or toString
	 * 
	 */
	public void play() {
		System.out.println("lion is playing");
	}
}
