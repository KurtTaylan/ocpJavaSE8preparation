/**
 * In Immutable Object pattern we set the object by Constructor than 
 * never let them change internally and especially externally.
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_3BuilderPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author tkurt
 * Date: Apr 10, 2016 10:51:33 AM
 *  
 */
public class Animal {
	
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;

	/**
	 * 
	 * @param species
	 * @param age
	 * @param favoriteFoods takes new mirrored object of it.
	 */
	public Animal(String species, int age, List<String> favoriteFoods) {
		
		this.species = species;
		this.age = age;
		/**
		 * Because this list is 'Object reference' we need to project them 
		 * pass by reference issue.
		 */
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		// By doing this, creating separated independent new object. 
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	public String getSpecies() {
		
		return species;
	}

	public int getAge() {
		
		return age;
	}

	public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
		
		// Because of direct access of object at heap! 
		/**
		 * One solution to this is some other solution to unmutable objects pattern :)
		 */
		List<String> unmodifiableList = (List) Collections.unmodifiableCollection(favoriteFoods);
		
		// or just do this :) , than return this instead of instance 's list object 'favoriteFoods'
		List<String> newObjectReferencedList = new ArrayList<String>(favoriteFoods);
		
		return favoriteFoods;
	}

	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
	
}
