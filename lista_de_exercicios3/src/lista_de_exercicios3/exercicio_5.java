package lista_de_exercicios3;

public class exercicio_5 {

	public static void main(String[] args) {
		String palavra = "exemplo";
		exibirpalavranavertical(palavra);


	}
	public static void exibirpalavranavertical(String palavra) {
		for(int i=0; i<palavra.length();i++) {
			System.out.println(palavra.charAt(i));
		}
		
	}

}
