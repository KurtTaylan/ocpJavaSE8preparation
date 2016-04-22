/**
 * Stream in Java is a sequence of data. A stream pipeline is the operations that run on a
 * stream to produce a result.With streams,
 * the data isn’t generated up front—it is created when needed.
 * 
 * Data isn’t generated up front—it is created when needed.
 * Many things can happen in the assembly line stations along the way. In programming,
 * these are called stream operations. Just like with the assembly line, operations occur in a
 * pipeline. Someone has to start and end the work, and there can be any number of stations
 * in between. 
 * 
 * After all, a job with one person isn’t an assembly line! There are three parts to
 * a stream pipeline,
 * 
 * -Source: Where the stream comes from.
 * 
 * -Intermediate operations: Transforms the stream into another one. There can be as few
 * or as many intermediate operations as you’d like. Since streams use lazy evaluation, the
 * intermediate operations do not run until the terminal operation runs.
 * 
 * -Terminal operation: Actually produces a result. Since streams can be used only once,
 * the stream is no longer valid after a terminal operation completes.
 * 
 * When viewing the assembly line from the outside,
 * you care only about what comes in and goes out. What happens in
 * between is an implementation detail.
 * 
 * We all want to avoid unnecessary work!
 * 
 * 
 */
package chapter4FunctionalProgramming.chapter4_2Streams;

/**
 * @author tkurt
 * Date: Apr 21, 2016 12:18:23 PM
 *  
 */
public class App {

	public static void main(String[] args) {

	}

}
