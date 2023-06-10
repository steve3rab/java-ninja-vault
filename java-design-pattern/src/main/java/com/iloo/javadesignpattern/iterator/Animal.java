package com.iloo.javadesignpattern.iterator;

/**
 * The Animal class represents an animal.
 */
class Animal {
	private String name;
	private String species;

	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}
}
