package com.nt.beans;

final class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine class 0-parem constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine is trady to start");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine is stop");

	}

}
