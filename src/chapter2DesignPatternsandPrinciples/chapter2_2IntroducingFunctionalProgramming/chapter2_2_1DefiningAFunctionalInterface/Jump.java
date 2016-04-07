/**
 * Java defines a functional interface as an interface that contains a single abstract method.
 * Functional interfaces are used as the basis for lambda expressions in functional programming.
 * A lambda expression is a block of code that gets passed around, like an anonymous method.
 */
package chapter2DesignPatternsandPrinciples.chapter2_2IntroducingFunctionalProgramming.chapter2_2_1DefiningAFunctionalInterface;

/**
 * @author tkurt
 * Date: Apr 7, 2016 1:07:46 PM
 *  
 */
/**
 * Since We annotated Jump interface as a FunctionalInterface
 * We need to define single method for interface to compile.
 * 
 * Also functional method should be 'abstract' type and cannot be 'default'
 */
@FunctionalInterface
public interface Jump {
	
	/**
	 * 
	 * @param height: if object has enough height than jump;
	 */
	public abstract void jumpAround(int height);
	
//	Applying the @FunctionalInterface Annotation
	
//	While it is a good practice to mark a functional interface with the @FunctionalInterface
//	annotation for clarity, it is not required with functional programming. The Java compiler
//	implicitly assumes that any interface that contains exactly one abstract method is
//	a functional interface. Conversely, if a class marked with the @FunctionalInterface
//	annotation contains more than one abstract method, or no abstract methods at all, then
//	the compiler will detect this error and not compile.
//	One problem with not always marking your functional interfaces with this annotation is
//	that another developer may treat any interface you create that has only one method as
//	a functional interface. If you later modify the interface to have other abstract methods,
//	suddenly their code will break since it will no longer be a functional interface.
//	Therefore, it is recommend that you explicitly mark the interface with the
//	@FunctionalInterface annotation so that other developers know which interfaces they
//	can safely apply lambdas to without the possibility that they may stop being functional
//	interfaces down the road.
//	The exam writers aren’t likely to use this annotation, as they expect you to be able to
//	determine whether an interface is a functional interface on your own.
	/** 
	 * In a result does not matter if interface specify static method or default method ,
	 * or extends another interface as long as interface has only one abstract method , 
	 * it assumes to be functional interface. 
	 */
}
