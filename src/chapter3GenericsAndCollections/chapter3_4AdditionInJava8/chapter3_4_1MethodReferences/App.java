/**
 * Method references are a way to make the code shorter by reducing some of the code that
 * can be inferred and simply mentioning the name of the method. Like lambdas, it takes time
 * to get used to the new syntax.
 * 
 * There are four formats for method references:
 * 
 * -Static methods
 * -Instance methods on a particular instance
 * -Instance methods on an instance to be determined at runtime
 * -Constructors
 * 
 * 
 * Remember from Chapter 2 that Predicate is a functional inter-
 * face that takes a single parameter of any type and returns a boolean . Another functional
 * interface is Consumer , which takes a single parameter of any type and has a void return
 * type. Finally, Supplier doesn’t take any parameters and returns any type.
 */
package chapter3GenericsAndCollections.chapter3_4AdditionInJava8.chapter3_4_1MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author tkurt
 * Date: Apr 19, 2016 9:42:01 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		/**
		 * Static method reference 
		 * Consumer:Takes one parameter and 'void' return type
		 */
		Consumer<List<Integer>> methodRef1 = Collections::sort; // Method reference
		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l); // Lambda usage
		
		/**
		 * Calling an instance method on a specific instance:
		 * Predicate:Takes one parameter and 'boolean' return type 
		 */
		String str = "abc";
		Predicate<String> methodRef2 = str::startsWith;// Method reference
		Predicate<String> lambda2 = s -> str.startsWith(s);// Lambda usage
		
		/**
		 * Next, we call an instance method without 
		 * knowing the instance in advance:
		 * It looks like a static method, but it isn’t. Instead, Java 
		 * knows that isEmpty is an instance method that does not
		 * take any parameters. Java uses the parameter supplied at 
		 * runtime as the instance on which the method is called.
		 */
		Predicate<String> methodRef3 = String::isEmpty;
		Predicate<String> lambda3 = s -> s.isEmpty();
		
		/**
		 * We have a constructor reference:
		 * A constructor reference is a special type of method reference that uses new instead of a
		 * method, and it creates a new object. It expands like the method references you have seen
		 * so far.
		 */
		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lambda4 = () -> new ArrayList();
		
		
		// We are creating Comparator by method reference .
		Comparator<Duck> byWeight = App::compareByWeight;

		
	}
	
	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.getWeight()- d2.getWeight();
	}

	public static int compareByName(Duck d1, Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}
}
