/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_5Enums.enumDetails;

/**
 * @author tkurt
 * Date: Mar 28, 2016 4:46:20 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		// See how is working for DaysAdvanceEnum.
		DaysAdvanceEnum[] daysArray = DaysAdvanceEnum.values();
		for(DaysAdvanceEnum day : daysArray){
			day.printOpenHourse();
		}
		
		System.out.println();
		
		// See how is working for DaysInAbstractShape.
		DaysInAbstractShape[] daysArrayInAbstractStyle = DaysInAbstractShape.values();
		for (DaysInAbstractShape abstractDay : daysArrayInAbstractStyle) {
					abstractDay.printHours();
					abstractDay.printNightHoursIfOpens();
		}

	}

}
