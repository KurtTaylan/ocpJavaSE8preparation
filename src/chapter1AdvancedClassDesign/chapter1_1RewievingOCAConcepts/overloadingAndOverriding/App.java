/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding;

import chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding.childs.BigBrother;
import chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding.childs.Sister;
import chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding.parents.Father;
import chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.overloadingAndOverriding.parents.Mother;

/**
 * @author tkurt Date: Mar 27, 2016 7:20:06 PM
 * 
 */
public class App {

	public static void main(String[] args) {
		Father father = new Father();
		Mother mother = new Mother();

		BigBrother bigBrother = new BigBrother();
		Sister sister = new Sister();

		father.beStrong();
		System.out.println("Father strong: " + father.fatherStrongPoint);
		bigBrother.beStrong();
		System.out.println("BigBrother strong: " + bigBrother.bigBrotherStrongPoints);

		int extra = 19;
		bigBrother.beStrong(extra);
		System.out.println("BigBrother strong after extra: " + bigBrother.bigBrotherStrongPoints);

		mother.beEmotional();
		System.out.println("Mother emotion: " + mother.motherEmotionPoints);
		
		sister.beEmotional();
		System.out.println("Sister emotion : " + sister.sisterEmotionalPoint);

		sister.beEmotional(extra);
		System.out.println("Sister emotion after extra : " + sister.sisterEmotionalPoint);
	}

}
