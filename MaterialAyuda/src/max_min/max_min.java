package max_min;

import java.util.Scanner;

public class max_min {
	
	public static void main(String args[]) {
		
		Scanner lectura = new Scanner(System.in);
		
		float temp, tempmax = -300, tempmin = 300;
		// temp es la temperatura que ingresa un usuario
		// tempmax =-300 para que inicialice en un valor bien bajo
		// tempmin = 300 para que comience en un valor bien alto
		
		for (int hora = 0; hora <= 24; hora += 4) {
			/* El for comienza con la hora 0.
			 * Aumenta de a 4 en 4 (hora+=4).
			 */
			System.out.println("Ingrese la temperatura a las " + hora + "hs: ");
			/* Primero sale en pantalla la frase. Luego, cada hora
			que vaya mostrando el for */
			
			temp = lectura.nextFloat(); // se ingresa la temperatura
			
			
			if (temp > tempmax) {
				tempmax = temp;
			}
			/* Se compara la temperatura ingresada (temp) con 
			 * la temperatura máxima que esté guardada. Como
			 * comienza con -300, es evidente que va a guardar
			 * un dato sí o sí (cualquier temperatura es mayor a -300)*/
			
			

			if (temp < tempmin) {

				tempmin = temp;
			}
			/* Se compara la temperatura ingresada (temp) con 
			 * la temperatura mínima que esté guardada. Como
			 * comienza con 300, es evidente que va a guardar
			 * un dato sí o sí (cualquier temperatura es menor a 300)*/
		}
		System.out.println("El numero minimo es: " + tempmin);
		System.out.println("El numero maximo es: " + tempmax);

	}
}