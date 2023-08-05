package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra;
		String palavrainvertida="";//A primeira linha declara a variável palavraInvertida como uma string vazia.
		                           //Essa variável será usada para armazenar a palavra invertida.
		
		System.out.println("Digite uma palavra: ");
		palavra= scan.nextLine();
		
		  //começa do último caractere da palavra (palavra.length() - 1) e percorre até o primeiro caractere (i >= 0).
		  //O contador i é decrementado em cada iteração.
		  for (int i = palavra.length() - 1; i >= 0; i--) {
	            palavrainvertida += palavra.charAt(i);
		  }
		  System.out.println("Palavra invertida: " + palavrainvertida);


	}

}
