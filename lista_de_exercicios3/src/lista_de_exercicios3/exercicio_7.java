package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_7 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String palavra;
		int cont=0;
		
		System.out.println("Digite uma String: ");
		palavra= scan.nextLine();
		
		for(int i=0;i<palavra.length(); i++) {
			if(palavra.charAt(i)=='1');
			cont++;
		}
		 System.out.println("Número de 1's na string: " + cont);
		
		


	}

}
