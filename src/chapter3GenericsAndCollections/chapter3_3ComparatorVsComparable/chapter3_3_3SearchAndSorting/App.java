/**
 * The sort method uses the compareTo() method to sort. It expects the objects to be sorted
 * to be Comparable .
 * 
 * The sort method uses the compareTo() method to sort. It expects the objects to be sorted
 * to be Comparable .
 */
package chapter3GenericsAndCollections.chapter3_3ComparatorVsComparable.chapter3_3_3SearchAndSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author tkurt
 * Date: Apr 20, 2016 9:06:32 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Fluffy", "Hoppy");
		Comparator<String> c = Comparator.reverseOrder();
		int index = Collections.binarySearch(names, "Hoppy", c);
		System.out.println(index);
	}

}
