package com.exceptionhandling.customexception;

class InvalidAgeException extends Exception {
	
	// Constructor to pass custom exception message
    InvalidAgeException(String message) {
        super(message);
    }
}