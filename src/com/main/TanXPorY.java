package com.main;

public class TanXPorY implements Operacion {

	double x;
	

	public TanXPorY(double x) {
		this.x = x;
		
	}

	@Override
	public String toString() {
		return "Tan:[x=" + x + "]";
	}

	@Override
	public double ejecuta() {
		
		return Math.tan(Math.toRadians(x));
	}

}
