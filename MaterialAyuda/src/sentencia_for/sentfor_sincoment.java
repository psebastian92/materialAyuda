package sentencia_for;

public class sentfor_sincoment {

	public static void main(String args[]) throws InterruptedException {

		for (int i = 0; i <= 100; i++) {
			System.out.println("La cantidad de seguidores es: " + i);
			Thread.sleep(50);
		}

		Thread.sleep(1000);

		System.out.println("\nFelicidades! Llegaste a los 100 seguidores");

		Thread.sleep(2000);

		System.out.println("\nEl streamer comenta que Messi es un pecho frío, y entonces: \n"); // ACORDATE: \n es un
																								// salto de línea
		Thread.sleep(3000);

		// Disminuimos la cantidad de seguidores de 100 a 0:

		for (int i = 100; i >= 0; i--) {
			System.out.println("La cantidad de seguidores es: " + i);
			Thread.sleep(50);
		}

		System.out.println("\t :( ");

	}

}