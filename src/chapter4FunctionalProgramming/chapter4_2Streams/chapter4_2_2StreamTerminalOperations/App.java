/**
 * You can perform a terminal operation without any intermediate operations but not the
 * other way around. This is why we will talk about terminal operations fi rst. Reductions are
 * a special type of terminal operation where all of the contents of the stream are combined
 * into a single primitive or Object.
 * 
 */
package chapter4FunctionalProgramming.chapter4_2Streams.chapter4_2_2StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author tkurt
 * Date: Apr 21, 2016 2:20:31 PM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		
		/** count() */
		/*
		 * The count() method determines the number of elements in a finite stream. For an infinite
         * stream, it hangs.
         * This example shows calling count() on a finite stream:
		 */
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		System.out.println(s.count());
		s.close();
		/** min() , max() */
		/*
		 * The min() and max() methods allow you to pass a custom comparator and find the 
		 * smallest or largest value in a finite stream according to that sort order.
		 */
		Stream<String> sm = Stream.of("monkey","gorilla","bonobo");
		Optional<?> min = sm.min((s1,s2)-> s1.length()-s2.length());
		min.ifPresent(System.out::println);//ape
		sm.close();
		
		Optional<?> minEmpty = Stream.empty().min((s1,s2)-> 0);
		System.out.println(minEmpty.isPresent()); // false
		
		/** findAny() findFirst() */
		/*
		 * The findAny() and findFirst() methods return an element of the stream unless the stream
		 * is empty. If the stream is empty, they return an empty Optional . This is the first method
		 * you’ve seen that works with an infinite stream. Since Java generates only the amount of
		 * stream you need, the infinite stream needs to generate only one element. findAny() is useful
		 * when you are working with a parallel stream. It gives Java the flexibility to return to you
		 * the first element it comes by rather than the one that needs to be first in the stream based
		 * on the intermediate operations.
		 * 
		 * These methods are terminal operations but not reductions. The reason is that they some-
		 * times return without processing all of the elements. This means that they return a value
		 * based on the stream but do not reduce the entire stream into one value.
		 */
		System.out.println();
		Stream<String> findList = Stream.of("monkey","gorilla","bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		findList.findAny().ifPresent(System.out::println);//monkey
		infinite.findAny().ifPresent(System.out::println);//chimp
		/*
		 * Finding any one match is more useful than it sounds. Sometimes we just want to sample the
		 * results and get a representative element, but we don’t need to waste the processing generating
		 * them all. After all, if we plan to work with only one element, why bother looking at more?
		 */
		
		/** allMatch() , anyMatch() and noneMatch()  */
		/*
		 * The allMatch() , anyMatch() and noneMatch() methods search a stream and return infor-
		 * mation about how the stream pertains to the predicate. These may or may not terminate
		 * for infinite streams. It depends on the data. Like the find methods, they are not reductions
		 * because they do not necessarily look at all of the elements.
		 * 
		 * The method signatures are as follows:
		 * 
		 * boolean anyMatch(Predicate <? super T> predicate)
		 * boolean allMatch(Predicate <? super T> predicate)
		 * boolean noneMatch(Predicate <? super T> predicate)
		 */
		System.out.println();
		List<String> list = Arrays.asList("monkey","2","chimp");
		Stream<String> infinitev = Stream.generate(()-> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred));//true
		System.out.println(list.stream().allMatch(pred));// false
		System.out.println(list.stream().noneMatch(pred));// false
		System.out.println(infinitev.anyMatch(pred));//true
		/**
		 * Remember that allMatch() , anyMatch() , and noneMatch() return a bool-
		 * ean . By contrast, the find methods return an Optional because they return
		 * an element of the stream.
		 */
		
		/** foreach() */
		/*
		 * A looping construct is available. As expected, calling forEach() on an infinite stream does
		 * not terminate. Since there is no return value, it is not a reduction.
		 * 
		 * The method signature is the following:
		 * 
         *  void forEach(Consumer<? super T> action)
		 */
		System.out.println();
		Stream<String> forEach = Stream.of("monkey","gorilla","bonobo");
		forEach.forEach(System.out::print);// MonkeyGorillaBonobo
		/*
		 * Remember that you can call forEach() directly on a Collection or on a
         * Stream . Don’t get confused on the exam when you see both approaches.
		 */
		/**   foreach()
		 * Streams cannot use a traditional for loop to run because 
		 * they don’t implement the Iterable interface.
		 */
		
		
		/** reduce() */
		/*
		 * The reduce() method combines a stream into a single object. As you can tell from the
		 * name, it is a reduction. The method signatures are these:
		 * 
		 * T reduce(T identity, BinaryOperator<T> accumulator)
		 * 
		 * Optional<T> reduce(BinaryOperator<T> accumulator)
		 * 
		 * <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator,BinaryOperator<U> combiner)
		 * 
		 */
		/*
		 * The most common way of doing a reduction is to start
		 * with an initial value and keep merging it with the next value.
		 */
		Stream<String> stream = Stream.of("w","o","l","f");
		String word = stream.reduce("",String::concat);
		System.out.println();
		System.out.println(word);//wolf
		System.out.println();
		stream.close();
		
		Stream<Integer> stream2 = Stream.of(3,4,6);
		System.out.println(stream2.reduce(1,(a,b) -> a*b));
		stream2.close();
		
		BinaryOperator<Integer> op = (a,b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElement = Stream.of(3,5,6);
		
		empty.reduce(op).ifPresent(System.out::print); // no output
		oneElement.reduce(op).ifPresent(System.out::println); //3
		threeElement.reduce(op).ifPresent(System.out::print); // 90
		
		System.out.println();
		BinaryOperator<Integer> op1 = (a, b) -> a * b;
		Stream<Integer> stream23 = Stream.of(3, 5, 6);
		System.out.println(stream23.reduce(1, op1, op1)); // 90
 		
		/** collect() */
		/*
		 * The collect() method is a special type of reduction called a mutable reduction.
		 * It is more efficient than a regular reduction because we use the same 
		 * mutable object while accumulating. Common mutable objects include StringBuilder
		 * and ArrayList . This is a really useful method, 
		 * because it lets us get data out of streams and into another form.
		 * 
		 */
		Stream<String> streamm = Stream.of("w","o","l","f");
		StringBuilder word12 = streamm.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);
		
		Stream<String> sttream = Stream.of("w","o","l","f");
		
		
	}

}
