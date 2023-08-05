package lista_de_exercicios3;
import java.util.Random;
import java.util.Arrays;
public class exercicio_12 {

	public static void main(String[] args) {
		int numeros[]= new int[50];
		
		preencher(numeros);
		numalterados(numeros);
		

	}
	public static void preencher(int numeros[]) {
		Random rd = new Random();
		
		
		for(int i=0; i<numeros.length;i++) {
			numeros[i]=rd.nextInt(100);
			System.out.println("O número gerado na posição " + i + " é: " + numeros[i]);
		}
	}
	public static void numalterados(int numeros[]) {
       Arrays.sort(numeros);
		
		for(int c=0; c<numeros.length;c++) {
			System.out.println("Os numeros em ordem crescente são: " +numeros[c]);
		
	}

}
}
