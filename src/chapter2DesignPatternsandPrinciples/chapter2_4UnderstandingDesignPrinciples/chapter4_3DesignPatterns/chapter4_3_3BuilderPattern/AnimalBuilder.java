/**
 * 
 * - Builder pattern rely on 'Method Chaining' i.e StringBuilder :)
 * - Of course also, get result method , mostly called 'build()' 
 * 
 *  This class uses Animal 'immutable' class to build. Again,
 *  we can use this pattern with mutable classes as well.
 *  This way of implementation of Builder pattern is defensive.
 *  
 *  We can use this pattern to provide reusable code for 
 *  part of application we need to implement over and over.
 *  
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_3BuilderPattern;

import java.util.List;

/**
 * @author tkurt Date: Apr 10, 2016 12:33:27 PM
 * 
 */
public class AnimalBuilder {
	private String species;
	private int age;
	private List<String> favoriteFoods;

	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}

	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}

	public Animal build() {
		return new Animal(species, age, favoriteFoods);
	}
	
	/**
	 * In practice, a builder class is often packaged alongside its target class, either as a static
	 * inner class within the target class or within the same Java package. One advantage of
	 * packing them together is that if one is changed, then the other can be quickly updated.
	 * Another advantage is that writers of the target class can then choose to make the
	 * constructor a private or default package, forcing the user to rely on the builder object
	 * to obtain instances of the target class. For example, if the Animal class did not have a
	 * public constructor, programs calling it from other packages would be required to use the
	 * AnimalBuilder class to create instances of Animal.
	 */
}
