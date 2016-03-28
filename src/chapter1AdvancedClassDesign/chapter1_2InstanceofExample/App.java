package chapter1AdvancedClassDesign.chapter1_2InstanceofExample;

import chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animalHierachy.Animal;
import chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animalHierachy.HeavyAnimal;
import chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animalHierachy.LightAnimal;
import chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animals.Bird;
import chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animals.Elephant;
import chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animals.Hippo;

public class App {

	public static void main(String[] args) {

		HeavyAnimal elephant = new Elephant();
		HeavyAnimal hippo = new Hippo();
		
		/* 'instanceof' Checks cases and return boolean value */
		boolean case1 = hippo instanceof HeavyAnimal;
		boolean case2 = elephant instanceof HeavyAnimal;
		boolean case3 = hippo instanceof Elephant;

		System.out.println(case1);
		System.out.println(case2);
		System.out.println(case3);
		
		/* "null" is not an object,so referencing it is returns false value  */
		
		HeavyAnimal nullElephant = null;
		boolean case4 = nullElephant instanceof Object ;
		
		System.out.println(case4);
		
		/* interesting point; Doesn't compile because hippo is not an elephant-
		 * Hippo does not extend elephant directly or indirectly */
		
	/*	Hippo hippoOrigin = new Hippo();
		boolean case5 = hippoOrigin instanceof Elephant;*/ // Doesnt compile
		
		
		/* 'instanceof' can let you check unrelated interfaces at compile time */
		Hippo heavyHippo = new Hippo();
		boolean case5 = heavyHippo instanceof LightAnimal;
		System.out.println(case5);
		
		
		/*Generally 'instanceof' is using object type checks on API to work with interfaces
		 * Trying to passing animalTypes */
		
		LightAnimal bird = new Bird();
		workWithAnimals(hippo);
		workWithAnimals(elephant);
		workWithAnimals(bird);
	}

	private static void workWithAnimals(Animal animal) {
		// Checking upcoming instance types
		if (animal instanceof HeavyAnimal) {
			((HeavyAnimal) animal).showWeight();
		} else if (animal instanceof LightAnimal) {
			((LightAnimal) animal).showHowLightWeight();
		} else {
			throw new RuntimeException("Unsupported animal");
		}
	}
}
