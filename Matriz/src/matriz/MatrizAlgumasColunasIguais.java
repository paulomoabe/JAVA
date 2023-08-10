package matriz;

public class MatrizAlgumasColunasIguais {
	 public static void main(String[] args) {
	        int[][] matriz = criarMatriz(5, 4);
	        mostrarMatriz(matriz);
	    }

	    public static int[][] criarMatriz(int l, int c) {
	        int[][] matriz = new int[l][c];

	        for (int i = 0; i < l; i++) {
	            for (int j = 0; j < c; j++) {
	                if (j % 2 == 0) {
	                    matriz[i][j] = 0;
	                } else {
	                    matriz[i][j] = 1;
	                }
	            }
	        }

	        return matriz;
	    }

	    public static void mostrarMatriz(int[][] matriz) {
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }

}
