package com.iloo.javainheritance.sealed;

sealed class Reptile extends Animal permits Crocodile {
	/**
	 * Creates a new reptile with the given name.
	 *
	 * @param name the name of the reptile
	 */
	public Reptile(String name) {
		super(name);
	}
}
