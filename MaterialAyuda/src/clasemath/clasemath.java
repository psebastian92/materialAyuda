package clasemath;

public class clasemath {

		  public static void main(String[] args) {
			/*RAIZ CUADRADA: usa variables tipo "double"
			 Ejemplo:  
			double raiz_cuadrada = Math.sqrt(25);
			
			Se puede convertir a otro tipo de variable. Te muestro con el float:
			float raiz_cuadrada = (float) Math.sqrt (25);
			se pone el tipo de variable entre paréntesis para cambiarla.
			*/
			double raiz_cuadrada = Math.sqrt(25);
			  
			
			/* POTENCIA: usa variables tipo "double"
			 * Ejemplo: 
			double base = 9, exponente = 2;
			double potencia = Math.pow(base, exponente);
			 Para cambiar el tipo de variable, se hace lo mismo que en la raiz cuadrada.
			 Es decir, se coloca entre paréntesis el tipo de variable antes de la clase
			 Math. 
			 Ejemplo:
			 int potencia = (int) Math.pow (4,2) (esto sería 4 al cuadrado);
			 */
			
			
			double base = 9, exponente = 2;
			double potencia = Math.pow(base, exponente);
			
			/* RANDOM: es una clase que me devuelve valores entre 0 y 1.
			   		Es del tipo "double".
			   	Ejemplo:
			   	double numeroAleatorio = (Math.random()*10);
			   	Esta línea de código, me da un número entre 0 y 1, pero que se multiplica
			   	por 10. Por ende, me devuelve un número entre 0 y 10.
			   	
			   	Para pasar a otro tipo de variable (por ejemplo, a "int"):
			   	int numeroAleatorio = (int) (Math.random()*10);
			 */
			
			double numeroAleatorio = (Math.random()*25); //daré un número entre 0 y 25.
			
			
			
			/*REDONDEO: es una clase que redondea a número entero. Es del tipo "long".
			 Por debajo del 5, redondea "para abajo". Por encima del 5, redondea para
			 arriba. Por ej: 4,4 redondea a 4, y 4,7 redondea a 5. 
			Ejemplo:
			float numero;
			long numRedondeado = Math.round(numero);
			
			Para pasar a otro tipo de variable (por ejemplo, a "int"):
			   	int numRedondeado = (int) Math.round(numero);
			 */
			double numero = 4.2;
			int numRedondeado = (int) Math.round(numero);
		 
		    
			
			// VAMOS A MOSTRAR EN PANTALLA TODOS LOS DATOS ANTERIORES:
		    System.out.println("El valor de la raiz es: "+raiz_cuadrada);
		    
		    System.out.println("El valor de la potencia es: "+potencia);
		    
		    System.out.println("El número aleatorio entre 1 y 25 es: " + numeroAleatorio);
		    
		    System.out.println("El número redondeado es: "+numRedondeado);
		    
		    
		 }
}
