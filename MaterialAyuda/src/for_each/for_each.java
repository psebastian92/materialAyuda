/*BUCLE FOR EACH ("POR CADA")
 * En este ejemplo, tenemos un array de nombres que contiene algunos nombres. 
 * 
 * Utilizamos el bucle "for-each" para recorrer cada nombre en el array. 
 * 
 * La línea for (String nombre : nombres) declara el bucle "for-each". 
 * 
 * "String" es el tipo de dato de los elementos en el array y "nombres_almacenados"
 *  es una variable que representa cada nombre en la iteración. 
 *  
 *  "nombres" es el array que queremos recorrer. 
 *  
 *  Dentro del bucle, la línea System.out.println(nombres_almacenados) 
 *  imprime cada nombre en la consola. 
 *  
 *  El programa recorrerá todos los nombres en el array y mostrará uno por uno.
 * */

package for_each;

public class for_each {

	public static void main(String[] args) {
		// Creamos un array de nombres
		String[] nombres_ejemplo = { "Ana", "Pedro", "María", "Carlos" };

		// Usamos el bucle "for-each" para recorrer los nombres
		for (String nombres_almacenados : nombres_ejemplo) {
			// Imprimimos cada nombre en la consola
			System.out.println(nombres_almacenados);
		}
	}

}
