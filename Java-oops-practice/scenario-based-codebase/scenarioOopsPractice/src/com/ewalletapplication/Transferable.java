package com.ewalletapplication;

public interface Transferable {
	
	void transferTo(User receiver, double amount);
	}