package com.iloo.javadesignpattern.abstractfactory;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Dog class represents a dog, which is a type of animal.
 */
class Dog implements Animal {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	@Override
	public void makeSound() {
		LOGGER.info("Dog barks.");
	}
}