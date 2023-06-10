package com.iloo.javasolid.core;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Fish class represents a fish. It implements the Animal and SwimmingAnimal
 * interfaces, adhering to the Liskov Substitution Principle (LSP).
 */
class Fish implements Animal, SwimmingAnimal {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	private final String name;

	public Fish(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void swim() {
		LOGGER.info("{} is swimming.", name);
	}
}
