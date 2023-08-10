package matriz;

import java.util.Random;

public class MatrizSomar {
	  public static void main(String[] args) {
	        int[][] num = new int[5][5];

	        preencher(num);
	        mostrar(num);
	        int soma = somar(num);
	        System.out.println("Soma de todos os elementos da matriz: " + soma);
	    }

	    public static void preencher(int[][] num) {
	        Random rd = new Random();

	        for (int i = 0; i < num.length; i++) {
	            for (int j = 0; j < num[i].length; j++) {
	                num[i][j] = rd.nextInt(100); // Gera números inteiros aleatórios até 99
	            }
	        }
	    }

	    public static void mostrar(int[][] num) {
	        System.out.println("Matriz completa:");

	        for (int i = 0; i < num.length; i++) {
	            for (int j = 0; j < num[i].length; j++) {
	                System.out.print(num[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }

	    public static int somar(int[][] num) {
	        int soma = 0;

	        for (int i = 0; i < num.length; i++) {
	            for (int j = 0; j < num[i].length; j++) {
	                soma += num[i][j];
	            }
	        }

	        return soma;
	    }
}
