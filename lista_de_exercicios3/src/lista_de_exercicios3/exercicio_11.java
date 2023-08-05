package lista_de_exercicios3;
import java.util.Scanner;
public class exercicio_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String candidatos[]= new String[6];
		int votos[]=new int[6];
		int votobranco=0;
		int votonulos=0;
		int voto=0;
		int vencedor=1;
		
		System.out.println("Digite o nome dos candidatos: ");
		for(int i=1;i<=5;i++) {
			System.out.println("O candidato "+i+"º é: ");
			candidatos[i]=scan.nextLine();
		}
		do {
			System.out.println("   URNA ELETRONICA  ");
			System.out.println("(0) BRANCO");
			for(int i=1;i<=5;i++) {
				System.out.println("Digite o numero do candidato ou 6 para encerrar votação: ");
				voto=scan.nextInt();
				
				switch(voto) {
				case 0:
					votobranco++;
					break;
					
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
			    votos[voto]++;
			    break;
				 default:
	                    System.out.println("Voto nulo");
					votonulos++;
					break;
					
				}
				break;
				
			}
			
		}while(voto!=6);
		
		System.out.println("  RESULTADO DA ELEIÇÃO ");
		for(int c=1; c<=5;c++) {
			System.out.println(candidatos[c]+":"+votos[c]+" votos");
		}
		System.out.println("A quantidade de votos nulo é: "+votonulos);
		System.out.println("A quantidade de votod em branco é: "+votobranco);
		
		for(int j=2;j<=5;j++) {
			if(votos[j]>votos[vencedor]) {
				vencedor=j;
			}
			
		}
		System.out.println("O candidato vencedor é: "+candidatos[vencedor]);


	}

}
