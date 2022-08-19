package com.main;

import java.util.*;
import java.util.function.DoubleBinaryOperator;

public class Principal {

	public static void main(String[] args) {

		// Operaciones Basicas
		DoubleBinaryOperator suma = (x, y) -> new Suma(x, y).ejecuta();
		DoubleBinaryOperator resta = (x, y) -> new Resta(x, y).ejecuta();
		DoubleBinaryOperator multi = (x, y) -> new Multip(x, y).ejecuta();
		DoubleBinaryOperator div = (x, y) -> new Divicion(x, y).ejecuta();

		// Operaciones extras
		DoubleBinaryOperator exp = (x, y) -> new Potencia(x, y).ejecuta();
		DoubleBinaryOperator raiz = (x, y) -> new RaizXMasY(x, y).ejecuta();

		DoubleBinaryOperator sen = (x, y) -> new SenXMenosY2(new Resta(x, y).ejecuta()).ejecuta();
		DoubleBinaryOperator cos = (x, y) -> new CosXMasY(new Suma(x, y).ejecuta()).ejecuta();
		DoubleBinaryOperator tan = (x, y) -> new TanXPorY(new Multip(x, y).ejecuta()).ejecuta();

		List<DoubleBinaryOperator> listOpe = new ArrayList<>();

		listOpe.add(suma); // 15
		listOpe.add(div); // 4
		listOpe.add(resta); // 9
		listOpe.add(multi); // 36

		listOpe.add(exp);// 1728
		listOpe.add(raiz); // 5.19

		listOpe.add(sen); // sen(9)->0.1564
		listOpe.add(cos); // cos(115)->0.9659
		listOpe.add(tan); // tan(36)-> 0.7265

		ejecutaOperaciones(listOpe);
	}

	static void ejecutaOperaciones(List<DoubleBinaryOperator> listOperaciones) {
		for (DoubleBinaryOperator ope : listOperaciones) {

			try {
				System.out.println(ope.applyAsDouble(12, 3));
			} catch (ArithmeticException e) {
				System.out.println("La división no se pudo realizar");
			}

		}
	}

}
