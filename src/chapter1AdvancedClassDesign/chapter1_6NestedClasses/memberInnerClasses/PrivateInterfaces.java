/**
 * The rule that all methods in an interface are public still applies. A class that implements
 * the interface must define that method as public .
 * 
 * The interface itself does not have to be public , though. Just like any inner class, an inner
 * interface can be private . This means that the interface can only be referred to within the
 * current outer class.
 */
package chapter1AdvancedClassDesign.chapter1_6NestedClasses.memberInnerClasses;

/**
 * @author tkurt
 * Date: Mar 28, 2016 10:52:19 PM
 *  
 */
public class PrivateInterfaces {
	
	private interface HideAndCatch {
		public void hide();
		public void catchHided();
	}

	class PlayGame implements HideAndCatch {

		@Override
		public void hide() {
			System.out.println("I have hided");
		}

		@Override
		public void catchHided() {
			System.out.println("I have catched one to be hided");
		}
	}
	
	public static void main(String[] args) {
		
		PrivateInterfaces app = new PrivateInterfaces();
		PlayGame play = app.new PlayGame();
		
		play.hide();
		play.catchHided();
	}
}
