package com.iloo.javainheritance.single;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Dog class represents a dog, which is a type of animal.
 */
class Dog extends Animal {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the dog bark.
	 */
	void bark() {
		LOGGER.info("Dog is barking.");
	}
}
