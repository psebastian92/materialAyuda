package archivos;

//Importar las clases necesarias para el programa
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Declarar la clase llamada "crearArchivos"
public class crearArchivos {

	// Método principal que se ejecuta cuando se inicia el programa
	public static void main(String ars[]) {

		// Crear un objeto "entrada" de tipo Scanner para recibir entrada de usuario
		Scanner entrada = new Scanner(System.in);

		// Declarar dos arreglos de cadenas de texto llamados "nombre" y "apellido" con
		// espacio para 3 elementos cada uno
		String[] nombre = new String[3];
		String[] apellido = new String[3];

		// Mostrar un mensaje en la consola
		System.out.println("INGRESA CUATRO NOMBRES Y APELLIDOS ");

		// Iniciar un ciclo "for" que se ejecutará 3 veces
		for (int i = 0; i < 3; i++) {

			// Mostrar un mensaje pidiendo al usuario ingresar un nombre y leer la entrada
			System.out.println("Ingresa el nombre numero: " + (i + 1));
			nombre[i] = entrada.next();

			// Mostrar un mensaje pidiendo al usuario ingresar un apellido y leer la entrada
			System.out.println("Ingresa el apellido numero: " + (i + 1));
			apellido[i] = entrada.next();

			// Mostrar una línea en blanco para separar las entradas de nombre y apellido
			System.out.println("");
		}

//	 	----------ESCRIBIR EL CONTENIDO EN UN ARCHIVO .TXT

		// Iniciar un bloque "try-catch" para manejar posibles errores
		try {

			// Especificar la ruta del archivo en la que se guardarán los datos
			String ruta = "C:\\Users\\seeba\\Desktop\\mi_archivo.txt";

			// Crear un objeto "file" que representa el archivo en la ruta especificada
			File file = new File(ruta);

			// Verificar si el archivo no existe, y si es así, crearlo
			if (!file.exists()) {
				file.createNewFile();
			}

			// Crear un objeto "fw" de tipo FileWriter para escribir en el archivo
			FileWriter fw = new FileWriter(file);

			// Crear un objeto "bw" de tipo BufferedWriter para escribir en el archivo de
			// manera eficiente
			BufferedWriter bw = new BufferedWriter(fw);

			// Iniciar un ciclo "for" que se ejecutará 3 veces
			for (int i = 0; i < 3; i++) {
				// Escribir en el archivo una línea que contiene el nombre y el apellido
				bw.write("Nombre: " + nombre[i] + ", Apellido: " + apellido[i]);

				// Agregar una nueva línea después de cada entrada
				bw.newLine();
			}

			// Cerrar el BufferedWriter para finalizar la escritura en el archivo
			// Si no se cierra el bufer, no se genera el archivo.
			bw.close();

			// Mostrar un mensaje en la consola para indicar que el archivo se creó con
			// éxito
			System.out.println("Archivo creado con éxito.");
		} catch (Exception e) {
			// En caso de un error, mostrar información detallada sobre el error en la
			// consola
			e.printStackTrace();
		}

// 	----------LEER EL CONTENIDO DE UN ARCHIVO .TXT

		// Intentamos hacer algo en este bloque de código
		try {
			// Abrimos un archivo llamado "mi_archivo.txt" ubicado en el escritorio de la
			// computadora
			// para leerlo (FileReader lo abre) y lo leemos línea por línea de manera
			// eficiente (BufferedReader)
			FileReader archivo = new FileReader("C:\\Users\\seeba\\Desktop\\mi_archivo.txt");
			BufferedReader lector = new BufferedReader(archivo);

			// Declaramos una variable llamada "linea" para guardar cada línea que leemos
			// del archivo
			String linea;

			// Usamos un bucle que se repite mientras haya líneas por leer en el archivo
			while ((linea = lector.readLine()) != null) {
				//!= significa "distinto de". En este caso, se refiere a que
				// va a repetirse el bucle mientras no haya líneas vacías.
				
				// Mostramos cada línea que leemos en la pantalla (en la consola)
				System.out.println(linea);
			}

			// Cerramos el archivo después de leerlo para liberar recursos
			lector.close();
		} catch (IOException e) {
			// En caso de que ocurra algún problema al abrir o leer el archivo,
			// mostramos información detallada sobre el error en la pantalla (en la consola)
			e.printStackTrace();
		}

	}
}

/*
 * A CONTINUACIÓN, SE DETALLAN ALGUNAS DEFINICIONES:
 * 
 * ARCHIVO: en informática, un archivo es una colección de datos almacenados en
 * una ubicación específica y con un nombre único en un dispositivo de
 * almacenamiento. stos datos pueden ser de diferentes tipos, como texto,
 * imágenes, sonidos, videos, programas ejecutables y más. Los archivos se
 * utilizan para organizar, almacenar y acceder a información de manera
 * estructurada.
 * 
 * 
 * IMPORTANCIA DE LOS ARCHIVOS: la escritura y lectura de archivos en Java es
 * importante en una amplia gama de aplicaciones y escenarios de desarrollo de
 * software. Facilita la persistencia de datos, la interacción con el usuario,
 * la comunicación entre aplicaciones, la recuperación de datos y muchas otras
 * tareas esenciales en la programación. Por lo tanto, es una habilidad
 * fundamental para los desarrolladores de Java.
 * 
 * 
 * BÚFER: el término "buffered" se refiere a la técnica de almacenar datos en
 * una memoria temporal llamada "buffer" antes de procesarlos o transferirlos a
 * su destino final. En el contexto de la programación, un "buffer" es un área
 * de memoria que se utiliza para almacenar temporalmente datos antes de su
 * lectura o escritura. En el código que proporcionaste, BufferedWriter se
 * utiliza para escribir datos en un archivo de manera eficiente al almacenarlos
 * primero en un búfer antes de escribirlos en el archivo físico. Esta técnica
 * ofrece ventajas en términos de rendimiento, ya que permite reducir el número
 * de operaciones de escritura directa en el archivo, lo que puede ser costoso
 * en términos de tiempo y recursos. En resumen, BufferedWriter se utiliza para
 * optimizar la escritura de datos en archivos al utilizar un búfer intermedio
 * que acumula los datos antes de escribirlos en el archivo, lo que puede
 * mejorar la eficiencia y el rendimiento de las operaciones de escritura.
 * 
 */
