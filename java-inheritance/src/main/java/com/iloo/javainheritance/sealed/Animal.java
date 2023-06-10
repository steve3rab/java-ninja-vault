package com.iloo.javainheritance.sealed;

/**
 * Represents an animal.
 */
public sealed class Animal permits Mammal, Bird, Reptile {
	private String name;

	/**
	 * Creates a new animal with the given name.
	 *
	 * @param name the name of the animal
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * Returns the name of the animal.
	 *
	 * @return the name of the animal
	 */
	public String getName() {
		return name;
	}
}
