/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_4CodingEqualsHashCodeAndToString.toString;

/**
 * @author tkurt 
 * Date: Mar 27, 2016 11:01:24 PM
 * 
 */
public class ManParent {
	protected double height;
	protected int weight;
	protected String name;
	protected String sex;
	protected String martialStatus;

	public ManParent(String name, String sex, String martialStatus, double height, int weight) {
		this.name = name;
		this.sex = sex;
		this.martialStatus = martialStatus;
		this.height = height;
		this.weight = weight;
	}

	
	/**
	 * You can create your own style of create Object.toString(); method 
	 * via override it from superclass. 
	 */
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();

		builder.append("Name:" + this.name + "\n");
		builder.append("Sex:" + this.sex + "\n");
		builder.append("Martial Status:" + this.martialStatus + "\n");
		builder.append("Height:" + this.height + "\n");
		builder.append("Weight:" + this.weight + "\n");
		
		return builder.toString();
	}
}
