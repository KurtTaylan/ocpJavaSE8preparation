/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding.childs;

import chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding.parents.Father;

/**
 * @author tkurt
 * Date: Mar 27, 2016 7:26:43 PM
 *  
 */
public class BigBrother extends Father {
	
	public int bigBrotherStrongPoints = 0;
	
	@Override
	public void beStrong() {
		this.bigBrotherStrongPoints += 100;
	}
	
	public void beStrong(int extraPoints) {
		this.bigBrotherStrongPoints += 100 + extraPoints;
	}
}
