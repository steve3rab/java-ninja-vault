package com.iloo.javainheritance.multilevel;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Parrot class represents a parrot, which is a type of bird.
 */
class Parrot extends Bird {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the parrot speak.
	 */
	void speak() {
		LOGGER.info("Parrot is speaking.");
	}
}
