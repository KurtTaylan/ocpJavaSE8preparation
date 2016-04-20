/**
 * Another new method introduced on List s is replaceAll . Java 8 lets you pass a lambda
 * expression and have it applied to each element in the list. The result replaces the current
 * value of that element.
 * 
 * The method signature looks like:
 *    void replaceAll(UnaryOperator<E> o)
 *    
 * It uses a UnaryOperator , which takes one parameter and returns a value of the same
 * type.
 */
package chapter3GenericsAndCollections.chapter3_4AdditionInJava8.chapter3_4_3UpdatingAllElements;

import java.util.Arrays;
import java.util.List;

/**
 * @author tkurt
 * Date: Apr 19, 2016 10:25:11 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		list.replaceAll(x -> x*2);
		System.out.println(list); // [2, 4, 6]
		
		
	}

}
