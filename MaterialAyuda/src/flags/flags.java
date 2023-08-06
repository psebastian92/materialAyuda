// BANDERAS (FLAGS EN INGLÉS)
/* Son variables booleanas. Recordar: variables booleanas son aquellas
   que solo nos dan dos valores posibles: true (verdadero) o false (falso). 
   Las banderas se utilizan para detectar si ocurrió un determinado acontecimiento.
   Si pasa "algo", levantamos (true) o bajamos (false) la bandera.
   Las variables booleanas, solo guardar 1 bit de información (true o false). Por lo que
   ocupan muy poca memoria en la computadora. */

//EJEMPLO: 
package flags;

import java.util.Scanner;

public class flags {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int edad, intentos = 1; // intentos será un contador.
		char decision = 'N';
		boolean quiero_salir = false; // ponemos la bandera hacia abajo (false).

		System.out.println("Trata de acertar mi edad: ");
		edad = datos.nextInt();

		while (edad != 30 && quiero_salir == false) { // 30 es el numero que hace ganar.
			/*
			 * El while quiere decir: se repite el ciclo mientras el número NO sea igual a
			 * 30, y(&&) mientras la bandera "quiero_salir" esté baja (false).
			 */
			System.out.println("No, le erraste.");
			intentos++;
			System.out.println("Cantidad de intentos: " + intentos);
			System.out.println("");

			System.out.println("Desea abandonar? (S/N)");
			decision = datos.next().charAt(0); // ingresamos un caracter S o N.

			if (decision == 'S') {
				quiero_salir = true; // se LEVANTA la bandera (true) si la persona desea salir del juego.
			} else if (decision == 'N') {
				System.out.println("Ingresa otro numero: ");
				edad = datos.nextInt();
			} else {
				System.out.println("Respuesta no valida. ");
				System.out.println("Ingresa otro numero: ");
				edad = datos.nextInt();
			}
		}

		// SALIENDO DEL CICLO WHILE

		if (quiero_salir == true) {
			System.out.println("Abandonaste. Cantidad de intentos: " + intentos);
		}
		/*
		 * Aca se da que, al estar la bandera levantada para abandonar el juego, solo se
		 * ejecuta esta acción del if (ya que pregunta si flag es igual a true
		 */

		if (edad == 30) {
			System.out.println("Ganaste! " + "Lo hiciste en " + intentos + " intentos");
		}
		/*
		 * En este caso, este "if" se iguala a la edad ganadora, que es 30. Al
		 * cumplirse, se muestra en pantalla
		 */

	}

}
