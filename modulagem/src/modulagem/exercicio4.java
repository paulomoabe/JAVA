package modulagem;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do primeiro lado: ");
		double lado1= scan.nextDouble();
		System.out.print("Digite o tamanho do segundo lado: ");
		double lado2=  scan.nextDouble();
		System.out.print("Digite o tamanho do terceiro lado: ");
		double lado3= scan.nextDouble();
		
		if (verifT(lado1, lado2, lado3)) {
			String classificacao=classifT(lado1, lado2, lado3);
			System.out.print(" O triângulo é " + classificacao);
		}else {
			System.out.print("Os valores informados não formam um triangulo valido");
		}
		
		
		

	}
	public static boolean verifT(double lado1, double lado2, double lado3) {
		return(lado1 + lado2 > lado3) && (lado1 + lado3> lado2) && (lado2 + lado3> lado1);
		
	}
	public static String classifT(double lado1, double lado2, double lado3) {
		if(lado1==lado2 && lado1==lado3) {
			return "equilatero";
		}else if(lado1==lado2 || lado1==lado3 || lado2==lado3) {
			return "isosceles";
		}else {
			return "escaleno";
		}
		
		
	}

}
