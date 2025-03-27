// AGREGAR DADOS POR PARTE DE UN USUARIO

package arreglos;

import java.util.Scanner;

public class arreglosusuario_sincoment {
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);

		String[] nombre = new String [3]; // array "nombre" String de 3 elementos
		
		int[] edad = new int [3]; // array "edad entero de 3 elementos
		
		for (int i = 0; i < 3 ; i++) {
			
			System.out.println("Ingresa un nombre: ");
			nombre[i] = datos.next();
			
			System.out.println("Ingresa la edad correspondiente: ");
			edad[i] = datos.nextInt();
			
			System.out.println(""); 
		}

		System.out.println("\n "); 


		for (int i = 0; i < 3; i++) {

			System.out.println("Nombre en la posicion " + i + ": ");
			System.out.println(nombre[i]);

			System.out.println("Edad en la posicion " + i + ": ");
			System.out.println(edad[i]);

			System.out.println(""); 

		}

	}

}