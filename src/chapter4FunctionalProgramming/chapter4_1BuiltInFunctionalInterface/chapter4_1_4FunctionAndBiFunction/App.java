/**
 * A Function is responsible for turning one parameter into a value of a potentially different
 * type and returning it. Similarly, a BiFunction is responsible for turning two parameters
 * into a value and returning it. Omitting any default or static methods, the interfaces are
 * defined as the following:
 * 
 * @FunctionalInterface public class Function<T, R> {
 *     R apply(T t);
 * }
 * 
 * @FunctionalInterface public class BiFunction<T, U, R> {
 *     R apply(T t, U u);
 * }
 */
package chapter4FunctionalProgramming.chapter4_1BuiltInFunctionalInterface.chapter4_1_4FunctionAndBiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author tkurt
 * Date: Apr 21, 2016 11:31:54 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("cluck")); // 5
		System.out.println(f2.apply("cluck")); // 5
		
		/*
		 * This function turns a String into an Integer . Well, technically it turns the String into
		 * an int , which is autoboxed into an Integer . The types don’t have to be different. The fol-
		 * lowing combines two String objects and produces another String :
		 */
		
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick
	}

}
