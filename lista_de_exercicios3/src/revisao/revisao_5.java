package revisao;
import java.util.Scanner;
public class revisao_5 {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        double[] medias = new double[10];

	        adicionaMedia(medias);
	        mostraMedia(medias);
	        int alunosFinal = informaAlunosFinal(medias);
	        System.out.println("A universidade possui " + alunosFinal + " alunos que irão para a final.");
	    }

	    public static void adicionaMedia(double[] medias) {
	        Scanner scan = new Scanner(System.in);
	        for (int i = 0; i < medias.length; i++) {
	            System.out.println("Digite a média do " + (i + 1) + "º aluno: ");
	            medias[i] = scan.nextDouble();
	        }
	    }

	    public static void mostraMedia(double[] medias) {
	        for (int i = 0; i < medias.length; i++) {
	            imprimir("Média do aluno " + (i + 1) + ": " + medias[i]);
	        }
	    }

	    public static int informaAlunosFinal(double[] medias) {
	        int cont = 0;
	        for (int i = 0; i < medias.length; i++) {
	            if (medias[i] >= 3 && medias[i] <= 5.9) {
	                cont++;
	            }
	        }
	        return cont;
	    }

	    public static void imprimir(String texto) {
	        System.out.println(texto);
	    }
	}