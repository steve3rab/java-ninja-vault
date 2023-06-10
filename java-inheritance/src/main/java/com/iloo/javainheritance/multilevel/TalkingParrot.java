package com.iloo.javainheritance.multilevel;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The TalkingParrot class represents a talking parrot, which is a type of
 * parrot.
 */
class TalkingParrot extends Parrot {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * Makes the talking parrot talk.
	 */
	void talk() {
		LOGGER.info("Talking parrot is talking.");
	}
}
