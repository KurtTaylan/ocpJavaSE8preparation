package chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animals;

import chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animalHierachy.HeavyAnimal;

public class Elephant implements HeavyAnimal {
	
	protected Integer elephentWeight;

	@Override
	public void showWeight() {
		this.elephentWeight = Integer.valueOf(100);
		System.out.println("Elephant weight : " + elephentWeight);
	}

}
