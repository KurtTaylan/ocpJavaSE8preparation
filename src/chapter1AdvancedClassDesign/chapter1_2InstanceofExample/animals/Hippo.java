package chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animals;

import chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animalHierachy.HeavyAnimal;

public class Hippo implements HeavyAnimal {

	protected Integer hippoWeight;

	@Override
	public void showWeight() {
		this.hippoWeight = Integer.valueOf(200);
		System.out.println("Hippo weight : " + hippoWeight);
	}

}
