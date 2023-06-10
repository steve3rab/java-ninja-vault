package com.iloo.javadesignpattern.functinalinterface;

/**
 * The AnimalSound interface represents a functional interface for making animal
 * sounds.
 */
@FunctionalInterface
interface AnimalSound {
	/**
	 * Makes the sound of an animal.
	 *
	 * @param animalName the name of the animal
	 */
	void makeSound(String animalName);
}
