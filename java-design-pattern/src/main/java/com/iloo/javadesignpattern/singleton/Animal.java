package com.iloo.javadesignpattern.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * The Animal class represents a singleton instance of an animal.
 */
class Animal {
	private static final AtomicReference<Animal> INSTANCE = new AtomicReference<>();
	private String name;
	private String species;

	/**
	 * Private constructor to prevent instantiation from outside the class.
	 */
	private Animal() {
	}

	/**
	 * Retrieves the singleton instance of the AnimalSingleton class.
	 *
	 * @return the singleton instance
	 */
	public static Animal getInstance() {
		if (INSTANCE.get() == null) {
			synchronized (Animal.class) {
				if (INSTANCE.get() == null) {
					INSTANCE.set(new Animal());
				}
			}
		}
		return INSTANCE.get();
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
}
