package com.main;

public class Multip implements Operacion {

	double x;
	double y;

	public Multip(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Multiplicación:[x=" + x + ", y=" + y + "]";
	}

	@Override
	public double ejecuta() {
		// TODO Auto-generated method stub
		return x * y;
	}

}
