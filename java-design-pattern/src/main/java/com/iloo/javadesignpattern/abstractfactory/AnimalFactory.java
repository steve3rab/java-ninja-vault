package com.iloo.javadesignpattern.abstractfactory;

/**
 * The AnimalFactory interface declares the abstract methods for creating
 * animals.
 */
interface AnimalFactory {
	/**
	 * Creates an instance of a dog.
	 *
	 * @return a dog object
	 */
	Animal createDog();

	/**
	 * Creates an instance of a cat.
	 *
	 * @return a cat object
	 */
	Animal createCat();
}
