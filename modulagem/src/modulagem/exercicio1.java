package modulagem;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String aluno;
		double n1, n2, media;
		
		System.out.print("Digite o nome do aluno: ");
		aluno= scan.nextLine();
		System.out.print("Digite a primeira nota: ");
		n1 = scan.nextDouble();
		System.out.print("Digite a segunda nota do aluno: ");
		n2 = scan.nextDouble();
		
		media= (n1+n2)/2;
		mediar(aluno, media);
		
	}public static void mediar(String aluno, double media) {
		if(media>=7) {
			System.out.print("Parabens " +aluno+ " você foi aprovado");
		}else if(media>=4){
			System.out.print(aluno + " Apresente-se a prova final");
		}else {
			System.out.print(aluno+ "Infelizmente aluno reprovado!");
		}
		
	}

}
