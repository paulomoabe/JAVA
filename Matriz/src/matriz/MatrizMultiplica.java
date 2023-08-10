package matriz;
import java.util.Scanner;
public class MatrizMultiplica {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int rowsA,colsA,rowsB ,colsB;

	        System.out.print("Digite o número de linhas da matriz A: ");
	         rowsA = sc.nextInt();
	        System.out.print("Digite o número de colunas da matriz A: ");
	         colsA = sc.nextInt();

	        System.out.print("Digite o número de linhas da matriz B: ");
	         rowsB = sc.nextInt();
	        System.out.print("Digite o número de colunas da matriz B: ");
	         colsB = sc.nextInt();

	        if (colsA != rowsB) {
	            System.out.println("As matrizes não podem ser multiplicadas.");
	            return;
	        }

	        int[][] matrizA = new int[rowsA][colsA];
	        int[][] matrizB = new int[rowsB][colsB];

	        preencherMatriz(matrizA, "A", sc);
	        preencherMatriz(matrizB, "B", sc);

	        int[][] matrizC = multiplicarMatrizes(matrizA, matrizB);

	        System.out.println("Matriz resultante C:");
	        mostrarMatriz(matrizC);
	    }

	    public static void preencherMatriz(int[][] matriz, String nome, Scanner scanner) {
	        System.out.println("Preenchendo a matriz " + nome + ":");
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(nome + "[" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	    }

	    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
	        int rowsA = matrizA.length;
	        int colsA = matrizA[0].length;
	        int colsB = matrizB[0].length;

	        int[][] matrizC = new int[rowsA][colsB];

	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                for (int k = 0; k < colsA; k++) {
	                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
	                }
	            }
	        }

	        return matrizC;
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
