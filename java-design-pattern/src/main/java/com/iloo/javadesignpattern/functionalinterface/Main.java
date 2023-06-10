package com.iloo.javadesignpattern.functionalinterface;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the sound of an animal using the provided AnimalSound implementation.
	 *
	 * @param animalName  the name of the animal
	 * @param animalSound the AnimalSound implementation for making the sound
	 */
	public void makeAnimalSound(String animalName, AnimalSound animalSound) {
		animalSound.makeSound(animalName);
	}

	/**
	 * Makes the sound of a cat.
	 *
	 * @param animalName the name of the animal (unused in this method)
	 */
	public static void meow(String animalName) {
		LOGGER.info("{} meows.", animalName);
	}

	public static void main(String[] args) {
		Main soundMaker = new Main();

		// Using lambda expression to define the AnimalSound implementation
		soundMaker.makeAnimalSound("Dog", animalName -> LOGGER.info("{} barks.", animalName));

		// Using a method reference to define the AnimalSound implementation
		soundMaker.makeAnimalSound("Cat", Main::meow);
	}

}
