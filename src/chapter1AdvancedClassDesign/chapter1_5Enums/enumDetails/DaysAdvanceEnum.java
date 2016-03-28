/**
 *  
 */
package chapter1AdvancedClassDesign.chapter1_5Enums.enumDetails;

/**
 * @author tkurt
 * Date: Mar 28, 2016 4:47:03 PM
 *  
 */
public enum DaysAdvanceEnum {
	
	/**
	 * When you open paranthesis;
	 * Think like you are creating small classes that
	 * you need to CONSTRUCT them according to parameters.
	 */
	MONDAY("10:00-22:00"),TUESDAY("10:00-22:00"),
	WEDNESDAY("11:00-22:00"),THURSDAY("11:00-22:00"),
	FRIDAY("10:00-20:00"),SATURDAY("11:00-23:00"),
	SUNDAY("12:00-20:00"); // <-- the semicolon at the end of the enum 
						  //      values is optional only if the only
						 //       thing in the enum is that list of values.
	
	private String openHourse;
	
	/**
	 * Contructor need to be PRIVATE, you should not
	 * initiate the enum class.
	 * 
	 * The code will not compile with a public constructor.
	 * 
	 * Days.MONDAY.printOpenHourse();
	 * Notice how we don’t appear to call the constructor. We just say that we want the enum
     * value. The first time that we ask for any of the enum values, Java constructs all of the enum
     * values. After that, Java just returns the already‐constructed enum values
	 * 
	 * @param openHourse:For which day shop is open.
	 */
	private DaysAdvanceEnum(String openHourse) {
		this.openHourse = openHourse;
	}
	
	public void printOpenHourse(){
		System.out.println("Today is "+this.name()+" and we are open between: "+ openHourse);
	}

}
