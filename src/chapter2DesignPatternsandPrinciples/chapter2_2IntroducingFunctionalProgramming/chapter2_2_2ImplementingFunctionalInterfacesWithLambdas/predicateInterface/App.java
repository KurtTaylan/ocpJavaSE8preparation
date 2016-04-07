/**
 * Actually, we dont have implement functional interface in some cases,
 * Java sees our some common problem and templating it : 
 * Predict interface; in java.util.function package - Functional interface with
 * public interface Predicate<T> {
 *  public boolean test(T t);
 * }
}
 */
package chapter2DesignPatternsandPrinciples.chapter2_2IntroducingFunctionalProgramming.chapter2_2_2ImplementingFunctionalInterfacesWithLambdas.predicateInterface;

import java.util.function.Predicate;

import chapter2DesignPatternsandPrinciples.chapter2_2IntroducingFunctionalProgramming.chapter2_2_2ImplementingFunctionalInterfacesWithLambdas.Animal;

/**
 * @author tkurt
 * Date: Apr 7, 2016 2:25:13 PM
 *  
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		print(new Animal("fish",false,false), (Animal animal) -> animal.canHop() );
		print(new Animal("kangroo",true,false), (Animal animal) -> animal.canHop() );
		print(new Animal("rabbit",true,false), (Animal animal) -> animal.canHop() );
	} 

	private static void print(Animal animal, Predicate<Animal> trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}
}
