/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_2IntroducingFunctionalProgramming.chapter2_2_2ImplementingFunctionalInterfacesWithLambdas;

/**
 * @author tkurt 
 * Date: Apr 7, 2016 1:34:17 PM
 * 
 */
public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}
	
	@Override
	public String toString() {
		return species;
	}
}
