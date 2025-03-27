package Sentencia_If;

public class ejemploIfAnidados {
	public static void main(String[] args) {
		/*
		 * OBJETIVO: analizar si una persona tiene la cuenta de Mercado Pago habilitada.
		 * Si la tiene, hay que controlar si puede abonar un sandwich de milanesa en lo
		 * de Cloty, que cuesta $5000, asignandole un valor inicial al dinero disponible
		 * de la persona.
		 */

		float dineroDisponible = 8000; // determinamos que tiene $4000 iniciales. Cambia este valor para ver que sucede.
		boolean cuentaActiva = true; // asignamos por programa que la cuenta esta activa. Cambia a "false" para ver que ocurre.

		if (cuentaActiva == true) {

			if (dineroDisponible >= 5000) {
				System.out.println("Que disfrutes tu sandwich!");
			} else {
				System.out.println("No tenes fondo suficiente :(");
			}

		} else {
			System.out.println("Cuenta inhabilitada.");
		}

	}
}
