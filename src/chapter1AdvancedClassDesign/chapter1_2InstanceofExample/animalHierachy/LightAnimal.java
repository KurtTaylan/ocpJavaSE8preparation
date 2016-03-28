package chapter1AdvancedClassDesign.chapter1_2InstanceofExample.animalHierachy;

public interface LightAnimal extends Animal {
	
	public default void showHowLightWeight(){
		System.out.println("I am default light animal");
	}
}
