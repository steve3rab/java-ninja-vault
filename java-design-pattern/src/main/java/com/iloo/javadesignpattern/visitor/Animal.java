package com.iloo.javadesignpattern.visitor;

/**
 * The Animal interface represents a sealed interface for animal types.
 */
sealed interface Animal permits Lion, Elephant, Giraffe, Tiger {
}
