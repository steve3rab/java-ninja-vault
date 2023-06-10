package com.iloo.javainheritance.hybrid;

public class Main {

	public static void main(String[] args) {
		Amphibian amphibian = new Amphibian();
		amphibian.run();
		amphibian.swim();

		Bat bat = new Bat();
		bat.run();
		bat.fly();
	}

}
