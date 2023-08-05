package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int menu =0, n1, n2;
		

		System.out.println("Digite o primeiro numero:");
		n1=scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2=scan.nextInt();
		
		exibirmenu();
		
		while (true) {
	        System.out.println("Escolha uma das opções:");
	        menu = scan.nextInt();
	        
	        while (menu < 1 || menu > 6) {
			    System.out.println("Opção inválida. Digite um número de 1 a 6.");
			    exibirmenu();
			    System.out.println("Escolha uma das opções: ");
			    menu = scan.nextInt();
			    
	        }
	        switch(menu) {
			case 1:
				System.out.println("O resultado da soma foi "+ soma(n1,n2));
				exibirmenu();
				break;
			case 2:
				System.out.print("O resuldado da soma foi " + subtracao(n1,n2));
				exibirmenu();
				break;
			case 3:
				System.out.print("O resultado da subtração foi " + divisao(n1,n2));
				exibirmenu();
				break;
			case 4:
			    System.out.print("O resultado da divisão foi " + multiplicacao(n1,n2));
			    exibirmenu();
			    break;
			case 5:
				System.out.println("digite o numero:");
				n1=scan.nextInt();
				System.out.println("digite o numero");
				n2=scan.nextInt();
				
				exibirmenu();
				break;
			case 6:
				System.out.println("Encerando o programa...");
				break;
	        }
	        if(menu==6) {
	        	break;
	        }
		}
		
		}
		
	public static void  exibirmenu() {
		 System.out.println("\n===== Calculadora Menu =====");
	        System.out.println("1 - Soma");
	        System.out.println("2 - Subtração");
	        System.out.println("3 - Divisão");
	        System.out.println("4 - Multiplicação");
	        System.out.println("5 - Trocar valores");
	        System.out.println("6 - Sair");
		
	}
public static int soma(int n1, int n2) {
		int somar=n1+n2;
		
		return somar;
	}
	public static int subtracao(int n1, int n2) {
		int subtrair= n1-n2;
		return subtrair;
		
	}
	public static int divisao(int n1, int n2) {
		 int dividir= n1/n2;
		 return dividir;
		
	}	
 public static int multiplicacao(int n1, int n2) {
	int multiplicar=n1*n2;
	return multiplicar;
	}
	

}
