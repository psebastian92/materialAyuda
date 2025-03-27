package sentencia_if_else;

import java.util.Scanner;

public class A_Ejemplo_Con_If {
	/* En programacion, una sentencia es una linea de comandos. 
	  Por ejemplo: indicar que una variable es entera, o mostrar en 
	  pantalla una frase, o determinar la funcion principal. Pero tambien
	  tenemos las llamadas SENTENCIAS DE CONTROL DE FLUJO.
	  En este script (o sea, en este programa), vamos a ver la sentencia condicional if.  */
	
	
	/* SENTENCIA CONDICIONAL IF 
	 	La instruccion if permite ejecutar ciertas instrucciones solo si de da una determinada condicion. Else, se 
		puede usar o no. Su funcion, es dar una instruccion que se hara si o si, si NO se cumplio anteriormente la 
		condicion del if. 
		
		Su sintaxis de uso es la sintaxis:
		if ( <condicion> ) {
 			<instrucciones>}
 			
		else{
 		<instruccionesElse>
		}
		DETALLE: else NO lleva condiciones, ya que las mismas son analizadas por "if". 
		
		En caso de analizar mas de una condicion:
		if ( <condicion> ) {
 			<instrucciones>}
 			
		else if ( <condicion2> ) {
 		<instruccionesElseIf>
		}
		
		else{
 		<instruccionesElse>
		}
		
		FORMAS DE ANALIZAR LA CONDICION: 
		-variable == numero (para analizar si es exactamente igual a un numero)
		
		-variable> numero : para analizar si es mayor a un numero
		
		-variable< numero : para analizar si es menor a un numero
		
		-variable>= numero : para analizar si es mayor o igual a un numero
		
		-variable<= numero : para analizar si es menor o igual a un numero
		
		-variable!= numero : para analizar si es distinta a un numero
		
		-numero1 && numero2 : el "&&" me permite analizar ambos numeros
		
		-numero1 || numero 2: el "||" me permite analizar un numero u otro
		
		-variable caracter == 'caracter': para analizar si una variable es exactamente el 
		caracter entre comillas simples ' '
		
		
		
		¿Cuando usar else if?

	  */
	
	// EJEMPLO: armar un programa que indique la mayoria de edad (18 anos).
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int edad;
		char genero;
					
		System.out.println("\tIndique la edad de la persona: ");  // \t centra la frase
		
		edad = entrada.nextInt();
		
		if (edad>=18) {
			System.out.println("Podes pasar al casino.  \n"); // \n da salto de linea		 	
		}
		
		else {
			System.out.println("Sos menor. Chau, pipi. \n");  // \n da salto de linea
		}
		
				
		/* Tambien se puede comparar los datos tipo 'char'. 
		  Ejemplo:
		   */
		
					
		System.out.println("\tIndique m o f: ");
		
		genero = entrada.next().charAt(0);
		// este comando permite ingresar caracteres. Siempre colocar 0 dentro de charAt().
		 
		  if (genero =='m' || genero =='M') { 
			  // || signfica "o". Es para analizar si ocurre una condición o la otra.
			  System.out.println("El genero es masculino ");			
		  }
		  if (genero == 'f' || genero == 'F' ){
		    System.out.println("El genero es femenino ");	
		  }
		   
		   
		
	}

}

