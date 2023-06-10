package com.iloo.javadesignpattern.builder;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		Animal dog = Animal.builder("Dog", "Canine").age(3).sound("Barks").build();

		Animal cat = Animal.builder("Cat", "Feline", builder -> builder.sound("Meows")).age(2).build();

		LOGGER.info(dog);
		LOGGER.info(cat);
	}

}
