package modulagem;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String catnadador;
		System.out.print("Digite a idade do nadador: ");
		int idadeN = scan.nextInt();
		
		catnadador=categoria(idadeN);
		System.out.print("A categoria do nadador é: " + catnadador);


	}
	public static String categoria(int idade) {
		String categoriar;
		
		if(idade>=5 && idade<=7){
			categoriar="Infantil A";
		}else if (idade>=8 && idade<=10) {
			categoriar="Infantil B";
		}else if(idade>=11 && idade<=13) {
			categoriar= "Juvenil A";
		}else if(idade>=14 && idade <=17) {
			categoriar="Juvenil B";
		}else {
			categoriar="Senior";
		}
		return categoriar;
		
	}

}
