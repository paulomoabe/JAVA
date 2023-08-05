package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome[]= new String[5];
		int idade[]= new int[5];
		int somaidades=0;
		
		for(int i=0;i<nome.length;i++) {
			System.out.println("Digite nome: ");
			nome[i]=scan.nextLine();
			
			System.out.println("Digite a idade: ");
			idade[i]=scan.nextInt();
			scan.nextLine();
			
			somaidades+=idade[i];
		}
		
		double media= (double)somaidades/idade.length;
		System.out.println("a media de idades é: "+ media);
		System.out.println("Pessoas com idades abaixo da media são: ");
		for(int i=0;i<nome.length;i++) {
			if(idade[i]> media) {
				System.out.println(nome[i]);
			}
		}
		

	}
}

