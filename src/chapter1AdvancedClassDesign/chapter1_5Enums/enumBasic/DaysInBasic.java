/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_5Enums.enumBasic;

/**
 * @author tkurt
 * Date: Mar 28, 2016 1:55:35 PM
 *  
 */
public enum DaysInBasic {

	/**
	 * An enum is a type of class that mainly contains static final members-constants.
	 * It also includes some helper methods like name() that 
	 * you will see shortly.
	 * 
	 * You cannat extend enum class because it should be constant even 
	 * at runtime.
	 */
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,
	SATURDAY,SUNDAY
}
