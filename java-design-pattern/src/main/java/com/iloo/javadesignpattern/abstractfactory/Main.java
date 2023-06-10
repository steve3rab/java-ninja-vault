package com.iloo.javadesignpattern.abstractfactory;

public class Main {

	public static void main(String[] args) {
		AnimalFactory dogFactory = new DogFactory();
		AnimalFactory catFactory = new CatFactory();

		// Create a dog using the dog factory
		Animal dog = dogFactory.createDog();
		dog.makeSound();

		// Create a cat using the cat factory
		Animal cat = catFactory.createCat();
		cat.makeSound();
	}

}
