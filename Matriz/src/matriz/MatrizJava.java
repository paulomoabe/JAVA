package matriz;

import java.util.Scanner;

public class MatrizJava {
	 public static void main(String[] args) {
	        int[][] num = new int[4][4];
	        preencher(num);
	        mostrar(num);
	    }

	    public static void preencher(int[][] num) {
	        Scanner scan = new Scanner(System.in);

	        for (int i = 0; i < num.length; i++) {
	            for (int j = 0; j < num[i].length; j++) {
	                System.out.print(i + ", " + j + ": ");
	                num[i][j] = scan.nextInt();
	            }
	        }
	    }

	    public static void mostrar(int[][] n) {
	        System.out.println("Matriz completa:");

	        for (int i = 0; i < n.length; i++) {
	            for (int j = 0; j < n[i].length; j++) {
	                System.out.print(n[i][j] + "\t");
	            }
	            System.out.println(); // Pula para a próxima linha após cada linha da matriz
	        }
	    }

}
