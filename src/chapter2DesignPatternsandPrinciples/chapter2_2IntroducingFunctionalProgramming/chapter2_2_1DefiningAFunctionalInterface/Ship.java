/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_2IntroducingFunctionalProgramming.chapter2_2_1DefiningAFunctionalInterface;


/**
 * @author tkurt
 * Date: Apr 7, 2016 1:20:12 PM
 *  
 */
public class Ship implements Jump {

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1IntroducingFunctionalProgramming.Jump#jumpAround(int)
	 * We have some condition
	 */
	@Override
	public void jumpAround(int height) {
		String sentence = height > 10 ? "Enoughy High to jump" : "Not enough";
		System.out.println(sentence);
	}

}
