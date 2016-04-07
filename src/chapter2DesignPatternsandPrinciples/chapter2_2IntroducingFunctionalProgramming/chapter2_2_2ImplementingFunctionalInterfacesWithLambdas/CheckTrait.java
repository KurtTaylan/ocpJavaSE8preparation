/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_2IntroducingFunctionalProgramming.chapter2_2_2ImplementingFunctionalInterfacesWithLambdas;

/**
 * @author tkurt
 * Date: Apr 7, 2016 1:33:59 PM
 *  
 */
@FunctionalInterface
public interface CheckTrait {
	public boolean test(Animal animal);
}
