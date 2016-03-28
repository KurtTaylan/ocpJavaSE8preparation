/**
 * It has implemented its own equals method to make compare easier
 */
package chapter1AdvancedClassDesign.chapter1_4CodingEqualsHashCodeAndToString.equals;

import chapter1AdvancedClassDesign.chapter1_4CodingEqualsHashCodeAndToString.toString.ManParent;

/**
 * @author tkurt
 * Date: Mar 28, 2016 12:45:56 PM
 *  
 */
public class Man extends ManParent{
	protected int manId;
	
	public Man(int manId,String name, String sex, String martialStatus, double height, int weight) {
		super(name, sex, martialStatus, height, weight);
		this.manId = manId;
	}
	
	
	/**
	 * The equals() method implements an equivalence relation on non‐null object references:
	 * -It is reflexive: For any non‐null reference value x , x.equals(x) should return true .
	 * 
	 * -It is symmetric: For any non‐null reference values x and y , x.equals(y) should return
     *  true if and only if y.equals(x) returns true .
     *  
	 * -It is transitive: For any non‐null reference values x , y , and z , if x.equals(y) returns
     *  true and y.equals(z) returns true , then x.equals(z) should return true .
     *  
	 * -It is consistent: For any non‐null reference values x and y , multiple invocations of
     *  x.equals(y) consistently return true or consistently return false , provided no
     *  information used in equals comparisons on the objects is modified.
     *  
     *  -For any non‐null reference value x , x.equals(null) should return false .
     *  
     *  !!The most interesting rule is the last
     *    one. It should be obvious that an object and null aren’t equal. The key is that equals()
     *    needs to return false when this occurs rather than throw a NullPointerException .
	 */
	@Override
	public boolean equals(Object object){
		// First Null check
		if(object == null) return false;
		// Second Type checking.
		if(!((Man)object instanceof Man)) return false;

		Man otherMan = (Man) object;
		
		return this.manId == otherMan.manId;
	}

}
