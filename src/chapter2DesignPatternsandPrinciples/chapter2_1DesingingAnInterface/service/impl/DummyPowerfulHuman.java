
/**
 *  While I am having 'mock' for Power interface I had to 
 *  inherit human being abstract methods too because I extended 
 *  power interface from HumanBeing.
 */
package chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.impl;

import chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power;

/**
 * @author tkurt
 * Date: Apr 7, 2016 12:01:01 PM
 *  
 */
public class DummyPowerfulHuman implements Power {

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing#walk()
	 */
	@Override
	public void walk() {

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing#sleep()
	 */
	@Override
	public void sleep() {

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing#eat()
	 */
	@Override
	public void eat() {

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.HumanBeing#produce()
	 */
	@Override
	public void produce() {

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power#liftHeavy()
	 */
	@Override
	public void liftHeavy() {

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power#charmPeople()
	 */
	@Override
	public void charmPeople() {

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power#scarePeople()
	 */
	@Override
	public void scarePeople() {

	}

	/* (non-Javadoc)
	 * @see chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service.Power#talkEfficient()
	 */
	@Override
	public void talkEfficient() {

	}

}
