package com.iloo.javadesignpattern.iterator;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Lion", "Feline"));
		animals.add(new Animal("Elephant", "Mammal"));
		animals.add(new Animal("Giraffe", "Mammal"));
		animals.add(new Animal("Tiger", "Feline"));

		// Using streams to iterate and process the collection of animals
		animals.stream().forEach(animal -> LOGGER.info("{} - {}", animal.getName(), animal.getSpecies()));
	}
}
