/**
 *  This is mock object class for show method reference
 */
package chapter3GenericsAndCollections.chapter3_4AdditionInJava8.chapter3_4_1MethodReferences;

/**
 * @author tkurt
 * Date: Apr 19, 2016 9:43:40 AM
 *  
 */
public class Duck {
	
	private int weight;
	private String name;
	
	public Duck(String name,int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
