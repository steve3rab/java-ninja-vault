package com.iloo.javainheritance.hybrid;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Amphibian class represents an amphibian, which is a land animal that can
 * swim.
 */
class Amphibian extends LandAnimal implements WaterAnimal {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	@Override
	public void swim() {
		LOGGER.info("Amphibian is swimming.");
	}
}
