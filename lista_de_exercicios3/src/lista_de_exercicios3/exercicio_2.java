package lista_de_exercicios3;
import java.util.Scanner;
import java.util.Random;
public class exercicio_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("escreva quantos numeros deseja colocar");
		int n=scan.nextInt();
		int numeros[]= new int[n];

		prenche(numeros);
		mostra(numeros);
		primo(numeros);
		Somaprimo(numeros);
	}
	
	
	
	
	
	
	private static void Somaprimo(int[] numeros) {
		int div=0;
		int soma=0;
		for(int i=0;i<numeros.length;i++) {
			div=0;
			for(int c=1;c<=numeros[i];c++) {
					if(numeros[i]%c==0) {
						div++;
					}
				}if(div==2) {
					soma=soma + numeros[i];
				
				}
				
			
			}
		System.out.println("A soma de todos os numeros primos e de: "+soma);
	}
	
	
	
	
	

	private static void primo(int[] numeros) {
		int div=0;
		for(int i=0;i<numeros.length;i++) {
			div=0;
			for(int c=1;c<=numeros[i];c++) {
					if(numeros[i]%c==0) {
						div++;
					}
				}if(div==2) {
					System.out.println("o numero "+numeros[i]+"  eh primo");
				
				}
				
			
			}
	}

	private static void mostra(int[] numeros) {
		for(int j=0;j<numeros.length;j++) {
			System.out.println(numeros[j]);
		}
	}

	private static void prenche(int[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			Random gerator= new Random();
			int posicao=gerator.nextInt(10);
			numeros[i]=posicao;
			
		}
	}
}