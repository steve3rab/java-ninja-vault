package com.iloo.javadesignpattern.visitorswitches;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A class demonstrating the usage of pattern matching switch expressions to
 * handle different types of animals without using the visitor pattern.
 */
public class Main {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * The main method of the AnimalSwitchExample class. Creates instances of
	 * different animals and prints their sounds.
	 *
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal lion = new Lion();

		printAnimalSound(cat);
		printAnimalSound(dog);
		printAnimalSound(lion);
	}

	/**
	 * Prints the sound of the given animal.
	 *
	 * @param animal The animal for which to print the sound.
	 */
	public static void printAnimalSound(Animal animal) {
		String sound = switch (animal.getClass().getSimpleName()) {
		case "Cat" -> "Meow";
		case "Dog" -> "Woof";
		case "Lion" -> "Roar";
		default -> "Unknown sound";
		};

		LOGGER.info("The animal sounds like: {}", sound);
	}
}
