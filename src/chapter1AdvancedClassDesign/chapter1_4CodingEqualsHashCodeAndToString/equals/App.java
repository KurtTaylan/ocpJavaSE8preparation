/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_4CodingEqualsHashCodeAndToString.equals;

/**
 * @author tkurt
 * Date: Mar 28, 2016 12:44:39 PM
 *  
 */
public class App {

	public static void main(String[] args) {
	
		// Creating Man objects
		Man taylan = new Man(1000,"Taylan","Male","Single",1.84,83);
		Man differentTaylan = new Man(1001,"Taylan Different", "Male", "Married",1.68,101);
		Man ugur = new Man(1001,"Ugurcan","Male","Complicated",1.84,83);
		Man differentUgur = new Man(1001,"Ugurcan Different", "Male", "Married",1.68,101);
		
		// Assigning the case 
		boolean mainCase = taylan.equals(ugur);
		boolean ugurCase = ugur.equals(differentUgur);
		boolean taylanCase = taylan.equals(differentTaylan);
		
		// Null Check -It should return false, rather then NullPointerException
		Man nullTaylan = null;
		boolean nullCase = taylan.equals(nullTaylan);
		System.out.println(nullCase);
		
		// Printing case out
		System.out.println(mainCase); // False
		
		System.out.println(ugurCase); // True,
		//because our equality condition is 
		// ugur.manId == differentUgur.manId 
		// is EQUAL.
		
		System.out.println(taylanCase); //False,
		//because our equality condition is 
		// taylan.manId == differentTaylan.manId 
		// is NOT EQUAL.
	}

}
