package com.iloo.javadesignpattern.factory;

public class Main {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();

		// Create a dog
		Animal dog = animalFactory.createAnimal("dog");
		dog.makeSound();

		// Create a cat
		Animal cat = animalFactory.createAnimal("cat");
		cat.makeSound();
	}

}
