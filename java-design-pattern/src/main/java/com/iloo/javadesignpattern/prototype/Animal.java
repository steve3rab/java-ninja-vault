package com.iloo.javadesignpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * The Animal class represents an animal.
 */
class Animal implements Cloneable {
	private String name;
	private String species;

	/**
	 * Constructs a new Animal with the given name and species.
	 *
	 * @param name    the name of the animal
	 * @param species the species of the animal
	 */
	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
	}

	/**
	 * Gets the name of the animal.
	 *
	 * @return the name of the animal
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the animal.
	 *
	 * @param name the name of the animal
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the species of the animal.
	 *
	 * @return the species of the animal
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * Sets the species of the animal.
	 *
	 * @param species the species of the animal
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * Creates a shallow clone of the Animal object.
	 *
	 * @return the cloned Animal object
	 * @throws CloneNotSupportedException if cloning is not supported
	 */
	@Override
	protected Animal clone() throws CloneNotSupportedException {
		return (Animal) super.clone();
	}

	/**
	 * The AnimalRegistry class serves as a registry for cloning animal objects.
	 */
	static class AnimalRegistry {
		private Map<String, Animal> animalMap;

		/**
		 * Constructs a new AnimalRegistry.
		 */
		public AnimalRegistry() {
			this.animalMap = new HashMap<>();
		}

		/**
		 * Adds an animal to the registry.
		 *
		 * @param animal the animal to add
		 */
		public void addAnimal(Animal animal) {
			animalMap.put(animal.getName(), animal);
		}

		/**
		 * Retrieves a cloned animal from the registry by name.
		 *
		 * @param name the name of the animal to retrieve
		 * @return the cloned animal object
		 * @throws CloneNotSupportedException if cloning is not supported
		 */
		public Animal getAnimal(String name) throws CloneNotSupportedException {
			Animal animal = animalMap.get(name);
			if (animal != null) {
				return animal.clone();
			}
			return null;
		}
	}
}
