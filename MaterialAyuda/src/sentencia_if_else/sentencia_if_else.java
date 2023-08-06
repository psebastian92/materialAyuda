package sentencia_if_else;

import java.util.Scanner;

public class sentencia_if_else {
	/* En programación una sentencia, es una línea de comandos. 
	  Por ejemplo: indicar que una variable es entera, o mostrar en 
	  pantalla una frase, o determinar la función principal. Pero también
	  tenemos las llamadas SENTENCIAS DE CONTROL DE FLUJO.
	  En este script (o sea, en este programa), vamos a ver la sentencia condicional if.  */
	
	
	/* SENTENCIA CONDICIONAL IF 
	 	La instrucción if permite ejecutar ciertas instrucciones sólo si de da una determinada condición. Else, se 
		puede usar o no. Su función, es dar una instrucción que se hará sí o sí, si NO se cumplió anteriormente la 
		condición del if. 
		
		Su sintaxis de uso es la sintaxis:
		if ( <condición> ) {
 			<instrucciones>}
 			
		else{
 		<instruccionesElse>
		}
		DETALLE: else NO lleva condiciones, ya que las mismas son analizadas por "if". 
		
		En caso de analizar mas de una condición:
		if ( <condición> ) {
 			<instrucciones>}
 			
		else if ( <condición2> ) {
 		<instruccionesElseIf>
		}
		
		else{
 		<instruccionesElse>
		}
		
		FORMAS DE ANALIZAR LA CONDICIÓN: 
		-variable == numero (para analizar si es exactamente igual a un numero)
		
		-variable> numero : para analizar si es mayor a un numero
		
		-variable< numero : para analizar si es menor a un numero
		
		-variable>= numero : para analizar si es mayor o igual a un numero
		
		-variable<= numero : para analizar si es menor o igual a un numero
		
		-variable!= numero : para analizar si es distinta a un numero
		
		-numero1 && numero2 : el "&&" me permite analizar ambos numeros
		
		-numero1 || numero 2: el "||" me permite analizar un numero u otro
		
		-variable caracter == 'caracter': para analizar si una variable es exactamente el 
		caracter entre apóstrofes ' '
		

	  */
	
	// EJEMPLO: armar un programa que indique la mayoría de edad (18 años).
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int edad;
		char genero;
					
		System.out.println("\tIndique la edad de la persona: ");  // \t centra la frase
		
		edad = entrada.nextInt();
		
		if (edad>=18) {
			System.out.println("Es mayor de edad \n"); // \n da salto de línea		 	
		}
		
		else {
			System.out.println("Es menor de edad \n");  // \n da salto de línea
		}
		
				
		/* También se puede comparar los datos tipo "char". 
		  Ejemplo:
		   */
		
					
		System.out.println("\tIndique m o f: ");
		
		genero = entrada.next().charAt(0);
		// este comando permite ingresar caracteres. Siempre colocar 0 dentro de charAt().
		 
		  if (genero =='m' ) {
			System.out.println("El genero es masculino ");			
		  }
		  if (genero == 'f' ){
		    System.out.println("El genero es femenino ");	
		  }
		   
		   
		
	}

}
