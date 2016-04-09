/**
 * One thing to keep in mind is that there might be multiple llama trainers at the zoo
 * but only one food storage location. Within our data model, this would amount to many
 * LlamaTrainer instances but only a single instance of HayStorage .
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_1SingletonDesignPattern;

/**
 * @author tkurt
 * Date: Apr 9, 2016 11:41:16 AM
 *  
 */
public class LlamaTrainer {
	
	public boolean feedLlamas(int numberOfLlamas) {
		
		int amountNeeded = 5 * numberOfLlamas;
		HayStorage hayStorage = HayStorage.getInstance();
		
		if (hayStorage.getHayQuantity() < amountNeeded) {
			hayStorage.addHay(amountNeeded + 10);
		}
		
		boolean fed = hayStorage.removeHay(amountNeeded);
		
		if (fed)
			System.out.println("Llamas have been fed");
		return fed;
	}
	/**
	 * We can initiate our singleton class with other ways too , 
	 * 
	 */
}
