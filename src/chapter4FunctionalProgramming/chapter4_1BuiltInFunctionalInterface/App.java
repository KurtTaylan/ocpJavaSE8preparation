/**
 *  Lambda expression accesses only these types of variables;
 *  
 *  1-Static variables.
 *  2-Instance variables.
 *  3-Effectively final local variables.
 *  4-Effectively final method parameters.
 *  
 *  Plus, There are a few functional interface to help you ;
 *  Supplier<T>         0       T          get
 *  Consumer<T>         1(T)    void       accept
 *  BiConsumer<T, U>    2(T, U) void       accept
 *  Predicate<T>        1(T)    boolean    test
 *  BiPredicate<T, U>   2(T, U) boolean    test
 *  Function<T, R>      1(T)    R          apply
 *  BiFunction<T, U, R> 2(T, U) R          apply
 *  UnaryOperator<T>    1(T)    T          apply
 *  BinaryOperator<T>   2(T, T) T          apply
 *  
 *  We are going to see each interface one by one
 *  
 */
package chapter4FunctionalProgramming.chapter4_1BuiltInFunctionalInterface;

/**
 * @author tkurt
 * Date: Apr 21, 2016 10:05:02 AM
 *  
 */
public class App {

	public static void main(String[] args) {

	}

}
