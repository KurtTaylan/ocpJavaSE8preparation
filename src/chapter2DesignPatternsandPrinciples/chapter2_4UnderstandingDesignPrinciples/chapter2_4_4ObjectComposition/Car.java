/**
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter2_4_4ObjectComposition;

/**
 * @author tkurt
 * Date: Apr 7, 2016 5:27:25 PM
 *  
 */
/**
 * This is delegate classes. We created this to compose two distinct classes 
 * which cannot take inheritance from each other.
 */
public class Car {
	
	private final Break breakCar;
	private final Gas gasCar;
	
	public Car(Gas gasCar,Break breakCar){
		this.gasCar = gasCar;
		this.breakCar = breakCar;
	}
	
	/**
	 * We are delegating composed classes methods to them.
	 */
	public void breakCar(){
		this.breakCar.breakCar();
	}
	
	public void getSpeedUp(){
		this.gasCar.getSpeedUp();
	}
	
	public void getSpeedDown(){
		this.gasCar.getSpeedDown();
	}
}
