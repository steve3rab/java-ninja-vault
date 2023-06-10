package com.iloo.javainheritance.hybrid;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The LandAnimal class represents a land-dwelling animal.
 */
class LandAnimal {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the land animal run.
	 */
	void run() {
		LOGGER.info("Land animal is running.");
	}
}