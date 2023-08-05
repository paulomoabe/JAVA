package testesString;
import java.util.Scanner;
public class charatEequalsIgnoreCase {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s;
		int  n;
		while(true) {
		
			System.out.println("Informe uma string, Fim para encerrar: ");
			s= scan.nextLine();
			//compara a string informada pelo usuario com a palavra FIM ignorando
           //na comparação se os caracteres são maiusculos ou minusculos
			if(s.equalsIgnoreCase("FIM")) {
				break;
			}
			System.out.println(" ");
			n= s.length(); //tamanho da string (qtd de caracteres)
			
			for(int i=0; i<n; i++) {
				//a cada linha mostra 'i' caracteres
				for(int j=0; j<=i;j++) {
					//mostra o j-ésimo caractere de 's'
					System.out.print(s.charAt(j));
					      //charat Retorna o i-ésimo caractere da string.Obs:assim como nos vetores
					     //a posição do primeiro caractere deuma string é igual a 0 (zero)
				}
				System.out.print("\n");
			}
			System.out.print("\n");
	}
	}

}
