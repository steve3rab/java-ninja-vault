package com.iloo.javasolid.core;

import java.util.List;

/**
 * The Zoo class represents a collection of animals in a zoo. It adheres to the
 * Open-Closed Principle (OCP) by allowing the addition of new animals without
 * modifying existing code.
 */
class Zoo {
	private final List<Animal> animals;

	public Zoo(List<Animal> animals) {
		this.animals = animals;
	}

	/**
	 * Performs the specified action on each animal in the zoo using the provided
	 * behavior. It utilizes Java 16 features, lambda expression, and functional
	 * interface.
	 *
	 * @param behavior the behavior to perform on each animal
	 */
	public void performActionOnAnimals(AnimalBehavior behavior) {
		animals.forEach(behavior::perform);
	}

	/**
	 * Retrieves the names of all animals in the zoo using a stream. It utilizes
	 * Java 16 features and stream API.
	 *
	 * @return the list of animal names
	 */
	public List<String> getAnimalNames() {
		return animals.stream().map(Animal::getName).toList();
	}
}
