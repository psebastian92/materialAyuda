/* SENTENCIA FOR
 La instrucción "for" es un bucle (algo que se repite), que va haciendo las instrucciones una cantidad de veces 
determinada. Al dejar de cumplirse la condición, termina de ejecutar sus instrucciones. Su sintaxis es:

for ( inicialización ; condición; modificación) {
<instrucciones>
}

se suele usar la letra "i" como variable dentro de un "for", definida como entero: int i.
Esto es porque "i" viene de "iteración" (repetición)".

EJEMPLO:
*/
package sentencia_for;

public class sentfor {

	public static void main(String args[]) throws InterruptedException {
		
		/* "for" necesita una variable, que como dijimos antes, usamos "i", que puede declararse dentro del for, o por fuera:
		POR FUERA DE FOR:
		int i;
		for (i=0 ; i<100; i++){
		}
		
		POR DENTRO DE FOR:
		for (int i=0 ; i<100; i++){
		}
		
		*/
		
		for (int i = 0 /*SE INICIA EL FOR EN 0*/; i<=100 /* SU CONDICIÓN ES QUE i SEA MENOR O IGUAL QUE 100*/; i++ /* AUMENTA "i" de 1 EN 1 */) {
			System.out.println("La cantidad de seguidores es: "+i);	
			Thread.sleep(50);
		}
		
		Thread.sleep(1000);
		
		System.out.println("\nFelicidades! Llegaste a los 100 seguidores");
		
		Thread.sleep(2000);
		
		System.out.println("\nEl streamer comenta que Messi es un pecho frío, y entonces: \n"); // ACORDATE: \n es un salto de línea
		Thread.sleep(3000);
				
		// Disminuimos la cantidad de seguidores de 100 a 0:
		
		
		for (int i = 100 /*SE INICIA EL FOR EN 100*/; i>=0 /* SU CONDICIÓN ES QUE i SEA MAYOR O IGUAL 0*/; i-- /* DISMINUYE "i" de 1 EN 1 */) {
			System.out.println("La cantidad de seguidores es: "+i);	
			Thread.sleep(50);
			
			/* ATENCIÓN: i es >0 porque si escribimos i<0 nunca va a hacer las instrucciones de for.
			pensá que: al comienzo de este ciclo, i es 100. "For" pregunta a si mismo "i, es menor a 0?" NO, porque 100 es mayor a 0. Entonces
			no realiza el "for". En cambio, al colocar que i es mayor o igual a 0, el ciclo "for" se pregunta:
			"i, es mayor o igual a 0" Sí! Es mayor, porque vale 100. Entonces realiza su ciclo. 
			*/
		}
		
		System.out.println("\t :( ");	
		
	}
	
}
