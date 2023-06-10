package com.iloo.javadesignpattern.prototype;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) throws CloneNotSupportedException {
		Animal animal1 = new Animal("Lion", "Feline");
		Animal animal2 = new Animal("Elephant", "Mammal");

		Animal.AnimalRegistry registry = new Animal.AnimalRegistry();
		registry.addAnimal(animal1);
		registry.addAnimal(animal2);

		Animal clonedAnimal1 = registry.getAnimal("Lion");
		Animal clonedAnimal2 = registry.getAnimal("Elephant");

		LOGGER.info("Original Animal 1: {}, {}", animal1.getName(), animal1.getSpecies());
		LOGGER.info("Cloned Animal 1: {}, {}", clonedAnimal1.getName(), clonedAnimal1.getSpecies());
		LOGGER.info("Original Animal 2: {}, {}", animal2.getName(), animal2.getSpecies());
		LOGGER.info("Cloned Animal 2: {}, {}", clonedAnimal2.getName(), clonedAnimal2.getSpecies());
	}
}
