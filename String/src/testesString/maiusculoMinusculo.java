package testesString;
import java.util.Scanner;
public class maiusculoMinusculo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s, maius, minus;
		
		System.out.println("informe uma string:\n ");
		s = scan.nextLine();
		
		maius= s.toUpperCase(); //string convertida em maiusculas
		minus= s.toLowerCase(); //dtring convertida em minusculas
		
		
		System.out.println("Resultado: ");
		System.out.println(maius+ " "+minus);

	}

}
