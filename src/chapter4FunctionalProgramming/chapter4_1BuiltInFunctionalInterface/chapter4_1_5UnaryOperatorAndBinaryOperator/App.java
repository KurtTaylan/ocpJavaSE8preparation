/**
 * UnaryOperator and BinaryOperator are a special case of a function. They require all type
 * parameters to be the same type.
 * 
 * This means that method signatures look like this:
 * 
 * T apply(T t);
 * T apply(T t1, T t2);
 */
package chapter4FunctionalProgramming.chapter4_1BuiltInFunctionalInterface.chapter4_1_5UnaryOperatorAndBinaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author tkurt
 * Date: Apr 21, 2016 11:42:13 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		
		System.out.println(u1.apply("chirp"));
		System.out.println(u2.apply("chirp"));
		
		/**
		 * This prints CHIRP twice. We don’t need to specify 
		 * the return type in the generics because
		 * UnaryOperator requires it to be the same as the parameter.
		 *  And now for the binary example:
		 */
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick
		
		/*
		 * Notice that this does the same thing as the BiFunction example. 
		 * The code is more succinct, which shows the importance of using
		 * the correct functional interface. It’s nice to have
		 * one generic type specified instead of three.
		 */
		
	}

}
