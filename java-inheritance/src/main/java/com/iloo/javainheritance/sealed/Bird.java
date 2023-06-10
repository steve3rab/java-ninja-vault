package com.iloo.javainheritance.sealed;

sealed class Bird extends Animal permits Sparrow {
	/**
	 * Creates a new bird with the given name.
	 *
	 * @param name the name of the bird
	 */
	public Bird(String name) {
		super(name);
	}
}
