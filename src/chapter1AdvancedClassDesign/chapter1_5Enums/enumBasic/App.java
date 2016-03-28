/**
 * In programming, it is common to have a type that can only have a finite set of values. An
 * enumeration is like a fixed set of constants.
 * 
 * It is much better than a bunch of constants because it provides type‐safe
 * checking.
 * 
 * Enumerations show up whenever you have a set of items whose types are known at com-
 * pile time. Common examples are the days of the week, months of the year, the planets in
 * the solar system, or the cards in a deck.
 * 
 */
package chapter1AdvancedClassDesign.chapter1_5Enums.enumBasic;

/**
 * @author tkurt
 * Date: Mar 28, 2016 1:45:54 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		/**
		 * You cannot initiate enum class 
		 * because it is 
		 */
		DaysInBasic monday = DaysInBasic.MONDAY;
		
		/**
		 * Enum class type has method name();
		 * when you call toString();
		 * that method coming in the picture.
		 * Than prints out constant name.
		 */
		System.out.println(monday);
		System.out.println(DaysInBasic.MONDAY);
		System.out.println(monday == DaysInBasic.MONDAY);
		
		
		/**
		 * An enum provides a method to get an array of all of the values.
		 *  You can use this like any normal array, including in a loop:
		 */
		for (DaysInBasic day : DaysInBasic.values()) {
			System.out.println(day.name() + " " + day.ordinal());
		}
		
		/**
		 * You cannot reach enum by 'int' value
		 * 
		 * FALSE: if(Days.Monday == 0);
		 * 
		 */
		
		
		/**
		 * 
		 * Another thing that you can’t do is extend an enum .
         * public enum ExtendedSeason extends Season { } // DOES NOT COMPILE
		 * 
		 */
		
		/**
		 * Swich - Case: You cannot assign Days.Monday rather than MONDAY to case.
		 * It would not compile ! 
		 */
		
		DaysInBasic someDay = DaysInBasic.SUNDAY;
		switch (someDay) {
		case MONDAY:
			System.out.println("Today is monday");
			break;
		case TUESDAY:
			System.out.println("Today is tuesday");
			break;
		case SUNDAY:
			System.out.println("This is the day to be lazy!");
			break;
		// case Days.SUNDAY: it does not compile !
		default:
			System.out.println("You are seeing default case.");
		}
	}

}
