package com.iloo.javainheritance.hierarchical;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Lion class represents a lion, which is a type of animal.
 */
class Lion extends Animal {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the lion roar.
	 */
	void roar() {
		LOGGER.info("Lion is roaring.");
	}
}
