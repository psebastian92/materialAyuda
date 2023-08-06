// AGREGAR DADOS POR PARTE DE UN USUARIO

package arreglos;

import java.util.Scanner;

public class arreglosusuario {
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);

		String[] nombre = new String[3];
		/*
		 * en este caso, 3 es el número de elementos. Acordate que primero SE DEFINEN
		 * los arreglos. A mi se me ocurrió llamarlo "nombre"
		 */

		// "String" significa "cadena" en inglés. Sirve para almacenar palabras.
		// "String" es distinto de "char", porque char es un solo caracter.

		int[] edad = new int[3];
		/*
		 * en este caso, 3 es el número de elementos. Acordate que primero SE DEFINEN
		 * los arreglos. A mi se me ocurrió llamarlo "edad"
		 */

		/* Vas a ver que voy a usar un "for" para guardar los datos. Los "for" son muy
		 * amigos de los arreglos. Ya vas a ver por qué:
		 */
		for (int i = 0; i < 3 /* acá también podía poner i<=2 */ ; i++) {
			// "i" es menor a 3, porque dijimos que el arreglo tiene 3 elementos.

			/*
			 * Fijate que asociamos "i" con la posición del vector (mirá en nombre[i], donde
			 * "i" es la posición). El "for" comienza en i=0. Entonces toooodo lo que se
			 * haga dentro del for instrucción, se va a realizar en la posición 0. Cuando
			 * terminen las instrucciones, "for" aumenta "i" a 1, entonces ahora el vector
			 * pasa a la posición 1.
			 * 
			 */

			System.out.println("Ingresa un nombre: ");
			nombre[i] = datos.next();
			// nombre en la posición "i" (comienza en 0, termina en 2).

			System.out.println("Ingresa la edad correspondiente: ");
			edad[i] = datos.nextInt();

		}

		System.out.println("\n "); // \n es un salto de línea. Lo uso por prolijidad.

		// voy a usar otro "for" para mostrar los datos que ingresamos antes
		for (int i = 0; i < 3; i++) {

			System.out.println("Nombre en la posicion " + i + ": ");
			System.out.println(nombre[i]);

			System.out.println("Edad en la posicion " + i + ": ");
			System.out.println(edad[i]);

			System.out.println(""); // meto println para ser mas prolijo.

		}

	}

}
