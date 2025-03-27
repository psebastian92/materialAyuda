package Sentencia_If;

import java.util.Scanner;

public class ejemplo_Else_If {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int mesDelAño;

		System.out.println("Ingrese el numero de mes, para ver a qué mes se refiere: ");
		mesDelAño = datos.nextInt();

		if (mesDelAño == 1) {
			System.out.println("Enero");
		} else if (mesDelAño == 2) {
			System.out.println("Febrero");
		} else if (mesDelAño == 3) {
			System.out.println("Marzo");
		} else if (mesDelAño == 4) {
			System.out.println("Abril");
		} else if (mesDelAño == 5) {
			System.out.println("Mayo");
		} else if (mesDelAño == 6) {
			System.out.println("Junio");
		} else if (mesDelAño == 7) {
			System.out.println("Julio");
		} else if (mesDelAño == 8) {
			System.out.println("Agosto");
		} else if (mesDelAño == 9) {
			System.out.println("Septiembre");
		} else if (mesDelAño == 10) {
			System.out.println("Octubre");
		} else if (mesDelAño == 11) {
			System.out.println("Noviembre");
		} else if (mesDelAño == 12) {
			System.out.println("Diciembre");
		} else {
			System.out.println("Mes no válido");
		}

		/*
		 * En este caso, se usa "else if", cuando tenemos varias condiciones por
		 * analizar.
		 * 
		 * Tener en cuenta, que la palabra reservada "else" analiza todas las
		 * condiciones anteriores hasta encontrar un IF. 
		 * 
		 */

	}
}
