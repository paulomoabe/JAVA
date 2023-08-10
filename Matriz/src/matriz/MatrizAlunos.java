package matriz;
import java.util.Scanner;
public class MatrizAlunos {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String[] alunos = new String[5];
	        double[][] notas = new double[5][4];

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
	            alunos[i] = sc.nextLine();

	            for (int j = 0; j < 4; j++) {
	                System.out.print("Digite a nota " + (j + 1) + " do aluno " + alunos[i] + ": ");
	                notas[i][j] = sc.nextDouble();
	            }

	            sc.nextLine(); // Limpar o buffer após a leitura das notas
	        }

	        System.out.println("\nListagem dos alunos e suas medias:");
	        for (int i = 0; i < 5; i++) {
	            double media = calcularMedia(notas[i]);
	            System.out.println(alunos[i] + ": Media = " + media);
	        }
	    }

	    public static double calcularMedia(double[] notas) {
	        double soma = 0;

	        for (double nota : notas) {
	            soma += nota;
	        }

	        return soma / notas.length;
	    }

}
