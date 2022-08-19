package com.main;

public class RaizXMasY implements Operacion {

	double x;
	double y;

	public RaizXMasY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Raíz:[x=" + x + "] + " + "Raíz:[x=" + y + "]";
	}

	@Override
	public double ejecuta() {
		// TODO Auto-generated method stub
		return Math.sqrt(x) + Math.sqrt(y);
	}

}
