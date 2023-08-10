package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class BuscarNomeAluno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String alunos[]= new String[5];
		
		for(int i=0; i<alunos.length; i++) {
			System.out.print("Digite o nome " + i + "º aluno: ");
			alunos[i]= scan.nextLine();
		}
		System.out.print("Digite o nome que deseja saber:  ");
		String buscanome = scan.nextLine();
		
		Arrays.sort(alunos);

		//Buscar o nome no vetor 
		int posicao = Arrays.binarySearch(alunos, buscanome);
		
		if(posicao>=0) {
			System.out.print("O nome " + buscanome + " foi encontrado na posição " + posicao + " do vetor");
		}else {
			System.out.print("O nome " + buscanome + "não foi encontrado no vetor ");
		}
	}

}
