/**
 * 
 * We are going to see some intermediate operations that does not effect on stream.
 * 
 */
package chapter4FunctionalProgramming.chapter4_2Streams.chapter4_2_3StreamIntermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author tkurt
 * Date: Apr 22, 2016 7:30:07 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		
		/** filter()*/
		/*
		 * The filter() method returns a Stream with elements that match a given expression. Here
         * is the method signature:
         * 
         * Stream<T> filter(Predicate<? super T> predicate)
		 */
		Stream<String> filteringList = Stream.of("monkey","gorilla","bonobo");
		filteringList.filter(x -> x.startsWith("m")).forEach(x -> System.out.println(x));
		System.out.println();
		/** distinct() */
		/*
		 * The distinct() method returns a stream with duplicate values removed. The duplicates do
         * not need to be adjacent to be removed. As you might imagine, Java calls equals() to deter-
         * mine whether the objects are the same. The method signature is as follows:
         * 
         * Stream<T> distinct()
		 */
		Stream<String> cutDuplicationList = Stream.of("duck","duck","duck","gorilla");
		cutDuplicationList.distinct().forEach(System.out::println); // duck gorilla
		System.out.println();
		
		/** limit() and skip() */
		/*
		 * The limit() and skip() methods make a Stream smaller. They could make a fi nite stream
         * smaller, or they could make a fi nite stream out of an infi nite stream. The method signatures
         * are shown here:
         * 
         * Stream<T> limit(int maxSize)
         * Stream<T> skip(int n)
		 */
		Stream<Integer> infinitiveList = Stream.iterate(1, n -> n+1 );
		infinitiveList.skip(5).limit(2).forEach(System.out::print); // 67
		System.out.println();
		
		/** map() */
		/*
		 * The map() method creates a one-to-one mapping from the elements in the stream to the ele-
         * ments of the next step in the stream. The method signature is as follows:
         * 
         * <R> Stream<R> map(Function<? super T, ? extends R> mapper)
         * 
         * As an example, this code converts a list of String objects to a list of Integer s represent-
         * ing their lengths:
		 */
		Stream<String> listNeedMapping = Stream.of("gorilla","wolf","bug");
		// after mapping we are having now Stream<Integer>.
		listNeedMapping.map(String::length).forEach(System.out::print); // 743
		System.out.println();
		
		/** flatmap() */
		/*
		 * The flatMap() method takes each element in the stream and makes any elements it con-
         * tains top-level elements in a single stream. This is helpful when you want to remove empty
         * elements from a stream or you want to combine a stream of lists.
         * 
         * <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
		 */
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		 
		animals.flatMap(l -> l.stream()).forEach(System.out::println);
		System.out.println();
		
		/** sorted() */
		/*
		 * The sorted() method returns a stream with the elements sorted. Just like sorting arrays,
		 * Java uses natural ordering unless we specify a comparator. The method signatures are
		 * these:
		 * 
		 * Stream<T> sorted()
		 * Stream<T> sorted(Comparator<? super T> comparator)
		 */
		Stream<String> s = Stream.of("brown-", "bear-");
		s.sorted().forEach(System.out::print); // bear-brown-
		
		/**
		 * Remember that we can pass a lambda expression as the comparator. For example, we
		 * can pass a Comparator implementation:
		 */
		System.out.println();
		System.out.println();
		Stream<String> s1 = Stream.of("brown bear-", "grizzly-");
		s1.sorted(Comparator.reverseOrder())
		.forEach(System.out::print); // grizzly-brown bear-
		System.out.println();
		System.out.println();
		/**  peek()   */
		/*
		 * The peek() method is our final intermediate operation. It is useful for debugging because it
		 * allows us to perform a stream operation without actually changing the stream. The method
		 * signature is as follows:
		 * 
		 * Stream<T> peek(Consumer<? super T> action)
		 * 
		 * The most common use for peek() is to output the contents of the stream as it goes by.
		 * 
		 */
		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
		long count = stream.filter(sa -> sa.startsWith("g"))
						   .peek(System.out::println)
						   .count(); // grizzly
		System.out.println(count);//1
		
		
		
	}

}
