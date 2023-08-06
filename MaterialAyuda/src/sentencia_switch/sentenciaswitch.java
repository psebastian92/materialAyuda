package sentencia_switch;

import java.util.Scanner;

public class sentenciaswitch {
	
		public static void main (String[] args) {
			Scanner datos = new Scanner (System.in);
					
			int dinero;
			
			System.out.println("Cuánta plata tenés?");
		
			dinero = datos.nextInt();
			
			
		/* Switch determina a partir de que "case" (opción) comienza a 
			ejecutar. Esa opción debe ser ENTERA (int), o bien un caracter
			entre apóstrofes ('a','b','c',etc.) */
			
			/* ESTRUCTURA DEL SWITCH:
			 switch (condición a analizar) {
			 	case número/letra: instrucciones;
			 	case número/letra: instrucciones;
			 	default: instrucciones;
			 }
			 
			 */
			
			switch(dinero) { // Switch analiza la variable "dinero".
			
				case 200:
					System.out.println("Empanada");
					break; /* break indica que acá termina el switch., 
					y sale por la llave que cierra al switch -> }.
					Si no se coloca "break", seguirá ejecutando 
					los "case" que continúan*/
					
			
				case 500:
					System.out.println("Milanesa sola");
					break;
					
				case 1000:
					System.out.println("Una re ensalada");
					break;
					
				default: /* Default sirve para indicar instrucciones
					a opciones que no están indicadas en el switch*/
					System.out.println("No tengo nada por esa cantidad");
					break;
				
			}
	 
			System.out.println("Hasta la proxima");
		}
	}
