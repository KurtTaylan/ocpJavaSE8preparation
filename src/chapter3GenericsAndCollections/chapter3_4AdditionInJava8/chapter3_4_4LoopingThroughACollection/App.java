/**
 * Looping though a Collection is very common. For example, we often want to print out the
 * values one per line. There are a few ways to do this. We could use an iterator, the enhanced
 * for loop, or a number of other approaches—or we could use a Java 8 lambda.
 */
package chapter3GenericsAndCollections.chapter3_4AdditionInJava8.chapter3_4_4LoopingThroughACollection;

import java.util.Arrays;
import java.util.List;

/**
 * @author tkurt
 * Date: Apr 19, 2016 10:30:00 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		List<String> cats = Arrays.asList("Annie", "Ripley");
		
		// Lambda Expression
		cats.forEach(c -> System.out.println(c));
		
		// Method reference way
		cats.forEach(System.out::println);
	}

}
