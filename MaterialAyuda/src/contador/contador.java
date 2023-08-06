// CONTADORES EN PROGRAMACIÓN
/*Los contadores se utilizan para muchas cosas que iremos aprendiendo en el año.
  Pero básicamente, son variables que aumentan o disminuyen su valor en un bucle 
  (bucle while, o el bucle for). */
package contador;

import java.util.Scanner;

public class contador {
	public static void main(String args[]) throws InterruptedException {
		// throws InterruptedException sirve para luego utilizar Thread.sleep()
		Scanner datos = new Scanner(System.in);
		int num_jugadores = 1;

		while (num_jugadores <= 11) {
			System.out.println("Jugador n°: " + num_jugadores);
			Thread.sleep(500);
			/*
			 * Thread.sleep(milisegundos) sirve para esperar un determinado tiempo en
			 * milisegundos, en esa línea donde fue aplicado.
			 */
			
			num_jugadores++; /*
								 * esta linea sirve para aumentar de a uno la cantidad de jugadores. Cada vez
								 * que se ejecuta la línea 15, aumenta en uno dicha cantidad. Al llegar al
								 * máximo establecido en la condición del while (en este caso es el número 11),
								 * finaliza el bucle.
								 */
			//SI QUIERO RESTAR:
			// num_jugadores--; // esto resta de a 1.
			
			/* SI QUIERO SUMAR O RESTAR DE A MAS DE 1:
			 * Suma: 
			 * num_jugadores +=2; suma de a 2.
			 * Resta:
			 * num_jugadores -=2; resta de a 2.
			 */
		}

		System.out.println("Lista completa.");

	}
}
