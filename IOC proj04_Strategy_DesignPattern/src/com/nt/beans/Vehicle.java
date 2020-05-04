package com.nt.beans;

public class Vehicle {
	Engine engine;

	public Vehicle() {
		System.out.println("Vehicle class 0-parem constructor");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void move() {
		engine.start();
		System.out.println("engine  is moving....");

	}

	public void parking() {
		engine.stop();
		System.out.println("engine  is park.");
	}
}
