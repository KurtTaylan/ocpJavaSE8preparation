/**
 * This 'Mock' Object is just for to test your interfaces.
 * Within this one we gonna test our 'Human' interface
 */
package chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.impl;

import chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing;

/**
 * @author tkurt
 * Date: Apr 7, 2016 11:57:31 AM
 *  
 */
public class DummyHuman implements HumanBeing{

	/**
	 * As you can see we had to implement 'abstract' 
	 * type methods of interface
	 */
	@Override
	public void walk() {
		System.out.println("Dummy is walking");
	}

	@Override
	public void sleep() {
		System.out.println("Dummy is sleeping");		
	}

	@Override
	public void eat() {
		System.out.println("Dummy is eating");		
	}

	@Override
	public void produce() {
		System.out.println("Dummy is produce");		
	}
	
	/**
	 * this method is default one so I didnt have to implement it
	 */
	@Override
	public void talk(){
		System.out.println("Dummy Human is talking :)");
	}

}
