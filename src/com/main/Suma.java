package com.main;

public class Suma implements Operacion {

	double x;
	double y;

	public Suma(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Suma:[x=" + x + ", y=" + y + "]";
	}

	@Override
	public double ejecuta() {
		// TODO Auto-generated method stub
		return x + y;
	}

}
