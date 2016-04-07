/**
 * Polymorphism is the ability of a single interface to support multiple underlying forms. In
 * Java, this allows multiple types of objects to be passed to a single method or class.
 */
package chapter2DesignPatternsandPrinciples.chapter2_3ImplementingPolymorphism;

/**
 * @author tkurt
 * Date: Apr 7, 2016 2:37:14 PM
 *  
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		App app = new App();
		
		app.showWhoYouAre(new Father());
		app.showWhoYouAre(new Mother());
		app.showWhoYouAre(new BigChild());
		app.showWhoYouAre(new LittleChild());
		
	}

	private void showWhoYouAre(FamilyMember member) {
		member.printName();
	}
}
