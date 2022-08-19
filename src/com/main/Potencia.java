package com.main;

public class Potencia implements Operacion {

	double x;
	double y;

	public Potencia(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Exponecial:[x=" + x + ",^ y=" + y + "]";
	}

	@Override
	public double ejecuta() {
		// TODO Auto-generated method stub
		return Math.pow(x, y);
	}

}
