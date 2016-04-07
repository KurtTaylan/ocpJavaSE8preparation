/**
 * WithIn this contract we have some power of human being 'Behaviours'
 */
package chapter2DesignPatternsandPrinciples.chapter2_1DesigningAnInterface.service;

/**
 * @author tkurt
 * Date: Apr 7, 2016 11:43:01 AM
 *  
 */
public interface Power extends HumanBeing {

	public abstract void liftHeavy();
	
	public abstract void charmPeople();
	
	public abstract void scarePeople();
	
	public abstract void talkEfficient();
}
