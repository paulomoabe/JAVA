package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_14 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int numeros[]= new int[5];
		int maior=0;
		int posicaomaior=0;
		
		System.out.println("Digite 5 numeros:");
		for(int i=0;i<5;i++) {
			System.out.println("Digite o "+(i+1)+"º numero: ");
			numeros[i]=scan.nextInt();
			
			if(numeros[i]> maior) {
				maior= numeros[i];
				posicaomaior=i+1;
			}
		}
		System.out.println("O maior número é " + maior + " e está na posição " + posicaomaior);
		

	}

}
