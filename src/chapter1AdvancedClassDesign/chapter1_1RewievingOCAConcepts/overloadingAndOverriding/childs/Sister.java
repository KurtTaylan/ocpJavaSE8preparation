/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding.childs;

import chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding.parents.Mother;

/**
 * @author tkurt
 * Date: Mar 27, 2016 7:27:22 PM
 *  
 */
public class Sister extends Mother {
	
	public int sisterEmotionalPoint = 0;
	
	@Override
	public void beEmotional() {
		this.sisterEmotionalPoint += 100;
	}
	
	public void beEmotional(int extraPoints){
		this.sisterEmotionalPoint += 100 + extraPoints;
	}

}
