/**
 * The Comparable interface has only one method. In fact, this is the entire interface:
 * 
 * public interface Comparable<T> {
 *     public int compareTo(T o);
 * }
 * 
 * 
 */
package chapter3GenericsAndCollections.chapter3_3ComparatorVsComparable.chapter3_3_1Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author tkurt
 * Date: Apr 19, 2016 8:04:58 PM
 *  
 */
public class App implements Comparable<App> {
	
	private String name;
	
	public App(String name) {
		this.name = name;
	}

	@Override
	public String toString() {  // use readable output
		return name;
	}
	
	@Override
	public int compareTo(App app) { // call String's compareTo
		return name.compareTo(app.name);
	}
	
	public static void main(String[] args) {
		
		// We created list with class instances which implemented 'compareto' method
		List<App> apps = new ArrayList<>();
		apps.add(new App("app1"));
		apps.add(new App("app2"));
		
		Collections.sort(apps);
		System.out.println(apps); // [app1, app2]
		
	}

}
