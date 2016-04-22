/**
 * An Optional is created using a factory. You can
 * either request an empty Optional or pass a value for the Optional to wrap. Think of an
 * Optional as a box that might have something in it or might instead be empty
 * 
 * NAME - EMPTY - CONTAINS VALUE
 * get() Throws an exception - Returns value
 * ifPresent(Consumer c) Does nothing - Calls Consumer c with value
 * isPresent() Returns false - Returns true
 * orElse(T other) Returns other parameter - Returns value
 * orElseGet(Supplier s) Returns result of calling - Returns value
 * orElseThrow(Supplier s) Throws exception created by calling Supplier - Returns value
 */
package chapter4FunctionalProgramming.chapter4_1BuiltInFunctionalInterface.chapter4_1_6OptionalInterface;

import java.util.Optional;

/**
 * @author tkurt
 * Date: Apr 21, 2016 12:03:24 PM
 *  
 */
public class App {

	public static void main(String[] args) {

		System.out.println(average(90, 100)); // Optional[95.0]
		System.out.println(average());// Optional.empty
		
		/**
		 * You can specify the case when response is empty.
		 */
		Optional<Double> opt = average(90, 100);
		if (opt.isPresent())
			System.out.println(opt.get()); // 95.0
		
		/**
		 * When creating an Optional , it is common to want to use empty when the value is null .
		 * You can do this with an if statement or ternary operator. We use the ternary operator to
		 * make sure that you remember how it works from the OCA:
		 */
		String value = "test";
		
		Optional<String> o = (value== null) ? Optional.empty(): Optional.of(value);
		
		/*
		 * If value is null , o is assigned the empty Optional . Otherwise, we wrap the value. Since
		 * this is such a common pattern, Java provides a factory method to do the same thing:
		 */
		Optional<String> o1 = Optional.ofNullable(value);
		
		
		
		
		
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}
}
