package com.structis.beug.part1.exceptions;

public class IllegalCharacterException extends RuntimeException {

	/** serialVersionUID */
	private static final long serialVersionUID = -8150275323568435745L;

	public IllegalCharacterException(String message) {
		super(message);
	}
}
