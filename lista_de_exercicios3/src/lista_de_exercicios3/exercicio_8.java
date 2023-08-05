package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_8 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String palavra;
		char letra;
		int cont=0;
		
		System.out.println("Digite uma palavra: " );
		palavra= scan.nextLine();
		System.out.println("Digite uma letra: ");
		letra= scan.nextLine().charAt(0);
		
		for(int i=0; i<palavra.length();i++) {
			if(palavra.charAt(i)==letra) {
			cont++;
			}
			
		}
		System.out.println("Quantidades de letras "+ letra+ " é: "+ cont);


	}

}
