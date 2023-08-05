package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_19 {

	public static void main(String[] args) {
		String nome[]= new String[5];
		double notas[][]=new double[5][4];
		
		nomedosalunos();
		notas(nome);
		exibirMedia(nome, notas);


	}
	public static String[] nomedosalunos() {
		String nome[]=new String[5];
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite os nomes dos aalunos: ");
		for(int i=0;i<nome.length;i++) {
			System.out.println("Digite o nome do "+(i+1)+"º aluno:");
			nome[i]=scan.nextLine();
		}
		return nome;
		
	}
	public static double[][] notas(String nome[]) {
		double notas[][]=new double[5][4];
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite as notas dos alunos: ");
		for(int i=0;i<notas.length;i++) {
			for(int j=0;j<notas[i].length;j++) {
			System.out.println("Digite a nota "+(j+1)+"º do aluno:  "+nome[i]+": ");
			notas[i][j]=scan.nextDouble();
			
		}
		}
		return notas;
		
	}

		 public static void exibirMedia(String[] nomes, double[][] notas){
		        for(int i = 0; i < notas.length; i++){
		            double media = 0;
		            for(int j = 0; j < notas[i].length; j++){
		                media += notas[i][j];
		            }
		            System.out.println("A média do aluno " + nomes[i] + " é " + media/notas[i].length);

		        }
	}
	
}
