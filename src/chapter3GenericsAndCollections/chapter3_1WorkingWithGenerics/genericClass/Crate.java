/**
 * A type parameter can be named anything you want. The convention is to use single
 * uppercase letters to make it obvious that they aren’t real class names. The following are
 * common letters to use:
 * E for an element
 * K for a map key
 * V for a map value
 * N for a number
 * T for a generic data type
 * S , U , V , and so forth for multiple generic types
 * 
 */
package chapter3GenericsAndCollections.chapter3_1WorkingWithGenerics.genericClass;

/**
 * @author tkurt
 * Date: Apr 14, 2016 10:21:55 AM
 *  
 */
//This is how to declare generic classes for your class
//This let you create 'Type-safe' classes.
public class Crate<T,U> {
	
	private T contents;
	private U sizeLimit;
	
	/**
	 * 
	 * @param contents is our instance it will be comed
	 * @param sizeLimit is our limit how much we create content
	 * 
	 */
	public Crate(T contents,U sizeLimit){
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}
	
	/**
	 * Generic classes become useful when the classes used as the type parameter can have absolutely
     * nothing to do with each other.
	 */
	
	/** TYPE ERASURE
	 * 
	 * Specifying a generic type allows the compiler to enforce proper use of the generic type.
	 * For example, specifying the generic type of Crate as Robot is like replacing the T in the
	 * Crate class with Robot . However, this is just for compile time.
	 * 
	 * Behind the scenes, the compiler replaces all references to T in Crate with Object . In other
     * words, after the code compiles, your generics are actually just Object types.
     * 
     * This means there is only one class file. There aren’t different copies for different
     * parameterized types. (Some other languages work that way.)
     * 
     * This process of removing the generics syntax from your code is referred to as type
     * erasure. Type erasure allows your code to be compatible with older versions of Java
     * that do not contain generics.
     * 
     * The compiler adds the relevant casts for your code to work with this type of erased
     * class
	 * 
	 */
}
