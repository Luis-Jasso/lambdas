package com.main;

public class SenXMenosY2 implements Operacion {

	double x;
	

	public SenXMenosY2(double x) {
		this.x = x;
		
	}

	@Override
	public String toString() {
		return "Sen:[x=" + x + "]";
	}

	@Override
	public double ejecuta() {
		
		return Math.sin(Math.toRadians(x));
	}

}
