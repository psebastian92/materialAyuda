package Sentencia_If;

import java.util.Scanner;

public class ejemploVariasCondiciones {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int numeroGanador = 1992;
		int numeroIngresado;
		System.out.println("Estimado usuario. Le solicito, por favor, que ingrese un "
				+ "\nnúmero entre 1900 y 2000 para hallar el número ganador: ");

		numeroIngresado = datos.nextInt();

		if (numeroGanador == numeroIngresado) {
			System.out.println("GANASTE :)");
		} else if (numeroIngresado >= 1900 && numeroIngresado <= 1930) {
			System.out.println("Estas muy lejos");
		} else if (numeroIngresado > 1930 && numeroIngresado <= 1960) {
			System.out.println("Estas lejos");
		} else if (numeroIngresado > 1960 && numeroIngresado <= 1970) {
			System.out.println("Estas un poco lejos");
		} else if (numeroIngresado > 1970 && numeroIngresado <= 1980) {
			System.out.println("Estas cerca");
		} else if (numeroIngresado > 1980 && numeroIngresado <= 1991
				|| numeroIngresado > 1991 && numeroIngresado <= 2000) {
			System.out.println("Estas muy cerca!!!");
		} else {
			System.out.println("Ingresaste cualquier cosa...");
		}

	}

}
