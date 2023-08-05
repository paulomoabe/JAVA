package teste001;
import java.util.Scanner;
public class testanto123 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int menu;
		
		System.out.print("Digite um numero: ");
		int n1 = scan.nextInt();
		System.out.print("Digite outro numero: ");
		int n2 = scan.nextInt();
		
		int r=soma(n1, n2);
		int re=subtracao(n1,n2);
		int res=multiplicacao(n1,n2);
		int resul=divisao(n1,n2);
		int sair=0;
		
		System.out.print("1- adição 2- subtração 3- multiplicação  4- divisão 5-sair");
		menu= scan.nextInt();
		
		if(menu==1) {
			System.out.print(r);
			}else if(menu==2) {
				System.out.print(re);
			}else if(menu==3) {
				System.out.print(res);
			}else if(menu==4) {
				System.out.print(resul);
			}else {
				System.out.print(sair);
			}

	}
	public static int soma(int n1, int n2) {
		int somar=n1+n2;
		return somar;
		
	}
	public static int subtracao(int n1, int n2) {
		int subtrair= n1-n2;
		return subtrair;
		
	}
	public static int multiplicacao(int n1, int n2) {
		int multiplicar= n1*n2;
		return multiplicar;
		
	}
	public static int divisao(int n1, int n2) {
		int dividir= n1/n2;
		return dividir;
		
	}
	

}
