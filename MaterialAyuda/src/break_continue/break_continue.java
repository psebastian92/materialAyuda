package break_continue;

public class break_continue {

	public static void main(String[] args) throws InterruptedException {
		// Ejemplo de 'break'
		System.out.println("Ejemplo de 'break':");
		for (int i = 1; i <= 7; i++) {
			if (i == 4) {
				break; // Sale del bucle cuando i es igual a 4
			}
			System.out.println("El valor de i es: " + i);
			Thread.sleep(1000);
		}
		System.out.println("Fin del programa después del 'break'");

		// Ejemplo de 'continue'
		System.out.println("\nEjemplo de 'continue':");
		for (int j = 1; j <= 5; j++) {
			if (j == 3) {
				continue; // Salta la iteración cuando j es igual a 3, pero no sale del bucle.
			}
			System.out.println("El valor de j es: " + j);
			Thread.sleep(1000);
		}
		System.out.println("Fin del programa después del 'continue'");
	}

}
