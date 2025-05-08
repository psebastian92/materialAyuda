package max_min;

import java.util.Scanner;

public class max_min {

    public static void main(String args[]) {

        // Creamos un objeto Scanner para poder leer las entradas del usuario
        Scanner lectura = new Scanner(System.in);

        // Declaramos las variables necesarias:
        // `temp` será para guardar la temperatura ingresada en cada iteración del bucle.
        // `tempMax` y `tempMin` guardarán respectivamente la temperatura máxima y mínima.
        // Al principio, asignamos un valor de 0 para ambas, ya que el primer valor ingresado será utilizado para inicializarlos.
        float temp, tempMax = 0, tempMin = 0;

        // Variable booleana que nos ayudará a saber si es el primer valor ingresado.
        boolean esPrimerIngreso = true;  

        // Iniciamos un bucle que va a recorrer las horas, de 0 a 24, con un paso de 4 horas
        for (int hora = 0; hora <= 24; hora += 4) {
            // Mostramos un mensaje en pantalla para pedirle al usuario la temperatura correspondiente a la hora
            System.out.println("Ingrese la temperatura a las " + hora + "hs: ");
            
            // Leemos la temperatura ingresada por el usuario y la guardamos en la variable `temp`
            temp = lectura.nextFloat(); 

            // Aquí verificamos si es el primer valor ingresado
            if (esPrimerIngreso) {
                // Si es el primer valor, lo usamos para inicializar tanto el máximo como el mínimo
                tempMax = temp;  // El primer valor es el máximo
                tempMin = temp;  // El primer valor es también el mínimo
                esPrimerIngreso = false;  // Luego de ingresar el primer valor, cambiamos la bandera
            }

            // Comparamos la temperatura ingresada con el valor máximo actual
            if (temp > tempMax) {
                // Si la temperatura ingresada es mayor que la máxima registrada, actualizamos `tempMax`
                tempMax = temp;
            }

            // Comparamos la temperatura ingresada con el valor mínimo actual
            if (temp < tempMin) {
                // Si la temperatura ingresada es menor que la mínima registrada, actualizamos `tempMin`
                tempMin = temp;
            }
        }

        // Una vez que terminamos de ingresar todas las temperaturas, mostramos los resultados:
        // Mostramos el valor más bajo registrado (temperatura mínima)
        System.out.println("El número mínimo es: " + tempMin);
        
        // Mostramos el valor más alto registrado (temperatura máxima)
        System.out.println("El número máximo es: " + tempMax);
    }
}
