package sentencia_while;

import java.util.Scanner;

/* ESTRUCTURA DEL WHILE:
while (condición a analizar) {
instrucciones;
}
while significa "mientras"
Se lee así: "mientras la condición se cumpla, se harán REPETITIVAMENTE las instrucciones
hasta que deje de cumplirse la condición. ESTE CICLO SE REPITE hasta que no se cumpla la condición analizada.
*/
public class sentencia_while {
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
		int contras;

		System.out.println("Escribi la contraseña: ");
		contras = datos.nextInt();

		while (contras != 7) {
			System.out.println("No, le erraste.");
			System.out.println("Volvé a intentarlo: ");
			contras = datos.nextInt();
		}

		System.out.println("Contraseña correcta.");

	}
}
