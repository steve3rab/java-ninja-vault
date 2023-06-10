package com.iloo.javainheritance.multiple;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Duck class represents a duck, which can fly and swim.
 */
class Duck implements Flyable, Swimmable {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	@Override
	public void fly() {
		LOGGER.info("Duck is flying.");
	}

	@Override
	public void swim() {
		LOGGER.info("Duck is swimming.");
	}
}
