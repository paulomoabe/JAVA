package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1=scan.nextInt();
		System.out.println("Digite um numero: ");
		int n2=scan.nextInt();
		
		int mmc=calculommc(n1,n2);
		System.out.println("O MMC de " + n1+" e "+n2+" é: "+mmc);
	}
	public static int calculommc(int n1, int n2) {
		int maior = Math.max(n1, n2);
		
		while(true) {
			if(maior%n1 ==0 && maior%n2 ==0) {
				
			
				return  maior;
			}
			maior++;
		}
		
		
	}

}
