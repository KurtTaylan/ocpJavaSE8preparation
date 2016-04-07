/**
 * 
 * In object‐oriented design, we refer to object composition as the property of constructing a
 * class using references to other classes in order to reuse the functionality of the other classes.
 * In particular, the class contains the other classes in the has‐a sense and may delegate
 * methods to the other classes.
 * 
 * Object composition should be thought of as an alternate to inheritance and is often
 * used to simulate polymorphic behavior that cannot be achieved via single inheritance.
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter2_4_4ObjectComposition;

/**
 * @author tkurt
 * Date: Apr 7, 2016 5:19:00 PM
 *  
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car(new Gas(),new Break());
		
		/**
		 * While we are using delegator instance method,
		 * we actually, using composed classes methods.
		 */
		car.getSpeedUp();
		car.getSpeedDown();
		car.breakCar();

		/**
		 * One of the advantages of object composition over inheritance is that it tends to promote
         * greater code reuse. By using object composition, you gain access to other classes and
         * methods that would be difficult to obtain via Java’s single‐inheritance model.
		 */
	}
	
//	Object composition may seem more attractive than inheritance because of its reusable
//	nature, but bear in mind that one of the strengths of Java is its powerful inheritance
//	model. Object composition still requires you to explicitly expose the underlying methods
//	and values manually, whereas inheritance includes protected and public members
//	automatically. Also, using method overloading to determine dynamically which method
//	to select at runtime is an extremely powerful tool for building intelligent classes. In other
//	words, both object composition and inheritance have their proper place in developing good
//	code, and in many cases it may be difficult to decide which path to choose.
}