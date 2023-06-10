package com.iloo.javadesignpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Lion());
		animals.add(new Elephant());
		animals.add(new Giraffe());
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Giraffe());
		animals.add(new Tiger());

		AnimalCounter animalCounter = new AnimalCounter();
		animalCounter.countAnimals(animals);
	}
}
