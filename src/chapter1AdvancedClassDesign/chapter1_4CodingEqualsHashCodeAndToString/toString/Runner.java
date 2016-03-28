/**
 * 
 */
package chapter1AdvancedClassDesign.chapter1_4CodingEqualsHashCodeAndToString.toString;

/**
 * @author tkurt
 * Date: Mar 27, 2016 11:09:29 PM
 *  
 */
public class Runner {

	public static void main(String[] args) {
		/**
		 * Look	at Man.toString();
		 */
		ManParent man = new ManParent("Taylan","Male","Single",1.84,83);
		
		System.out.println(man);
	}

}
