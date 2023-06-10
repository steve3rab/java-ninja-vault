package com.iloo.javadesignpattern.visitor;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The AnimalCounter class counts the number of each animal type in a list of
 * animals.
 */
class AnimalCounter {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	private int lionCount;
	private int elephantCount;
	private int giraffeCount;
	private int tigerCount;

	/**
	 * Counts the number of each animal type in the given list of animals.
	 *
	 * @param animals the list of animals to count
	 */
	public void countAnimals(List<Animal> animals) {
		for (Animal animal : animals) {
			if (animal instanceof Lion) {
				lionCount++;
			} else if (animal instanceof Elephant) {
				elephantCount++;
			} else if (animal instanceof Giraffe) {
				giraffeCount++;
			} else if (animal instanceof Tiger) {
				tigerCount++;
			}
		}

		LOGGER.info("Lion count: {}", lionCount);
		LOGGER.info("Elephant count: {}", elephantCount);
		LOGGER.info("Giraffe count: {}", giraffeCount);
		LOGGER.info("Tiger count: {}", tigerCount);
	}
}
