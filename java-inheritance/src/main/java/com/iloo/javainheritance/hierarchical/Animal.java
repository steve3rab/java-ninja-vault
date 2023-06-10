package com.iloo.javainheritance.hierarchical;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Animal class represents a generic animal.
 */
class Animal {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the animal eat.
	 */
	void eat() {
		LOGGER.info("Animal is eating.");
	}
}
