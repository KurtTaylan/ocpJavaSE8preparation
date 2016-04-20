/**
 * You use a list when you want an ordered collection that can contain duplicate entries.
 * 
 * The main thing that all List implementations have in common is that they are ordered
 * and allow duplicates.
 */
package chapter3GenericsAndCollections.chapter3_2UsingListsSetsMapsQueues.chapter3_2_1ListInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tkurt
 * Date: Apr 19, 2016 12:03:39 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		/**
		 * An ArrayList is like a resizable array. When elements are added, the ArrayList 
		 * automatically grows. When you aren’t sure which collection to use, use an ArrayList.
		 * 
		 * The main benefit of an ArrayList is that you can look up any element in constant time.
		 * Adding or removing an element is slower than accessing an element. This makes an
		 * ArrayList a good choice when you are reading more often than (or the same amount
		 * as) writing to the ArrayList.
		 * 
		 * A LinkedList: is special because it implements both List and Queue . It has all of the
		 * methods of a List . It also has additional methods to facilitate adding or removing from the
		 * beginning and/or end of the list.
		 * 
		 * The main benefits of a LinkedList are that you can access, add, and remove from the
		 * beginning and end of the list in constant time. The tradeoff is that dealing with an 
		 * arbitrary index takes linear time. This makes a LinkedList a good choice when you’ll be using
		 * it as Queue .
		 * 
		 * A Stack: is a data structure where you add and remove elements from the top of the
         * stack. Think about a stack of paper as an example.
         * 
         * !If you need a stack, use an ArrayDeque instead.
         * 
         * 
		 */
		// Show-case of ArrayList
		List<String> list = new ArrayList<>();
		list.add("SD");// [SD]
		list.add(0, "NY");// [NY,SD]
		list.set(1, "FL");// [NY,FL]
		list.remove("NY");// [FL]
		list.remove(0);// []
		
		list.add("OH");// [OH]
		list.add("CO");// [OH,CO]
		list.add("NJ");// [OH,CO,NJ]
		String state = list.get(0);// OH
		int index = list.indexOf("NJ");// 2
		/**
		 * The output would be the same if you tried these examples with LinkedList , Vector , or
		 * Stack . Although the code would be less efficient, it wouldn’t be noticeable until you have
		 * very large lists.
		 */
	}

}
