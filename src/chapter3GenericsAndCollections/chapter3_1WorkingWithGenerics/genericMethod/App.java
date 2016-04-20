/**
 * You have already seen generic method on generic class and interface section but still :)
 * 
 * It is also possible to declare them on the method level. This is often useful for static
 * methods since they aren’t part of an instance that can declare the type. However, it is also
 * allowed on non-static methods as well.
 */
package chapter3GenericsAndCollections.chapter3_1WorkingWithGenerics.genericMethod;

import chapter3GenericsAndCollections.chapter3_1WorkingWithGenerics.genericClass.Crate;

/**
 * @author tkurt
 * Date: Apr 14, 2016 11:51:52 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
	}
	
	/**
	 *  The method parameter is the generic type T . The return type is a Crate<T> . Before the
	 *  return type, we declare the formal type parameter of <T> .
	 */
	public static <T,U> Crate<T,U> ship(T t, U u) {
		System.out.println("Preparing " + t +", For size of:" + u);
		return new Crate<T,U>(t,u);
	}
	
	/**
	 * Unless a method is obtaining the generic formal type parameter from the class/interface,
	 * it is specified immediately before the return type of the method. This can lead to some
	 * interesting-looking code!
	 */
	public static <T> void sink(T t) {
	}

	public static <T> T identity(T t) {
		return t;
	}
	
	// public static T noGood(T t) { return t; } // DOES NOT COMPILE

}
