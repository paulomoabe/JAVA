package vetores;

import java.util.Scanner;

public class SalariosVet {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sal[]= new double[5];
		
		for(int i=0; i<sal.length; i++) {
			System.out.print("Digite o salario do " + i +"º funcionario: " );
			sal[i]= scan.nextDouble();
		}
		System.out.print("Salarios dos funcionarios: ");
		for(double salario: sal) {
			System.out.println(salario);
		}

	}

}
