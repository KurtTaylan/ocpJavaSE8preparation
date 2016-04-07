/**
 * The following simple program
 * uses a lambda expression to determine if some sample animals 
 * match the specified criteria:
 */
package chapter2DesignPatternsandPrinciples.chapter2_2IntroducingFunctionalProgramming.chapter2_2_2ImplementingFunctionalInterfacesWithLambdas;

/**
 * @author tkurt
 * Date: Apr 7, 2016 1:33:09 PM
 *  
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * This expression means that Java should call a method with an Animal parameter that
		 * returns a boolean value that’s the result of a.canHop()
		 */
		print(new Animal("fish", false, true), animal -> animal.canHop());
		print(new Animal("kangaroo", true, false), animal -> animal.canHop());
	}

// 		Java relies on context when figuring out what lambda expressions mean. We are
//		passing this lambda as the second parameter of the print() method. That method
//		expects a CheckTrait as the second parameter. Since we are passing a lambda instead,
//		Java treats CheckTrait as a functional interface and tries to map it to the single
//		abstract method:
//						boolean test(Animal a);
//		Since this interface’s method takes an Animal , it means the lambda parameter has to be
//		an Animal . And since that interface’s method returns a boolean , we know that the lambda
//		returns a boolean .

	private static void print(Animal animal, CheckTrait trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}
}
