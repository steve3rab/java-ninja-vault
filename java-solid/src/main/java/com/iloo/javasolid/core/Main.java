package com.iloo.javasolid.core;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		List<Animal> animals = List.of(new Bird("Eagle"), new Fish("Salmon"), new Bird("Ostrich"),
				new Fish("Goldfish"));

		Zoo zoo = new Zoo(animals);

		LOGGER.info("Animal Names:");
		List<String> animalNames = zoo.getAnimalNames();
		animalNames.forEach(LOGGER::info);

		LOGGER.info("Performing Flying:");
		zoo.performActionOnAnimals(animal -> {
			if (animal instanceof FlyingAnimal flyingAnimal) {
				flyingAnimal.fly();
			}
		});

		LOGGER.info("Performing Swimming:");
		zoo.performActionOnAnimals(animal -> {
			if (animal instanceof SwimmingAnimal swimmingAnimal) {
				swimmingAnimal.swim();
			}
		});
	}
}
