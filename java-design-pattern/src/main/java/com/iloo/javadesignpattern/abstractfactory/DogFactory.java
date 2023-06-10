package com.iloo.javadesignpattern.abstractfactory;

/**
 * The DogFactory class is a concrete implementation of the AnimalFactory
 * interface for creating dog objects.
 */
class DogFactory implements AnimalFactory {
	@Override
	public Animal createDog() {
		return new Dog();
	}

	@Override
	public Animal createCat() {
		throw new UnsupportedOperationException("DogFactory cannot create a cat.");
	}
}
