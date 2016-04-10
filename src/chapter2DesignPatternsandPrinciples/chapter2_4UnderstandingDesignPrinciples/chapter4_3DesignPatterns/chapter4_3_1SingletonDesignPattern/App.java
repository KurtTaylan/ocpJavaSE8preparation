/**
 * In Software Architecture there are steps 
 * to process of software design;
 * 1-Design Creation
 * 2-Review Requirements
 * 3-Identity Problems  - TIME TAKING
 * 4-Design Solutions	- TIME TAKING
 * 
 * Also there are 4 elements of Design Creation;
 * 1-Naming
 * 2-Problem
 * 3-Consequence
 * 4-Solution
 * 
 * However,while you are noting them let pursue on Singleton patterns :)
 * 
 * GoF-Singleton,Page 124.
 * 
 * Name:
 * -Singleton
 *  
 * Problem/Intent:
 * -Ensure a class only has one instance, and provide a global point of access to it.
 * 
 * Motivation;
 * -It’s important for some classes to have exactly one instance. Although there can be many printers in a system,
 * there should be only one printer spooler. There should be only one file system and one window manager.
 * A digital filter will have one A/D converter. An accounting system will be dedicated to serving one company.
 * 
 * Solution:
 * -solution is to make the class itself responsible for keeping track of its sole instance.
 * The class can ensure that no other instance can be created (by intercepting requests to create new objects),
 * and it can provide a way to access the instance. This is the Singleton pattern.
 * 
 * Applicability:
 * -Use the Singleton pattern when there must be exactly one instance of a class,
 * and it must be accessible to clients from a well-known access point.
 * 
 * -When the parent instance should be extensible by subclasses,
 *  and clients should be able to use an extended instance without modifying their code.
 *  
 * -Clients access a Singleton instance solely through Singleton’s Instance operation.
 * 
 * In a result: You apply singleton for some instance you want it unique during entire application is running
 * and have it shared by multiple classes.
 * 
 * Also singleton object SHOULD manage its internal processes in itself but from outside.
 * 
 * 
 * */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_1SingletonDesignPattern;

/**
 * @author tkurt
 * Date: Apr 9, 2016 10:59:39 AM
 *  
 */
public class App {

	public static void main(String[] args) {
		// Look HayStorage as first :)
	}

}
