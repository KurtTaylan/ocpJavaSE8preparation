/**
 *  Here we have 'product' factory for to get product at run-time.
 *  
 *  In here factory 'method' pattern looks quite similar to abstract factory pattern;
 *  -Only difference is that abstract factory pattern has compose objects way ;) 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.advanced;

/**
 * @author tkurt
 * Date: Apr 13, 2016 6:39:49 PM
 *  
 */
public class CarFactory extends TransporterFactory {

	@Override
	public Transporter create() {
		return new Car();
	}

}
