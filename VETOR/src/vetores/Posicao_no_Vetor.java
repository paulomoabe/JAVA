package vetores;
import java.util.Scanner;
import java.util.Scanner;

public class Posicao_no_Vetor {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num[] = new int [5];

	
	System.out.print("Digite 5 numeros: ");
	
	for(int i=0; i<num.length; i++) {
		System.out.println("Número " + (i + 1) + ": ");
		num[i] = scan.nextInt();
		
			
		
	}
	System.out.println("Posições dos números no vetor:");
	
	for(int j=0; j<num.length; j++) {
		System.out.println("Número " + num[j] + " está na posição " + j);
	}
}

}
