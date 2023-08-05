package modulagem;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		int n1, n2, menu, media, res, resultado;
		
		System.out.print("Digite um numero: ");
		n1 = scan.nextInt();
		System.out.print("Digite outro numero: ");
		n2 = scan.nextInt();
		
		resultado=somar(n1,n2);
		res=subtrair(n1,n2);
		System.out.print("1- adicao ou 2- subtracao");
		menu= scan.nextInt();
		if(menu==1) {
			System.out.print(resultado);
		}else {
			System.out.print(res);
		}
				

	}
	public static int somar(int n1, int n2) {
		int soma=n1+n2;
		return soma;
		
	}
	public static int subtrair(int n1, int n2) {
		int subtracao=n1+n2;
		return subtracao;
	
	}

}
