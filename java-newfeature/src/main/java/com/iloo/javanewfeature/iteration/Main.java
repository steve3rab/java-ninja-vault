package com.iloo.javanewfeature.iteration;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.iloo.javanewfeature.iteration.AnimalInteraction.Animal;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		List<Animal> animals = List.of(new Animal("Lion", "Mammal", 10), new Animal("Eagle", "Bird", 5),
				new Animal("Salmon", "Fish", 2), new Animal("Giraffe", "Mammal", 7), new Animal("Tiger", "Mammal", 8));

		AnimalInteraction animalInteraction = new AnimalInteraction();

		// Perform animal interactions
		LOGGER.info("Filtered Animals (Age > 5):");
		List<Animal> filteredAnimals = animalInteraction.filterAnimals(animals, animal -> animal.getAge() > 5);
		filteredAnimals.forEach(animal -> LOGGER.info(animal.getName()));

		LOGGER.info("Animal Names:");
		List<String> animalNames = animalInteraction.mapAnimalNames(animals);
		animalNames.forEach(LOGGER::info);

		LOGGER.info("Unique Animal Types:");
		Set<String> uniqueTypes = animalInteraction.convertToAnimalTypes(animals);
		uniqueTypes.forEach(LOGGER::info);

		LOGGER.info("Animals Grouped by Type:");
		Map<String, List<Animal>> animalsByType = animalInteraction.groupAnimalsByType(animals);
		animalsByType.forEach((type, animalList) -> {
			LOGGER.info("{} :", type);
			animalList.forEach(animal -> LOGGER.info(" - {}", animal.getName()));
		});

		// Benchmark animal interactions
		int iterations = 100000;
		animalInteraction.benchmarkAnimalInteractions(animals, iterations);
	}
}
