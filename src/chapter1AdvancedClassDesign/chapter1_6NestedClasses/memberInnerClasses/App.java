/**
 * A member inner class is defined at the member level of a class
 * 
 * -Can be declared public, private, or protected or use default access
 * -Can extend any class and implement interfaces
 * -Can be abstract or final
 * -Cannot declare static fields or methods !!
 * -Can access members of the outer class including private members
 */
package chapter1AdvancedClassDesign.chapter1_6NestedClasses.memberInnerClasses;

/**
 * @author tkurt
 * Date: Mar 28, 2016 10:22:58 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		App app = new App();
		
		// Since a member inner class is not static,
		// it has to be used with an instance of the outer class. 
		InnerClass innerClass= app.new InnerClass();
		innerClass.showYourSelf();
	}
	
	
	public class InnerClass{
		
		public void showYourSelf(){
			System.out.println("I am member inner class");		 			
		}
	}
}
