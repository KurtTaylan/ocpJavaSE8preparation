/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_3UnderstandingVirtualMethodInvocation.parent;

/**
 * @author tkurt 
 * Date: Mar 27, 2016 7:44:55 PM
 * 
 */
public abstract class Animal {
	public String name="???";
	
	public abstract void feed();
	
	public void printName(){
		System.out.println(name);
	}
	
	
	public void careFor() {
		play();
	}

	public void play() {
		System.out.println("Animal is playing");
	}
}
