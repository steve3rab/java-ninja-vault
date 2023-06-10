package com.iloo.javainheritance.hybrid;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Bat class represents a bat, which is a land animal that can fly.
 */
class Bat extends LandAnimal implements FlyingAnimal {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	@Override
	public void fly() {
		LOGGER.info("Bat is flying.");
	}
}