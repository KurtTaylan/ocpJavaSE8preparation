/**
 * Here we are going to see about compare to object on multiple fields.
 */
package chapter3GenericsAndCollections.chapter3_3ComparatorVsComparable.chapter3_3_2Comparator;

import java.util.Comparator;

/**
 * @author tkurt
 * Date: Apr 20, 2016 8:21:02 AM
 *  
 */
/*
 * It implements Comparator interface itself.
 */
public class AdvancedApp implements Comparator<Squirrel> {
	
	public static void main(String[] args) {

	}

	/**
	 * With overriden method we can create our complex comparator functions.
	 */
	@Override
	public int compare(Squirrel s1, Squirrel s2) {
		
		/* oldschool way
			int result = app1.getSpecies().compareTo(app2.getSpecies());
			if(result !=0)
				return result;
			
			return app1.getWeight() - app2.getWeight();
		*/
		
		Comparator<Squirrel> c = Comparator. comparing (s -> s.getSpecies());
		c = c.thenComparingInt(s -> s.getWeight());
		return c.compare(s1, s2);
	}

}
