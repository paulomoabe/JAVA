package vetores;

import java.util.Scanner;

public class PrimosVetor {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primo[]= new int[12];
		
		
		for(int i=0; i<primo.length; i++) {
			System.out.print("Digite o " + (i+1) + "º numero: ");
			primo[i]=scan.nextInt();
			
			
			int div=0;
			for(int c=1; c<=primo[i]; c++) {
				if(primo[i]%c==0) {
					div++;
				}
		}
		}
			
		int div=0;	
		int c = 0;
		

		if(div==2) {
			System.out.print(primo[c]+ "eh primo");
		}else {
			System.out.print(primo[c] + " nao eh primo");
	}


	}
}
