package com.iloo.javainheritance.sealed;

sealed class Mammal extends Animal permits Cat, Dog {
	/**
	 * Creates a new mammal with the given name.
	 *
	 * @param name the name of the mammal
	 */
	public Mammal(String name) {
		super(name);
	}
}
