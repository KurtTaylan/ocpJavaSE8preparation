/**
 * An anonymous inner class is a local inner class that does not have a name.
 * 
 * It is declared and instantiated all in one statement using the new keyword.
 * 
 * Anonymous inner classes are required to extend an existing class or 
 * implement an existing interface. They are useful when you have a short 
 * implementation that will not be used anywhere else.
 */
package chapter1AdvancedClassDesign.chapter1_6NestedClasses.anonymousInnerClasses;

/**
 * @author tkurt
 * Date: Mar 29, 2016 10:13:36 PM
 *  
 */
public class App {
	
	private interface SaleAbility{
		void saleItNicely();
	} 
	
	public void educateYourselfOnSelling(SaleAbility ability){
		/**
		 * 4- Then we took implemented object and do something on it
		 * 	  here we just inherited override method from our nice interface
		 *    than do some little rock!
		 */
		ability.saleItNicely();
	}

	public static void main(String[] args) {
		/**
		 * 1-Create our App object to call real point here.
		 */
		App app = new App();
		// 2-Calling Object.
		app.startToLearn();
	}
	
	public void startToLearn(){
		/**
		 * 3-Here is crazy; You are passing anonymous inner class
		 * 	by implementing Interface, you could do same on abstract
		 * 	just via "new ImplementedClassName(){}" than you just PASS IT. 
		 */
		educateYourselfOnSelling(new SaleAbility(){
			@Override
			public void saleItNicely() {
				System.out.println("Omg what I just did and learn Nicely selling skills.");
			}
		}); 
	}
	/**
	 * NOTES: You should be aware that inner classes go against some fundamental concepts, such as
	 *        reuse of classes and high cohesion (discussed in the next chapter). Therefore, make sure
     *        that inner classes make sense before you use them in your code.
	 * 
	 * 
	 * NOTE TO ME: This type of anonymous inner class technique is applying for JavaFX for event handling.
	 * 			   I was doing it what I did not know what was it :)
	 */
}
