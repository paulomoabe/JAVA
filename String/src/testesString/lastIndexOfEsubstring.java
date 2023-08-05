package testesString;
import java.util.Scanner;
public class lastIndexOfEsubstring {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String nome, sobrenome;
		int i;
		
		System.out.println("Informe um nome: ");
		nome= scan.nextLine();
		
		//retorna a posição da ultima ocorrência do espaço em branco
		//na string 'nome', ou seja o sobrenome é a ultima parte de um nome
		
		i= nome.lastIndexOf(' ');
		sobrenome= nome.substring(i+1, nome.length());
		
		System.out.println("\nSobrenome: " + sobrenome);


	}

}
