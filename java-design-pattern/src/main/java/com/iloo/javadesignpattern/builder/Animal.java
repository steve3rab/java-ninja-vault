package com.iloo.javadesignpattern.builder;

import java.util.function.Consumer;

/**
 * The Animal class represents an animal.
 */
class Animal {
	private final String name;
	private final String species;
	private final int age;
	private final String sound;

	private Animal(AnimalBuilder builder) {
		this.name = builder.name;
		this.species = builder.species;
		this.age = builder.age;
		this.sound = builder.sound;
	}

	/**
	 * Gets the name of the animal.
	 *
	 * @return the name of the animal
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the species of the animal.
	 *
	 * @return the species of the animal
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * Gets the age of the animal.
	 *
	 * @return the age of the animal
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Gets the sound the animal makes.
	 *
	 * @return the sound the animal makes
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * Creates a new AnimalBuilder with the required parameters.
	 *
	 * @param name    the name of the animal
	 * @param species the species of the animal
	 * @return the AnimalBuilder instance
	 */
	public static AnimalBuilder builder(String name, String species) {
		return new AnimalBuilder(name, species);
	}

	/**
	 * Creates a new AnimalBuilder with the required parameters, using a consumer
	 * function to configure the builder.
	 *
	 * @param name     the name of the animal
	 * @param species  the species of the animal
	 * @param consumer the consumer function to configure the builder
	 * @return the AnimalBuilder instance
	 */
	public static AnimalBuilder builder(String name, String species, Consumer<AnimalBuilder> consumer) {
		AnimalBuilder builder = new AnimalBuilder(name, species);
		consumer.accept(builder);
		return builder;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Animal{" + "name='" + name + '\'' + ", species='" + species + '\'' + ", age=" + age + ", sound='"
				+ sound + '\'' + '}';
	}

	/**
	 * The AnimalBuilder class is used to construct instances of the Animal class.
	 */
	static class AnimalBuilder {
		private final String name;
		private final String species;
		private int age;
		private String sound;

		private AnimalBuilder(String name, String species) {
			this.name = name;
			this.species = species;
		}

		/**
		 * Sets the age of the animal.
		 *
		 * @param age the age of the animal
		 * @return the AnimalBuilder instance
		 */
		public AnimalBuilder age(int age) {
			this.age = age;
			return this;
		}

		/**
		 * Sets the sound the animal makes.
		 *
		 * @param sound the sound the animal makes
		 * @return the AnimalBuilder instance
		 */
		public AnimalBuilder sound(String sound) {
			this.sound = sound;
			return this;
		}

		/**
		 * Builds an instance of the Animal class.
		 *
		 * @return the constructed Animal object
		 */
		public Animal build() {
			return new Animal(this);
		}
	}
}
