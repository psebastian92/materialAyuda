package buscar_elemento_arrays;

import java.util.Scanner;

public class buscar_elemento_arrays {
	public static void main(String[] args) {
		int[] codigos = { 89713, 12384, 55612, 34123, 80921 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un codigo a buscar: ");
		int codigoBuscado = scanner.nextInt();

		boolean encontrado = false;

		for (int recorrer_array : codigos) {
			if (codigoBuscado == recorrer_array) {
				encontrado = true;
				break;
			}
		}

		if (encontrado == true) {
			System.out.println("Sí, el código ingresado está en la lista.");
			System.out.println("El codigo es: "+codigoBuscado);
		} else {
			System.out.println("No se encuentra el código ingresado.");
		}

		scanner.close();
	}
}
