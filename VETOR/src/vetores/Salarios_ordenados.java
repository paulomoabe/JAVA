package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Salarios_ordenados {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salarios[]= new double[5];
		
		for(int i=0; i<salarios.length; i++) {
			System.out.print("Digite o " + i + "º salario: ");
			salarios[i]= scan.nextDouble();
		}
		//para mostrar o vetor em ordem crescente 
		Arrays.sort(salarios);
		
		System.out.println("Salarios dos trabalhadores ordenados: ");
		for(double salario :salarios) {
			System.out.println("R$ " + salario);
		}
	}

}
