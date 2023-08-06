			/* INGRESO Y EGRESO DE DATOS CON JOPTIONPANE*/
/* Hasta ahora venimos ingresando datos con la clase Scanner, y mostrando datos
  por consola. Vamos a explicar la clase JOptionPane, que tiene algunas particularidades.
  
  JOPTIONPANE INGRESA SIEMPRE STRINGS A LAS VARIABLES (vamos a ver en este programa cómo
  hacer cuando quiero ingresar variables que no son Strings).
    
  */


package ingrdatos_joptionpane;

// Primero que nada, se necesita la librería 'javax.swing.JOptionPane'. Abajo de este comentario:
import javax.swing.JOptionPane;

public class ingrdatos_joptionpane {
	public static void main(String[] args) {
		String nombre;
		char genero;
		int edad;
		float altura;
		
		/*INGRESAR DATOS TIPO STRING (cadena de caracteres, o sea, texto): 
		Se escribe así:
		variable = JOptionPane.showInputDialog() 
		Te lo explico:
		
		variable = -se escribe la clase JOption Pane- -luego va un punto.
		 
		 - después el comando para ingresar datos showInputDialog.
		 
		 - finalmente, y pegado a showInputDialog, abro y cierro paréntesis (). Dentro de esto
		 saldrá un mensaje por ventana. 
		*/
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");	
		
		/*INGRESAR DATOS TIPO CHAR (caracteres): 
		Se escribe así:
		variable = JOptionPane.showInputDialog().charAt(0);
		Te lo explico:
		
		variable = -se escribe la clase JOption Pane- -luego va un punto.
		 
		 - después el comando para ingresar datos showInputDialog.
		 
		 - Luego, y pegado a showInputDialog, abro y cierro paréntesis (). Dentro de esto
		 saldrá un mensaje por ventana. 
		 
		 - finalmente, el comando charAt(0) con un CERO dentro del paréntesis.
		*/
		
		
		genero = JOptionPane.showInputDialog("Ingrese con una letra su genero: ").charAt(0);
		
		
		/*INGRESAR DATOS TIPO INT (enteros): 
		 En el caso de los números, hay que transformar el String que ingresa el JOptionPane
		 en su respectivo número (int, float, double, etc.). 
		 
		Se escribe así:
		variable = Integer.parseInt( JOptionPane.showInputDialog() );
		Te lo explico:
		
		variable = -se escribe la clase Integer -luego va un punto.
		
		 - Luego de Integer., se escribe "parseInt" y abro y cierro paréntesis. 
		 Esto transforma el String que genera el JOptionPane en entero (Int). 
		 
		 - Dentro de los paréntesis, va el comando para ingresar datos JOptionPane.showInputDialog.
		 
		 - Finalmente, y pegado a showInputDialog, abro y cierro paréntesis (). Dentro de esto
		 saldrá un mensaje por ventana. 
		 

		*/
		
		edad =  Integer.parseInt( JOptionPane.showInputDialog("Ingrese su edad: ") );
		
		/*INGRESAR DATOS TIPO FLOAT (decimales): 
		 En el caso de los números, hay que transformar el String que ingresa el JOptionPane
		 en su respectivo número (int, float, double, etc.). 
		 
		Se escribe así:
		variable = Float.parseFloat( JOptionPane.showInputDialog() );
		Te lo explico:
		
		variable = -se escribe la clase Integer -luego va un punto.
		
		 - Luego de Float., se escribe "parseFloat" y abro y cierro paréntesis. 
		 Esto transforma el String que genera el JOptionPane en flotante (float). 
		 
		 - Dentro de los paréntesis, va el comando para ingresar datos JOptionPane.showInputDialog.
		 
		 - Finalmente, y pegado a showInputDialog, abro y cierro paréntesis (). Dentro de esto
		 saldrá un mensaje por ventana. 
		 

		*/
		
		altura =  Float.parseFloat( JOptionPane.showInputDialog("Ingrese su altura: ") );
		// CUIDADO. Al momento de ingresar decimales, hacerlo con punto y no con coma.
		
		// MOSTRAR DATOS POR VENTANA EN VEZ DE POR CONSOLA.
		
		/* Vamos a mostrar los datos ingresados. Pero por ventana, no por consola.
		   Acá vas a ver el comando. Tené en cuenta que SIEMPRE (por ahora) va (null, dato a mostrar)
		   */
		JOptionPane.showMessageDialog(null, "Su nombre es: "+nombre);
		JOptionPane.showMessageDialog(null, "Su genero es: "+genero);
		JOptionPane.showMessageDialog(null, "Su edad es: "+edad);
		JOptionPane.showMessageDialog(null, "Su altura es: "+altura);
		
		/* TAMBIÉN SE PUEDE INGRESAR DATOS CON JOPTIONPANE Y MOSTRAR POR CONSOLA: */
		System.out.println("Su nombre es: "+nombre);
		System.out.println("Su genero es: "+genero);
		System.out.println("Su edad es: "+edad);
		System.out.println("Su altura es: "+altura);
		
				 
	}

}
