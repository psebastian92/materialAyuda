package matrices;

public class matricesPorPrograma {

	public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        // Matriz de 3 filas x 3 columnas

        // Asignar valores a los elementos de la matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        
        /* OTRA MANERA DE ASIGNAR ELEMENTOS A UNA MATRIZ:
         * matriz[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }
         * 
         */

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
	
}
