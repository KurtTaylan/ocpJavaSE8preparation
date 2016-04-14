/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.advanced;

/**
 * @author tkurt
 * Date: Apr 14, 2016 9:28:16 AM
 *  
 */
public class BikeFactory extends TransporterFactory{

	@Override
	public Transporter create() {
		return new Bike();
	}

}
