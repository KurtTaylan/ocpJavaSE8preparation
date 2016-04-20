/**
 * Java 8 introduces a new method called removeIf . Before this, we had the ability to remove
 * a specified object from a collection or a specified index from a list. Now we can specify
 * what should be deleted using a block of code.
 * 
 * The method signature looks like this:
 * 
 * 	   boolean removeIf(Predicate<? super E> filter)
 */
package chapter3GenericsAndCollections.chapter3_4AdditionInJava8.chapter3_4_2RemovingConditionally;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tkurt
 * Date: Apr 19, 2016 10:21:24 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list); // [Magician, Assistant]
		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list); // [Magician]
		
		/**
		 * How would you replace line 8 with a method reference? Trick question—you can’t. Since
		 * startsWith takes a parameter that isn’t s , it needs to be specified “the long way.”
		 */
	}

}
