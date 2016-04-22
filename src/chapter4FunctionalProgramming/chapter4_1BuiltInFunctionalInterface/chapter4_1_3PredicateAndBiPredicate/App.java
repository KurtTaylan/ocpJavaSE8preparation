/**
 * Predicate is often used when filtering or matching. Both are
 * very common operations. A BiPredicate is just like a Predicate except that it takes two
 * parameters instead of one.
 * 
 * Omitting any default or static methods, the interfaces are
 * defined as follows:
 * 
 * @FunctionalInterface public class Predicate<T> {
 *    boolean test(T t);
 * }
 * 
 * @FunctionalInterface public class BiPredicate<T, U> {
 *    boolean test(T t, U u);
 * }
 * 
 */
package chapter4FunctionalProgramming.chapter4_1BuiltInFunctionalInterface.chapter4_1_3PredicateAndBiPredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author tkurt
 * Date: Apr 21, 2016 11:18:36 AM
 *  
 */
public class App {

	public static void main(String[] args) {

		/**
		 * Example 1
		 */
		 Predicate<String> p1 = String::isEmpty;// Method reference
		 Predicate<String> p2 = x -> x.isEmpty();
		
		 System.out.println(p1.test(""));
		 System.out.println(p2.test(""));
		 
		 /**
		  * Example 2
		  */
		 /*
		  * This prints true twice. More interesting is a BiPredicate . 
		  * This example also prints true twice:
		  */
		BiPredicate<String, String > b1 = String::startsWith;
		BiPredicate<String, String > b2 = (String string, String prefix ) -> string.startsWith(prefix);
		
		System.out.println(b1.test("chicken", "chick"));
		System.out.println(b2.test("chicken,", "chick"));
		
		/**
		 * Example 3
		 */
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());
			
	}

}
