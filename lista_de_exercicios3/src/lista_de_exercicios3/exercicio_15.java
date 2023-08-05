package lista_de_exercicios3;
import java.util.Scanner;

public class exercicio_15 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite quantos numeros vai inserir:");
		int n=scan.nextInt();
		int numeros[]= new int[n];
		
		carregarvetor(scan, n, numeros);
		mostarvetor(numeros);
		
		
		
	}
	public static void carregarvetor(Scanner scan, int n, int[] numeros) {
		for(int i=0;i<n;i++) {
			System.out.println("insira um numero:");
			int numero=scan.nextInt();
			if(primo(numero)==true) {
				numeros[i]=numero;
				}
		}
	}
	public static void mostarvetor(int[] numeros) {
		for(int c=0;c<numeros.length;c++) {
			if(numeros[c]!=0) {
			System.out.println(numeros[c]);
			}
		}
	}
	public static boolean primo(int numero) {
		int cont=0;
		for(int i=1;i<=numero;i++) {
			if(numero%i==0) {
				cont++;
			}
		}
		if(cont==2) {
			return true;
		}else {
			return false;
		}
		
		
	}





}
	


