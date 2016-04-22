/**
 * 
 */
package chapter4FunctionalProgramming.chapter4_2Streams.chapter4_2_1StreamSources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author tkurt
 * Date: Apr 21, 2016 2:04:35 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		/**
		 * In Java, the Stream interface is in the java.util.stream package. There are a few ways to
		 * create a finite stream:
		 */
		Stream<String> empty = Stream.empty(); // count = 0
		Stream<Integer> singleElement = Stream.of(1); // count = 1
		Stream<Integer> fromArray = Stream.of(1,2,3); // count = 2
		
		/*
		 *Since streams are new in Java 8, most code that’s
         *already written uses lists. Java provides a convenient way to convert from a list to a stream:
		 */
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		/**
		 * Using parallel streams is like setting up multiple tables of workers who
		 * are able to do the same task. Painting would be a lot faster if we could have fi ve painters
		 * painting different signs at once. Just keep in mind that it isn’t worth working in parallel for
		 * small streams. There is an overhead cost in coordinating the work among all of the workers
		 * operating in parallel. For small amounts of work, it is faster just to do it sequentially.
		 */
		Stream<Double> randoms = Stream.generate(Math::random);// generates random value until kill it
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n+2 ); // generates odd numbers starting from 1 until you kill it
		
		
		
		
	}

}
