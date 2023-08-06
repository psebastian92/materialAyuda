package sentencia_for;

import java.util.Scanner;

public class sentfor_usuario {
	public static void main(String args[]) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int alumnos;

		System.out.println("Indique cantidad de alumnos: ");
		alumnos = entrada.nextInt();

		for (int i = 0; i <= alumnos; i++) {
			System.out.println("Se inscribio el alumno numero: " + i);
			Thread.sleep(50);
		}

		System.out.println("Se alcanzó la cantidad máxima de alumnos. ");

	}
}
