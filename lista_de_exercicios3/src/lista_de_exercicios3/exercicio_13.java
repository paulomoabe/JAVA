package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeros[]= new int[10];
		int pares=0;
		int impares=0;
		
		 System.out.println("Digite 10 numeros: ");
		for(int i=0;i<10;i++) {
			
		    System.out.println("Digite o "+(i+1)+ "º numero: ");
		    int valor= scan.nextInt();
		    
		    if(valor%2==0) {
		    	numeros[pares]=valor;
		    	pares++;
		    }else {
		    	numeros[impares+5]=valor;
		    	impares++;
		    }
		}
		 System.out.println("Vetor com ímpares nas primeiras 10 posições e pares nas últimas 10 posições:");
		 
		 for(int i=0; i<10;i++) {
			 System.out.println(numeros[i]+ "");
		 }

		
	}

}
