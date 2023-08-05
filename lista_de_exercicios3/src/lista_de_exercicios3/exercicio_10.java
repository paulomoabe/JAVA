package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra;
		
		System.out.println("Digite uma palavra: ");
		palavra= scan.nextLine();
		
		System.out.println("Digite a letra a ser substituida (l1): ");
		char l1= scan.nextLine().charAt(0);
		
		System.out.println("Digite a letra a ser substituida (l2): ");
		char l2= scan.nextLine().charAt(0);
		
		String novapalavra= trocarletra(palavra,l1,l2);
		System.out.println("A palavra depois da substituição é: "+novapalavra);


	}
	public static String trocarletra(String palavra, char l1, char l2) {
		String novapalavra="";
		
		for(int i=0; i<palavra.length();i++) {
			char atual= palavra.charAt(i);
			if(atual==l1) {
				novapalavra+=l2;
			}else {
				novapalavra+=atual;	
			}
		}
		return novapalavra;
	}

}
