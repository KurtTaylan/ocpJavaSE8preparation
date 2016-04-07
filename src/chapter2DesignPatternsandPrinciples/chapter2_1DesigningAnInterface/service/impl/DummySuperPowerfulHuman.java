/**
 * Now I am having longer list because I have inherited all abstract methods
 * of all three interfaces because SuperPower interface extends Power than 
 * indirectly extends HumanBeing.
 */
package chapter2DesignPatternsandPrinciples.chapter2_1DesigningAnInterface.service.impl;

import chapter2DesignPatternsandPrinciples.chapter2_1DesigningAnInterface.service.SuperPower;

/**
 * @author tkurt
 * Date: Apr 7, 2016 12:04:38 PM
 *  
 */
public class DummySuperPowerfulHuman implements SuperPower {

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power#liftHeavy()
	 */
	@Override
	public void liftHeavy() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power#charmPeople()
	 */
	@Override
	public void charmPeople() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power#scarePeople()
	 */
	@Override
	public void scarePeople() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power#talkEfficient()
	 */
	@Override
	public void talkEfficient() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing#walk()
	 */
	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing#sleep()
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing#produce()
	 */
	@Override
	public void produce() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.SuperPower#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.SuperPower#burstLaserFromEyes()
	 */
	@Override
	public void burstLaserFromEyes() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.SuperPower#liftFuckingHeavy()
	 */
	@Override
	public void liftFuckingHeavy() {
		// TODO Auto-generated method stub

	}
	
	/**
	 * this method is default one so I didnt have to implement it
	 */
	@Override
	public void talk(){
		System.out.println("Dummy super powerful human is talking :)");
	}

}
