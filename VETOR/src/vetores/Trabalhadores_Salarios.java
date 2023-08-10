package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Trabalhadores_Salarios {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salarios[]= new double[5];
		Arrays.sort(salarios);
		
		for(int i=0; i<salarios.length; i++) {
			System.out.print("Digite o salario do " + (i+1) + "º funcionario: ");
			salarios[i]= scan.nextDouble();
		}
		System.out.println("Salários dos trabalhadores:");
		int contador = 1;
		for (double salario : salarios) {
			System.out.println("Trabalhador " + contador + ": R$" + salario);
			contador++;
		}
	}




}
