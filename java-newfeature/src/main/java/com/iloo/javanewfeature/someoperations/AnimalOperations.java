package com.iloo.javanewfeature.someoperations;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A class demonstrating various operations on animals using Java 16 features.
 */
public class AnimalOperations {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Filters and prints the names of animals using a provided predicate.
	 *
	 * @param animals   The list of animals to filter.
	 * @param predicate The predicate to filter animals.
	 * @param consumer  The consumer to print the names of filtered animals.
	 */
	public static void filterAndPrintNames(List<Animal> animals, Predicate<Animal> predicate,
			Consumer<String> consumer) {
		animals.stream().filter(predicate).map(Animal::getName).forEach(consumer);
	}

	/**
	 * Generates a list of animals using a supplier and populates it using a
	 * consumer.
	 *
	 * @param animalSupplier The supplier to generate animals.
	 * @param animalConsumer The consumer to populate the list with animals.
	 * @return The list of generated animals.
	 */
	public static List<Animal> generateAnimals(Supplier<Animal> animalSupplier, Consumer<Animal> animalConsumer) {
		List<Animal> animals = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Animal animal = animalSupplier.get();
			animalConsumer.accept(animal);
			animals.add(animal);
		}
		return animals;
	}

	/**
	 * Applies an operation to modify the name of an animal using a unary operator.
	 *
	 * @param animal       The animal to modify.
	 * @param nameModifier The unary operator to modify the animal's name.
	 */
	public static void modifyAnimalName(Animal animal, UnaryOperator<String> nameModifier) {
		String modifiedName = nameModifier.apply(animal.getName());
		animal.setName(modifiedName);
	}

	/**
	 * Checks if an animal is an instance of a specific class.
	 *
	 * @param animal The animal to check.
	 * @return true if the animal is an instance of Dog, false otherwise.
	 */
	public static boolean isDog(Animal animal) {
		return animal instanceof Dog;
	}

	/**
	 * The main method of the AnimalOperations class. Demonstrates the usage of
	 * various operations on animals.
	 *
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// Generate a list of animals
		List<Animal> animals = generateAnimals(() -> new Dog("U"), animal -> animal.setName("Unnamed"));

		// Filter and print the names of dogs
		filterAndPrintNames(animals, AnimalOperations::isDog, LOGGER::info);

		// Modify the name of the first dog
		modifyAnimalName(animals.get(0), name -> "Max");

		// Filter and print the names of modified dogs
		filterAndPrintNames(animals, AnimalOperations::isDog, LOGGER::info);
	}
}
