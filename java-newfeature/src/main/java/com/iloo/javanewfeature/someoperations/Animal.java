package com.iloo.javanewfeature.someoperations;

/**
 * An abstract class representing an animal.
 */
abstract class Animal {
	private String name;

	/**
	 * Constructs an animal with the given name.
	 *
	 * @param name The name of the animal.
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * Gets the name of the animal.
	 *
	 * @return The name of the animal.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the animal.
	 *
	 * @param name The name of the animal.
	 */
	public void setName(String name) {
		this.name = name;
	}
}
