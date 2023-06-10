package com.iloo.javadesignpattern.factory;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Cat class represents a cat, which is a type of animal.
 */
class Cat implements Animal {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	@Override
	public void makeSound() {
		LOGGER.info("Cat meows.");
	}
}
