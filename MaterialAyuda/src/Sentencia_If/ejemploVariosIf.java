package Sentencia_If;

import java.util.Scanner;

public class ejemploVariosIf {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese el día, mes y año de una fecha determinada
		// (todo con números).
		// Se controlará si esa fecha es válida.
		// Ejemplo de fecha valida: 30 / 8 / 2022
		// Ejemplo de fecha no valida: 32 / 7 / 2020 (no existe el dia 32 en un mes)
		// NO ENTRAR EN DETALLES CON MESES DE 28, 30 O 31 DIAS. TOMAREMOS MESES CON 30
		// DIAS COMO DATO VALIDO.

		System.out.println("\tIngrese una fecha determinada por dia, mes y año.");

		System.out.print("Ingrese el día: ");
		int dia = scanner.nextInt();

		System.out.print("Ingrese el mes: ");
		int mes = scanner.nextInt();

		System.out.print("Ingrese el año: ");
		int ano = scanner.nextInt();

		if (dia > 30) {
			System.out.println("Los meses no tienen mas de 30 días");
		}
		if (mes > 12) {
			System.out.println("Los años no tienen mas de 12 meses");
		}
		if (ano > 2025) {
			System.out.println("No se ha superado el año 2025");
		}
		
		
		System.out.println("Fecha: "+dia+"/"+mes+"/"+ano);

	}
}
