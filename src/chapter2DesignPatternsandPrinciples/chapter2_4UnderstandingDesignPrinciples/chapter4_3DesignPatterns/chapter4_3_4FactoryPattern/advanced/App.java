/**
 *  In this example we are going to see factory 'method' pattern in bigger perspective.
 * 	
 * Again, whole point of this pattern is to defer object creation to subclass.
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_4FactoryPattern.advanced;

/**
 * @author tkurt
 * Date: Apr 13, 2016 6:22:47 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		// First we are creating our general factory class with
		// concrete factory class we want to create. In this case car. 
		TransporterFactory factory = new CarFactory();
		Transporter car = factory.create();
		
		//Printing out to see what we have here.
		System.out.println(car.drive()); // Car is Driving

		//Now we are referencing to another concrete factory.
		factory = new BikeFactory();
		Transporter bike = factory.create();
		
		//Printing out to see what we have here.
		System.out.println(bike.drive()); // Bike is Driving
		
	}

}
