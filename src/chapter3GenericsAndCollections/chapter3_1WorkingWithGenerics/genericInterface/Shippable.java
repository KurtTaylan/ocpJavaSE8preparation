/**
 * 
 */
package chapter3GenericsAndCollections.chapter3_1WorkingWithGenerics.genericInterface;

/**
 * @author tkurt
 * Date: Apr 14, 2016 11:23:53 AM
 *  
 */
public interface Shippable<T> {
	
	public abstract void ship(T t);
	
	/**
	 * 
	 * There are three ways a class can approach implementing this interface. The first is to
	 * specify the generic type in the class. The following concrete class says that it deals only
	 * with robots. This lets it declare the ship() method with a Robot parameter:
	 * 
	 * class ShippableRobotCrate implements Shippable<Robot> {
	 *      
	 *      public void ship(Robot t) { }
	 *      }
	 *      
	 * The next way is to create a generic class. The following concrete class allows the caller
	 * to specify the type of the generic:
	 * 
	 * class ShippableAbstractCrate<U> implements Shippable<U> {
	 *      
	 *      public void ship(U t) { }
	 *      }
	 *      
	 * The final way is to not use generics at all. This is the old way of writing code. It gener-
	 * ates a compiler warning about Shippable being a raw type, but it does compile. Here the
	 * ship() method has an Object parameter since the generic type is not defined:
	 * 
	 * class ShippableCrate implements Shippable {
	 *   public void ship(Object t) { }
	 *
	 *   
	 *   }     
	 */
	
	/** WHAT YOU CANNOT DO WITH GENERICS
	 * 
	 * Most of the limitations are due to type erasure. Oracle refers to types whose information
	 * is fully available at runtime as reifiable. Reifiable types can do anything that Java allows.
	 * Non-reifiable types have some limitations.
	 * 
	 * Here are the things that you can’t do with generics. (And by “can’t,” we mean without
	 * resorting to contortions like passing in a class object.)
	 * 
	 * -Call the constructor. new T() is not allowed because at runtime it would be new
	 * Object() .
	 * 
	 * -Create an array of that static type. This one is the most annoying, but it makes sense
	 * because you’d be creating an array of Object s.
	 * 
	 * -Call instanceof . This is not allowed because at runtime List<Integer> and
	 * List<String> look the same to Java thanks to type erasure.
	 * 
	 * -Use a primitive type as a generic type parameter. This isn’t a big deal because you
	 * can use the wrapper class instead. If you want a type of int , just use Integer .
	 * 
	 * -Create a static variable as a generic type parameter. This is not allowed because the
	 * type is linked to the instance of the class.
	 * 
	 */

}
