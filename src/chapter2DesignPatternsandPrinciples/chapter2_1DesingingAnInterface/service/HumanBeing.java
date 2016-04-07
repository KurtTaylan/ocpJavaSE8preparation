/**
 *  We have here some parent Interface we can inherit from.
 *  
 *  This is contract if we want to be human :) 
 *  Of course we need to have some 'Behaviours' to be human.
 */
package chapter2DesignPatternsandPrinciples.chapter2_1DesingingAnInterface.service;

/**
 * @author tkurt
 * Date: Apr 7, 2016 11:35:49 AM
 *  
 */
public interface HumanBeing {
	
	/**
	 * Of course there are different human being 
	 * who has different measurements but this is for average :)
	 */
	public static final int WEIGHT = 80;
	public static final float HEIGHT = 1.75f; 
	
	public abstract void walk();
	
	public abstract void sleep();
	
	public default void talk(){
		System.out.println("Hi I am Human Being :)");
	}
	
	public abstract void eat();
	
	public abstract void produce();

}

