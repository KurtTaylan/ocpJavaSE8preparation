/**
 * A HashMap stores the keys in a hash table. This means that it uses the hashCode() method
 * of the keys to retrieve their values more efficiently.
 * 
 * The main benefit is that adding elements and retrieving the element by key both have
 * constant time. The tradeoff is that you lose the order in which you inserted the elements.
 * Most of the time, you aren’t concerned with this in a map anyway. If you were, you could
 * use LinkedHashMap .
 * 
 * A TreeMap stores the keys in a sorted tree structure. The main benefit is that the keys are
 * always in sorted order. The tradeoff is that adding and checking if a key is present are both
 * O(log n).
 * 
 * A Hashtable is like Vector in that it is really old and thread-safe and that you won’t be
 * expected to use it. It contains a lowercase t as a mistake from the olden days. All you have
 * to do is be able to pick it out in a lineup. In the form of old school analogies, ArrayList is
 * to Vector as HashMap is to Hashtable .
 */
package chapter3GenericsAndCollections.chapter3_2UsingListsSetsMapsQueues.chapter3_2_4MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author tkurt
 * Date: Apr 19, 2016 5:23:06 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala"); // bamboo
		for (String key: map.keySet())
			System.out.print(key + ","); // koala,giraffe,lion,
		System.out.println(food);
		
		System.out.println();
		/**
		 * Java uses the hashCode() of the key to determine the order. The order here happens to
         * not be sorted order, or the order in which we typed the values. Now let’s look at TreeMap :
		 */
		
		Map<String, String> map2 = new TreeMap<>();
		map2.put("koala", "bamboo");
		map2.put("lion", "meat");
		map2.put("giraffe", "leaf");
		String food2 = map2.get("koala"); // bamboo
		
		for (String key: map.keySet())
			System.out.print(key + ","); // giraffe,koala,lion,
		System.out.println(food2);
		
		/**
		 * TreeMap sorts the keys as we would expect. If we were to have called values() instead
         * of keySet() , the order of the values would correspond to the order of the keys.
		 */
		// System.out.println(map .contains("lion")); does not compile
		System.out.println(map.containsKey("lion"));
		System.out.println(map.containsValue("lion"));
		System.out.println(map.size());
		
		/**
		 * In handy list form, all data structures allow null s except these:
		 * TreeMap —no null keys
		 * Hashtable —no null keys or values
		 * TreeSet —no null elements
		 * ArrayDeque —no null elements
		 * 
		 */
	}

}
