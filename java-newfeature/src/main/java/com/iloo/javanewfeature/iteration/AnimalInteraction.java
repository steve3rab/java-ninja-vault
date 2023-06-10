package com.iloo.javanewfeature.iteration;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The AnimalInteraction class demonstrates various interactions with
 * animal-related data structures using lambda expressions and streams in Java
 * 16.
 */
public class AnimalInteraction {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Filters a list of animals based on the given predicate using lambda and
	 * stream.
	 *
	 * @param animals   the list of animals to filter
	 * @param predicate the predicate for filtering
	 * @return the filtered list of animals
	 */
	public List<Animal> filterAnimals(List<Animal> animals, Predicate<Animal> predicate) {
		return animals.stream().filter(predicate).toList();
	}

	/**
	 * Maps the list of animals to a list of their names using lambda and stream.
	 *
	 * @param animals the list of animals to map
	 * @return the list of animal names
	 */
	public List<String> mapAnimalNames(List<Animal> animals) {
		return animals.stream().map(Animal::getName).toList();
	}

	/**
	 * Converts a list of animals to a set of unique animal types using lambda and
	 * stream.
	 *
	 * @param animals the list of animals to convert
	 * @return the set of unique animal types
	 */
	public Set<String> convertToAnimalTypes(List<Animal> animals) {
		return animals.stream().map(Animal::getType).collect(Collectors.toSet());
	}

	/**
	 * Groups the animals by their types using lambda and stream.
	 *
	 * @param animals the list of animals to group
	 * @return the map of animal types to animals
	 */
	public Map<String, List<Animal>> groupAnimalsByType(List<Animal> animals) {
		return animals.stream().collect(Collectors.groupingBy(Animal::getType));
	}

	/**
	 * Benchmarks the execution time of the animal interactions by repeating the
	 * operations for the given number of times.
	 *
	 * @param animals    the list of animals to perform interactions on
	 * @param iterations the number of iterations for benchmarking
	 */
	public void benchmarkAnimalInteractions(List<Animal> animals, int iterations) {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < iterations; i++) {
			filterAnimals(animals, animal -> animal.getAge() > 5);
			mapAnimalNames(animals);
			convertToAnimalTypes(animals);
			groupAnimalsByType(animals);
		}

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;

		LOGGER.info("Benchmark completed in {} milliseconds.", totalTime);
	}

	/**
	 * The Animal class represents an animal with a name, type, and age.
	 */
	static class Animal {
		private final String name;
		private final String type;
		private final int age;

		public Animal(String name, String type, int age) {
			this.name = name;
			this.type = type;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}

		public int getAge() {
			return age;
		}
	}
}
