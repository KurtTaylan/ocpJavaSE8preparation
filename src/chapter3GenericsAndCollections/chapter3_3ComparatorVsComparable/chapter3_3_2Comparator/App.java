/**
 * Sometimes you want to sort an object that did not implement Comparable , or you want to
 * sort objects in different ways at different times.
 */
package chapter3GenericsAndCollections.chapter3_3ComparatorVsComparable.chapter3_3_2Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author tkurt Date: Apr 19, 2016 8:15:42 PM
 * 
 */
public class App implements Comparable<App>{

	private String name;
	private int weight;

	public App(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() { // use readable output
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(App app) { // call String's compareTo
		return name.compareTo(app.name);
	}

	public static void main(String[] args) {

		/**
		 * With comparator you can give some other condition to object to
		 * compare by initiating by lambda
		 */
		Comparator<App> byWeight = (app1, app2) -> app1.getWeight() - app2.getWeight();

		List<App> apps = new ArrayList<>();
		apps.add(new App("Quack", 7));
		apps.add(new App("Puddles", 10));

		Collections.sort(apps);
		System.out.println(apps);// [Puddles, Quack]
		Collections.sort(apps, byWeight);
		System.out.println(apps);// [Quack, Puddles]
		
		/**
		 * We said that Comparator is a functional interface because it has a single abstract method.
		 * Comparable is also a functional interface since it also has a single abstract method. How-
		 * ever, using a lambda for Comparable would be silly. The point of Comparable is to imple-
		 * ment it inside the object being compared.
		 */
		
		/**
		 * There is advanced way to compare multiple variable with lambda
		 */
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
