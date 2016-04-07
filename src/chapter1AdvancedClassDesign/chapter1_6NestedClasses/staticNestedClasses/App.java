/**
 * A static nested class is a static
 * class defined at the member level. It can be instantiated without an object of the
 * enclosing class, so it can’t access the instance variables without an explicit object of
 * the enclosing class.
 * 
 * -The nesting creates a namespace because the enclosing class name must be used to refer
 *  to it.
 *  
 * -It can be made private or use one of the other access modifiers to encapsulate it.
 * 
 * -The enclosing class can refer to the fields and methods of the static nested class.
 * 
 */
package chapter1AdvancedClassDesign.chapter1_6NestedClasses.staticNestedClasses;

import java.util.Scanner;


/**
 * @author tkurt
 * Date: Mar 30, 2016 8:19:25 AM
 *  
 */
public class App {
	public static void main(String[] args) {
		
		/**
		 * Since the class is static , you do not need an
         * instance of Enclosing in order to use it.
		 */
		StaticApp staticApp = new StaticApp();
		/**
		 * You are allowed to access private instance
         * variables
		 */
		System.out.println(staticApp.number);
		
		
	}
	
	static class StaticApp{
		private int number = 10;
	} 

}
