/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.accessModifiers.hiearchy.species;

import chapter1AdvancedClassDesign.chapter1_1RewievingOCAConcepts.accessModifiers.hiearchy.Fish;

/**
 * @author tkurt
 * Date: Mar 27, 2016 7:10:36 PM
 * 
 */
public class Shark extends Fish {
	
	public int teethNumber;
	protected String fishName;
	boolean isDangerous;
	private float measurements;
	
	public Shark(int teethNumber, String fishName,boolean isDangerous ,float measurements ) {
		this.teethNumber = teethNumber;
		this.fishName = fishName;
		this.isDangerous = isDangerous;
		this.measurements = measurements;
	}
}
