package com.iloo.javadesignpattern.abstractfactory;

/**
 * The CatFactory class is a concrete implementation of the AnimalFactory
 * interface for creating cat objects.
 */
class CatFactory implements AnimalFactory {
	@Override
	public Animal createDog() {
		throw new UnsupportedOperationException("CatFactory cannot create a dog.");
	}

	@Override
	public Animal createCat() {
		return new Cat();
	}
}
