package com.iloo.javainheritance.hierarchical;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Tiger class represents a tiger, which is a type of animal.
 */
class Tiger extends Animal {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the tiger jump.
	 */
	void jump() {
		LOGGER.info("Tiger is jumping.");
	}
}
