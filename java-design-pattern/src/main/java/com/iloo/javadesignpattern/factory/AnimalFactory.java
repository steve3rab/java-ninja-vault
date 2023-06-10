package com.iloo.javadesignpattern.factory;

/**
 * The AnimalFactory class is a factory class that creates animal objects.
 */
class AnimalFactory {
	/**
	 * Creates an animal object based on the given animal type.
	 *
	 * @param animalType the type of animal to create
	 * @return an instance of the animal object
	 */
	public Animal createAnimal(String animalType) {
		if (animalType.equalsIgnoreCase("dog")) {
			return new Dog();
		}
		if (animalType.equalsIgnoreCase("cat")) {
			return new Cat();
		} else {
			throw new IllegalArgumentException("Invalid animal type: " + animalType);
		}
	}
}
