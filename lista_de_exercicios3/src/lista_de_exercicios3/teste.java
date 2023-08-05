package lista_de_exercicios3;

import java.util.Scanner;
import java.util.Random;
public class teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("escreva quantos numeros deseja colocar");
		int n=scan.nextInt();
		int num[]= new int[n];
		preencher(num);
		mostrar(num);


	}
	
	public static void mostrar(int num[]) {
		for(int c=0;c<num.length;c++) {
			System.out.println(num[c]);
		}
		
	}
	public static void preencher(int num[]) {
		Random rd= new Random();
		for(int i=0;i<num.length; i++) {
			num[i]=rd.nextInt(10);
			
		}
	}

}
