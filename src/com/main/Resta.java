package com.main;

public class Resta implements Operacion {

	double x;
	double y;

	public Resta(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Resta:[x=" + x + ", y=" + y + "]";
	}

	@Override
	public double ejecuta() {
		// TODO Auto-generated method stub
		return x - y;
	}

}
