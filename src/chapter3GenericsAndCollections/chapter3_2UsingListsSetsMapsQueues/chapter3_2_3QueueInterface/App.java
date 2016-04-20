/**
 * You use a queue when elements are added and removed in a specific order. Queues are 
 * typically used for sorting elements prior to processing them. For example, when you want to
 * buy a ticket and someone is waiting in line, you get in line behind that person. And if you
 * are British, you get in the queue behind that person, making this really easy to remember!
 * 
 * You saw LinkedList earlier in the List section. In addition to being a list, it is a double-
 * ended queue. A double-ended queue is different from a regular queue in that you can insert
 * and remove elements from both the front and back of the queue.
 * 
 * The main benefit of a LinkedList is that it implements both the List and Queue
 * interfaces. The tradeoff is that it isn’t as efficient as a “pure” queue.
 * 
 * An ArrayDeque is a “pure” double-ended queue. It was introduced in Java 6, and it
 * stores its elements in a resizable array. The main benefit of an ArrayDeque is that it is more
 * efficient than a LinkedList . Deque is supposed to be pronounced “deck,” but many people,
 * including the authors, say it wrong as “d-queue.”
 * 
 * Except for push , all are in the Queue interface as well. push is what makes it a double-
 * ended queue.
 */
package chapter3GenericsAndCollections.chapter3_2UsingListsSetsMapsQueues.chapter3_2_3QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author tkurt
 * Date: Apr 19, 2016 4:35:50 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		// Write for the queue data structure
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10)); // true
		System.out.println(queue.offer(4));// true
		System.out.println(queue.peek());// 10
		System.out.println(queue.poll());// 10
		System.out.println(queue.poll());// 4
		System.out.println(queue.peek());// null
		
		/**
		 * Now let’s rewrite that example using the stack functionality:
		 */
		System.out.println();
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(4);
		System.out.println(stack.peek());// 4
		System.out.println(stack.poll());// 4
		System.out.println(stack.poll());// 10
		System.out.println(stack.peek());// null
		
		
	}

}
