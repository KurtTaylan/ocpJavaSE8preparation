/**
 * These two methods are on the upgrade exam but not on the OCP exam. In a nutshell,
 * computeIfPresent() calls the BiFunction if the requested key is found.
 */
package chapter3GenericsAndCollections.chapter3_4AdditionInJava8.chapter3_4_6computeIfPresentandComputeIfAbsent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author tkurt
 * Date: Apr 19, 2016 10:49:31 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		/**
		 * The function interface is a BiFunction again. However, this time the key and value are
		 * passed rather than two values. Just like with merge() , the return value is the result of what
		 * changed in the map or null if that doesn’t apply.
		 */
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		
		Integer jenny = counts.computeIfPresent("Jenny", mapper);
		Integer sam = counts.computeIfPresent("Sam", mapper);
		System.out.println(counts); // {Jenny=2}
		System.out.println(jenny); // 2
		System.out.println(sam); // null
		System.out.println();
		
		
		/**
		 * For computeIfAbsent() , the functional interface runs only when the key isn’t present or
		 * is null :
		 */
		Map<String, Integer> counts2 = new HashMap<>();
		counts2.put("Jenny", 15);
		counts2.put("Tom", null);
		
		Function<String, Integer> mapper2 = (k) -> 1;
		
		Integer jenny2 = counts2.computeIfAbsent("Jenny", mapper2); // 15
		Integer sam2 = counts2.computeIfAbsent("Sam", mapper2); // 1
		Integer tom2 = counts2.computeIfAbsent("Tom", mapper2); // 1
		System.out.println(counts2); // {Tom=1, Jenny=15, Sam=1}
		System.out.println();
		/**
		 * Since there is no value already in the map, a Function is used instead of a
		 * BiFunction . Only the key is passed as input. As you can see, Jenny isn’t changed
		 * because that key is already in the map. Tom is updated because null is treated like not
		 * being there.
		 */
		
		
		/**
		 * If the mapping function is called and returns null , the key is removed from the map for
		 * computeIfPresent() . For computeIfAbsent() , the key is never added to the map in the
		 * first place, for example:
		 */
		Map<String, Integer> counts3 = new HashMap<>();
		counts3.put("Jenny", 1);
		counts3.computeIfPresent("Jenny", (k, v) -> null);
		counts3.computeIfAbsent("Sam", k -> null);
		System.out.println(counts3); // {}
		System.out.println();
		/*
		 * After running this code, the map is empty. The call to computeIfPresent() removes the
         * key from the map. The call to computeIfAbsent() doesn’t add a key.
		 */
	}

}
