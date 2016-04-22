/**
 * A Supplier is used when you want to generate or supply values without taking any input.
 * The Supplier interface is defined as
 * 
 * @FunctionalInterface public class Supplier<T> {
 *     public T get();
 * }
 * 
 * A Supplier is often used when constructing new objects.
 */
package chapter4FunctionalProgramming.chapter4_1BuiltInFunctionalInterface.chapter4_1_1SupplierInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @author tkurt
 * Date: Apr 21, 2016 10:44:10 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		/** Example 1 */
		// We implemented by supplier interface - We initiated by Method reference. 
		Supplier<LocalDate> date1 = LocalDate::now;
		Supplier<LocalDate> date2 = LocalDate::now;
		// By this, we are getting object using factory 'Method' design 
		// pattern
		LocalDate d1 = date1.get();
		LocalDate d2 = date2.get();
		System.out.println(d1);
		System.out.println(d2);
	
		
		/** Example 2 */
		// Here we have another example to use Supplier Interface ın factory pattern.
		Supplier<StringBuilder> s1 = StringBuilder::new; // Method-constructor reference way
		Supplier<StringBuilder> s2 = () -> new StringBuilder(); // Lambda way
		
		Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
		ArrayList<String> a1 = s3.get();
		System.out.println(a1);
		
		
		
	}

}
