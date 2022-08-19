package com.main;

public class CosXMasY implements Operacion {

	double x;
	

	public CosXMasY(double x) {
		this.x = x;
		
	}

	@Override
	public String toString() {
		return "Cos:[x=" + x + "]";
	}

	@Override
	public double ejecuta() {
		
		return Math.cos(Math.toRadians(x));
	}

}
