package com.iloo.javainheritance.sealed;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		Animal animal = new Animal("Generic Animal");
		LOGGER.info("Animal name: {}", animal.getName());

		Cat cat = new Cat("Whiskers");
		LOGGER.info("Cat name: {}", cat.getName());

		Dog dog = new Dog("Buddy");
		LOGGER.info("Dog name: {}", dog.getName());

		Sparrow sparrow = new Sparrow("Chirpy");
		LOGGER.info("Sparrow name: {}", sparrow.getName());

		Reptile reptile = new Reptile("Rex");
		LOGGER.info("Reptile name: {}", reptile.getName());

		Crocodile crocodile = new Crocodile("Snappy");
		LOGGER.info("Crocodile name: {}", crocodile.getName());
	}
}
