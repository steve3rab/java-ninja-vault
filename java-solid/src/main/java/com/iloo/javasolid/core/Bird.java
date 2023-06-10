package com.iloo.javasolid.core;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Bird class represents a bird. It implements the Animal and FlyingAnimal
 * interfaces, adhering to the Liskov Substitution Principle (LSP).
 */
class Bird implements Animal, FlyingAnimal {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	private final String name;

	public Bird(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void fly() {
		LOGGER.info("{} is flying.", name);
	}
}
