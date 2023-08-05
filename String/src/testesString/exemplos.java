package testesString;

public class exemplos {

	public static void main(String[] args) {
		
		String teste= "isso é um teste.";
		
		System.out.println(teste);
		                     //neste caso esta iniciando a partir do indice 10
		System.out.println(teste.substring(10));
		//Substring é um pedaço de uma string, com este metodo conseguimos 
		//extrair pedaços de uma String
		System.out.println(teste.substring(10, 15));
		 //neste caso o indice inicial é 10 e o final é 15
		
		
		String espacos= "i s p a ç o";
		String semespacos= espacos.replace("i", "e");
		//o metodo replace  trocar a letra de uma palavra por outra da sua escolha
		System.out.println(semespacos);
		
		semespacos= semespacos.replaceAll(" ", "");
		System.out.println(semespacos);
		//remover todos os espaços//
		
		String nome= " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());
		//este metodo remove todos os espeços que estao sobrando antes e depois do conteudo da String//
		

	}

}
