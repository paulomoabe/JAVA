package vetores;

import java.util.Scanner;

public class mediaNotasVetor {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double notas[] = new double[5]; 
		double soma=0;
		double media=0;
	
		
		
		for(int i=0; i<notas.length; i++) {
			System.out.println("Digite a " + (i+1) +"º nota: ");
			notas[i]= scan.nextDouble();
			
			soma+=notas[i]/5;
			media=soma+notas[i]/5;	
			
		}
		for(int c=1; c<notas.length; c++) {
			System.out.println("Nota " + notas[c] + "esta na posição " + c );
		}
		
			System.out.print("A media das notas: " + media );
		
	
		


	}


}
