package com.iloo.javasolid.core;

/**
 * The AnimalBehavior functional interface represents a behavior to be performed
 * on an animal. It adheres to the Single Abstract Method (SAM) requirement,
 * making it a functional interface.
 */
@FunctionalInterface
interface AnimalBehavior {
	void perform(Animal animal);
}
