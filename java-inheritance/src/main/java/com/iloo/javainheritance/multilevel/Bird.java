package com.iloo.javainheritance.multilevel;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Bird class represents a generic bird.
 */
class Bird {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the bird fly.
	 */
	void fly() {
		LOGGER.info("Bird is flying.");
	}
}
