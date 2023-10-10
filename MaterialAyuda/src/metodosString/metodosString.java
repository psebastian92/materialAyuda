package metodosString;

import java.util.Scanner;

public class metodosString {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String prueba = "Vamos a Modificar Este String";
		int numero = 9;

		String numeroString = prueba.valueOf(numero);
		String minuscula = prueba.toLowerCase();
		String mayuscula = prueba.toUpperCase();
		boolean comparacion = minuscula.equals(mayuscula);
		boolean comparacionTotal = minuscula.equalsIgnoreCase(mayuscula);

//		System.out.println(numeroString);
//		System.out.println(minuscula);
//		System.out.println(mayuscula);
//		System.out.println(comparacion);
//		System.out.println(comparacionTotal);

//	System.out.println("Ingrese su nombre");
//	String nombre = entrada.next();
//	String nombreMinuscula = nombre.toLowerCase();
//	char PrimeraMayuscula = nombreMinuscula.toUpperCase().charAt(0);
//	
//	int tamanoNombre = nombreMinuscula.length();
//	
//	String nombreSinPrimeraLetra = nombreMinuscula.substring(1, tamanoNombre);
//	System.out.println( PrimeraMayuscula+nombreSinPrimeraLetra );

//		String email = entrada.next();
//		int emailArroba = email.indexOf('@');
//		int emailPunto = email.indexOf('.');
//	
//		while ( email.indexOf('@') == -1 || email.indexOf('.')== -1 || emailArroba>emailPunto ) {
//			System.out.println("Vuelva a ingresar un email correcto");
//			email = entrada.next();
//		}

	}

}
