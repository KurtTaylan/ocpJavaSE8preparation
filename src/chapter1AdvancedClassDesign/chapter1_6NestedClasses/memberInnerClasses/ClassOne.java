package chapter1AdvancedClassDesign.chapter1_6NestedClasses.memberInnerClasses;



/**
 * @author tkurt
 * Date: Mar 28, 2016 10:43:45 PM
 *  
 */
public class ClassOne {
	private int weight = 100;
	
	protected class ClassTwo{
		private int weight = 80;
		
		public class ClassThree{
			private int weight = 50;
			
			public void printAllWeights(){
				System.out.println(weight);
				System.out.println(this.weight);
				System.out.println(ClassTwo.this.weight);
				System.out.println(ClassOne.this.weight);
			} 
		}
	}
	
	public static void main(String[] args) {
		
		ClassOne 			         one   =  new ClassOne();
		
		// We could specify ClassTwo .
		ClassOne.ClassTwo            two   = one.new ClassTwo();
		
		// !! We cannot spesify as ClassThree bacause it is too deep java to see.
		ClassOne.ClassTwo.ClassThree three = two.new ClassThree();
		
		// Try to print out fields of Nested classes
		three.printAllWeights();
	}
}
