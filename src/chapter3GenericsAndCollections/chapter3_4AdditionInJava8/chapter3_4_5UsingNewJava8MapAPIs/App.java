/**
 * Java 8 added a number of new methods on the Map interface. Only merge() is listed in the
 * OCP objectives. Two others, computeIfPresent() and computeIfAbsent() , are added in
 * the upgrade exam objectives.TODO:I recommend checking http://www.selikoff.net/ocp to
 * make sure that this is still the case before you take the exam.
 */
package chapter3GenericsAndCollections.chapter3_4AdditionInJava8.chapter3_4_5UsingNewJava8MapAPIs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author tkurt
 * Date: Apr 19, 2016 10:33:11 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		/**
		 * Sometimes you need to update the value for a specific key in the map. There are a few
		 * ways that you can do this. The first is to replace the existing value unconditionally:
		 */
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Jenny", "Tram");
		
		System.out.println(favorites); // {Jenny=Tram}
		System.out.println();
		
		/**
		 * There’s another method, called putIfAbsent() , that you can call if you want to set a
		 * value in the map, but this method skips it if the value is already set to a non- null value:
		 */
		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Jenny", "Bus Tour");
		favorites2.put("Tom", null);
		favorites2.putIfAbsent("Jenny", "Tram");
		favorites2.putIfAbsent("Sam", "Tram");
		favorites2.putIfAbsent("Tom", "Tram");
		
		System.out.println(favorites2); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
		System.out.println();
		
		
		/**                          MERGE
		 * The merge() method allows adding logic to the problem of what to choose. Suppose that
		 * our guests are indecisive and can’t pick a favorite. They agree that the ride that has the lon-
		 * gest name must be the most fun. We can write code to express this by passing a mapping
		 * function to the merge() method:
		 * 
		 */
		
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		Map<String, String> favorites3 = new HashMap<>();
		favorites3.put("Jenny", "Bus Tour");
		favorites3.put("Tom", "Tram");
		
		String jenny = favorites3.merge("Jenny", "Skyride", mapper);
		String tom = favorites3.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites3); // {Tom=Skyride, Jenny=Bus Tour}
		System.out.println(jenny);// Bus Tour
		System.out.println(tom);// Skyride
		System.out.println();
		
		/**
		 * The merge() method also has logic for what happens if null s or missing keys are
		 * involved.
		 */
		
		Map<String, String> favorites4 = new HashMap<>();
		favorites4.put("Sam", null);
		favorites4.merge("Tom", "Skyride", mapper);
		favorites4.merge("Sam", "Skyride", mapper);
		System.out.println(favorites4); // {Tom=Skyride, Sam=Skyride}
		System.out.println();
		/**
		 * Notice that the mapping function isn’t called. If it were, we’d have a
		 * NullPointerException . The mapping function is used only when there are two actual 
		 * values to decide between.
		 */
		
		
		/**
		 * The final thing to know about merge() is what happens when the mapping function is
         * called and returns null . The key is removed from the map when this happens:
		 */
		BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
		Map<String, String> favorites5 = new HashMap<>();
		favorites5.put("Jenny", "Bus Tour");
		favorites5.put("Tom", "Bus Tour");
		favorites5.merge("Jenny", "Skyride", mapper2);
		favorites5.merge("Sam", "Skyride", mapper2);
		System.out.println(favorites5); // {Tom=Bus Tour, Sam=Skyride}
		System.out.println();
		/**
		 * Tom was left alone since there was no merge() call for that key. Sam was added since
		 * that key was not in the original list. Jenny was removed because the mapping function
		 * returned null .
		 */
		
	}

}
