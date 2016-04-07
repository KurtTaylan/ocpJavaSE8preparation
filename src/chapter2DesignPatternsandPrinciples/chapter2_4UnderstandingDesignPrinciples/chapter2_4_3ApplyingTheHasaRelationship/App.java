/**
 * In object‐oriented design, we often want to test whether an object contains a particular
 * property or value. We refer to the has‐a relationship as the property of an object having a
 * named data object or primitive as a member. The has‐a relationship is also known as the
 * object composition test
 * 
 * 
 * More generally, if a parent has‐a object as a protected or public member,
 * then any child of the parent must also have that object as a member. Note that this does not
 * hold true for private members defined in parent classes, because private members are
 * not inherited in Java.
 * 
 * Sometimes relationships appear to pass the is‐a test but fail when combined with the
 * has‐a test via inheritance;
 * 
 * -Then what we should do is that we should
 * remove the property from the Parent class, since not all child classes have that property.
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter2_4_3ApplyingTheHasaRelationship;

/**
 * @author tkurt
 * Date: Apr 7, 2016 5:02:01 PM
 *  
 */
public class App {

	public static void main(String[] args) {

	}

}
