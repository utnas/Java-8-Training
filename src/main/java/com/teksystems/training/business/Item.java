
package com.teksystems.training.business;

public class Item {

	private final String name;
	private final double basePrice;
	private volatile boolean imported;

	public Item(final String name, final double price) {
		this.name = name;
		this.basePrice = price;
	}

	public String getName() {
		return this.name;
	}

	public double getBasePrice() {
		return this.basePrice;
	}

	public void makeImported() {
		this.imported = true;
	}

	public void makeNotImported() {
		this.imported = false;
	}

	public boolean isImported() {
		return this.imported;
	}
}
