package com.iloo.javadesignpattern.singleton;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		Animal animal1 = Animal.getInstance();
		animal1.setName("Lion");
		animal1.setSpecies("Feline");

		Animal animal2 = Animal.getInstance();

		LOGGER.info("Animal 1: {}, {}", animal1.getName(), animal1.getSpecies());
		LOGGER.info("Animal 2: {}, {}", animal2.getName(), animal2.getSpecies());
		LOGGER.info("Are the instances the same?  {}", (animal1 == animal2));
	}
}
