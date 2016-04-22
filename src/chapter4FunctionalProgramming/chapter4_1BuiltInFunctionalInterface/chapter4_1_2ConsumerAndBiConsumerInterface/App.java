/**
 * You use a Consumer when you want to do something with a parameter but not return any-
 * thing. BiConsumer does the same thing except that it takes two parameters. Omitting the
 * default methods, the interfaces are defined as follows:
 * 
 * @FunctionalInterface public class Consumer<T> {
 *    void accept(T t);
 * }
 * 
 * @FunctionalInterface public class BiConsumer<T, U> {
 *    void accept(T t, U u);
 * }
 * 
 * You’ll notice this pattern. Bi means two. It comes from Latin, but you can
 * remember it from English words like binary (0 or 1) or bicycle (two wheels).
 * Always add another parameter when you see Bi show up.
 */
package chapter4FunctionalProgramming.chapter4_1BuiltInFunctionalInterface.chapter4_1_2ConsumerAndBiConsumerInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author tkurt
 * Date: Apr 21, 2016 11:02:51 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		// It does not need explanation :)
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Annie");
		c2.accept("Annie");
		
		/**
		 * BiConsumer is called with two parameters. They don’t have to be the same type. For
		 * example, we can put a key and a value in a map using this interface:
		 */
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		 
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		 
		System.out.println(map);
		
		
	}

}
