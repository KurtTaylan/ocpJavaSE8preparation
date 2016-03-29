/**
 * A local inner class is a nested class defined within a method. Like local variables, a local
 * inner class declaration does not exist until the method is invoked, and it goes out of scope
 * when the method returns.
 * 
 * -They do not have an access specifier.
 * -They cannot be declared static and cannot declare static fields or methods.
 * -They have access to all fields and methods of the enclosing class.
 * -They do not have access to local variables of a method unless those variables are final
 *  or effectively final. More on this shortly.
 *  
 * !!!:With Java 8 Effectively final term has came: 
 *     -If the code could still compile with the keyword final inserted before the local variable,
 *      the variable is effectively final. 
 *      : LOCAL VALUE SHOULD ASSIGN WHEN IT IS DECLARED OR ONLY ONCE THAN NEVER CHANGE!
 */
package chapter1AdvancedClassDesign.chapter1_6NestedClasses.localInnerClasses;

/**
 * @author tkurt
 * Date: Mar 29, 2016 10:23:11 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		App app = new App();
		// We wanted app to print out weird Hello World
		app.sayHelloToWorld();
		
	}

	private void sayHelloToWorld() {
		final int quantityToSayHello = 10;
		
		/**
		 * Local Inner class
		 * 
		 */
		class Printer{
			int quantityToSayWorld = 5;
			
			public void print(){
				
				for (int i = 0; i < quantityToSayHello; i++) {
					System.out.print("Hello ");
					for (int j = 0; j < quantityToSayWorld; j++) {
						System.out.print("World ");
					}
					System.out.println();
				}
				
			}
		}
		
		/**
		 * After we implement local inner class
		 * we initiate it than 
		 * call the local inner class method through reference 
		 */
		Printer printer = new Printer();
		printer.print();
	}

}
