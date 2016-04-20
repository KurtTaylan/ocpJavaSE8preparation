/**
 * You use a set when you don’t want to allow duplicate entries.
 * 
 */
package chapter3GenericsAndCollections.chapter3_2UsingListsSetsMapsQueues.chapter3_2_2SetInterface;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author tkurt
 * Date: Apr 19, 2016 3:57:46 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		/**
		 * A HashSet stores its elements in a hash table. This means that it uses the hashCode()
         * method of the objects to retrieve them more efficiently.
         * 
         * The main benefit is that adding elements and checking if an element is in the set both
         * have constant time. The tradeoff is that you lose the order in which you inserted the
         * elements. Most of the time, you aren’t concerned with this in a set anyway, making HashSet
         * the most common set.
         * 
         * A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set
         * is always in sorted order. The tradeoff is that adding and checking if an element is 
         * present are both O(log n)
         * 
         * You also have to know the differences between the types of sets
		 */
		
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66); // true
		boolean b2 = set.add(10); // true
		boolean b3 = set.add(66); // false , it is dublicated
		boolean b4 = set.add(8); // true
		
		for (Integer integer : set) {
			System.out.print(integer + ","); // 66,8,10,
		}
		
		/**
		 * Now let’s look at the same example with TreeSet;
		 */
		System.out.println();
		
		Set<Integer> set2 = new TreeSet<>();
		boolean b5 = set.add(66); // true
		boolean b6 = set.add(10); // true
		boolean b7 = set.add(66); // false , it is dublicated
		boolean b8 = set.add(8); // true
		
		for (Integer integer : set) {
			System.out.print(integer + ","); // 8,10,66
		}
		
		/**
		 * TreeSet implements the NavigableSet interface. This interface provides some 
		 * interesting methods. Their method signatures are as follows:
		 */
		System.out.println();
		
		NavigableSet<Integer> set3 = new TreeSet<>();
		for (int i = 1; i <= 20; i++) set3.add(i);
		System.out.println(set3.lower(10)); // 9
		System.out.println(set3.floor(10)); // 10
		System.out.println(set3.ceiling(20)); // 20
		System.out.println(set3.higher(20)); // null
		
	}

}
