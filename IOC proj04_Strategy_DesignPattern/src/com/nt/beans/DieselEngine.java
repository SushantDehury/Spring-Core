package com.nt.beans;

final class DieselEngine implements Engine {
	public DieselEngine() {
		System.out.println("DieselEngine class 0-parem constructor");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine is trady to start");

	}

	@Override
	public void stop() {
		System.out.println("DieselEngine is stop");

	}

}
