package sentencia_for;

import java.util.Scanner;

public class sentfor_opmatem {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int num, limite, resul;

		System.out.println("Indique de que numero desea ver su tabla de multiplicar ");
		num = entrada.nextInt();

		System.out.println("Hasta que valor deseas la tabla? ");
		limite = entrada.nextInt();

		for (int i = 0; i <= limite; i++) {
			resul = num * i;
			System.out.println(num + " * " + i + " = " + resul);
		}

	}
}
