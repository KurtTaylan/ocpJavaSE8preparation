/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_5Enums.enumDetails;

/**
 * @author tkurt
 * Date: Mar 28, 2016 9:59:34 PM
 *  
 */
public enum DaysInAbstractShape {
	
	
	MONDAY {
		public void printHours() {
			System.out.println("Today is "+this.name()+" and we are open between: 9am-3pm");
		}

		@Override
		public void printNightHoursIfOpens() {
			System.out.println(this.name() + " has night shift");
		}
	},
	TUESDAY {
		public void printHours() {
			System.out.println("Today is "+this.name()+" and we are open between: 9am-3pm");
		}
	},
	WEDNESDAY {
		public void printHours() {
			System.out.println("Today is "+this.name()+" and we are open between: 9am-7pm");
		}
	},
	THURSDAY {
		public void printHours() {
			System.out.println("Today is "+this.name()+" and we are open between: 9am-3pm");
		}
	},
	FRIDAY {
		public void printHours() {
			System.out.println("Today is "+this.name()+" and we are open between: 9am-7pm");
		}
		
		@Override
		public void printNightHoursIfOpens() {
			System.out.println(this.name() + " has night shift");
		}
	},
	SATURDAY {
		public void printHours() {
			System.out.println("Today is "+this.name()+" and we are open between: 9am-3pm");
		}
	},
	SUNDAY {
		public void printHours() {
			System.out.println("Today is "+this.name()+" and we are open between: 9am-7pm");
		}
	};

	/**
	 * We can define abstract method for each constant inherit from.
	 */
	public abstract void printHours();

	/**
	 * We can define normal method type for each constant inherit from.
	 */
	public void printNightHoursIfOpens() {
		System.out.println("This day does not have night shift");
	}
}
